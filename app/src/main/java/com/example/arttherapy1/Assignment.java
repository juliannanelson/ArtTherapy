package com.example.arttherapy1;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

/**
 * Created by julianna on 6/22/18.
 */

public class Assignment implements Parcelable{

    /* VARIABLES */

    public String desc;
    public Bitmap pic;
    public Date date;

    /* CONSTRUCTORS */

    public Assignment(){
        desc = "Empty assignment";
        date = new Date();
    }

    public Assignment(String desc){
        this.desc = desc;
        date = new Date();
    }

    public void setImage(Bitmap img){
        this.pic = img;
    }

    /* PARCEL CONSTRUCTOR */

    public Assignment(Parcel in) {
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
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(desc);
        parcel.writeValue(date);
        parcel.writeParcelable(pic, 0);
    }

    private void readFromParcel(Parcel in ) {
        desc = in.readString();
        date = (Date) in.readValue(Date.class.getClassLoader());
        pic = in.readParcelable(Bitmap.class.getClassLoader());
    }
}
