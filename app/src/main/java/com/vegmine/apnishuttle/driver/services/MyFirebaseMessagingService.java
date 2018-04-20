package com.vegmine.apnishuttle.driver.services;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.vegmine.apnishuttle.driver.BaseModel;
import com.vegmine.apnishuttle.driver.LocationListener;

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    private static final String TAG = "MyFirebaseMsgService";
    private LocationListener locationListener;

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.e(TAG, "From: " + remoteMessage.getFrom());
        Log.e(TAG, "Notification Message Body: " + remoteMessage.getData());
        locationListener=new BaseModel().getLocationListener();
        locationListener.onLocationChanged(Double.parseDouble(remoteMessage.getData().get("LAT")),Double.parseDouble(remoteMessage.getData().get("LOG")));
    }
}
