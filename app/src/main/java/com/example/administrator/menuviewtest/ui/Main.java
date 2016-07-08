package com.example.administrator.menuviewtest.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.administrator.menuviewtest.R;

//import com.example.zengchengjie.myapplication.R;

/**
 * Created by 张娇娇 on 2016/7/7.
 */
public class Main extends Activity {
    private TextView mtextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ui_layout);
        mtextview = (TextView) findViewById(R.id.mytext);

    }


}
