package com.example.a16022809.p03_problemstatement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class AddActivity extends AppCompatActivity {
    TextView textView1;
    RadioGroup rg;
    TextView textView2;
    Button btnSubmit;
// add activity ---

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        textView1=(TextView)findViewById(R.id.textView1);
        rg=(RadioGroup)findViewById(R.id.rg);
        textView2=(TextView)findViewById(R.id.textView2);
        btnSubmit=(Button)findViewById(R.id.btnSubmit);

        // get the id selected radio button in the radiogroup
        int selectedButtonId1=rg.getCheckedRadioButtonId();

        final RadioButton rb=(RadioButton) findViewById(selectedButtonId1);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String [] info={textView1.getText().toString(),textView2.getText().toString(),rb.getText().toString()};

                Intent intent= new Intent(AddActivity.this,Info.class);

                intent.putExtra("info",info);
                startActivity(intent);

            }
        });



    }
}
