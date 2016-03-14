package be.Stude.stude.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import be.Stude.stude.struct.Element;

public class ElementAdapter {
	public static String dbName = "BrainTrain";
	public static String tableName = "Quiz";
	public static String colonne_id = "_id";
	public static String colonne_ThemeId = "Theme";
	public static String colonne_Word = "Word";
	public static String colonne_Description = "Description";
	public static String colonne_Check = "Check";

	private ElementHelper helper;
	private SQLiteDatabase db;
	private Context context;

	public ElementAdapter(Context c) {
		this.context = c;
	}

	public ElementAdapter openWritable() {
		helper = new ElementHelper(context, dbName, null, 1);
		db = helper.getWritableDatabase();
		return this;
	}

	public void close() {
		db.close();
		helper.close();
	}

	public long insertElement(Element e) {
		ContentValues values = new ContentValues();

		values.put(colonne_ThemeId, e.getThemeId());
		values.put(colonne_Word, e.getWord());
		values.put(colonne_Description, e.getDescription());
		values.put(colonne_Check, e.getCheck());

		return db.insert(tableName, null, values);
	}

	public Cursor getAllChar() {
		String[] selectAll = { colonne_id, colonne_ThemeId, colonne_Word,
				colonne_Description, colonne_Description };
		Cursor c = db.query(tableName, selectAll, null, null, null, null, null);
		return c;
	}

	public void delElement(int id) {

		try {
			String query = "DELETE FROM Quiz WHERE id=" + id;
		} catch (SQLiteException e) {

		}

		db.delete(tableName, colonne_id + " = ?",
				new String[] { String.valueOf(id) });
	}

	public void delTheme(int themeId) {
		db.delete(tableName, colonne_id + " = ?",
				new String[] { String.valueOf(themeId) });
	}

	public void editWord(int id, String word) {
		ContentValues values = new ContentValues();
		values.put(colonne_Word, word);
		String clause = "_id=" + id;
		
		db.update(tableName, values, clause, null);
	}

	public void editDescription(int id, String description) {
		ContentValues values = new ContentValues();
		values.put(colonne_Description, description);
		String clause = "_id=" + id;
		
		db.update(tableName, values, clause, null);
	}
}
