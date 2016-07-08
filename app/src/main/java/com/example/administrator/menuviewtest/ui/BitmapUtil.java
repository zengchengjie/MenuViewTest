package com.example.administrator.menuviewtest.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/7/7.
 */
public class BitmapUtil {
    private TextView mtextview;

    int width = 720;

    int height = 1280;

    float valueW = 1;

    float valueH = 1;
    Activity activity;
    public TextView showbitmap(int resid, Context context){
        //1、获得浮点数
        DisplayMetrics m_DisplayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(m_DisplayMetrics);


        int currentwidth = m_DisplayMetrics.widthPixels;
        int currentheight = m_DisplayMetrics.heightPixels;

        valueW = currentwidth / width;
        valueH = currentheight / height;

        //2、获得图片
        Bitmap buffer = BitmapFactory.decodeResource(activity.getResources(),resid);

        Matrix m_Matrix = new Matrix();

        m_Matrix.setScale(valueW, valueH);

        Bitmap bitmap = Bitmap.createBitmap(buffer, 0, 0, buffer.getWidth(), buffer.getHeight(), m_Matrix, true);

        Drawable m_Drawable = new BitmapDrawable(bitmap);

        mtextview.setBackgroundDrawable(m_Drawable);
        return mtextview;
    }

}
