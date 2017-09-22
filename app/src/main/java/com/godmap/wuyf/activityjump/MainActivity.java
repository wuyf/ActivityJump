package com.godmap.wuyf.activityjump;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
  Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.button);
        btn1.setOnClickListener(click);
    }
    //监听对象
    View.OnClickListener click=new View.OnClickListener()
    {

        @Override
        public void onClick(View v) {
            Intent it=new Intent(MainActivity.this,NewActivity.class);
            startActivityForResult(it,RESULT_OK);
        }
    };
}
