package com.example.draug.howtoeat;


import android.os.Parcel;
import android.os.Parcelable;

public class LocationData implements Parcelable{


    private String title;
    private String description;
    private int imageUrl;
    private int reservationCode;
    private boolean reserved;

    public LocationData(String title, String description, int imageUrl){

        this.title = title;
        this.imageUrl = imageUrl;
        this.description = description;
        this.reservationCode = -1;
        this.reserved = false;
    }

    protected LocationData(Parcel in) {
        title = in.readString();
        description = in.readString();
        imageUrl = in.readInt();
        reservationCode = in.readInt();
    }

    public static final Creator<LocationData> CREATOR = new Creator<LocationData>() {
        @Override
        public LocationData createFromParcel(Parcel in) {
            return new LocationData(in);
        }

        @Override
        public LocationData[] newArray(int size) {
            return new LocationData[size];
        }
    };

    // getters
    public String getTitle(){ return title; }
    public String getDescription(){ return description; }
    public int getImageUrl(){ return imageUrl; }
    public int getReservationCode(){ return reservationCode; }
    public boolean getReserved(){ return reserved; }

    // setters
    public void setReserved(){
        reserved = true;
    }

    public void resetReserved(){
        reserved = false;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeString(description);
        parcel.writeInt(imageUrl);
        parcel.writeInt(reservationCode);
    }
}
