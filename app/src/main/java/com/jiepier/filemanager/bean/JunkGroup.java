package com.jiepier.filemanager.bean;

import java.util.ArrayList;

/**
 * Created by panruijie on 2017/2/15.
 * Email : zquprj@gmail.com
 */

public class JunkGroup {

    public static final int PROCESS = 0;
    public static final int CACHE = 1;
    public static final int APK = 2;
    public static final int TEMP = 3;
    public static final int LOG = 4;
    public static final int AD = 5;
    public static final int BIG_FILE = 6;

    private String mName;
    private long mSize;
    private ArrayList<JunkProcessInfo> mChildren;

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public long getmSize() {
        return mSize;
    }

    public void setSize(long mSize) {
        this.mSize = mSize;
    }

    public ArrayList<JunkProcessInfo> getChildren() {
        return mChildren;
    }

    public void setChildren(ArrayList<JunkProcessInfo> mChildren) {
        this.mChildren = mChildren;
    }
}
