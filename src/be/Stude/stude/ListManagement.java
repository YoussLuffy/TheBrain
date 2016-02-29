package be.Stude.stude;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ListManagement extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_management);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.list_management, menu);
		return true;
	}

}
