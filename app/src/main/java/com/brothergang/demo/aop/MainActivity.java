package com.brothergang.demo.aop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = MainActivity.class.getSimpleName();

    private Button mBtnIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnIntent = (Button)findViewById(R.id.btn_intent);
        mBtnIntent.setOnClickListener(this);

        Button btnClick = (Button)findViewById(R.id.btn_click);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "我被点击了", Toast.LENGTH_SHORT).show();
                LogUtils.i(this.getClass(), "=== 我被点击了 ===");
            }
        });

        TextView txtTitle = (TextView)findViewById(R.id.txt_title);
        txtTitle.setText(TAG);
    }

    @Override
    public void onClick(View view) {
        if (view.equals(mBtnIntent)) {
            Intent intent = new Intent(this, TestActivity.class);
            startActivity(intent);
        }
    }
}
