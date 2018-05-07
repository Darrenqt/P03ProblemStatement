package com.example.a16022809.p03_problemstatement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class AddActivity extends AppCompatActivity {
    TextView textView1;
    TextView textView2;
    Button btnSubmit;

    private ArrayList<DailyGrade> Grade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        textView1=(TextView)findViewById(R.id.textView1);

        textView2=(TextView)findViewById(R.id.textView2);
        btnSubmit=(Button)findViewById(R.id.btnSubmit);

        Grade = new ArrayList<DailyGrade>();
        String num= Integer.toString(Grade.size()+1);
        textView1.setText(num);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup rg=(RadioGroup)findViewById(R.id.rg);
                // get the id selected radio button in the radiogroup
                int selectedButtonId1=rg.getCheckedRadioButtonId();
                RadioButton rb=(RadioButton) findViewById(selectedButtonId1);

                Intent intent= new Intent(AddActivity.this,Info.class);
                intent.putExtra("add",rb.getText());
                startActivity(intent);

            }
        });



    }
}
