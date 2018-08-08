package com.norstc.youda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE="com.norstc.youda.Message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity","hello world" );
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this,DisplayMessageActivity.class);
        EditText editText = (EditText)findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void helloToast(View view){
        Intent intent = new Intent(this, HelloToastActivity.class);
        startActivity(intent);
    }

    public void toYouda(View view) {
        Intent intent = new Intent(this, YoudaActivity.class);
        startActivity(intent);
    }

    public void toSelectYouda(View view) {
        Intent intent = new Intent(this,SelectYoudaActivity.class);
        startActivity(intent);
    }

    public void toListYouda(View view){
        Intent intent = new Intent(this,ListYoudaActivity.class);
        startActivity(intent);
    }
}
