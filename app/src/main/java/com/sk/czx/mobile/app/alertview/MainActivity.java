package com.sk.czx.mobile.app.alertview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sk.czx.mobile.app.alertlibrary.DialogAlert;
import com.sk.czx.mobile.app.alertview.util.AlertUtil;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                AlertUtil.showAlert(this,"默认的!");
                break;
            case R.id.button2:
                AlertUtil.showError(this,"确定删除？").setOnDialogAlertClickListener(new DialogAlert.OnDialogAlertClickListener() {
                    @Override
                    public void onSubmitClick(DialogAlert dialogAlert) {
                        dialogAlert.dismiss();
                    }

                    @Override
                    public void onCancelClick(DialogAlert dialogAlert) {
                        dialogAlert.dismiss();
                    }
                });
                break;
            case R.id.button3:
                AlertUtil.showWarning(this,"警告!");
                break;
            case R.id.button4:
                AlertUtil.showSuccess(this,"OK!");
                break;
            case R.id.button5:
                AlertUtil.showAlert(this,"OK!","提示信息");
                break;
        }
    }
}
