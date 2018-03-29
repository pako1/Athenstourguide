package com.example.android.athenstourguide;

public class Model {

    private int mImage;
    private String mSightname;
    private String mAddress;
    private String mPhone;
    private String mSchedule;
    private String mPrice;
    private String mDescription;

    public String getmDescription() {
        return mDescription;
    }

    public int getmImage() {
        return mImage;
    }

    public String getmSightname() {
        return mSightname;
    }

    public String getmAddress() {
        return mAddress;
    }

    public String getmPhone() {
        return mPhone;
    }

    public String getmSchedule() {
        return mSchedule;
    }

    public String getmPrice() {
        return mPrice;
    }

    Model(int mImage, String mSightname, String mAddress, String mPhone, String mSchedule, String mPrice, String mDescription) {
        this.mImage = mImage;
        this.mSightname = mSightname;
        this.mAddress = mAddress;
        this.mPhone = mPhone;
        this.mSchedule = mSchedule;
        this.mPrice = mPrice;
        this.mDescription = mDescription;
    }
}
