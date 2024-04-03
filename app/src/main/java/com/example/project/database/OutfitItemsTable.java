package com.example.project.database;

public class OutfitItemsTable {
    private static final String TABLE_NAME = "outfit_items";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_OUTFIT_ID = "outfit_id";
    private static final String COLUMN_ITEM_ID = "item_id";

    public static String getTableName() {
        return TABLE_NAME;
    }
    public static String getCreateTable() {
        return CREATE_TABLE;
    }
    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "("
            + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + COLUMN_OUTFIT_ID + " INTEGER,"
            + COLUMN_ITEM_ID + " INTEGER"
            + ")";
}
