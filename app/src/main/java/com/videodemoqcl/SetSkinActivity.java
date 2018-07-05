package com.videodemoqcl;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;

/**
 * Created by Nathen
 * On 2016/02/23 10:05
 */
public class SetSkinActivity extends AppCompatActivity {
    JCVideoPlayer videoController1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setskin);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayUseLogoEnabled(false);
        getSupportActionBar().setTitle("SetSkin");

        videoController1 = (JCVideoPlayer) findViewById(R.id.videocontroller1);
        videoController1.setUp("http://2449.vod.myqcloud.com/2449_43b6f696980311e59ed467f22794e792.f20.mp4",
                "http://p.qpic.cn/videoyun/0/2449_43b6f696980311e59ed467f22794e792_1/640",
                "一行代码实现视频播放");

    }

    @Override
    protected void onPause() {
        super.onPause();
        JCVideoPlayer.releaseAllVideos();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
