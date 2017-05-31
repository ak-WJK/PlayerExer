package com.atguigu.playerexer.viewhodler;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.atguigu.playerexer.R;
import com.atguigu.playerexer.bean.ListViewBean;

import org.xutils.common.util.DensityUtil;
import org.xutils.image.ImageOptions;
import org.xutils.x;

/**
 * Created by Administrator on 2017/5/30.
 */

public class GifHodler extends BaseHodler {
    private final Context mContext;
    private final View convertView;
    private final ImageOptions imageOptions;
    private ListViewBean.ListBean data;

    TextView tvContext;
    ImageView ivImageGif;


    public GifHodler(Context mContext, View convertView) {
        super(convertView);

        this.mContext = mContext;
        this.convertView = convertView;

        tvContext = (TextView) convertView.findViewById(R.id.tv_context);
        ivImageGif = (ImageView) convertView.findViewById(R.id.iv_image_gif);



        imageOptions = new ImageOptions.Builder()
                //包裹类型
                .setSize(ViewGroup.LayoutParams.WRAP_CONTENT, -2)
                //设置圆角
                .setRadius(DensityUtil.dip2px(5))
                .setIgnoreGif(false)//是否忽略gif图。false表示不忽略。不写这句，默认是true
                .setImageScaleType(ImageView.ScaleType.CENTER_CROP)
                .setLoadingDrawableId(R.drawable.video_default)
                .setFailureDrawableId(R.drawable.video_default)
                .build();








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

        //下面是gif
        if (data.getGif() != null && data.getGif() != null && data.getGif().getImages() != null) {
//                Glide.with(context)
// .load(data.getGif().getImages().get(0))
// .diskCacheStrategy(DiskCacheStrategy.SOURCE)
// .into(ivImageGif);
            x.image().bind(ivImageGif, data.getGif().getImages().get(0), imageOptions);
        }



    }
}
