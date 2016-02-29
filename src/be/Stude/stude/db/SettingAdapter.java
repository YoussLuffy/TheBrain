package be.Stude.stude.db;

import be.Stude.stude.struct.Setting;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class SettingAdapter {
	
	public static String dbName = "BrainTrain";
	public static String tableName = "Settings";
	public static String colonne_id = "_id";
	public static String colonne_Mode = "Mode";
	public static String colonne_Color = "Color";
	
	private SettingHelper helper;
	private SQLiteDatabase db;
	private Context context;
	
	public SettingAdapter(Context c) {
		this.context = c;
	}

	public SettingAdapter openWritable() {
		helper = new SettingHelper(context, dbName, null, 1);
		db = helper.getWritableDatabase();
		return this;
	}

	public void close() {
		db.close();
		helper.close();
	}

	public long insertSetting(Setting s) {
		ContentValues values = new ContentValues();

		values.put(colonne_Mode, s.getMode());
		values.put(colonne_Color, s.getColor());

		return db.insert(tableName, null, values);
	}

}
