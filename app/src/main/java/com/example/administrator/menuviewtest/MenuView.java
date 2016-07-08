package com.example.administrator.menuviewtest;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/7/6.
 */
public class MenuView extends RelativeLayout implements View.OnClickListener {
    TextView button_recommend;
    TextView button_list;
    TextView button_singer;
    TextView button_song;
    TextView button_class;
    Context context;

    public MenuView(Context context) {
        super(context);
    }

    public MenuView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public MenuView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * 获得推荐按钮
     */
    private void findbuttoncommend() {
        button_recommend = (TextView) findViewById(R.id.menu_view_button_recommend);
        button_recommend.setOnClickListener(this);
    }

    /**
     * 获得排行榜
     */
    private void findbuttonlist() {
        button_list = (TextView) findViewById(R.id.menu_view_button_list);
        button_list.setOnClickListener(this);
    }

    /**
     * 获得歌手
     */
    private void findbuttonsinger() {
        button_singer = (TextView) findViewById(R.id.menu_view_button_singer);
        button_singer.setOnClickListener(this);
    }

    /**
     * 获得歌曲
     */
    private void findbuttonsong() {
        button_song = (TextView) findViewById(R.id.menu_view_button_song);
        button_song.setOnClickListener(this);
    }

    /**
     * 获得分类
     */
    private void findbuttonclass() {
        button_class = (TextView) findViewById(R.id.menu_view_button_class);
        button_class.setOnClickListener(this);
    }

    private void init(Context m_context) {
        //把一个布局文件转为View对象，并且放到一个容器
        ((Activity) m_context).getLayoutInflater().inflate(R.layout.menu_view, this);
        findbuttoncommend();
        findbuttonlist();
        findbuttonsinger();
        findbuttonsong();
        findbuttonclass();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.menu_view_button_recommend:
                Toast.makeText(getContext(), "你点击了推荐按钮", Toast.LENGTH_SHORT).show();
                break;
            case  R.id.menu_view_button_list:
                Toast.makeText(getContext(), "你点击了排行榜按钮", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_view_button_singer:
                Toast.makeText(getContext(), "你点击了歌手按钮", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_view_button_song:
                Toast.makeText(getContext(), "你点击了歌曲按钮", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_view_button_class:
                Toast.makeText(getContext(), "你点击了分类按钮", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
