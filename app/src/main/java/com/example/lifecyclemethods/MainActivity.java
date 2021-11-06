package com.example.lifecyclemethods;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String MY_LOG="MyLogs";
    private Button openBut;
    TextView textV;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1){
            if(resultCode==RESULT_OK){
                textV.setText(data.getStringExtra("text"));

            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(MY_LOG,"onCreate");
        openBut=findViewById(R.id.openSecAct);
        textV=findViewById(R.id.textView);
        openBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivityForResult(intent,1);

            }
        });



    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(MY_LOG,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(MY_LOG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(MY_LOG,"onPause");
    }

    @Override
    protected void onRestart() {
        Log.d(MY_LOG,"onRestart");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(MY_LOG,"onDestroy");
    }

}