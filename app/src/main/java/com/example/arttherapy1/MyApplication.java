package com.example.arttherapy1;

import android.app.Application;

import com.example.arttherapy1.Assignment;

import java.util.ArrayList;

/**
 * Created by julianna on 8/19/18.
 */

public class MyApplication extends Application {

    private ArrayList<Assignment> assignments = new ArrayList<Assignment>();

    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    public void addAssignment(Assignment asgn) {
        this.assignments.add(asgn);
    }
}
