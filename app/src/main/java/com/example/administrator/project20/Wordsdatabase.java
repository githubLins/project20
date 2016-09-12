package com.example.administrator.project20;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2016/9/12.
 */
public class Wordsdatabase extends SQLiteOpenHelper{
    private final static String Database_name="WordsDb";
    private final static int DATABASE_VERSION=1;

    private final static String SQL_CREATE_DATABASE="CREATE_TABLE"+Words.Word.Table_name +"("+
            Words.Word._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            Words.Word.Column_name_word + " TEXT" + "," +
            Words.Word.Column_name_mean + " TEXT" + ","
            + Words.Word.Column_name_sample + " TEXT" + " )";

    //删表SQL
    private final static String SQL_DELETE_DATABASE = "DROP TABLE IF EXISTS " + Words.Word.Table_name;

    public Wordsdatabase(Context context) {

        super(context, Database_name, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //创建数据库
        sqLiteDatabase.execSQL(SQL_CREATE_DATABASE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        //当数据库升级时被调用，首先删除旧表，然后调用OnCreate()创建新表
        sqLiteDatabase.execSQL(SQL_DELETE_DATABASE);
        onCreate(sqLiteDatabase);

    }
}
