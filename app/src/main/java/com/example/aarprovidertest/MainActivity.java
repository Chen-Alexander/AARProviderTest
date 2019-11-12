package com.example.aarprovidertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.librarytwo.One;
import com.example.llibraryone.Two;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new One().printf();
        new Two().printf();
    }
}
