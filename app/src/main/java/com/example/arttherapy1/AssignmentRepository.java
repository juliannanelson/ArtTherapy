package com.example.arttherapy1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by julianna on 6/25/18.
 */

public class AssignmentRepository {

    FileOutputStream stream;

    private GsonBuilder bldr;
    private Gson assignmentRepo;
    private File repoFile;

    public AssignmentRepository() throws Exception{

        repoFile = new File("assignments.json");

        try {

            stream = new FileOutputStream(repoFile.getName(), true);
            stream.close();

        }catch(Exception e){

            repoFile.createNewFile();

            stream = new FileOutputStream(repoFile.getName(), true);
            stream.close();

        }
    }

}
