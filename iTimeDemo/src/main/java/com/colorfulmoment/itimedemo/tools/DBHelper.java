package com.colorfulmoment.itimedemo.tools;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
	
	private static final String DB_FILE = "itime.db";
	private static final int DB_VERSION = 1;
	public static final String DB_TABLE_EVENT = "Event";
	public static final String DB_TABLE_GROUP = "Group";

	public DBHelper(Context context) {
		super(context, DB_FILE, null, DB_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(
				"CREATE TABLE IF NOT EXISTS " + DB_TABLE_EVENT + " (" +
				"_id PRIMARY KEY AUTOINCREMENT, " +
				"eTitle VARCHAR, " +
				"eStartTime TIMESTAMP, " +
				"eEndTime TIMESTAMP, " +
				"eDescription TIMESTAMP, " +
				"ePlace VARCHAR, " +
				"eType VARCHAR, " +
				"eAlert INTEGER, " +
				"eActivity BOOLEAN, " +
				"extra1 VARCHAR, " +
				"extra2 VARCHAR)");
		db.execSQL(
				"CREATE TABLE IF NOT EXISTS " + DB_TABLE_GROUP + " (" +
				"gName VARCHAR, " +
				"gRegion VARCHAR, " +
				"gType VARCHAR, " +
				"gSetUpTime TIMESTAMP, " +
				"extra1 VARCHAR, " +
				"extra2 VARCHAR)");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
