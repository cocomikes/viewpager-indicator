package com.android.vp;

import android.graphics.Color;

/**
 *
 * 用于获取两个颜色的过渡色
 */
public class ColorGradient {
    /** 开始的颜色 */
    private int colorStart;
    /** 结束的颜色 */
    private int colorEnd;
    /** 开始的颜色到结束的颜色的过渡色分为几份 */
    private int count;
    /** 开始的颜色的a，r，g，b值 */
    private int[] colorStartValues;
    /** 结束的颜色的a，r，g，b值 */
    private int[] colorEndValues;

    public ColorGradient(int colorStart, int colorEnd, int count) {
        super();
        this.colorStart = colorStart;
        this.colorEnd = colorEnd;
        this.count = count;
        colorStartValues = toColorValue(colorStart);
        colorEndValues = toColorValue(colorEnd);
    }

    /**
     * 获取第几个过渡色，总共分为count个过渡色，i表示去其中的第i个过渡色
     *
     * @param i
     * @return
     */
    public int getColor(int i) {
        int[] result = new int[4];
        for (int j = 0; j < colorEndValues.length; j++) {
            result[j] = (int) (colorStartValues[j] + (colorEndValues[j] - colorStartValues[j]) * 1.0 / count * i);
        }
        return Color.argb(result[0], result[1], result[2], result[3]);
    }

    private int[] toColorValue(int color) {
        int[] values = new int[4];
        values[0] = Color.alpha(color);
        values[1] = Color.red(color);
        values[2] = Color.green(color);
        values[3] = Color.blue(color);
        return values;
    }

    public int getColorStart() {
        return colorStart;
    }

    public int getColorEnd() {
        return colorEnd;
    }

    public int getCount() {
        return count;
    }

}