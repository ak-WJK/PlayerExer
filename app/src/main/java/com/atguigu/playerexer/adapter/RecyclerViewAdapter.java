package com.atguigu.playerexer.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.atguigu.playerexer.R;
import com.atguigu.playerexer.bean.ListViewBean;
import com.atguigu.playerexer.viewhodler.ADHodler;
import com.atguigu.playerexer.viewhodler.BaseHodler;
import com.atguigu.playerexer.viewhodler.GifHodler;
import com.atguigu.playerexer.viewhodler.ImageHodler;
import com.atguigu.playerexer.viewhodler.TextHodler;
import com.atguigu.playerexer.viewhodler.VideoHodler;

import java.util.List;

/**
 * Created by Administrator on 2017/5/31.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<BaseHodler> {


//
//    /**
//     * 事件回调监听
//     */
//    private RecyclerViewAdapter.OnItemClickListener onItemClickListener;

    private final Context mContext;
    private final List<ListViewBean.ListBean> listBeans;


    /**
     * 视频
     */
    private static final int TYPE_VIDEO = 0;

    /**
     * 图片
     */
    private static final int TYPE_IMAGE = 1;

    /**
     * gif图片
     */
    private static final int TYPE_GIF = 2;

    /**
     * 文字
     */
    private static final int TYPE_TEXT = 3;

    /**
     * 广告
     */
    private static final int TYPE_AD = 4;

    public RecyclerViewAdapter(Context mContext, List<ListViewBean.ListBean> listBeans) {

        this.mContext = mContext;
        this.listBeans = listBeans;


    }


    @Override
    public BaseHodler onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View convertView = null;
        BaseHodler viewHodler = null;

//        new BaseHodler(convertView, mContext);

        switch (viewType) {
            case TYPE_VIDEO:


                if (convertView == null) {

                    convertView = View.inflate(mContext, R.layout.all_video_item, null);

                    viewHodler = new VideoHodler(mContext, convertView);

                    convertView.setTag(viewHodler);

                } else {
                    viewHodler = (VideoHodler) convertView.getTag();

                }


                break;
            case TYPE_IMAGE:


                if (convertView == null) {

                    convertView = View.inflate(mContext, R.layout.all_image_item, null);

                    viewHodler = new ImageHodler(mContext, convertView);

                    convertView.setTag(viewHodler);

                } else {
                    viewHodler = (ImageHodler) convertView.getTag();

                }


                break;
            case TYPE_GIF:

                if (convertView == null) {

                    convertView = View.inflate(mContext, R.layout.all_gif_item, null);

                    viewHodler = new GifHodler(mContext, convertView);

                    convertView.setTag(viewHodler);

                } else {
                    viewHodler = (GifHodler) convertView.getTag();

                }


                break;
            case TYPE_TEXT:


                if (convertView == null) {

                    convertView = View.inflate(mContext, R.layout.all_text_item, null);

                    viewHodler = new TextHodler(mContext, convertView);

                    convertView.setTag(viewHodler);

                } else {
                    viewHodler = (TextHodler) convertView.getTag();

                }


                break;
            case TYPE_AD:

                if (convertView == null) {

                    convertView = View.inflate(mContext, R.layout.all_ad_item, null);

                    viewHodler = new ADHodler(mContext, convertView);

                    convertView.setTag(viewHodler);

                } else {
                    viewHodler = (ADHodler) convertView.getTag();

                }


                break;
        }


        return viewHodler;
    }

    @Override
    public void onBindViewHolder(final BaseHodler baseHodler, final int position) {
        baseHodler.setData(listBeans.get(position));

        //点击监听的方法一:

        baseHodler.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int layoutPosition = baseHodler.getLayoutPosition();
                listener.onItemClick(baseHodler.itemView, layoutPosition);

            }
        });


        //实现点击监听的方法二:

//       baseHodler.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String type = listBeans.get(position).getType();
//                if (type != null) {
//                    Intent intent = new Intent(mContext, ShowPhotoActivity.class);
//
//                    if (type.equals("gif")) {
//                        String url = listBeans.get(position).getGif().getImages().get(0);
//                        intent.putExtra("url", url);
//                        mContext.startActivity(intent);
//                    } else if (type.equals("image")) {
//                        String url = listBeans.get(position).getImage().getBig().get(0);
//                        intent.putExtra("url", url);
//                        mContext.startActivity(intent);
//                    }
//                }
//
//            }
//        });


    }

    @Override
    public int getItemCount() {
        return listBeans.size();
    }

    @Override
    public int getItemViewType(int position) {

        int viewType = -1;
        String type = listBeans.get(position).getType();

        if ("video".contains(type)) {
            viewType = TYPE_VIDEO;
        } else if ("image".contains(type)) {
            viewType = TYPE_IMAGE;
        } else if ("gif".contains(type)) {
            viewType = TYPE_GIF;
        } else if ("text".contains(type)) {
            viewType = TYPE_TEXT;

        } else if ("ad".contains(type)) {
            viewType = TYPE_AD;
        }

        return viewType;

    }

    private onItemClickListener listener;


    public void setOnItemClickListener(onItemClickListener listener) {
        this.listener = listener;


    }


    public interface onItemClickListener {

        public void onItemClick(View view, int position);

    }


}
