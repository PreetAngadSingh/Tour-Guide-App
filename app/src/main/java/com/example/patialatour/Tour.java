package com.example.patialatour;

public class Tour {
    private String mTitle;
    private String mDescription;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Tour(String title,String description){
        mTitle=title;
        mDescription=description;
    }
    //constructor calles to fill string
    public Tour(String title,String description,int imageResourceId){
        mTitle=title;
        mDescription=description;
        mImageResourceId=imageResourceId;
    }
    //get the default translation of the Tour
    public String getdescription(){
        return mDescription;
    }
    //get the miwok translation of the Tour
    public String gettitle(){
        return mTitle;
    }
    //get the resource id of the image
    public int getImageResourceId(){ return mImageResourceId;}

    public boolean hasImage(){
        return mImageResourceId!=NO_IMAGE_PROVIDED;
    }
}
