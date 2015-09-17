package com.example.draug.howtoeat;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private ItemData[] itemsData;

    public MyAdapter(ItemData[] itemsData) {
        this.itemsData = itemsData;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_item_layout, null);

        // create ViewHolder

        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {

        // - get data from your itemsData at this position
        // - replace the contents of the view with that itemsData

        viewHolder.textViewTitle.setText(itemsData[position].getTitle());
        viewHolder.textViewDescription.setText(itemsData[position].getDescription());
        viewHolder.imgViewIcon.setImageResource(itemsData[position].getImageUrl());

    }

    // inner class to hold a reference to each item of RecyclerView
    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textViewTitle;
        public TextView textViewDescription;
        public ImageView imgViewIcon;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            textViewTitle = (TextView) itemLayoutView.findViewById(R.id.item_title);
            textViewDescription = (TextView) itemLayoutView.findViewById(R.id.item_description);
            //textViewDescription.setEllipsize(TextUtils.TruncateAt.END);
            imgViewIcon = (ImageView) itemLayoutView.findViewById(R.id.item_icon);
        }
    }


    // Return the size of your itemsData (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return itemsData.length;
    }

    public ItemData getItemDataByID( int position ){
        return itemsData[position];
    }
}