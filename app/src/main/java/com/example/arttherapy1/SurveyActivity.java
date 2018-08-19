package com.example.arttherapy1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

public class SurveyActivity extends AppCompatActivity {

    public static int happiness;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);
    }

    public void newAssignment(View view) {

        SeekBar seekH = (SeekBar) findViewById(R.id.seekBar2);
        int hValue = seekH.getProgress();

        Intent intent = new Intent(this, PreAssignmentActivity.class);
        intent.putExtra("happiness", hValue);

        startActivity(intent);



    }
}
