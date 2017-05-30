package com.atguigu.playerexer.viewhodler;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.atguigu.playerexer.R;
import com.atguigu.playerexer.bean.ListViewBean;

/**
 * Created by Administrator on 2017/5/30.
 */

public class ADHodler extends BaseHodler {
    private final Context mContext;
    private final View convertView;
    private ListViewBean.ListBean data;

    TextView tvContext;
    ImageView ivImageIcon;
    Button btnInstall;


    public ADHodler(Context mContext, View convertView) {
        super(convertView);
        this.mContext = mContext;
        this.convertView = convertView;

        tvContext = (TextView) convertView.findViewById(R.id.tv_context);
        btnInstall = (Button) convertView.findViewById(R.id.btn_install);
        ivImageIcon = (ImageView) convertView.findViewById(R.id.iv_image_icon);


    }

    public void setData(ListViewBean.ListBean data) {
        this.data = data;
    }
}
