package com.androidproject1.bye.logfiles;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    public static final String Tag = "LOG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final Button log_in_button=(Button)findViewById(R.id.log_in_button);

        log_in_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                log_in_button.setText("logged");
                log_in_button.setBackgroundColor(Color.CYAN);
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag,"onstart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(Tag,"onrestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Tag,"onresume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Tag,"onpause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Tag,"onstop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Tag,"ondestroy");
    }
}
