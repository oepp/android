package com.oepp.oeppMobile.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.oepp.oeppMobile.User.User;

public class SqlLiteHelper extends SQLiteOpenHelper
{
    public SqlLiteHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version)
    {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1)
    {

    }
     //Kullanıcı Kayıt Et
    public void UserRegistration(User user)
    {

    }
     //Kayıtli kullanıcıyı veritabından alır
    public User getUser(String email,String password)
    {
        return null;
    }
}
