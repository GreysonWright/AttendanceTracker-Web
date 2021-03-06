package com.helper.attendence.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

/* File created by: Zack Witherspoon
/  Description: This class is an adapter that helps to inflate and populate the ArrayList of
/      attendance for the choosen class
*/

public class AttendanceAdapter extends ArrayAdapter<Attendance> {

    private LayoutInflater mInflater;
    private ArrayList<Attendance> users;
    private int mViewResourceId;

    //Function created by: Zack Witherspoon
    public AttendanceAdapter(Context context, int textViewResourceId, ArrayList<Attendance> users) {
        super(context, textViewResourceId, users);
        this.users = users;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mViewResourceId = textViewResourceId;
    }

    //Function created by: Zack Witherspoon
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mInflater.inflate(mViewResourceId, null);
        Attendance user = users.get(position);
        if (user != null) {
            TextView firstName = (TextView) convertView.findViewById(R.id.textFirstName);
            TextView lastName = (TextView) convertView.findViewById(R.id.textLastName);
            if (firstName != null) {
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                System.out.println("On date: " + user.getDate() + " and attendance: " + user.getDidAttend().toString());
                String strDate = formatter.format(user.getDate());
                System.out.println("Date: " + strDate);
                firstName.setText(strDate);
            }
            if (lastName != null) {
                lastName.setText(user.getDidAttend().toString());
            }
        }

        return convertView;
    }
}