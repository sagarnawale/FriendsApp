package com.alluresoft.friends;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MeetUpDetailsActivity extends AppCompatActivity {


    private ImageView friend1,friend2,friend3,friend4;
    private ImageView nearby,followers,profile,discover,favourites;
    private Button attend,shareIt,friend5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meet_up_details);

        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar_discover_tinder);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView activity_name=(TextView) findViewById(R.id.activity_name);
        activity_name.setText("Discover");

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.profile_pic1);
        Bitmap circularBitmap = RoundedImageView.getRoundedCroppedBitmap(bitmap, 100);

        friend1=(ImageView)findViewById(R.id.friend1);
        friend1.setImageBitmap(circularBitmap);

        friend2=(ImageView)findViewById(R.id.friend2);
        friend2.setImageBitmap(circularBitmap);

        friend3=(ImageView)findViewById(R.id.friend3);
        friend3.setImageBitmap(circularBitmap);

        friend4=(ImageView)findViewById(R.id.friend4);
        friend4.setImageBitmap(circularBitmap);

        friend5=(Button)findViewById(R.id.friend5);

        attend=(Button) findViewById(R.id.attend_btn_discover);
        attend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MeetUpDetailsActivity.this,"attend",Toast.LENGTH_SHORT).show();
            }
        });

        shareIt=(Button) findViewById(R.id.share_it_button);
        shareIt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareIt();
            }
        });


    }

    public void onIconClick(View v){

        switch(v.getId()){
            case R.id.nearby_map_icon:
                Toast.makeText(MeetUpDetailsActivity.this, "Nearby", Toast.LENGTH_SHORT).show();
                break;
            case R.id.followers_map_icon:
                Toast.makeText(MeetUpDetailsActivity.this, "Followers", Toast.LENGTH_SHORT).show();
                break;
            case R.id.profile_map_icon:
                Toast.makeText(MeetUpDetailsActivity.this, "Profile", Toast.LENGTH_SHORT).show();
                break;
            case R.id.favourites_map_icon:
                Toast.makeText(MeetUpDetailsActivity.this, "Favorites", Toast.LENGTH_SHORT).show();
                break;
            case R.id.discover_map_icon:
                Toast.makeText(MeetUpDetailsActivity.this, "Discover", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    //sharing implementation here
    private void shareIt() {
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "AndroidSolved");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Share this event on over the web...");
        startActivity(Intent.createChooser(sharingIntent, "Share via"));
    }
    /**
     public boolean onCreateOptionsMenu(Menu menu) {
     // Inflate the menu_main; this adds items to the action bar if it is present.
     getMenuInflater().inflate(R.menu.menu_other_profile, menu);
     SearchView searchView=(SearchView) menu.findItem(R.id.menu_discover_search).getActionView();
     SearchManager searchManager=(SearchManager) getSystemService(SEARCH_SERVICE);
     searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
     return true;
     }
     */
}
