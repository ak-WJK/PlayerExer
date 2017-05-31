package com.atguigu.playerexer.viewhodler;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.atguigu.playerexer.R;
import com.atguigu.playerexer.bean.ListViewBean;

import org.xutils.x;

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


        if (data.getU() != null && data.getU().getHeader() != null && data.getU().getHeader().get(0) != null) {
            x.image().bind(ivHeadPortrait, data.getU().getHeader().get(0));

        }

        if (data.getU() != null && data.getU().getName() != null) {

            tvUserName.setText(data.getU().getName()+"");
        }

        tvVideoupdateTime.setText(data.getPasstime());
        tvContext.setText(data.getText() + "_" + data.getType());

    }
}
