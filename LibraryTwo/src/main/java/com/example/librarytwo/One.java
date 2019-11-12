package com.example.librarytwo;

import android.util.Log;

public class One
{
    private static final String TAG = "One";

    public static void Init()
    {
        for (int i = 0; i < 10000; i++)
        {}
        Log.e(TAG, "One初始化完成。");
    }

    public void printf()
    {
        Log.e(TAG, "你调用到了One");
    }
}
