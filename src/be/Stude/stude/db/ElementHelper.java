package be.Stude.stude.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class ElementHelper extends SQLiteOpenHelper {

	public ElementHelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
	}

	private final String CREAT_REQUEST = "CREATE TABLE " 
			+ ElementAdapter.tableName + " ( " 
			+ ElementAdapter.colonne_id + " INTEGER PRIMARY KEY AUTOINCREMENT, "
			+ ElementAdapter.colonne_ThemeId + " TEXT NOT NULL, "
			+ ElementAdapter.colonne_Word + " TEXT NOT NULL, "
			+ ElementAdapter.colonne_Description + " TEXT NOT NULL "
			+ ElementAdapter.colonne_Check + " INT NULL, ";
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREAT_REQUEST);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {		
	}
	
}
