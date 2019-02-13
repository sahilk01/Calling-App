package com.elgigs.callingapp;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=findViewById(R.id.tv1);
//        tv1.setTextDirection(View.TEXT_DIRECTION_RTL);
    }



    public void fone(View v) {
            tv1.setText(String.valueOf(tv1.getText())+"1");
        }


    public void two(View v) {
            tv1.setText(String.valueOf(tv1.getText())+"2");
        }


    public void three(View v) {
            tv1.setText(String.valueOf(tv1.getText())+"3");
        }


    public void four(View v) {
            tv1.setText(String.valueOf(tv1.getText())+"4");
        }


    public void five(View v) {
            tv1.setText(String.valueOf(tv1.getText())+"5");
        }


    public void six(View v) {
            tv1.setText(String.valueOf(tv1.getText())+"6");
        }


    public void seven(View v) {
            tv1.setText(String.valueOf(tv1.getText())+"7");
        }


    public void eight(View v) {
            tv1.setText(String.valueOf(tv1.getText())+"8");
        }


    public void nine(View v) {
            tv1.setText(String.valueOf(tv1.getText())+"9");
        }


    public void zero(View v) {
            tv1.setText(String.valueOf(tv1.getText())+"0");
        }


    public void back(View v) {
                String check = tv1.getText().toString();
                if(check.length()>0){
                    String h = check.toString().substring(0, check.length() - 1);
                    tv1.setText(h);
                }
        }



//    public void sms(View v){
//        String phoneNo = "+919560787007";
//        String message = "Hi whatsup";
//        SmsManager smsManager = SmsManager.getDefault();
//        smsManager.sendTextMessage("9929041994", null, message, null, null);
//    }

    public void call(View v)
    {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED)
        {
            String val = tv1.getText().toString();
            String num = "tel:"+val;
            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse(num));
            startActivity(intent);
        }
        else
        {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
            {
                requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 10);
            }
        }

    }

}
