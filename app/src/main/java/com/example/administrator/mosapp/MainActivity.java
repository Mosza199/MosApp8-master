package com.example.administrator.mosapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String Message ="kitsak";
    public static final String Message2 ="kitsak2";
    public static final String Message3 ="kitsak3";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }
        public void gosend(View view){
            Intent intent = new Intent(this, Main2Activity.class);
            EditText editText =(EditText) findViewById(R.id.editText);
            EditText editText2 =(EditText) findViewById(R.id.editText3);
            EditText editText3 =(EditText) findViewById(R.id.editText4);
            String message = editText.getText().toString();
            String message2 = editText2.getText().toString();
            String message3 = editText3.getText().toString();
            intent.putExtra(Message, message);
            intent.putExtra(Message2, message2);
            intent.putExtra(Message3, message3);
            startActivity(intent);

        }
}
