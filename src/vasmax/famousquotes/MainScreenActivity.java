package vasmax.famousquotes;

import android.app.Activity;
import android.os.Bundle;

public class MainScreenActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }    
    /** Called when the activity destroyed. */    
    @Override
    public void onDestroy() {
    	super.onDestroy();
    }
}