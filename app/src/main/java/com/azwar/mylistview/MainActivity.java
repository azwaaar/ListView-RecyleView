package com.azwar.mylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    private String[] dataName;
    private String[] dataDescription;
    private String[] tglrelease;
    private String[] datadirector;
    private String description;
    private String movie;
    private String release;
    private String director;
    private TypedArray dataPhoto;
    private HeroAdapter adapter;
    private ArrayList<Hero> heroes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter = new HeroAdapter(this);
        final ListView listView = findViewById(R.id.lv_list);
        listView.setAdapter(adapter);
        prepare();
        addItem();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, heroes.get(i).getJudul(), Toast.LENGTH_SHORT).show();

                Hero hero = new Hero();
                hero.setPhoto(dataPhoto.getResourceId(i, 1));
                hero.setJudul(movie);
                hero.setJudulfilm(dataName[i]);
                hero.setDirector(director);
                hero.setNamadirector(datadirector[i]);
                hero.setRelease(release);
                hero.setTglrelease(tglrelease[i]);
                hero.setDescription(description);
                hero.setDatadescription(dataDescription[i]);
                Intent intent = new Intent(MainActivity.this, Detail.class);
                intent.putExtra(Detail.EXTRA_PERSON, hero);
                startActivity(intent);
            }
        });
    }

    private void prepare() {
        dataName = getResources().getStringArray(R.array.data_name);
        tglrelease = getResources().getStringArray(R.array.tgl_release);
        datadirector = getResources().getStringArray(R.array.data_director);
        dataDescription = getResources().getStringArray(R.array.data_description);
        dataPhoto = getResources().obtainTypedArray(R.array.data_photo);
        movie = getResources().getString(R.string.movietitle);
        release = getResources().getString(R.string.release);
        director = getResources().getString(R.string.director);
    }

    private void addItem() {
        heroes = new ArrayList<>();

        for (int i = 0; i < dataName.length; i++) {
            Hero hero = new Hero();
            hero.setPhoto(dataPhoto.getResourceId(i, -1));
            hero.setJudul(dataName[i]);
            hero.setDescription(dataDescription[i]);
            heroes.add(hero);
        }
        adapter.setHeroes(heroes);
    }
}