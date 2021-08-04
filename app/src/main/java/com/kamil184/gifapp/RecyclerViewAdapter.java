package com.kamil184.gifapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ImageButton;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import com.bumptech.glide.Glide;

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

        ViewHolder(View view){
            super(view);
            this.view = view;
            gifView = (ImageView)view.findViewById(R.id.gif);
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
        public void setGifView(String url){
            Glide.with(view.getContext()).asGif().load(url).into(gifView);
        }
    }
}