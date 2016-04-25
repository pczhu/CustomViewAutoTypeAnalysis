package com.pczhu.autotypeanalysis;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 名称：自定义注解
 * 作用：
 * 描述：
 * 作者：pczhu
 * 创建时间： 16/4/20 下午3:41
 * 版本：V1.0
 * 修改历史：
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface TypeAnno {
    int value();
}
