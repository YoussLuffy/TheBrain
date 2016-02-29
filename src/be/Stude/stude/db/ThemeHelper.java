package be.Stude.stude.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class ThemeHelper extends SQLiteOpenHelper{

	private final String CREAT_REQUEST = "CREATE TABLE " 
			+ ThemeAdapter.tableName + " ( " 
			+ ThemeAdapter.colonne_id + " INTEGER PRIMARY KEY AUTOINCREMENT, "
			+ ThemeAdapter.colonne_Name + " INT NULL";
	
	public ThemeHelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {		
	}

}
