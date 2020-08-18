package com.lifesense.login.login;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.lifesense.login.R;
import com.lifesense.login.UserInfo;
import com.lifesense.login.manager.UserManager;
@Route(path = "/login/login")
public class LoginMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity_login_main);
        Button btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(v -> {
            UserInfo userInfo = new UserInfo();
            userInfo.accountID ="10010";
            userInfo.nickname = "??";
            UserManager.getInstance().saveUser(userInfo);
        });
    }
}
