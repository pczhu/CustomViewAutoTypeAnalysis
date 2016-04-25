package com.pczhu.autotypeanalysis;

import android.content.res.TypedArray;
import android.graphics.Color;

import android.util.Log;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;


/**
 * 名称：
 * 作用：
 * 描述：
 * 作者：pczhu
 * 创建时间： 16/4/25 上午9:13
 * 版本：V1.0
 * 修改历史：
 */
public class TypeAnalysis {
    public static void getTypes(Object handler,TypedArray typedArray){
        TypeAnalysis.getTypes(handler,typedArray,handler.getClass());
    }
    public static void getTypes(Object handler,TypedArray typedArray , Class<?> clz){
        Field[] declaredFields = clz.getDeclaredFields();
        for (Field field:declaredFields){

            if(field !=null && field.isAnnotationPresent(TypeAnno.class)) {
                Class<?> type = field.getType();
                String typeName = type.getName();
                field.setAccessible(true);
                TypeAnno annotation = field.getAnnotation(TypeAnno.class);
                try {
                    if(annotation!=null){
                        if(!Modifier.isStatic(field.getModifiers()) && !Modifier.isFinal(field.getModifiers()) && !type.isArray()) {
                            if(typeName.equals("color") ){
                                field.set(handler, typedArray.getColor(annotation.value(), Color.TRANSPARENT));
                            }else if(typeName.equals("int")){
                                field.set(handler, typedArray.getInteger(annotation.value(), -1));
                            }else if(typeName.equals("java.lang.String")){
                                field.set(handler, typedArray.getString(annotation.value()));
                            }else if(typeName == "boolean"){
                                field.set(handler, typedArray.getBoolean(annotation.value(), false));
                            }else if(typeName.equals("float")){
                                field.set(handler, typedArray.getDimension(annotation.value(), -1));
                            }else if(typeName.equals("drawable")){
                                field.set(handler, typedArray.getDrawable(annotation.value()));
                            }
                        }else{
                            Log.e("TypeAnalysis","there is the attr which can not be static,final,primitive or array");
                        }
                    }
                }catch (Exception e){
                    Log.e("TypeAnalysis","there is something wrong in annotation");
                }


            }

        }
        typedArray.recycle();
    }
}
