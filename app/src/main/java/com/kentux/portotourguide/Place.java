package com.kentux.portotourguide;

/**
 * Created by Tiago Gomes on 20/05/2017.
 */

public class Place {
    //Name of the place
    private String mPlaceName;
    //Address of the place
    private String mPlaceAddress;
    //Image resource Id for the specific place
    private int mImageResourceId;

    public Place(String placeName, String placeAddress, int imageResourceId) {
        mPlaceName = placeName;
        mPlaceAddress = placeAddress;
        mImageResourceId = imageResourceId;
    }

    public String getPlaceName(){
        return mPlaceName;
    }
    public String getPlaceAddress() {
        return mPlaceAddress;
    }
    public int getImageResourceId() {
        return mImageResourceId;
    }
}
