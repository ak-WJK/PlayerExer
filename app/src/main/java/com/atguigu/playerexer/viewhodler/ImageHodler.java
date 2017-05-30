package com.atguigu.playerexer.viewhodler;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.atguigu.playerexer.R;
import com.atguigu.playerexer.bean.ListViewBean;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

/**
 * Created by Administrator on 2017/5/30.
 */

public class ImageHodler extends BaseHodler {
    private final Context mContext;
    private final View convertView;
    private ListViewBean.ListBean data;


    TextView tvContext;
    ImageView ivImageIcon;


    public ImageHodler(Context mContext, View convertView) {
        super(convertView);
        this.mContext = mContext;
        this.convertView = convertView;

        tvContext = (TextView) convertView.findViewById(R.id.tv_context);
        ivImageIcon = (ImageView) convertView.findViewById(R.id.iv_image_icon);

    }

    public void setData(ListViewBean.ListBean data) {
        this.data = data;
        tvContext.setText(data.getText() + "_" + data.getType());

        ivImageIcon.setImageResource(R.drawable.bg_item);

        if (data.getImage() != null && data.getImage() != null && data.getImage().getSmall() != null) {
            Glide.with(mContext)
                    .load(data.getImage()
                            .getDownload_url().get(0))
                    .placeholder(R.drawable.bg_item)
                    .error(R.drawable.bg_item)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(ivImageIcon);
        }


    }
}
