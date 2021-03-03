# NumberStepper - 数字步进器-购物车数量加减按钮

[![API](https://img.shields.io/badge/API-19%2B-green.svg?style=flat)](https://android-arsenal.com/api?level=19)
[![demo](https://img.shields.io/badge/download-demo-blue.svg)](/screens/app-demo.apk) <-- 点击下载demo


![show_01](/screens/show_01.png)


### 快速使用

**Step 1.** Add it in your root build.gradle at the end of repositories:

```groovy
allprojects {
	repositories {
		maven { url 'https://jitpack.io' }
	}
}
```

**Step 2.** Add the dependency

```groovy
dependencies {
	implementation 'com.github.shaoshuai904:NumberStepper:1.0.0'
}
```

###  NumberStepper

```java
    <com.maple.numberstepper.NumberStepper
        android:id="@+id/stepperCustom2"
        android:layout_width="180dp"
        android:layout_height="60dp"
        android:layout_marginTop="40dp"
        stepper:currentValue="100"
        stepper:maxValue="200"
        stepper:minValue="50"
        stepper:stepValue="5"
        stepper:stepper_background="#349AFF"
        stepper:stepper_buttonWidth="50dp"
        stepper:stepper_contentBackground="#B1CAFB"
        stepper:stepper_contentTextColor="#000000"
        stepper:stepper_contentTextSize="18"
        stepper:stepper_leftButtonBackground="#5BADFF"
        stepper:stepper_leftButtonResources="@drawable/svg_left"
        stepper:stepper_rightButtonBackground="#5BADFF"
        stepper:stepper_rightButtonResources="@drawable/svg_right" />
```


