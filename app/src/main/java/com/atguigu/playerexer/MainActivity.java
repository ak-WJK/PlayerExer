package com.atguigu.playerexer;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.atguigu.playerexer.fragment.BaseFragment;
import com.atguigu.playerexer.fragment.ListView;
import com.atguigu.playerexer.fragment.LocalAudio;
import com.atguigu.playerexer.fragment.LocalVideo;
import com.atguigu.playerexer.fragment.NetVideo;
import com.atguigu.playerexer.fragment.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.fl_content)
    FrameLayout flContent;
    @BindView(R.id.tv_search)
    TextView tvSearch;
    @BindView(R.id.iv_game)
    ImageView ivGame;
    @BindView(R.id.iv_hostory)
    ImageView ivHostory;

    @BindView(R.id.rb_locla_video)
    RadioButton rbLoclaVideo;
    @BindView(R.id.rb_locla_audio)
    RadioButton rbLoclaAudio;
    @BindView(R.id.rb_net_video)
    RadioButton rbNetVideo;
    @BindView(R.id.rb_listview)
    RadioButton rbListview;
    @BindView(R.id.rb_recyclerview)
    RadioButton rbRecyclerview;
    @BindView(R.id.rg_main)
    RadioGroup rgMain;

    private ArrayList<BaseFragment> fragments;
    private int position;
    private SensorManager sensorManager;
    private JCVideoPlayer.JCAutoFullscreenListener autoFullscreenListener;
    private Sensor defaultSensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        fragments = new ArrayList<>();
        fragments.add(new LocalVideo());
        fragments.add(new LocalAudio());
        fragments.add(new NetVideo());
        fragments.add(new ListView());
        fragments.add(new RecyclerView());


        rgMain.setOnCheckedChangeListener(new MyOnCheckedChangeListener());

        rgMain.check(R.id.rb_locla_video);


        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        autoFullscreenListener = new JCVideoPlayer.JCAutoFullscreenListener();


    }


    @Override
    protected void onResume() {
        super.onResume();
        defaultSensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sensorManager.registerListener(autoFullscreenListener, defaultSensor, SensorManager.SENSOR_DELAY_NORMAL);

    }

    class MyOnCheckedChangeListener implements RadioGroup.OnCheckedChangeListener {


        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            switch (checkedId) {
                case R.id.rb_locla_video:
                    position = 0;
                    break;
                case R.id.rb_locla_audio:
                    position = 1;
                    break;
                case R.id.rb_net_video:
                    position = 2;
                    break;
                case R.id.rb_listview:
                    position = 3;
                    break;
                case R.id.rb_recyclerview:
                    position = 4;
                    break;
            }

            BaseFragment currentFragment = fragments.get(position);
            selectFragment(currentFragment);

        }
    }

    private Fragment tempFragment;

    private void selectFragment(BaseFragment currentFragment) {


        if (currentFragment != tempFragment) {

            FragmentTransaction fm = this.getSupportFragmentManager().beginTransaction();

            if (!currentFragment.isAdded()) {
                if (tempFragment != null) {
                    fm.hide(tempFragment);
                }
                fm.add(R.id.fl_content, currentFragment);
            } else {
                if (tempFragment != null) {
                    fm.hide(tempFragment);
                }
                fm.show(currentFragment);

            }

            tempFragment = currentFragment;
            fm.commit();
        }

    }


    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(autoFullscreenListener);
        JCVideoPlayer.releaseAllVideos();

    }

    @Override
    public void onBackPressed() {
        if (JCVideoPlayer.backPress()) {
            return;
        }
        super.onBackPressed();
    }

}
