package com.example.a16022809.p03_problemstatement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CourseAdapter extends ArrayAdapter<Course> {
    private ArrayList<Course> course;
    private Context context;
    private TextView tvModuleName, tvModuleCode;

    public CourseAdapter(Context context, int resource, ArrayList<Course> objects) {
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        course = objects;
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
        View rowView = inflater.inflate(R.layout.modulerow, parent, false);

        // Get the TextView object
        tvModuleCode = (TextView) rowView.findViewById(R.id.moduleCode);
        // Get the ImageView object
        tvModuleName = (TextView) rowView.findViewById(R.id.moduleName);


        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Course currentCourse = course.get(position);
        // Set the TextView to show the food

        tvModuleName.setText(currentCourse.moduleName);
        tvModuleCode.setText(currentCourse.moduleCode);

        return rowView;
    }

}