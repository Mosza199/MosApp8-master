package com.example.administrator.mosapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.Message);
        String message1 = intent.getStringExtra(MainActivity.Message2);
        String message2 = intent.getStringExtra(MainActivity.Message3);
        TextView textView = (TextView) findViewById(R.id.textView2);
        TextView textView2 = (TextView) findViewById(R.id.textView);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView.setText(message);
        textView2.setText(message1);
        textView3.setText(message2);

    }
        public void goback(View view){
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);

        }

}
