package com.example.a16022809.p03_problemstatement;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Info extends AppCompatActivity {
    Button info;
    private ListView lv;
    private ArrayAdapter aa;
    private ArrayList<DailyGrade> Grade;

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

        lv = (ListView)findViewById(R.id.lv);
        Grade = new ArrayList<DailyGrade>();
        Grade.add(new DailyGrade("1","B"));
        Grade.add(new DailyGrade("2","C"));
        Grade.add(new DailyGrade("3","A"));


        aa = new DailyGradeAdapter(this, R.layout.info_row, Grade);
        lv.setAdapter(aa);

    }
}
