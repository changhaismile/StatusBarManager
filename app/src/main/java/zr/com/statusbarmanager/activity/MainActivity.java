package zr.com.statusbarmanager.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.zr.library.StatusBarManager;

import zr.com.statusbarmanager.R;
import zr.com.statusbarmanager.base.BaseActivity;


public class MainActivity extends BaseActivity implements View.OnClickListener {

    private Button mNormalButton, mDrawerLayoutButton, mCoordinatorLayoutButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        setListener();
    }

    private void initView() {
        mNormalButton = (Button) findViewById(R.id.btn_normal);
        mDrawerLayoutButton = (Button) findViewById(R.id.btn_drawer_layout);
        mCoordinatorLayoutButton = (Button) findViewById(R.id.btn_coordinator_layout);
    }

    private void setListener() {
        mNormalButton.setOnClickListener(this);
        mDrawerLayoutButton.setOnClickListener(this);
        mCoordinatorLayoutButton.setOnClickListener(this);
    }

    @Override
    protected void initStatusBar() {
        StatusBarManager.getsInstance().setColor(MainActivity.this, Color.BLUE);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_normal:
                NormalActivity.launch(MainActivity.this);
                break;

            case R.id.btn_drawer_layout:
                DrawerLayoutActivity.launch(MainActivity.this);
                break;

            case R.id.btn_coordinator_layout:
                CoordinatorLayoutActivity.launch(MainActivity.this);
                break;
        }
    }
}
