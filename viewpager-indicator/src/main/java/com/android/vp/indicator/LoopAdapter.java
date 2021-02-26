package com.android.vp.indicator;

/**
 * Created by mikes on 2018/10/25.
 */

public abstract class LoopAdapter implements IndicatorPagerAdapter {
    public abstract int getRealPosition(int position);

    public abstract void setLoop(boolean loop);

    public abstract int getCount();
}
