package com.example.multimedia.msgproject;

import com.facebook.Profile;

/**
 * Created by LG on 2015-06-18.
 */
public class FacebookUserProf implements Communicator{
    String name;
    static Profile pf;
    public FacebookUserProf(){}
    public FacebookUserProf(Profile profile){
        pf=profile;
    }

    @Override
    public void logIn(Profile profile) {

    }

    public static Profile getProfile(){
        return pf;
    }
}
