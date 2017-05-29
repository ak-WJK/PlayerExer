package com.atguigu.playerexer.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;

import com.atguigu.playerexer.MainActivity;
import com.atguigu.playerexer.R;

public class WecomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wecome);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity();
            }
        }, 2000);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        startActivity();
        return super.onTouchEvent(event);
    }

    private void startActivity() {
        Intent intent = new Intent(WecomeActivity.this, MainActivity.class);
        startActivity(intent);
    }

}
