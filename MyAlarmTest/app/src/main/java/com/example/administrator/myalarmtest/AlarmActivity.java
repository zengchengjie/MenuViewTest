package com.example.administrator.myalarmtest;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Administrator on 2016/5/19.
 */
public class AlarmActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //显示对话框
        new AlertDialog.Builder(AlarmActivity.this).
                setTitle("闹钟").//设置标题
                setMessage("时间到了！").//设置内容
                setPositiveButton("知道了", new DialogInterface.OnClickListener(){//设置按钮
            public void onClick(DialogInterface dialog, int which) {
                AlarmActivity.this.finish();//关闭Activity
            }
        }).create().show();
    }
}
