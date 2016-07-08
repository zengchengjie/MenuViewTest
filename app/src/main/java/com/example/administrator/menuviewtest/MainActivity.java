package com.example.administrator.menuviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    /**
     * 推荐状态
     */
    final int STATE_RECOMMEND = 0;
    /**
     * 排行榜状态
     */
    final int STATE_LIST = STATE_RECOMMEND + 1;
    /**
     * 歌手状态
     */
    final int STATE_SINGER = STATE_LIST + 1;
    /**
     * 歌曲状态
     */
    final int STATE_SONG = STATE_SINGER + 1;
    /**
     * 分类状态
     */
    final int STATE_class = STATE_SONG + 1;
    /**
     * 当前状态值
     */
    int state = 0;
    /**
     * 推荐按钮
     */
    private TextView button_recommend;
    /**
     * 排行榜按钮
     */
    private TextView button_list;
    /**
     * 歌手按钮
     */
    private TextView button_singer;
    /**
     * 歌曲按钮
     */
    private TextView button_song;
    /**
     * 分类按钮
     */
    private TextView button_class;

    /**
     * 自定义菜单组件
     */
    MenuView m_MenuView;
//    WeixinMenu weixinMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_layout);

        m_MenuView = (MenuView) findViewById(R.id.menu_view);
        findbuttoncommend();
        findbuttonlist();
        findbutton_siger();
        findbutton_song();
        findbutton_class();
    }

    /**
     * 获得推荐按钮
     */
    private void findbuttoncommend() {
        button_recommend = (TextView) findViewById(R.id.menu_view_button_recommend);
        button_recommend.setOnClickListener(this);
    }

    /**
     * 获得排行榜按钮
     */
    private void findbuttonlist() {
        button_list = (TextView) findViewById(R.id.menu_view_button_list);
        button_list.setOnClickListener(this);
    }

    /**
     * 获得歌手按钮
     */
    private void findbutton_siger() {
        button_singer = (TextView) findViewById(R.id.menu_view_button_singer);
        button_singer.setOnClickListener(this);
    }

    /**
     * 获得歌曲按钮
     */
    private void findbutton_song() {
        button_song = (TextView) findViewById(R.id.menu_view_button_song);
        button_song.setOnClickListener(this);
    }

    /**
     * 获得分类按钮
     */
    private void findbutton_class() {
        button_class = (TextView) findViewById(R.id.menu_view_button_class);
        button_class.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.menu_view_button_recommend:
                actionRecommend();
                break;
            case R.id.menu_view_button_list:
                actionList();
                break;
            case R.id.menu_view_button_singer:
                actionSinger();
                break;
            case R.id.menu_view_button_song:
                actionSong();
                break;
            case R.id.menu_view_button_class:
                actionClass();
                break;
        }
    }

    private void actionRecommend() {
        if (state == STATE_RECOMMEND) {
            return;
        }
        changeButton();
        button_recommend.setBackgroundResource(R.mipmap.button_1_2);
        state = STATE_RECOMMEND;
    }

    private void actionList() {
        if (state == STATE_LIST) {
            return;
        }
        changeButton();
        button_list.setBackgroundResource(R.mipmap.button_2_2);
        state = STATE_LIST;
    }

    private void actionSinger() {
        if (state == STATE_SINGER) {
            return;
        }
        changeButton();
        button_singer.setBackgroundResource(R.mipmap.button_3_2);
        state = STATE_SINGER;
    }

    private void actionSong() {
        if (state == STATE_SONG) {
            return;
        }
        changeButton();
        button_song.setBackgroundResource(R.mipmap.button_4_2);
        state = STATE_SONG;
    }

    private void actionClass() {
        if (state == STATE_class) {
            return;
        }
        changeButton();
        button_class.setBackgroundResource(R.mipmap.button_5_2);
        state = STATE_class;
    }

    private void changeButton() {

        switch (state) {
            case STATE_RECOMMEND:
                button_recommend.setBackgroundResource(R.mipmap.button_1_1);
                break;
            case STATE_LIST:
                button_list.setBackgroundResource(R.mipmap.button_2_1);
                break;
            case STATE_SINGER:
                button_singer.setBackgroundResource(R.mipmap.button_3_1);
                break;
            case STATE_SONG:
                button_song.setBackgroundResource(R.mipmap.button_4_1);
                break;
            case STATE_class:
                button_class.setBackgroundResource(R.mipmap.button_5_1);
                break;

        }
    }
}
