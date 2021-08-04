package com.kamil184.gifapp;

public class Gif {
    private boolean liked = false;
    private String url;

    public Gif(String url) {
        this.url = url;
    }

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
