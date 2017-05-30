package com.atguigu.playerexer.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.atguigu.playerexer.R;
import com.atguigu.playerexer.bean.ListViewBean;

import java.util.List;

/**
 * Created by Administrator on 2017/5/30.
 */

public class ListViewAdapter extends BaseAdapter {
    private final Context mContext;
    private final List<ListViewBean.ListBean> beanList;


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


    public ListViewAdapter(Context mContext, List<ListViewBean.ListBean> beanList) {

        this.mContext = mContext;
        this.beanList = beanList;
    }

    @Override
    public int getCount() {
        return beanList.size();
    }

    @Override
    public int getViewTypeCount() {
        return 5;
    }

    @Override
    public int getItemViewType(int position) {
        int viewType = -1;
        ListViewBean.ListBean bean = beanList.get(position);

        String type = bean.getType();
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


    @Override
    public Object getItem(int position) {
        return beanList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = initView(convertView, getItemViewType(position), beanList.get(position));
        return convertView;
    }

    private View initView(View convertView, int itemViewType, ListViewBean.ListBean listBean) {
        switch (itemViewType) {
            case TYPE_VIDEO:

                if (convertView == null) {
                    convertView = View.inflate(mContext, R.layout.all_video_item,null);


                }



                break;
            case TYPE_IMAGE:

                break;
            case TYPE_GIF:

                break;
            case TYPE_TEXT:

                break;
            case TYPE_AD:

                break;
        }


        return null;

    }
}
