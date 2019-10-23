package com.example.returnusingthis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ThisReturn thisReturn=new ThisReturn();
        int a=thisReturn.m1(63);
        System.out.println("value will be"+a);
    }
}
