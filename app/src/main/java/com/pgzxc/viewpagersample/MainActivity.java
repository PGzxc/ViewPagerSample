package com.pgzxc.viewpagersample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.pgzxc.viewpagersample.activity.ClipChildrenActivity;
import com.pgzxc.viewpagersample.activity.ViewPagerItemActivity;
import com.pgzxc.viewpagersample.activity.ViewPagerCardViewActivity;
import com.pgzxc.viewpagersample.activity.ViewPagerPadActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListener();
    }

    private void setListener() {

        findViewById(R.id.btn_clipChildren).setOnClickListener(view -> {
            startActivity(ClipChildrenActivity.class);
        });
        findViewById(R.id.btn_clipViewPager).setOnClickListener(view -> {
            startActivity(ViewPagerItemActivity.class);
        });

        findViewById(R.id.btn_clipPad).setOnClickListener(view -> {
            startActivity(ViewPagerPadActivity.class);
        });
        findViewById(R.id.btn_clipCardView).setOnClickListener(view -> {
            startActivity(ViewPagerCardViewActivity.class);
        });
    }

    public void startActivity(Class cls) {
        Intent intent = new Intent(this, cls);
        startActivity(intent);
    }
}
