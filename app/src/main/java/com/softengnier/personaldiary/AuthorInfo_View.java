package com.softengnier.personaldiary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;

public class AuthorInfo_View extends AppCompatActivity {

    ImageButton rtnHomeBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_author_info);

        rtnHomeBtn = findViewById(R.id.btn_rtnHome_author);
        rtnHomeBtn.setOnClickListener(v -> {
            finish();
        });
    }
}