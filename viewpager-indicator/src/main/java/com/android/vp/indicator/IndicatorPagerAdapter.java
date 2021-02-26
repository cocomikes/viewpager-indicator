package com.android.vp.indicator;

import androidx.viewpager.widget.PagerAdapter;

/**
 * Created by mikes on 2018/10/25.
 */

public interface IndicatorPagerAdapter {
    PagerAdapter getPagerAdapter();

    Indicator.IndicatorAdapter getIndicatorAdapter();

    void notifyDataSetChanged();
}
