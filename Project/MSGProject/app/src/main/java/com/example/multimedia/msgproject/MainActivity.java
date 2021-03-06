package com.example.multimedia.msgproject;

//import android.app.FragmentManager;
//import android.app.FragmentTransaction;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.*;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


import com.facebook.Profile;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseInstallation;
import com.parse.ParsePush;
import com.parse.SaveCallback;


public class MainActivity extends ActionBarActivity implements Communicator{

    public static final int REQUEST_CODE_MENU_ACTIVITY = 1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Parse.initialize(this, "v73KI9vr14xLfEB1vyW4YVan4rQEH5oiTxR6TPHx", "4sAWPVeP42kQH3SUFZhfECuq2AccgNikxMvZmeT8");
        ParseInstallation.getCurrentInstallation().saveInBackground();
        ParsePush.subscribeInBackground("", new SaveCallback() {
            @Override
            public void done(ParseException e) {
                if (e == null) {
                    Log.d("com.parse.push", "successfully subscribed to the broadcast channel.");
                } else {
                    Log.e("com.parse.push", "failed to subscribe for push", e);
                }
            }
        });

       // MainScene mainScene = new MainScene();
        //FragmentManager manager = getSupportFragmentManager();

        //FragmentTransaction transaction = manager.beginTransaction();
        //transaction.add(R.id.main_layout,new MainFragment(),"YJFragment");
        //transaction.commit();


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void logIn(Profile profile) {

        Intent i = new Intent(this,MenuActivity.class);
        startActivity(i);
        FacebookUserProf fu=new FacebookUserProf(profile);

        //FragmentManager manager= getSupportFragmentManager();

        /*
        //MainFragment mainFragment = (MainFragment) manager.findFragmentById(R.id.main_scene_fragment);
        MainScene mainScene= (MainScene) manager.findFragmentById(n);
        mainScene.changeText(profile.getName());
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.main_scene,new MainScene(),"YJFragment");
        transaction.commit();
        */

    }
}
