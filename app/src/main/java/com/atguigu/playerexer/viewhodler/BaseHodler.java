package com.atguigu.playerexer.viewhodler;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.atguigu.playerexer.R;

/**
 * Created by Administrator on 2017/5/30.
 */

public class BaseHodler {

//    @BindView(R.id.iv_head_portrait)
//    ImageView ivHeadPortrait;
//    @BindView(R.id.tv_user_name)
//    TextView tvUserName;
//    @BindView(R.id.tv_videoupdate_time)
//    TextView tvVideoupdateTime;
//    @BindView(R.id.ib_head_share)
//    ImageButton ibHeadShare;
//    @BindView(R.id.tv_bottem_label)
//    TextView tvBottemLabel;
//    @BindView(R.id.zan)
//    TextView zan;
//    @BindView(R.id.cai)
//    TextView cai;
//    @BindView(R.id.zhuanfa)
//    TextView zhuanfa;
//    @BindView(R.id.btn_download)
//    Button btnDownload;


    public ImageView ivHeadPortrait;
    public TextView tvUserName;
    public TextView tvVideoupdateTime;
    public ImageButton ibHeadShare;
    public TextView tvBottemLabel;
    public TextView zan;
    public TextView cai;
    public TextView zhuanfa;
    public Button btnDownload;

    public BaseHodler(View convertView) {

        ivHeadPortrait = (ImageView) convertView.findViewById(R.id.iv_head_portrait);
        tvUserName = (TextView) convertView.findViewById(R.id.tv_user_name);
        tvVideoupdateTime = (TextView) convertView.findViewById(R.id.tv_videoupdate_time);
        ibHeadShare = (ImageButton) convertView.findViewById(R.id.ib_head_share);

        tvBottemLabel = (TextView) convertView.findViewById(R.id.tv_bottem_label);
        zan = (TextView) convertView.findViewById(R.id.zan);
        cai = (TextView) convertView.findViewById(R.id.cai);
        zhuanfa = (TextView) convertView.findViewById(R.id.zhuanfa);
        btnDownload = (Button) convertView.findViewById(R.id.btn_download);


    }


}





