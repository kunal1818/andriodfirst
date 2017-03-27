package com.androidproject1.bye.logfiles;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import static com.androidproject1.bye.logfiles.R.id.log_in_button;

public class Main2Activity extends Activity {
    public static String Tag= "LOG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Button go_back_button=(Button)findViewById(R.id.go_back_button);

        go_back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                go_back_button.setText("going back");
                go_back_button.setBackgroundColor(Color.CYAN);
                Intent i=new Intent(Main2Activity.this,MainActivity.class);
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
