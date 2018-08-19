package com.example.arttherapy1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AssignmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment);

        Intent intent = getIntent();
        Assignment asgn = intent.getParcelableExtra("asgn");
        TextView textView = (TextView) this.findViewById(R.id.textView2);

        textView.setText(asgn.desc);

    }

    public void openDrawingTool(View view) {
        Intent intent = new Intent(this, DrawingActivity.class);
        startActivity(intent);
    }

}
