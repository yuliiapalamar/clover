package com.example.project.database;

public class WeatherTypesTable {
    private static final String TABLE_NAME = "weather_types";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_TYPE = "type";

    public static String getTableName() {
        return TABLE_NAME;
    }
    public static String getCreateTable() {
        return CREATE_TABLE;
    }
    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "("
            + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + COLUMN_TYPE + " TEXT"
            + ")";
}