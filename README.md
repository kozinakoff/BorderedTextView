# BorderedTextView
A simple TextView with border

![screenshot](screenshot.png)

[![](https://jitpack.io/v/kozinakoff/BorderedTextView.svg)](https://jitpack.io/#kozinakoff/BorderedTextView)

# Install
To add this library to your project, you must add the JitPack repo to your root build.gradle file...

```groovy
allprojects {
 repositories {
    ...
    maven { url "https://jitpack.io" }
 }
}
```

Then include this line in your dependencies block...

```
implementation 'com.github.kozinakoff:BorderedTextView:0.1.2'
```


# Usage
Simply include in your layout like so...

```xml
    <ru.nextexit.borderedtextview.BorderedTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="18sp"
        android:textColor="@android:color/white"
        android:text="Hello world?"
        android:layout_marginTop="6dp"
        app:btv_borderRadius="4dp"
        app:btv_borderWidth="1dp"
        app:btv_borderPaddingLeft="4dp"
        app:btv_borderPaddingRight="4dp"
        app:btv_backgroundColor="@color/colorPrimary"
        app:btv_borderColor="@color/colorAccent"/>
```

## Attributes

| Name        |  Value  |
| ------------- |:-------------:|
| btv_borderRadius | dimension |
| btv_borderWidth | dimension |
| btv_borderColor | color |
| btv_backgroundColor | color |
| btv_borderPadding | dimension |
| btv_borderPaddingTop | dimension |
| btv_borderPaddingBottom | dimension |
| btv_borderPaddingLeft | dimension |
| btv_borderPaddingRight | dimension |

## Notes

* Use `setBorderRadius(...)` to chnage border radius programmatically
