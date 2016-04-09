package com.example.nasir.workshop;

import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

/**
 * Created by Nasir on 05/04/16.
 */
public class firebase extends MainActivity {


    @JsonIgnoreProperties(ignoreUnknown=true)
    public static class User {
        int ticket_id;
        int est;
        String location;




        public User() {
            // empty default constructor, necessary for Firebase to be able to deserialize Users
        }

        public int getTicket() {
            return ticket_id;
        }

        public int getEst(){
            return est;
        }

        public String getLocation() {
            return location;
        }

        @Override
        public String toString() {
            return "User{ticket_id='" + ticket_id + "', est='" + est + "',  location='" + location + "'}";
        }
    }
}
