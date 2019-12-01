package com.azwar.mylistview;

import android.os.Parcel;
import android.os.Parcelable;

public class Hero implements Parcelable {
    private int photo;
    private String judul;
    private String judulfilm;
    private String director;
    private String namadirector;
    private String release;
    private String tglrelease;
    private String description;
    private String datadescription;

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJudulfilm() {
        return judulfilm;
    }

    public void setJudulfilm(String judulfilm) {
        this.judulfilm = judulfilm;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getNamadirector() {
        return namadirector;
    }

    public void setNamadirector(String namadirector) {
        this.namadirector = namadirector;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getTglrelease() {
        return tglrelease;
    }

    public void setTglrelease(String tglrelease) {
        this.tglrelease = tglrelease;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDatadescription() {
        return datadescription;
    }

    public void setDatadescription(String datadescription) {
        this.datadescription = datadescription;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.photo);
        dest.writeString(this.judul);
        dest.writeString(this.judulfilm);
        dest.writeString(this.director);
        dest.writeString(this.namadirector);
        dest.writeString(this.release);
        dest.writeString(this.tglrelease);
        dest.writeString(this.description);
        dest.writeString(this.datadescription);
    }

    public Hero() {
    }

    protected Hero(Parcel in) {
        this.photo = in.readInt();
        this.judul = in.readString();
        this.judulfilm = in.readString();
        this.director = in.readString();
        this.namadirector = in.readString();
        this.release = in.readString();
        this.tglrelease = in.readString();
        this.description = in.readString();
        this.datadescription = in.readString();
    }

    public static final Creator<Hero> CREATOR = new Creator<Hero>() {
        @Override
        public Hero createFromParcel(Parcel source) {
            return new Hero(source);
        }

        @Override
        public Hero[] newArray(int size) {
            return new Hero[size];
        }
    };
}