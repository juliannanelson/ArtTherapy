package com.example.arttherapy1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PreAssignmentActivity extends AppCompatActivity {

    public Assignment asgn = new Assignment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preassignment);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        int hValue = intent.getIntExtra("happiness", 0);


        TextView textView = (TextView) this.findViewById(R.id.hpyTV);

        if (hValue == 0){
            asgn = new Assignment("Draw or paint a tree and label each of the leaves or branches with something you are grateful for, using words or images.");
            textView.setText(asgn.desc);

        } else if (hValue == 1){
            asgn = new Assignment("Draw a thought bubble or mandala and fill it with whatever's on your mind right now. Write it down or use images to represent whatever comes to mind: ideas, worries, things on your to-do list, etc. Get it all out of your head and onto the page.");
            textView.setText(asgn.desc);

        } else if (hValue == 2){
            asgn = new Assignment("Draw or paint how you're feeling today using colors, lines, shapes, words, and/or images. This can be abstract, metaphorical, or literal.");
            textView.setText(asgn.desc);

        } else if (hValue == 3){
            asgn = new Assignment("Take a moment to tune into your body and take note of any sensations you're feeling in each part of your body; do you feel tension anywhere? pain? relaxed? pressure from your seat or the floor? hot or cold? Then draw an outline of a body, and create a visual map of how you feel in each area. You can use words or colors to represent sensations.");
            textView.setText(asgn.desc);

        } else if (hValue == 4){
            asgn = new Assignment("Create a mandala that is an expression of who you want to be in 5 years. This can be abstract, metaphorical, or literal. (To make a mandala, draw a big circle and put your drawing or painting inside the circle).");
            textView.setText(asgn.desc);
        }


    }

    public void startAssignment(View view) {
        Intent intent = new Intent(this, AssignmentActivity.class);
        intent.putExtra("asgn", asgn);
        startActivity(intent);
    }

}
