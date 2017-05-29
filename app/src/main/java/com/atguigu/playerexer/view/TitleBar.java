package com.atguigu.playerexer.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.atguigu.playerexer.R;

import butterknife.BindView;

/**
 * Created by Administrator on 2017/5/29.
 */

public class TitleBar extends LinearLayout implements View.OnClickListener {


    @BindView(R.id.tv_search)
    TextView tvSearch;
    @BindView(R.id.iv_game)
    ImageView ivGame;
    @BindView(R.id.iv_hostory)
    ImageView ivHostory;
    private Context context;

    public TitleBar(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context = context;


    }

    @Override
    protected void onFinishInflate() {
        tvSearch = (TextView) getChildAt(1);
        ivGame = (ImageView) getChildAt(2);
        ivHostory = (ImageView) getChildAt(3);



        tvSearch.setOnClickListener(this);
        ivGame.setOnClickListener(this);
        ivHostory.setOnClickListener(this);

        super.onFinishInflate();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_search:
                Toast.makeText(context, "搜索", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_game:
                Toast.makeText(context, "游戏", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_hostory:
                Toast.makeText(context, "历史", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
