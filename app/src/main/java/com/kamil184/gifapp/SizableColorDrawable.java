package com.kamil184.gifapp;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

public class SizableColorDrawable extends ColorDrawable {

    int mWidth = -1;

    int mHeight = -1;

    public SizableColorDrawable(int color, int width, int height) {
        super(color);

        mWidth = width;
        mHeight = height;
    }

    @Override public int getIntrinsicWidth() {
        return mWidth;
    }

    @Override public int getIntrinsicHeight() {
        return mHeight;
    }
}