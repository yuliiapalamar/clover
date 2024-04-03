package com.example.project.database;

public class WardrobeTable {
    private static final String TABLE_NAME = "wardrobe";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_USER_ID = "user_id";
    private static final String COLUMN_PHOTO_URL = "photo_url";
    private static final String COLUMN_FABRIC_TYPE_ID = "fabric_type_id";
    private static final String COLUMN_CATEGORY_ID = "category_id";

    public static String getTableName() {
        return TABLE_NAME;
    }
    public static String getCreateTable() {
        return CREATE_TABLE;
    }
    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "("
            + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + COLUMN_USER_ID + " INTEGER,"
            + COLUMN_PHOTO_URL + " TEXT,"
            + COLUMN_FABRIC_TYPE_ID + " INTEGER,"
            + COLUMN_CATEGORY_ID + " INTEGER"
            + ")";
}
