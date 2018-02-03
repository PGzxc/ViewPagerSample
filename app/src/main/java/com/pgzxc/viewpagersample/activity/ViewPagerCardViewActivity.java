package com.pgzxc.viewpagersample.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;

import com.pgzxc.viewpagersample.R;
import com.pgzxc.viewpagersample.adapter.ClipAdapter;
import com.pgzxc.viewpagersample.transformer.ScaleTransformerCardView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2018/2/3.
 */

public class ViewPagerCardViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        List<Integer> list = new ArrayList<>();
        list.add(R.drawable.ic_home_pager_1);
        list.add(R.drawable.ic_home_pager_2);
        list.add(R.drawable.ic_home_pager_3);
        list.add(R.drawable.ic_home_pager_4);
        ClipAdapter adapter = new ClipAdapter(this, list);
        viewPager.setAdapter(adapter);
        viewPager.setPageMargin((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                48, getResources().getDisplayMetrics()));
        viewPager.setPageTransformer(false, new ScaleTransformerCardView(this));
    }
}
