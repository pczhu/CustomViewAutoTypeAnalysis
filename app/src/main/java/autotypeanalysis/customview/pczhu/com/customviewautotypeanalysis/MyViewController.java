package autotypeanalysis.customview.pczhu.com.customviewautotypeanalysis;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;


import com.pczhu.autotypeanalysis.TypeAnalysis;
import com.pczhu.autotypeanalysis.TypeAnno;


/**
 * 名称：
 * 作用：
 * 描述：
 * 作者：pczhu
 * 创建时间： 16/4/18 下午2:24
 * 版本：V1.0
 * 修改历史：
 */
public class MyViewController extends TextView{
    //private View mView;
    private Context mContext;
    private AttributeSet mAttributeSet;

    //#####################属性#######################//
    @TypeAnno(R.styleable.MyGraView_rv_drawable)
    private String myDrawalbe;
    @TypeAnno(R.styleable.MyGraView_rv_drawable1)
    private String myDrawalbe1;
    @TypeAnno(R.styleable.MyGraView_rv_drawable2)
    private String myDrawalbe2;
    @TypeAnno(R.styleable.MyGraView_rv_String)
    private String myString;
    //normal背景色
    @TypeAnno(R.styleable.MyGraView_rv_backgroundColor)
    private int normalBgColor;
    //press背景色
    @TypeAnno(R.styleable.MyGraView_rv_backgroundPressColor)
    private int pressBgColor;
    //slected背景色
    @TypeAnno(R.styleable.MyGraView_rv_backgroundSelectedColor)
    private int selectedBgColor;
    //normal边线色
    @TypeAnno(R.styleable.MyGraView_rv_strokeColor)
    private int normalStrokeColor;
    //press边线色
    @TypeAnno(R.styleable.MyGraView_rv_strokePressColor)
    private int pressStrokeColor;
    //slected边线色
    @TypeAnno(R.styleable.MyGraView_rv_strokeSelectedColor)
    private int selectedStrokeColor;
    //边线宽度
    @TypeAnno(R.styleable.MyGraView_rv_strokeWidth)
    private float strokeWidth;
    //左上角
    @TypeAnno(R.styleable.MyGraView_rv_cornerRadius_TL)
    private float cornerRadius_TL;
    //左下角
    @TypeAnno(R.styleable.MyGraView_rv_cornerRadius_BL)
    private float cornerRadius_BL;
    //右上角
    @TypeAnno(R.styleable.MyGraView_rv_cornerRadius_TR)
    private float cornerRadius_TR;
    //右下角
    @TypeAnno(R.styleable.MyGraView_rv_cornerRadius_BR)
    private float cornerRadius_BR;
    //统一角度
    @TypeAnno(R.styleable.MyGraView_rv_cornerRadius)
    private float cornerRadius;
    //是否半高度
    @TypeAnno(R.styleable.MyGraView_rv_isRadiusHalfHeight)
    private boolean isHalfHeightCornerRadius;
    //是否长宽相等 （就是一个圆）
    @TypeAnno(R.styleable.MyGraView_rv_isWidthHeightEqual)
    private boolean isWidthEqualsHeight;
    //normal文字颜色
    @TypeAnno(R.styleable.MyGraView_textColor)
    private int normalTextColor;
    //press文字颜色
    @TypeAnno(R.styleable.MyGraView_rv_textPressColor)
    private int pressTextColor;
    //selected文字颜色
    @TypeAnno(R.styleable.MyGraView_rv_textSelectedColor)
    private int selectedTextColor;
    @TypeAnno(R.styleable.MyGraView_rv_integer)
    private int myint;


    public void setMyint(int myint) {
        this.myint = myint;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    public MyViewController(Context context) {
        super(context);
        this.mContext = context;
    }

    public MyViewController(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
        this.mAttributeSet = attrs;
        initViewAttributes(attrs);
    }

    public MyViewController(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        this.mAttributeSet = attrs;
        initViewAttributes(attrs);
    }
    private void initViewAttributes(AttributeSet attributes) {

        TypedArray typedArray = mContext.obtainStyledAttributes(attributes, R.styleable.MyGraView);
        TypeAnalysis.getTypes(this, typedArray);
        this.setTextColor(normalTextColor);
        this.setBackgroundColor(normalBgColor);

    }
    public boolean isHalfHeightCornerRadius() {
        return isHalfHeightCornerRadius;
    }

    public boolean isWidthEqualsHeight() {
        return isWidthEqualsHeight;
    }

//    public void setmView(View mView) {
//        this.mView = mView;
//    }

    public void setCornerRadius(float cornerRadius) {
        this.cornerRadius = cornerRadius;
    }

    public void setMyDrawalbe(String myDrawalbe) {
        this.myDrawalbe = myDrawalbe;
    }

    public void setMyDrawalbe1(String myDrawalbe1) {
        this.myDrawalbe1 = myDrawalbe1;
    }

    public void setMyDrawalbe2(String myDrawalbe2) {
        this.myDrawalbe2 = myDrawalbe2;
    }

    public void setmContext(Context mContext) {
        this.mContext = mContext;
    }

    public void setmAttributes(AttributeSet mAttributes) {
        this.mAttributeSet = mAttributes;
    }

    public MyViewController setNormalBgColor(int normalBgColor) {
        this.normalBgColor = normalBgColor;
        return this;
    }

    public MyViewController setPressBgColor(int pressBgColor) {
        this.pressBgColor = pressBgColor;
        return this;
    }

    public MyViewController setSelectedBgColor(int selectedBgColor) {
        this.selectedBgColor = selectedBgColor;
        return this;
    }

    public MyViewController setNormalStrokeColor(int normalStrokeColor) {
        this.normalStrokeColor = normalStrokeColor;
        return this;
    }

    public MyViewController setPressStrokeColor(int pressStrokeColor) {
        this.pressStrokeColor = pressStrokeColor;
        return this;
    }

    public MyViewController setSelectedStrokeColor(int selectedStrokeColor) {
        this.selectedStrokeColor = selectedStrokeColor;
        return this;
    }

    public MyViewController setStrokeWidth(float strokeWidth) {
        this.strokeWidth = strokeWidth;
        return this;
    }

    public MyViewController setCornerRadius_TL(float cornerRadius_TL) {
        this.cornerRadius_TL = cornerRadius_TL;
        return this;
    }

    public MyViewController setCornerRadius_BL(float cornerRadius_BL) {
        this.cornerRadius_BL = cornerRadius_BL;
        return this;
    }

    public MyViewController setCornerRadius_TR(float cornerRadius_TR) {
        this.cornerRadius_TR = cornerRadius_TR;
        return this;
    }

    public MyViewController setCornerRadius_BR(float cornerRadius_BR) {
        this.cornerRadius_BR = cornerRadius_BR;
        return this;
    }

    public MyViewController setCornerRadius(int cornerRadius) {
        this.cornerRadius = cornerRadius;
        return this;
    }

    public MyViewController setIsHalfHeightCornerRadius(boolean isHalfHeightCornerRadius) {
        this.isHalfHeightCornerRadius = isHalfHeightCornerRadius;
        return this;
    }

    public MyViewController setIsWidthEqualsHeight(boolean isWidthEqualsHeight) {
        this.isWidthEqualsHeight = isWidthEqualsHeight;
        return this;
    }

    public MyViewController setNormalTextColor(int normalTextColor) {
        this.normalTextColor = normalTextColor;
        return this;
    }

    public MyViewController setPressTextColor(int pressTextColor) {
        this.pressTextColor = pressTextColor;
        return this;
    }

    public MyViewController setSelectedTextColor(int selectedTextColor) {
        this.selectedTextColor = selectedTextColor;
        return this;
    }


    //#####################属性#######################//




    @Override
    public String toString() {
        return "MyViewController{" +
                "myDrawalbe='" + myDrawalbe + '\'' +
                ", myDrawalbe1='" + myDrawalbe1 + '\'' +
                ", myDrawalbe2='" + myDrawalbe2 + '\'' +
                ", myString='" + myString + '\'' +
                ", normalBgColor=" + normalBgColor +
                ", pressBgColor=" + pressBgColor +
                ", selectedBgColor=" + selectedBgColor +
                ", normalStrokeColor=" + normalStrokeColor +
                ", pressStrokeColor=" + pressStrokeColor +
                ", selectedStrokeColor=" + selectedStrokeColor +
                ", strokeWidth=" + strokeWidth +
                ", cornerRadius_TL=" + cornerRadius_TL +
                ", cornerRadius_BL=" + cornerRadius_BL +
                ", cornerRadius_TR=" + cornerRadius_TR +
                ", cornerRadius_BR=" + cornerRadius_BR +
                ", cornerRadius=" + cornerRadius +
                ", isHalfHeightCornerRadius=" + isHalfHeightCornerRadius +
                ", isWidthEqualsHeight=" + isWidthEqualsHeight +
                ", normalTextColor=" + normalTextColor +
                ", pressTextColor=" + pressTextColor +
                ", selectedTextColor=" + selectedTextColor +
                ", myint=" + myint +
                '}';
    }
}
