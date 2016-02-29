package be.Stude.stude.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import be.Stude.stude.struct.Setting;

public class ThemeAdapter {

	public static String dbName = "BrainTrain";
	public static String tableName = "Themes";
	public static String colonne_id = "_id";
	public static String colonne_Name = "Name";
	
	private ThemeHelper helper;
	private SQLiteDatabase db;
	private Context context;
	
	public ThemeAdapter(Context c) {
		this.context = c;
	}

	public ThemeAdapter openWritable() {
		helper = new ThemeHelper(context, dbName, null, 1);
		db = helper.getWritableDatabase();
		return this;
	}

	public void close() {
		db.close();
		helper.close();
	}

	public long insertTheme(Setting s) {
		ContentValues values = new ContentValues();
		values.put(colonne_Name, s.getMode());
		return db.insert(tableName, null, values);
	}
}
