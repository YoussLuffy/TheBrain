package be.Stude.stude.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class SettingHelper extends SQLiteOpenHelper {

	private final String CREAT_REQUEST = "CREATE TABLE " 
			+ SettingAdapter.tableName + " ( " 
			+ SettingAdapter.colonne_id + " INTEGER PRIMARY KEY AUTOINCREMENT, "
			+ SettingAdapter.colonne_Mode + " INT NULL,"
			+ SettingAdapter.colonne_Color + " TEXT NOT NULL";
	
	public SettingHelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}

}
