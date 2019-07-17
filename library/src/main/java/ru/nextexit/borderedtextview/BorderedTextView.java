package ru.nextexit.borderedtextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.ColorInt;
import ru.kozinakoff.borderedtextview.R;

public class BorderedTextView extends TextView {

    private final int MIN_WIDTH = 1;

    private float mBorderRadius = Integer.MIN_VALUE;
    private int mBorderWidth = 1;
    private int mBorderColor = Color.BLACK;
    private int mBackgroundColor = Color.TRANSPARENT;  //default is transparent

    private int mBorderPaddingTop = 2;
    private int mBorderPaddingBottom = 2;
    private int mBorderPaddingLeft = 4;
    private int mBorderPaddingRight = 4;

    public BorderedTextView(Context context) {
        super(context);
        init(context, null);
    }

    public BorderedTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public BorderedTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {

        if (attrs != null) {
            TypedArray ta = context.getTheme().obtainStyledAttributes(
                    attrs,
                    R.styleable.BorderedTextView,
                    0, 0);

            try {
                mBorderRadius = ta.getDimension(R.styleable.BorderedTextView_btv_borderRadius, 0);
                mBorderWidth = (int) ta.getDimension(R.styleable.BorderedTextView_btv_borderWidth, MIN_WIDTH);
                mBorderColor = ta.getColor(R.styleable.BorderedTextView_btv_borderColor, 0);
                mBackgroundColor = ta.getColor(R.styleable.BorderedTextView_btv_backgroundColor, 0);

                int borderPadding = (int) ta.getDimension(R.styleable.BorderedTextView_btv_borderPadding, 0);

                if (borderPadding > 0) {
                    mBorderPaddingLeft = mBorderPaddingRight = mBorderPaddingTop = mBorderPaddingBottom = borderPadding;
                } else {
                    mBorderPaddingLeft = (int) ta.getDimension(R.styleable.BorderedTextView_btv_borderPaddingLeft, 4);
                    mBorderPaddingRight = (int) ta.getDimension(R.styleable.BorderedTextView_btv_borderPaddingRight, 4);
                    mBorderPaddingTop = (int) ta.getDimension(R.styleable.BorderedTextView_btv_borderPaddingTop, 2);
                    mBorderPaddingBottom = (int) ta.getDimension(R.styleable.BorderedTextView_btv_borderPaddingBottom, 2);
                }
            } finally {
                ta.recycle();
            }
        }

        setPadding(mBorderPaddingLeft, mBorderPaddingTop, mBorderPaddingRight, mBorderPaddingBottom);

        Drawable drawable = getBackgroundDrawable();
        setBackgroundDrawable(drawable);
    }

    private Drawable getBackgroundDrawable() {
        GradientDrawable shape = new GradientDrawable();
        shape.setShape(GradientDrawable.RECTANGLE);
        shape.setCornerRadius(mBorderRadius);
        shape.setColor(mBackgroundColor);
        shape.setStroke(mBorderWidth, mBorderColor);

        return shape;
    }

    private Drawable getBackgroundDrawable(@ColorInt int colorResId) {
        GradientDrawable shape = new GradientDrawable();
        shape.setShape(GradientDrawable.RECTANGLE);
        shape.setCornerRadius(mBorderRadius);
        shape.setColor(colorResId);
        shape.setStroke(mBorderWidth, mBorderColor);

        return shape;
    }

    /**
     * Sets the border radius on the label
     * @param borderRadius The radius of each border's corner
     */
    public void setBorderRadius(float borderRadius) {
        mBorderRadius = borderRadius;
        Drawable drawable = getBackgroundDrawable();
        setBackgroundDrawable(drawable);
    }

    @Override
    public void setBackgroundColor(int color) {
        mBackgroundColor = color;
        super.setBackgroundColor(color);
        Drawable drawable = getBackgroundDrawable();
        setBackgroundDrawable(drawable);
    }
}