package com.example.salonbellezalab7_20200643.utils;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.text.SimpleDateFormat;

public class FirebaseUtils {
    public static CollectionReference getCitasCollection(){
        return FirebaseFirestore.getInstance().collection("citas");
    }
    public static String timestampToString(Timestamp timestamp){
        return new SimpleDateFormat("HH:MM").format(timestamp.toDate());
    }
}
