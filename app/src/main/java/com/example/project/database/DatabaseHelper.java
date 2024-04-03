package com.example.project.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "clover.db";
    private static final int DATABASE_VERSION = 1;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Створення таблиць
        db.execSQL(UserTable.getCreateTable());
        db.execSQL(WardrobeTable.getCreateTable());
        db.execSQL(OutfitsTable.getCreateTable());
        db.execSQL(OutfitItemsTable.getCreateTable());
        db.execSQL(WeatherTable.getCreateTable());
        db.execSQL(FabricTypesTable.getCreateTable());
        db.execSQL(CategoriesTable.getCreateTable());
        db.execSQL(WeatherTypesTable.getCreateTable());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Оновлення бази даних (якщо потрібно)
        db.execSQL("DROP TABLE IF EXISTS " + UserTable.getTableName());
        db.execSQL("DROP TABLE IF EXISTS " + WardrobeTable.getTableName());
        db.execSQL("DROP TABLE IF EXISTS " + OutfitsTable.getTableName());
        db.execSQL("DROP TABLE IF EXISTS " + OutfitItemsTable.getTableName());
        db.execSQL("DROP TABLE IF EXISTS " + WeatherTable.getTableName());
        db.execSQL("DROP TABLE IF EXISTS " + FabricTypesTable.getTableName());
        db.execSQL("DROP TABLE IF EXISTS " + CategoriesTable.getTableName());
        db.execSQL("DROP TABLE IF EXISTS " + WeatherTypesTable.getTableName());
        onCreate(db);
    }
}

