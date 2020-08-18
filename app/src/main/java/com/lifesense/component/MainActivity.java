package com.lifesense.component;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_go_login).setOnClickListener(v -> {
            ARouter.getInstance().build("/login/login").navigation();
        });
        findViewById(R.id.btn_go_share).setOnClickListener(v -> {
            ARouter.getInstance().build("/share/share").navigation();
        });

    }
}