package com.example.todofragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // Fragment Manager to add the TodoFragment to the TodoActivity
        //add todofragment in the  by getting a reference for fragment manager
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null){
            TodoFragment todoFragment = new TodoFragment();//

            //gives reference to hte fragment transaction object which is responsible for doing all the activities like add, remove, replace.
            fm.beginTransaction()
                    .add(R.id.fragment_container, todoFragment)
                    .commit();//this will allow user to see the changes
        }

    }
}
