package com.example.akar.udacity_project1;

//import android.annotation.TargetApi;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.graphics.Movie;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by Akar on 05-04-2016.
 */
public class MoviedetailsFragment extends Fragment
{
    private Movie_details movie;
    private Context context;
    public MoviedetailsFragment() {
        // Required empty public constructor
    }

    public void setMovie(Movie_details movie,Context context)
    {
        this.movie = movie;
        this.context=context;

    }

   // @TargetApi(Build.VERSION_CODES.M)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      //  getActivity().getActionBar().hide();


        View rootView = inflater.inflate(R.layout.activity_movie_details, container, false);

        TextView originalTitle = (TextView) rootView.findViewById(R.id.original_title);

        originalTitle.setText(movie.getOriginaltitle());

        ImageView poster = (ImageView) rootView.findViewById(R.id.poster_image);

            Picasso.with(context).load(movie.getPosterimagepath()).into(poster);



        TextView synopsis = (TextView) rootView.findViewById(R.id.overview);
        synopsis.setText(movie.getOverview());

        TextView userRating = (TextView) rootView.findViewById(R.id.user_rating);
        userRating.setText("User Rating: " + movie.getUserrating());

        TextView releaseDate = (TextView) rootView.findViewById(R.id.release_Date);
        releaseDate.setText("Release Date: " + movie.getReleasedate());

        return rootView;
        }
}
