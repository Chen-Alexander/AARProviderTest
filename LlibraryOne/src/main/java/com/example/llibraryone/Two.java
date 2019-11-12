package com.example.llibraryone;

import android.util.Log;

public class Two
{
    private static final String TAG = "Two";

    public static void Init()
    {
        for (int i = 0; i < 10000; i++)
        {}
        Log.e(TAG, "Two初始化完成。");
    }

    public void printf()
    {
        Log.e(TAG, "你调用到了Two");
    }
}
