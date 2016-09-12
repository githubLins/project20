package com.example.administrator.project20;

import android.provider.BaseColumns;

/**
 * Created by Administrator on 2016/9/12.
 */
public class Words {
    public Words(){

    }
    public static abstract class Word implements BaseColumns{
        public static final String Table_name="words";
        public static final String Column_name_word="word";
        public static final String Column_name_mean="mean";
        public static final String Column_name_sample="sample";
    }
}
