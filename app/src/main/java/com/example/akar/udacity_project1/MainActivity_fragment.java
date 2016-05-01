package com.example.akar.udacity_project1;

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

/**
 * Created by Akar on 05-04-2016.
 */

public class MainActivity_fragment extends Fragment
{
    private GridView gridView;
    private GetMovies_AsyncTask gmov;

    public MainActivity_fragment() {

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {

        int id = item.getItemId();

        if (id == R.id.most_popular)
        {
            gmov = new GetMovies_AsyncTask(gridView,getContext());
            gmov.execute(getContext().getString(R.string.sort_by_popularity));
        }

        if (id == R.id.highest_rated)
        {
            gmov = new GetMovies_AsyncTask(gridView,getContext());
            gmov.execute(getContext().getString(R.string.sort_by_rating));
        }

        return true;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater)
    {
        super.onCreateOptionsMenu(menu, inflater);
        menu.clear();
        inflater.inflate(R.menu.menu_main, menu);

    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
       // gridView= (GridView) getView().findViewById(R.id.gridView);
        super.onCreate(savedInstanceState);

        setHasOptionsMenu(true);
        setRetainInstance(true);

    }





   public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
    //    Log.e(TAG , "on create view called");

   //     super.onCreateView(inflater, container, savedInstanceState);

       View v = inflater.inflate(R.layout.acitivitymain_fragment, container, false);

        gridView = (GridView)v.findViewById(R.id.gridView);
        gmov = new GetMovies_AsyncTask(gridView,getContext());
        gmov.execute(getContext().getString(R.string.sort_by_popularity));
        return v;
    }


}
