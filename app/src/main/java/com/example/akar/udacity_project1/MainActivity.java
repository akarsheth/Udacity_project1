package com.example.akar.udacity_project1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.view.KeyEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Fragment mainActivity_fragment;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FragmentManager mFragmentManager=getSupportFragmentManager();




        mainActivity_fragment =(MainActivity_fragment) mFragmentManager.findFragmentByTag("main_activity_fragment");

        FragmentTransaction mFragmentTransaction=mFragmentManager.beginTransaction();

        if(mainActivity_fragment == null)
        {
          //  Toast.makeText(this,"null null",Toast.LENGTH_SHORT).show();
            mainActivity_fragment = new MainActivity_fragment();
            mFragmentTransaction.add(R.id.fragment_main, mainActivity_fragment, "main_activity_fragment"); //check this
            mFragmentTransaction.addToBackStack(null);
            mFragmentTransaction.commit();
          //  Toast.makeText(this,"commit commit",Toast.LENGTH_SHORT).show();

        }



    }


}
