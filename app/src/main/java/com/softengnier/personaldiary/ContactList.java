package com.softengnier.personaldiary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;

public class ContactList extends AppCompatActivity {

    ImageButton rtnHomeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_list);
        rtnHomeBtn = findViewById(R.id.btn_rtnHome_contacts);
        rtnHomeBtn.setOnClickListener(v -> {
            finish();
        });


    }
}