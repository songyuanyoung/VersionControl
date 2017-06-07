package com.example.zhangwenpurdue.versioncontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public int myModZach(int a, int b) {
        return a % b;
    }
    public int add(int i, int j){
        int k = i+j;
        return  k;
    }
    public int multiply(int a, int b)
    {
        return a*b;

    }
    public int Division(int a, int b)
    {
        return a/b;
    }

    public int sub(int i, int j) {
        return i-j;
    }
}
