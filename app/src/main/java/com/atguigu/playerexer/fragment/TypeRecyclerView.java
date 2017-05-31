package com.atguigu.playerexer.fragment;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;

import com.atguigu.playerexer.R;
import com.atguigu.playerexer.ShowPhotoActivity;
import com.atguigu.playerexer.adapter.RecyclerViewAdapter;
import com.atguigu.playerexer.bean.ListViewBean;
import com.google.gson.Gson;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2017/5/29.
 */

public class TypeRecyclerView extends BaseFragment {


    @BindView(R.id.recyclerview)
    RecyclerView recyclerview;
    Unbinder unbinder;

    private static String url = "http://s.budejie.com/topic/list/jingxuan/1/budejie-android-6.2.8/0-20.json?market=baidu&udid=863425026599592&appname=baisibudejie&os=4.2.2&client=android&visiting=&mac=98%3A6c%3Af5%3A4b%3A72%3A6d&ver=6.2.8";
    private RecyclerViewAdapter adapter;


    @Override
    public View initView() {
        View view = View.inflate(mContext, R.layout.recyclerview_layout, null);
        ButterKnife.bind(this, view);
        return view;

    }

    @Override
    protected void initData() {

        getData();
    }


    public void getData() {

        RequestParams request = new RequestParams(url);
        x.http().get(request, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
//                LogUtils.e("TAG", "RecyclerView === result" + result);
                if (!TextUtils.isEmpty(result)) {

                    analysisJson(result);

                }


            }

            @Override
            public void onError(Throwable throwable, boolean b) {

            }

            @Override
            public void onCancelled(CancelledException e) {

            }

            @Override
            public void onFinished() {

            }
        });


    }

    private void analysisJson(String json) {
        ListViewBean listViewBean = new Gson().fromJson(json, ListViewBean.class);
        final List<ListViewBean.ListBean> listBeans = listViewBean.getList();
        if (listBeans.size() > 0 && listBeans != null) {

            adapter = new RecyclerViewAdapter(mContext, listBeans);
            recyclerview.setAdapter(adapter);

            //添加布局管理器
            recyclerview.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false));

        }

        adapter.setOnItemClickListener(new RecyclerViewAdapter.onItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                String type = listBeans.get(position).getType();

                if (type != null) {
                    Intent intent = new Intent(mContext, ShowPhotoActivity.class);
                    if (type.equals("gif")) {

                        String url = listBeans.get(position).getGif().getImages().get(0);

                        intent.putExtra("url", url);

                        mContext.startActivity(intent);

                    } else if (type.equals("image")) {
                        String url = listBeans.get(position).getImage().getBig().get(0);
                        intent.putExtra("url", url);
                        mContext.startActivity(intent);
                    }
                }


            }
        });


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}