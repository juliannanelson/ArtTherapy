package com.example.arttherapy1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class GalleryActivity extends AppCompatActivity {

    private ListView lv;

    @Override
    public void onCreate(Bundle saveInstanceState) {

        super.onCreate(saveInstanceState);

        setContentView(R.layout.activity_gallery);
        lv = (ListView) findViewById(R.id.list);

        ArrayList<Assignment> asgns = ((MyApplication) this.getApplication()).getAssignments();

        ArrayAdapter<Assignment> arrayAdapter = new ArrayAdapter<Assignment>(
                this,
                android.R.layout.simple_list_item_1,
                asgns);

        lv.setAdapter(arrayAdapter);


    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(GalleryActivity.this, HomePage.class));
        return;
    }
}
