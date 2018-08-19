package com.example.arttherapy1;

import android.media.Image;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by julianna on 6/22/18.
 */

public class Assignment implements Parcelable{

    /* VARIABLES */

    private int id;
    public String desc;
    public Image pic;

    /* CONSTRUCTORS */

    public Assignment(){
        this.id = 1;
        desc = "Empty assignment";
    }

    public Assignment(String desc){

        this.id = 1;
        this.desc = desc;
    }

    public Assignment(Parcel in ) {
        readFromParcel( in );
    }

    /* PARCEL CREATOR */

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Object createFromParcel(Parcel in ) {
            return new Assignment( in );
        }

        public Assignment[] newArray(int size) {
            return new Assignment[size];
        }
    };

    /* PARCEL METHODS */

    @Override
    public int describeContents() {
        return id;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(desc);
    }

    private void readFromParcel(Parcel in ) {

        desc = in.readString();

    }
}
