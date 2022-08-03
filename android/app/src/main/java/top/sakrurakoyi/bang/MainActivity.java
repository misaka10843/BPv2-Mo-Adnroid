package top.sakrurakoyi.bang;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.ActionBar;

import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Hide both the navigation bar and the status bar.
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // Hide Action bar.
        ActionBar actionBar = getSupportActionBar();
        // Notice:Replace getSupportActionBar() with getActionBar() if you aren't using androidx...
        if (actionBar != null) {
            actionBar.hide();
        }
    }
}
