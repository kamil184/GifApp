package com.kamil184.gifapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class GifsActivity extends AppCompatActivity {

    ArrayList<Gif> gifs = new ArrayList<Gif>();
    private Toolbar toolbar;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liked);
        setGifs();

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        recyclerView = (RecyclerView) findViewById(R.id.gifs);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL));
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(gifs);
        recyclerView.setAdapter(adapter);
    }

    private void setGifs() {
        gifs.add(new Gif("https://media.giphy.com/media/2E6OYt2yphlWTGZeYK/giphy.gif"));
        gifs.add(new Gif("https://media.giphy.com/media/oTXAk431VJbJC/giphy.gif"));
        gifs.add(new Gif("https://media.giphy.com/media/2inElen0t36MJ9vSSy/giphy.gif"));
        gifs.add(new Gif("https://media.giphy.com/media/l41Ys1fQky5raqvMQ/giphy.gif"));
        gifs.add(new Gif("https://media.giphy.com/media/e5I0YiwNYkG5y/giphy.gif"));
        gifs.add(new Gif("https://media.giphy.com/media/vhlnTxMqmurx8UWS1k/giphy.gif"));
        gifs.add(new Gif("https://media.giphy.com/media/3ohs7W7ACsSvyY5WoM/giphy.gif"));
        gifs.add(new Gif("https://media.giphy.com/media/xA5gDh057PmM2Rd90j/giphy.gif"));
        gifs.add(new Gif("https://media.giphy.com/media/J2e2dmVNSdfb2/giphy.gif"));
        gifs.add(new Gif("https://media.giphy.com/media/jluHLy0OgYuJvbTRrA/giphy.gif"));
        gifs.add(new Gif("https://media.giphy.com/media/37r7LZbOgxE12f3JW5/giphy.gif"));
        gifs.add(new Gif("https://media.giphy.com/media/aP6ZGj2g9sLn2/giphy.gif"));
        gifs.add(new Gif("https://media.giphy.com/media/XdIzXbDG1uDOpl2naF/giphy.gif"));
        gifs.add(new Gif("https://media.giphy.com/media/XtydbjSSwkC7K2zBTH/giphy.gif"));
        gifs.add(new Gif("https://media.giphy.com/media/l0HlPkb1ktE2PZFbG/giphy.gif"));
        gifs.add(new Gif("https://media.giphy.com/media/2E6OYt2yphlWTGZeYK/giphy.gif"));
        gifs.add(new Gif("https://media.giphy.com/media/oTXAk431VJbJC/giphy.gif"));
        gifs.add(new Gif("https://media.giphy.com/media/2inElen0t36MJ9vSSy/giphy.gif"));
        gifs.add(new Gif("https://media.giphy.com/media/l41Ys1fQky5raqvMQ/giphy.gif"));
        gifs.add(new Gif("https://media.giphy.com/media/e5I0YiwNYkG5y/giphy.gif"));
        gifs.add(new Gif("https://media.giphy.com/media/vhlnTxMqmurx8UWS1k/giphy.gif"));
        gifs.add(new Gif("https://media.giphy.com/media/3ohs7W7ACsSvyY5WoM/giphy.gif"));
        gifs.add(new Gif("https://media.giphy.com/media/xA5gDh057PmM2Rd90j/giphy.gif"));
        gifs.add(new Gif("https://media.giphy.com/media/J2e2dmVNSdfb2/giphy.gif"));
        gifs.add(new Gif("https://media.giphy.com/media/jluHLy0OgYuJvbTRrA/giphy.gif"));
        gifs.add(new Gif("https://media.giphy.com/media/37r7LZbOgxE12f3JW5/giphy.gif"));
        gifs.add(new Gif("https://media.giphy.com/media/aP6ZGj2g9sLn2/giphy.gif"));
        gifs.add(new Gif("https://media.giphy.com/media/XdIzXbDG1uDOpl2naF/giphy.gif"));
        gifs.add(new Gif("https://media.giphy.com/media/XtydbjSSwkC7K2zBTH/giphy.gif"));
        gifs.add(new Gif("https://media.giphy.com/media/l0HlPkb1ktE2PZFbG/giphy.gif"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.gifs_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case  R.id.menu_refresh:

                return true;
            case android.R.id.home:
                finish();
                return true;
        }

        return true;
    }
}