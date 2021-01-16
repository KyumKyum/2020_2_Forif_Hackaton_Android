package com.example.a2020_2forifhackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_result);

        ImageButton imageButtonWrite;

        // 검색한 정보 가져오기 (intent)
        Intent intent = getIntent();
        String city = intent.getExtras().getString("CITY");

        /*
        * API에서 city로 검색하고, 검색이 잘못된 경우에 잘못되었다고 메시지를 띄워야합니다.
        * 변수는 string으로 저장되어 있습니다.
        */

        // 글작성 intent
        // to-do 로그인 세션으로, 로그인 안되어있는 상태인 경우 안되게 해야함
        imageButtonWrite = (ImageButton)findViewById(R.id.imageButtonWrite);
        imageButtonWrite.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultActivity.this, PostActivity.class);
                startActivity(intent);
            }
        });


    }
}