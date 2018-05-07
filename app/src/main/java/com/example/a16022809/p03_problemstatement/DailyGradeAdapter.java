package com.example.a16022809.p03_problemstatement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class DailyGradeAdapter extends ArrayAdapter<DailyGrade> {
    private ArrayList<DailyGrade> grade;
    private Context context;
    private TextView tvDG, tvGrade, tvWeek;


    public DailyGradeAdapter(Context context, int resource, ArrayList<DailyGrade> objects) {
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        grade = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }





    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.info_row, parent, false);

        // Get the TextView object
        tvDG = (TextView) rowView.findViewById(R.id.textViewDG);
        // Get the ImageView object
        tvGrade = (TextView) rowView.findViewById(R.id.textViewGrade);
        tvWeek = (TextView)rowView.findViewById(R.id.textViewWeek);
//
//
        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        DailyGrade currentGrade = grade.get(position);
        // Set the TextView to show the food

        tvDG.setText("DG");
        tvWeek.setText("Week");
        tvGrade.setText(currentGrade.getGrade());

        return rowView;
    }

}
