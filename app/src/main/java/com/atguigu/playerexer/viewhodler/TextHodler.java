package com.atguigu.playerexer.viewhodler;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.atguigu.playerexer.R;
import com.atguigu.playerexer.bean.ListViewBean;

/**
 * Created by Administrator on 2017/5/30.
 */

public class TextHodler extends BaseHodler {
    private final Context mContext;
    private final View convertView;
    private ListViewBean.ListBean data;
    TextView tvContext;

    public TextHodler(Context mContext, View convertView) {
        super(convertView);
        this.mContext = mContext;
        this.convertView = convertView;


        //中间公共部分 -所有的都有
        tvContext = (TextView) convertView.findViewById(R.id.tv_context);
    }

    public void setData(ListViewBean.ListBean data) {
        this.data = data;

        tvContext.setText(data.getText() + "_" + data.getType());

    }
}
