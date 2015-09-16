package com.example.draug.howtoeat;


import android.os.Parcel;
import android.os.Parcelable;

public class ItemData implements Parcelable{


    private String title;
    private String description;
    private int imageUrl;

    public ItemData(String title, String description, int imageUrl){

        this.title = title;
        this.imageUrl = imageUrl;
        this.description = description;
    }

    protected ItemData(Parcel in) {
        title = in.readString();
        description = in.readString();
        imageUrl = in.readInt();
    }

    public static final Creator<ItemData> CREATOR = new Creator<ItemData>() {
        @Override
        public ItemData createFromParcel(Parcel in) {
            return new ItemData(in);
        }

        @Override
        public ItemData[] newArray(int size) {
            return new ItemData[size];
        }
    };

    // getters & setters
    public String getTitle(){
        return title;
    }
    public String getDescription(){ return description; };
    public int getImageUrl(){ return imageUrl; }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeString(description);
        parcel.writeInt(imageUrl);
    }
}
