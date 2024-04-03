package com.example.project.database;

public class OutfitsTable {
    private static final String TABLE_NAME = "outfits";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_USER_ID = "user_id";
    private static final String COLUMN_WEATHER_ID = "weather_id";

    public static String getTableName() {
        return TABLE_NAME;
    }
    public static String getCreateTable() {
        return CREATE_TABLE;
    }
    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "("
            + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + COLUMN_USER_ID + " INTEGER,"
            + COLUMN_WEATHER_ID + " INTEGER"
            + ")";
}