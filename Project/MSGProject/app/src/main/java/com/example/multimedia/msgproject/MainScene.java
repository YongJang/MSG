package com.example.multimedia.msgproject;

import android.app.Activity;
import android.support.v4.app.*;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by multimedia on 2015-06-17.
 */
public class MainScene extends Fragment implements View.OnClickListener{
    TextView wellcome_message;
    Button back_button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_scene,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        /*back_button = (Button) getActivity().findViewById(R.id.back_button);
        wellcome_message = (TextView) getActivity().findViewById(R.id.wellcome_message);
        back_button.setOnClickListener(this);
        */
    }

    @Override
    public void onClick(View v) {

    }

    public void changeText(String name){
        wellcome_message.setText("Wellcome!!"+name);
    }
}
