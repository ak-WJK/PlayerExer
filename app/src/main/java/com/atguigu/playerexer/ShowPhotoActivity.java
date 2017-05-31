package com.atguigu.playerexer;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.github.chrisbanes.photoview.PhotoView;
import com.github.chrisbanes.photoview.PhotoViewAttacher;

import org.xutils.common.Callback;
import org.xutils.common.util.DensityUtil;
import org.xutils.image.ImageOptions;
import org.xutils.x;

public class ShowPhotoActivity extends AppCompatActivity {

    private PhotoView iv_photo;
    private String url;
    private ImageOptions imageOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_photo);
        iv_photo = (PhotoView) findViewById(R.id.iv_photo);

        url = getIntent().getStringExtra("url");

        final PhotoViewAttacher viewAttacher = new PhotoViewAttacher(iv_photo);


        imageOptions = new ImageOptions.Builder()
//                .setSize(DensityUtil.dip2px(80), DensityUtil.dip2px(80))
                //设置圆角
                .setRadius(DensityUtil.dip2px(5))
                .setIgnoreGif(false)//是否忽略gif图。false表示不忽略。不写这句，默认是true
                .setImageScaleType(ImageView.ScaleType.CENTER_CROP)
                .setLoadingDrawableId(R.drawable.video_default)
                .setFailureDrawableId(R.drawable.video_default)
                .build();


        x.image().bind(iv_photo, url, imageOptions, new Callback.CommonCallback<Drawable>() {
            @Override
            public void onSuccess(Drawable drawable) {
                viewAttacher.update();
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
}
