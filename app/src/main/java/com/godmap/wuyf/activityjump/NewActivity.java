package com.godmap.wuyf.activityjump;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewActivity extends AppCompatActivity {
   Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //加载布局
        setContentView(R.layout.activity_new);
        //初始化空间
        btn1=(Button)findViewById(R.id.button3);
        btn1.setOnClickListener(onclick);
    }

    View.OnClickListener onclick=new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            Intent in=getIntent();
            //关闭当前界面
            finish();
        }
    };
}
