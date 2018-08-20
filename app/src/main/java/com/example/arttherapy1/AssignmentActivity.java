package com.example.arttherapy1;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AssignmentActivity extends AppCompatActivity {

    static final int REQUEST_IMAGE_CAPTURE = 1;

    private Assignment asgn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment);

        //Get assignment object from intent
        Intent intent = getIntent();
        asgn = intent.getParcelableExtra("asgn");

        //Set text to assignment description
        TextView textView = (TextView) this.findViewById(R.id.textView2);
        textView.setText(asgn.desc);

    }


    //Open custom drawing tool
    public void openDrawingTool(View view) {
        Intent intent = new Intent(this, DrawingActivity.class);
        startActivityForResult(intent, 0);
    }


    //Use camera API to take image
    public void dispatchTakePictureIntent(View view) {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }


    //Action for after picture has been returned by camera or drawing tool
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        // If we used the camera to take an image
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            asgn.setImage(imageBitmap);

            Intent intent = new Intent(this, DisplayActivity.class);
            intent.putExtra("asgn", asgn);
            startActivity(intent);

        //If we used the drawing tool to take an image (TBD)
        }else{

            //REPLACE THIS IN THE FUTURE
            asgn.setImage(Bitmap.createBitmap(100, 100, Bitmap.Config.ALPHA_8));
            Intent intent = new Intent(this, DisplayActivity.class);
            intent.putExtra("asgn", asgn);
            startActivity(intent);

        }
    }

}
