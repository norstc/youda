package com.norstc.youda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        //手机要打开日志输出 魅族note5 =》设置 =》辅助功能=》开发者选项 =》性能优化=》高级日志输出=》全部允许
        Log.d("DisplayMessageActivity","hello message" );
        Log.i("some info","what");
        // Get intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //put the text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
}
