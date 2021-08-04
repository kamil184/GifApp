package com.kamil184.gifapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Gif> gifs = new ArrayList<Gif>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liked);
        /*gifs = getGifs();*/
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

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.gifs);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL));
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(gifs);
        recyclerView.setAdapter(adapter);
    }

    private ArrayList getGifs() {
        ArrayList<Gif> arrayList = new ArrayList<Gif>();
        arrayList.add(new Gif("https://i.gifer.com/embedded/download/W3Za.gif"));
        /*arrayList.add(new Gif("https://media1.tenor.com/images/d021f759174d01cb7855f9ab8986d542/tenor.gif?itemid=16356277"));
        arrayList.add(new Gif("https://ne-kurim.ru/forum/attachments/funny-cat-2020-5-gif.1418971/"));*/
        return arrayList;
    }
}