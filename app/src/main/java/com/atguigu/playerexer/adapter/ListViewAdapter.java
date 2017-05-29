package com.atguigu.playerexer.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.atguigu.playerexer.bean.ListViewBean;

import java.util.List;

/**
 * Created by Administrator on 2017/5/30.
 */

public class ListViewAdapter extends BaseAdapter {
    private final Context mContext;
    private final List<ListViewBean.ListBean> beanList;

    public ListViewAdapter(Context mContext, List<ListViewBean.ListBean> beanList) {

        this.mContext = mContext;
        this.beanList = beanList;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
