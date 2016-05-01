package com.example.akar.udacity_project1;

/**
 * Created by Akar on 08-04-2016.
 */
public class Movie_details
{
    private String originaltitle,userrating,releasedate,overview,posterimagepath;
    Movie_details(String originaltitle, String posterimagepath, String overview, String userrating, String releasedate)
    {
        this.originaltitle=originaltitle;
        this.overview=overview;
        this.releasedate=releasedate;
        this.posterimagepath=posterimagepath;
        this.userrating=userrating;
    }

    public String getOriginaltitle() {
        return originaltitle;
    }

    public void setOriginaltitle(String originaltitle) {
        this.originaltitle = originaltitle;
    }

    public String getUserrating() {
        return userrating;
    }

    public void setUserrating(String userrating) {
        this.userrating = userrating;
    }

    public String getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(String releasedate) {
        this.releasedate = releasedate;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getPosterimagepath() {
        return posterimagepath;
    }

    public void setPosterimagepath(String posterimagepath) {
        this.posterimagepath = posterimagepath;
    }
}
