package com.example.akar.udacity_project1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by akar on 06-04-2016.
 */
public class ImageAdapter extends ArrayAdapter<Movie_details>{
    private Context mContext;
    private List<Movie_details> movieList;

    public ImageAdapter(Context context, List<Movie_details> movieList) {
        super(context, 0, movieList);
        mContext = context;
        this.movieList = movieList;
    }

    public int getCount() {
        return movieList.size();
    }

    public Movie_details getItem(int position)
    {
        return movieList.get(position);
    }

    // create a new ImageView for each item referenced by the Adapter
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        //if no view present, create new image view
        if (convertView == null)
        {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(275,500));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);

        }
        else
        {
            imageView = (ImageView) convertView;
        }

        final Movie_details movie = getItem(position);
      //  Picasso.with(mContext).load(movie.getPosterimagepath()).into(imageView);
        Picasso.with(mContext).load(movie.getPosterimagepath()).into(imageView);


        return imageView;
    }
}