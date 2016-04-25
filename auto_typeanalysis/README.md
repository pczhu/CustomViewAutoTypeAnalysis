
#实例化自定义控件方法
###实现复杂自定义Android控件经常出现十几个甚至几十个控件属性，这样就要写相当多的typedArray.getXXX()方法去获取各个属性值 本Library 实用注解方式获取控件属性，类似大家平时用注解findViewById
	
使用方法
```
// 声明属性 实用注解
@TypeAnno(R.styleable.MyGraView_rv_drawable)
private String myDrawalbe;
// 获取TypedArray并传入TypeAnalysis中		
TypedArray typedArray = mContext.obtainStyledAttributes(attributes, R.styleable.MyGraView);
//这里的this就是当前的自定义控件了
TypeAnalysis.getTypes(this, typedArray);
    
```
