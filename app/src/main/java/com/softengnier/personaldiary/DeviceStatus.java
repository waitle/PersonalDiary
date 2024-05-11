package com.softengnier.personaldiary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class DeviceStatus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_status);
        ImageButton backBtn = findViewById(R.id.btn_rtnHome_status);
        // Set a click listener on the back button
        backBtn.setOnClickListener(v -> {
            // Finish the current activity
            finish();
        });

        TextView versionTxt = findViewById(R.id.text_andoridVersion_status);
        versionTxt.setText(android.os.Build.VERSION.RELEASE);

        TextView wifiStatus = findViewById(R.id.text_wifi_status);
        wifiStatus.setText(String.valueOf(isWifiEnabled()));

        TextView cellularStatus = findViewById(R.id.text_cellular_status);
        cellularStatus.setText(String.valueOf(isCellularEnabled()));

        TextView storageStatus = findViewById(R.id.text_storage_status);
        storageStatus.setText(getStorageStatus());


    }

    private boolean isWifiEnabled() {
        return true;
    }
    private boolean isCellularEnabled() {
        return true;
    }
    private String getStorageStatus() {
        return "Storage Capacity: 64GB, Free Space: 32GB";
    }
}