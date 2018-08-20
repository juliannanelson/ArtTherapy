package com.example.arttherapy1;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    Assignment asgn = new Assignment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        //Get assignment object from intent
        Intent intent = getIntent();
        Assignment asgn = intent.getParcelableExtra("asgn");
        ((MyApplication) this.getApplication()).addAssignment(asgn);

        //Set image
        ImageView img = (ImageView) findViewById(R.id.imageView3);
        img.setImageBitmap(asgn.pic);

        //Set text
        TextView text = (TextView) findViewById(R.id.textView4);
        text.setText(asgn.desc);

    }

    //Go to gallery if we press back button
    @Override
    public void onBackPressed() {
        startActivity(new Intent(DisplayActivity.this, GalleryActivity.class));
        return;
    }

}
