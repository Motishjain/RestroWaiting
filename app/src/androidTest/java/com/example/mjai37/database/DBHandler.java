package com.example.mjai37.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by mjai37 on 1/21/2016.
 */
public class DBHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "waitingCustomersDB";
    private static final String TABLE_WAITING_CUSTOMERS = "waitingCustomers";
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_CELL_PHONE = "cellPhone";
    private static final String COLUMN_TOTAL_PEOPLE = "totalPeople";
    private static final String COLUMN_WAITING_TIME = "waitingTime";
    private static final String COLUMN_EST_WAITING_TIME = "estWaitingTime";


    public DBHandler(Context context, String name,
                     SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_PRODUCTS_TABLE = "CREATE TABLE " +
                TABLE_WAITING_CUSTOMERS + "("
                + COLUMN_NAME + " TEXT," + COLUMN_CELL_PHONE
                + " TEXT," + COLUMN_TOTAL_PEOPLE + " TEXT, " + COLUMN_WAITING_TIME +"TEXT, "+ COLUMN_EST_WAITING_TIME +" TEXT)";
        db.execSQL(CREATE_PRODUCTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion,
                          int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_WAITING_CUSTOMERS);
        onCreate(db);
    }
}
