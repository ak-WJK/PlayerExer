package com.atguigu.playerexer.fragment;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.atguigu.playerexer.R;
import com.atguigu.playerexer.adapter.ListViewAdapter;
import com.atguigu.playerexer.bean.ListViewBean;
import com.atguigu.playerexer.utlis.LogUtils;
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

public class ListView extends BaseFragment {


    @BindView(R.id.listview)
    android.widget.ListView listview;
    @BindView(R.id.hint)
    TextView hint;
    Unbinder unbinder;

    private static String url = "http://s.budejie.com/topic/list/jingxuan/1/budejie-android-6.2.8/0-20.json?market=baidu&udid=863425026599592&appname=baisibudejie&os=4.2.2&client=android&visiting=&mac=98%3A6c%3Af5%3A4b%3A72%3A6d&ver=6.2.8";
    private ListViewAdapter adapter;

    @Override
    public View initView() {
        View rootView = View.inflate(mContext, R.layout.list_fragment, null);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
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
                LogUtils.e("TAG", "result" + result);
                if (!TextUtils.isEmpty(result)) {
                    analysisJson(result);
                }


            }

            @Override
            public void onError(Throwable throwable, boolean b) {
                LogUtils.e("TAG", "onError" + throwable.getMessage());

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
        List<ListViewBean.ListBean> beanList = listViewBean.getList();

        if (beanList != null && beanList.size() > 0) {
            adapter = new ListViewAdapter(mContext, beanList);
            listview.setAdapter(adapter);

        }


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

}
