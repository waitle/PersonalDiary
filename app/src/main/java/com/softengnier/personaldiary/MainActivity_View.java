package com.softengnier.personaldiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity_View extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout menu_contacts = findViewById(R.id.menu_contacts);
        LinearLayout menu_web = findViewById(R.id.menu_webSearch);
        LinearLayout menu_device = findViewById(R.id.menu_deviceStatus);
        LinearLayout menu_author = findViewById(R.id.menu_authorInfo);


        menu_contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //intent to contacts activity
                Intent intent = new Intent(MainActivity_View.this, ContactList_View.class);
                //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }
        });
        menu_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_View.this, WebSearch_View.class);
                //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        menu_device.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_View.this, DeviceStatus_View.class);
                //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        menu_author.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_View.this, AuthorInfo_View.class);
                //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}