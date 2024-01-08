package com.duodevloopers.teammanagement.Custom;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

import com.duodevloopers.teammanagement.R;

import java.util.Calendar;

public class MatchCreateDialog extends AppCompatDialogFragment {
    private EditText teamName;
    private Button datePicker, timePicker;

    private TextView date, time;
    @SuppressLint("MissingInflatedId")
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();

        View view = inflater.inflate(R.layout.match_create_dialog,null);

        builder.setView(view)
                .setTitle("Create Match")
                .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setPositiveButton("create", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        teamName = view.findViewById(R.id.editTextTeamname);
        datePicker = view.findViewById(R.id.buttonDatePicker);
        timePicker = view.findViewById(R.id.buttonTimePicker);
        date = view.findViewById(R.id.tvDate);
        time = view.findViewById(R.id.tvTime);

        datePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar c = Calendar.getInstance();

                int year = c.get(Calendar.YEAR);
                int month = c.get(Calendar.MONTH);
                int day = c.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(getContext(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {
                        date.setText(dayOfMonth+" "+getMonth(monthOfYear)+", "+year);
                        date.setVisibility(View.VISIBLE);
                    }
                },year,month,day);

                datePickerDialog.show();
            }
        });

        timePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar cldr = Calendar.getInstance();
                int hour = cldr.get(Calendar.HOUR_OF_DAY);
                int minutes = cldr.get(Calendar.MINUTE);

                TimePickerDialog timePickerDialog = new TimePickerDialog(getContext(), android.R.style.Theme_Holo_Light_Dialog, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hour, int minute) {
                        time.setText(getTime(hour, minute));
                        time.setVisibility(View.VISIBLE);
                    }
                },hour,minutes,false);
                timePickerDialog.setTitle("Set Starting Time");
                timePickerDialog.show();
            }
        });

        return builder.create();
    }

    private StringBuilder getTime(int hour, int minute) {
        StringBuilder timeFormatted = new StringBuilder();

        if(hour > 12) {
            timeFormatted = new StringBuilder((hour - 12) + ":" + minute + " pm");
        } else {
            timeFormatted = new StringBuilder(hour + ":" + minute + " am");
        }

        return timeFormatted;
    }


    private static String getMonth(int i) {
        String monthName = null;
        switch (i) {
            case 0:
                monthName =  "January";
                break;
            case 1:
                monthName = "February";
                break;
            case 2:
                monthName = "March";
                break;
            case 3:
                monthName = "April";
                break;
            case 4:
                monthName = "May";
                break;
            case 5:
                monthName = "June";
                break;
            case 6:
                monthName = "July";
                break;
            case 7:
                monthName = "August";
                break;
            case 8:
                monthName = "September";
                break;
            case 9:
                monthName = "October";
                break;
            case 10:
                monthName = "November";
                break;
            case 11:
                monthName = "December";
                break;
        }
        return monthName;
    }
}
