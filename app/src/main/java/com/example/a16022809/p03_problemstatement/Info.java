package com.example.a16022809.p03_problemstatement;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Info extends AppCompatActivity {
    Button info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Intent i = getIntent();
        String code = i.getStringExtra("courseCode");
        final String link = i.getStringExtra("link");
        Log.i("ttt",code);
        getSupportActionBar().setTitle("Info for "+code);


        info = (Button)findViewById(R.id.buttonInfo);

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent to display data
                Intent moduleIntent = new Intent(Intent.ACTION_VIEW);
                // Set the URL to be used.
                moduleIntent.setData(Uri.parse(link));
                startActivity(moduleIntent);
            }
        });



    }
}
