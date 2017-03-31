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
compile 'com.github.kozinakoff:BorderedTextView:0.1.2'
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
        app:borderRadius="4dp"
        app:borderWidth="1dp"
        app:borderPaddingLeft="4dp"
        app:borderPaddingRight="4dp"
        app:backgroundColor="@color/colorPrimary"
        app:borderColor="@color/colorAccent"/>
```
