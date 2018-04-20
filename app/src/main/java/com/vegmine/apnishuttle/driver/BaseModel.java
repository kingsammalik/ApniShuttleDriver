package com.vegmine.apnishuttle.driver;

public class BaseModel {

    private static LocationListener locationListener;

    public LocationListener getLocationListener() {
        return locationListener;
    }

    public void setLocationListener(LocationListener locationListener) {
        BaseModel.locationListener = locationListener;
    }
}
