package com.example.lifecyclemethods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editText=findViewById(R.id.editText);
        Intent intent=getIntent();
        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if(keyCode==KeyEvent.KEYCODE_ENTER){
                    Intent resultIntent=new Intent();
                    String result=editText.getText().toString();
                    resultIntent.putExtra("text",result);
                    setResult(RESULT_OK,resultIntent);
                    finish();

                return true;
                }else{
                return false;}
            }
        });
    }
}