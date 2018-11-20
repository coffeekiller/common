package com.bubblelab.common.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;

import com.bubblelab.common.base.BaseApplication;

/**
 * Created  on 2018/11/20.
 * <p>
 * 1.用来获取resource中的各种数据
 *
 * @author JamesWang
 */

public class ResourceUtil {
    /**
     * @return 获取本应用的Resources
     */
    public static Resources getResources() {
        return BaseApplication.getContext().getResources();
    }

    /**
     * 按照string的id获取对应的string
     *
     * @param id string资源id
     */
    public static String getString(int id) {
        return getResources().getString(id);
    }

    /**
     * 获取color资源
     *
     * @param id 颜色id
     * @return 返回对应的颜色
     */
    public static int getColor(int id) {
        return getResources().getColor(id);
    }

    /**
     * 获取字符串数组资源
     *
     * @param id
     * @return
     */
    public static String[] getStringArray(int id) {
        return getResources().getStringArray(id);
    }


    /**
     * 获取dp资源
     *
     * @param id
     * @return
     */
    public static float getDimens(int id) {
        return getResources().getDimension(id);
    }

    /**
     * 获取drawable资源
     *
     * @param id
     * @return
     */
    public static Drawable getDrawable(int id) {
        return getResources().getDrawable(id);
    }

    /**
     * 获取bitmap
     *
     * @param id drawable的id值
     * @return 返回bitmap对象
     */
    public static Bitmap getBitmap(int id) {
        return BitmapFactory.decodeResource(getResources(), id);
    }


}
