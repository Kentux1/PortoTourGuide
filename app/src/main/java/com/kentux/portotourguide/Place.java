package com.kentux.portotourguide;

public class Place {
    //Name of the place
    private String mPlaceName;
    //Address of the place
    private String mPlaceAddress;
    //Image resource Id for the specific place
    private int mImageResourceId;
    //Description of the place
    private String mPlaceDescription;
    //Coordinates for maps intent
    private String mPlaceMap;

    public Place(String placeName, String placeAddress, int imageResourceId, String placeDescription, String placeMap) {
        mPlaceName = placeName;
        mPlaceAddress = placeAddress;
        mImageResourceId = imageResourceId;
        mPlaceDescription = placeDescription;
        mPlaceMap = placeMap;
    }

    public String getPlaceName() {
        return mPlaceName;
    }

    public String getPlaceAddress() {
        return mPlaceAddress;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getPlaceDescription() {
        return mPlaceDescription;
    }

    public String getPlaceMap() {
        return mPlaceMap;
    }
}
