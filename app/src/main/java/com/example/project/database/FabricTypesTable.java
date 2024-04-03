package com.example.project.database;

public class FabricTypesTable {
    private static final String TABLE_NAME = "fabric_types";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_FABRIC_TYPE_NAME = "fabric_type_name";

    public static String getTableName() {
        return TABLE_NAME;
    }
    public static String getCreateTable() {
        return CREATE_TABLE;
    }
    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "("
            + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + COLUMN_FABRIC_TYPE_NAME + " TEXT"
            + ")";
}
