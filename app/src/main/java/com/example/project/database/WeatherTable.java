package com.example.project.database;

public class WeatherTable {
    private static final String TABLE_NAME = "weather";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_DATE = "date";
    private static final String COLUMN_MIN_TEMPERATURE = "min_temperature";
    private static final String COLUMN_MAX_TEMPERATURE = "max_temperature";
    private static final String COLUMN_PRECIPITATION = "precipitation";
    private static final String COLUMN_HUMIDITY = "humidity";
    private static final String COLUMN_WIND = "wind";
    private static final String COLUMN_WEATHER_TYPE_ID = "weather_type_id";

    public static String getTableName() {
        return TABLE_NAME;
    }
    public static String getCreateTable() {
        return CREATE_TABLE;
    }
    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "("
            + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + COLUMN_DATE + " TEXT,"
            + COLUMN_MIN_TEMPERATURE + " INTEGER,"
            + COLUMN_MAX_TEMPERATURE + " INTEGER,"
            + COLUMN_PRECIPITATION + " TEXT,"
            + COLUMN_HUMIDITY + " INTEGER,"
            + COLUMN_WIND + " INTEGER,"
            + COLUMN_WEATHER_TYPE_ID + " INTEGER"
            + ")";
}
