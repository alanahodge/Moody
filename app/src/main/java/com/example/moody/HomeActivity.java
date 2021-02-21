package com.example.moody;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class HomeActivity extends AppCompatActivity {
    Button profilebtn;
    Button friendsbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        profilebtn = findViewById(R.id.HomePageToProfileBtn);
        friendsbtn = findViewById(R.id.btnFriends);

        //Event listener to direct user to their profile
        profilebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchProfilePage();
            }
        });

        //Event listener to direct user to their friendslist
        friendsbtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                launchFriendsList();
            }
        });
        
    }

    private void launchFriendsList() {
        Intent i = new Intent(HomeActivity.this, FriendsListActivity.class);
        startActivity(i);

    }

    //Creates intent to take user to their profile
    private void launchProfilePage() {
        Intent i = new Intent(HomeActivity.this, ProfileActivity.class);
        startActivity(i);
    }
}
