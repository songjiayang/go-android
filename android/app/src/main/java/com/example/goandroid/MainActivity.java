package com.example.goandroid;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // register id
        findViewById(R.id.onTest).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText registerIdText =(EditText)findViewById(R.id.urlInput);
                String url = registerIdText.getText().toString();
                Log.d("GOAndroid","start speed testing with url: " + url);
                int cost = SpeedTester.INSTANCE.Perform(url);
                Log.d("GOAndroid", "finish speed testing with result: " + cost + "ms");
                return;
            };
        });

    }
}
