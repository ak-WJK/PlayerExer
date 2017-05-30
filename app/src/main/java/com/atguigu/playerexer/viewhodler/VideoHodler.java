package com.atguigu.playerexer.viewhodler;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.atguigu.playerexer.R;
import com.atguigu.playerexer.bean.ListViewBean;
import com.atguigu.playerexer.utlis.Utils;
import com.bumptech.glide.Glide;

import org.xutils.x;

import java.util.List;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

/**
 * Created by Administrator on 2017/5/30.
 */

public class VideoHodler extends BaseHodler {


    private final Context mContext;
    private final View convertView;
//    @BindView(R.id.tv_context)
//    TextView tvContext;
//    @BindView(R.id.tv_play_nums)
//    TextView tvPlayNums;
//    @BindView(R.id.tv_video_duration)
//    TextView tvVideoDuration;
//    @BindView(R.id.rl_holder)
//    RelativeLayout rlHolder;
//    @BindView(R.id.iv_commant)
//    ImageView ivCommant;
//    @BindView(R.id.tv_commant_context)
//    TextView tvCommantContext;


    TextView tvContext;
    JCVideoPlayerStandard jcvVideoplayer;
    TextView tvPlayNums;
    TextView tvVideoDuration;
    ImageView ivCommant;
    TextView tvCommantContext;


    private ListViewBean.ListBean data;

//    @BindView(R.id.jcv_videoplayer)
//    JCVideoPlayerStandard jcVideoplayer;

    private Utils utils;

    public VideoHodler(Context mContext, View convertView) {
        super(convertView);

        this.mContext = mContext;
        this.convertView = convertView;
        utils = new Utils();


        tvContext = (TextView) convertView.findViewById(R.id.tv_context);

        tvPlayNums = (TextView) convertView.findViewById(R.id.tv_play_nums);
        tvVideoDuration = (TextView) convertView.findViewById(R.id.tv_video_duration);
        ivCommant = (ImageView) convertView.findViewById(R.id.iv_commant);
        tvCommantContext = (TextView) convertView.findViewById(R.id.tv_commant_context);
        jcvVideoplayer = (JCVideoPlayerStandard) convertView.findViewById(R.id.jcv_videoplayer);


    }


    public void setData(ListViewBean.ListBean data) {
        this.data = data;


        if (data.getU() != null && data.getU().getHeader() != null && data.getU().getHeader().get(0) != null) {
            x.image().bind(ivHeadPortrait, data.getU().getHeader().get(0));

            if (data.getU() != null && data.getU().getName() != null) {

                tvUserName.setText(data.getU().getName());
            }
            tvVideoupdateTime.setText(data.getPasstime());

            //设置视频的标签

            List<ListViewBean.ListBean.TagsBean> tags = data.getTags();
            if (tags.size() > 0 && tags != null) {
                StringBuffer stringBuffer = new StringBuffer();
                for (int i = 0; i < tags.size(); i++) {

                    stringBuffer.append(tags.get(i).getName() + " ");
                }
                tvBottemLabel.setText(stringBuffer.toString());
            }


            // 踩 赞 转发
            zan.setText(data.getUp());
            cai.setText(data.getDown() + "");
            zhuanfa.setText(data.getForward() + "");

            tvContext.setText(data.getText() + "_" + data.getType());

        }

        boolean setUp = jcvVideoplayer.setUp(data.getVideo().getVideo().get(0), JCVideoPlayerStandard.SCREEN_LAYOUT_LIST, "");
        if (setUp) {


            Glide.with(mContext).load(data.getVideo().getThumbnail_small().get(0)).into(jcvVideoplayer.thumbImageView);

        }

        tvPlayNums.setText(data.getVideo().getPlaycount() + "次播放");

        tvVideoDuration.setText(utils.stringForTime(data.getVideo().getDuration() * 1000) + "");


    }
}
