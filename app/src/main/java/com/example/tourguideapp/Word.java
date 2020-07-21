package com.example.tourguideapp;

public class Word {

    private int mNameId;

    private int mResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED =-1;

    public Word( int nameId,int resourceId) {
        mNameId = nameId;
        mResourceId= resourceId;
    }

    public int getmNameId() {
        return mNameId;
    }

    public int getmResourceId() {
        return mResourceId;
    }


}
