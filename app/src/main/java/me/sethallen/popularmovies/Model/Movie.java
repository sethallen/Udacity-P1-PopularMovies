package me.sethallen.popularmovies.Model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Created by Allense on 4/21/2016.
 */
public class Movie implements Parcelable {

    private String poster_path;
    private boolean adult;
    private String overview;
    private String release_date;
    private List<Integer> genreIds = new ArrayList<>();
    private int id;
    private String original_title;
    private String original_language;
    private String title;
    private String backdrop_path;
    private float popularity;
    private int vote_count;
    private boolean video;
    private float vote_average;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    private Uri posterUri;
    private Uri backdropUri;

    /**
     * No args constructor for use in serialization
     *
     */
    public Movie() {
    }

    /**
     *
     * @param id
     * @param genreIds
     * @param title
     * @param release_date
     * @param overview
     * @param poster_path
     * @param original_title
     * @param vote_average
     * @param original_language
     * @param adult
     * @param backdrop_path
     * @param vote_count
     * @param video
     * @param popularity
     */
    public Movie(String poster_path, boolean adult, String overview, String release_date, List<Integer> genreIds, int id, String original_title, String original_language, String title, String backdrop_path, float popularity, int vote_count, boolean video, float vote_average) {
        this.poster_path = poster_path;
        this.adult = adult;
        this.overview = overview;
        this.release_date = release_date;
        this.genreIds = genreIds;
        this.id = id;
        this.original_title = original_title;
        this.original_language = original_language;
        this.title = title;
        this.backdrop_path = backdrop_path;
        this.popularity = popularity;
        this.vote_count = vote_count;
        this.video = video;
        this.vote_average = vote_average;
    }

    /**
     *
     * @return
     * The poster_path
     */
    public String getPosterPath() {
        return poster_path;
    }

    /**
     *
     * @param poster_path
     * The poster_path
     */
    public void setPosterPath(String poster_path) {
        this.poster_path = poster_path;
    }

    /**
     *
     * @return
     * The adult
     */
    public boolean isAdult() {
        return adult;
    }

    /**
     *
     * @param adult
     * The adult
     */
    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    /**
     *
     * @return
     * The overview
     */
    public String getOverview() {
        return overview;
    }

    /**
     *
     * @param overview
     * The overview
     */
    public void setOverview(String overview) {
        this.overview = overview;
    }

    /**
     *
     * @return
     * The release_date
     */
    public String getReleaseDate() {
        return release_date;
    }

    /**
     *
     * @param release_date
     * The release_date
     */
    public void setReleaseDate(String release_date) {
        this.release_date = release_date;
    }

    /**
     *
     * @return
     * The genreIds
     */
    public List<Integer> getGenreIds() {
        return genreIds;
    }

    /**
     *
     * @param genreIds
     * The genre_ids
     */
    public void setGenreIds(List<Integer> genreIds) {
        this.genreIds = genreIds;
    }

    /**
     *
     * @return
     * The id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The original_title
     */
    public String getOriginalTitle() {
        return original_title;
    }

    /**
     *
     * @param original_title
     * The original_title
     */
    public void setOriginalTitle(String original_title) {
        this.original_title = original_title;
    }

    /**
     *
     * @return
     * The original_language
     */
    public String getOriginalLanguage() {
        return original_language;
    }

    /**
     *
     * @param original_language
     * The original_language
     */
    public void setOriginalLanguage(String original_language) {
        this.original_language = original_language;
    }

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The backdrop_path
     */
    public String getBackdropPath() {
        return backdrop_path;
    }

    /**
     *
     * @param backdrop_path
     * The backdrop_path
     */
    public void setBackdropPath(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    /**
     *
     * @return
     * The popularity
     */
    public float getPopularity() {
        return popularity;
    }

    /**
     *
     * @param popularity
     * The popularity
     */
    public void setPopularity(float popularity) {
        this.popularity = popularity;
    }

    /**
     *
     * @return
     * The vote_count
     */
    public int getVoteCount() {
        return vote_count;
    }

    /**
     *
     * @param vote_count
     * The vote_count
     */
    public void setVoteCount(int vote_count) {
        this.vote_count = vote_count;
    }

    /**
     *
     * @return
     * The video
     */
    public boolean isVideo() {
        return video;
    }

    /**
     *
     * @param video
     * The video
     */
    public void setVideo(boolean video) {
        this.video = video;
    }

    /**
     *
     * @return
     * The vote_average
     */
    public float getVoteAverage() {
        return vote_average;
    }

    /**
     *
     * @param vote_average
     * The vote_average
     */
    public void setVoteAverage(float vote_average) {
        this.vote_average = vote_average;
    }

//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
//
//    public void setAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }

    public Date getReleaseDateAsDate()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        try {
            return sdf.parse(getReleaseDate());
        } catch (ParseException pe) {
            return null;
        }
    }

    /**
     *
     * @return
     * The poster full uri
     */
    public Uri getPosterUri() {
        return posterUri;
    }

    /**
     *
     * @param posterUri
     * The poster full uri
     */
    public void setPosterUri(Uri posterUri) {
        this.posterUri = posterUri;
    }

    /**
     *
     * @return
     * The backdrop full uri
     */
    public Uri getBackdropUri() {
        return backdropUri;
    }

    /**
     *
     * @param backdropUri
     * The backdrop full uri
     */
    public void setBackdropUri(Uri backdropUri) {
        this.backdropUri = backdropUri;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.poster_path);
        dest.writeByte(adult ? (byte) 1 : (byte) 0);
        dest.writeString(this.overview);
        dest.writeString(this.release_date);
        dest.writeList(this.genreIds);
        dest.writeInt(this.id);
        dest.writeString(this.original_title);
        dest.writeString(this.original_language);
        dest.writeString(this.title);
        dest.writeString(this.backdrop_path);
        dest.writeFloat(this.popularity);
        dest.writeInt(this.vote_count);
        dest.writeByte(video ? (byte) 1 : (byte) 0);
        dest.writeFloat(this.vote_average);
        //dest.writeParcelable(this.additionalProperties, flags);
        dest.writeString(this.posterUri.toString());
        dest.writeString(this.backdropUri.toString());
    }

    protected Movie(Parcel in) {
        this.poster_path = in.readString();
        this.adult = in.readByte() != 0;
        this.overview = in.readString();
        this.release_date = in.readString();
        this.genreIds = new ArrayList<>();
        in.readList(this.genreIds, List.class.getClassLoader());
        this.id = in.readInt();
        this.original_title = in.readString();
        this.original_language = in.readString();
        this.title = in.readString();
        this.backdrop_path = in.readString();
        this.popularity = in.readFloat();
        this.vote_count = in.readInt();
        this.video = in.readByte() != 0;
        this.vote_average = in.readFloat();
        //this.additionalProperties = in.readParcelable(Map<String, Object>.class.getClassLoader());
        this.posterUri = Uri.parse(in.readString());
        this.backdropUri = Uri.parse(in.readString());
    }

    public static final Parcelable.Creator<Movie> CREATOR = new Parcelable.Creator<Movie>() {
        public Movie createFromParcel(Parcel source) {
            return new Movie(source);
        }

        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };
}