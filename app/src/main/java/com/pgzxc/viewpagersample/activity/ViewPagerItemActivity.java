package com.pgzxc.viewpagersample.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.pgzxc.viewpagersample.R;
import com.pgzxc.viewpagersample.adapter.MyVpAdater;
import com.pgzxc.viewpagersample.transformer.AlphaTransformer;
import com.pgzxc.viewpagersample.transformer.ScaleTransformer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2018/2/3.
 */

public class ViewPagerItemActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clip_viewpager);
        ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setPageMargin(80);
        viewPager.setOffscreenPageLimit(3);
        List<Integer> list = new ArrayList<>();
        list.add(R.drawable.ic_home_pager_1);
        list.add(R.drawable.ic_home_pager_2);
        list.add(R.drawable.ic_home_pager_3);
        list.add(R.drawable.ic_home_pager_4);
        MyVpAdater adater = new MyVpAdater(this, list);
        viewPager.setAdapter(adater);
        //viewPager.setPageTransformer(false,new AlphaTransformer());
        viewPager.setPageTransformer(false,new ScaleTransformer());
    }
}
