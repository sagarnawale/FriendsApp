package com.alluresoft.friends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v){

        if(v.getId() == R.id.create_meetup_popup){
            Intent intent = new Intent(this, CreateMeetUpActivity.class);
            startActivity(intent);
        }else if(v.getId() == R.id.discover){
            Intent intent = new Intent(this, DiscoverActivity.class);
            startActivity(intent);
        }else if(v.getId() == R.id.meetup_details){
            Intent intent = new Intent(this, MeetUpDetailsActivity.class);
            startActivity(intent);
        }
    }

}
