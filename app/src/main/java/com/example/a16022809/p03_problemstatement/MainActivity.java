package com.example.a16022809.p03_problemstatement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvModule;
    private ArrayAdapter aa;
    private ArrayList<Course> course;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvModule = (ListView)findViewById(R.id.listviewModule);
        course = new ArrayList<Course>();
        course.add(new Course("Android Programming II","C347","https://www.rp.edu.sg/schools-courses/courses/full-time-diplomas/full-time-courses/modules/index/C347"));
        course.add(new Course("Web Services","C302","https://www.rp.edu.sg/schools-courses/courses/full-time-diplomas/full-time-courses/modules/index/C302"));


        aa = new CourseAdapter(this, R.layout.modulerow, course);
        lvModule.setAdapter(aa);

        lvModule.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Course selectedcourse = course.get(i);
                //toast
//                Toast.makeText(MainActivity.this,selectedcourse.getModuleCode()+":"+selectedcourse.getLink(),Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, Info.class);
                intent.putExtra("courseCode",selectedcourse.getModuleCode());
                intent.putExtra("link",selectedcourse.getLink());
                startActivity(intent);
            }
        });
    }
}
