package com.example.sooantpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText et_id;
    private Button btn_login;
    private String str;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_id = findViewById(R.id.et_id);
        btn_login = findViewById(R.id.btn_login);


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = et_id.getText().toString();
                System.out.println("aaaaaaaaaaa");
                Intent intent = new Intent(MainActivity.this, Mainpage.class);
                intent.putExtra("str",str);
                startActivity(intent);  //액티비티 이동 구문
            }
        });
    }
}