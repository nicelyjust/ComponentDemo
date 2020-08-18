package com.lifesense.share.share;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.lifesense.componentbase.ServiceFactory;
import com.lifesense.share.R;
@Route(path = "/share/share")
public class ShareMainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.share_activity_share_main);

        TextView tvUser = findViewById(R.id.tv_user_id);
        tvUser.setText(getResources().getString(R.string.share_user_id, ServiceFactory.getInstance().getAccountService().getAccountID()));

        Button btnShare = findViewById(R.id.btn_share);
        btnShare.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_share) {
            if (ServiceFactory.getInstance().getAccountService().isLogin())
                Toast.makeText(this, "分享成功", Toast.LENGTH_LONG).show();
            else
                Toast.makeText(this, "用户未登录", Toast.LENGTH_LONG).show();
        }
    }
}