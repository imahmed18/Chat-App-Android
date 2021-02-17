package com.example.chatapp.Fragments;

import com.example.chatapp.Notifications.MyResponse;
import com.example.chatapp.Notifications.Sendder;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAry1nm4U:APA91bG_sqwrl5ku3te9IiwYjIk7m0zN_6RAJMYehLtJ1OLuuqWEOv--ZDQDHe4nzkD4gFmMDy5sqohGn5s3baNRaJHApbF47cOPdtg9q2uXcJlRZ7vmu16FC8Uaq8NH6HkS2T4zvCY2"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sendder body);
}
