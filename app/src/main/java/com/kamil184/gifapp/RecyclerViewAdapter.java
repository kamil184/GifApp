package com.kamil184.gifapp;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private final List<Gif> gifs;

    RecyclerViewAdapter(List<Gif> gifs) {
        this.gifs = gifs;
    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gif_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, int position) {
        Gif gif = gifs.get(position);
        holder.setGifView(gif.getUrl());
        holder.likedView.setSelected(gif.isLiked());
    }

    @Override
    public int getItemCount() {
        return gifs.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView gifView;
        final ImageButton likedView;

        private View view;

        ViewHolder(View view) {
            super(view);
            this.view = view;
            gifView = (ImageView) view.findViewById(R.id.gif);
            likedView = (ImageButton) view.findViewById(R.id.liked);
            likedView.setOnClickListener(button -> {
                likedView.setSelected(!likedView.isSelected());

                /*if (likedView.isSelected()) {
                    //Handle selected state change
                } else {
                    //Handle de-select state change
                }*/

            });
        }

        public void setGifView(String url) {
            DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
            float dpWidth = displayMetrics.widthPixels / displayMetrics.density;
            float dpPlaceholderWidth = (dpWidth - 48) / 3; //48 = 6 * 8, where 6 is the number of gaps, 8 is the margin
            float dpPlaceholderHeight = 150;
            int placeholderWidth = Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dpPlaceholderWidth, displayMetrics));
            int placeholderHeight = Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dpPlaceholderHeight, displayMetrics));

            Glide.with(view.getContext()).asGif().placeholder(new SizableColorDrawable(placeholderWidth, placeholderHeight)).load(url).into(gifView);
        }
    }
}