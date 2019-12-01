package com.azwar.mylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {
    public static final String EXTRA_PERSON = "extra_person";

    ImageView photo;
    TextView judul;
    TextView judulfilm;
    TextView director;
    TextView namadirector;
    TextView release;
    TextView tglrelease;
    TextView description;
    TextView datadescription;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        judul = findViewById(R.id.outputjudul);
        photo = findViewById(R.id.outputdataphoto);
        judulfilm = findViewById(R.id.outputjudulfilm);
        director = findViewById(R.id.outputdirector);
        namadirector = findViewById(R.id.outputdatadirector);
        release = findViewById(R.id.outputrelease);
        tglrelease = findViewById(R.id.outputtglrelease);
        description = findViewById(R.id.description1);
        datadescription = findViewById(R.id.outputdatadescription);


        Hero hero = getIntent().getParcelableExtra(EXTRA_PERSON);
        int image = hero.getPhoto();
        String text = hero.getJudul();
        String text1 = hero.getJudulfilm();
        String text2 = hero.getDirector();
        String text3 = hero.getNamadirector();
        String text4 = hero.getRelease();
        String text5 = hero.getTglrelease();
        String text6 = hero.getDescription();
        String text7 = hero.getDatadescription();

        photo.setImageResource(image);
        judul.setText(text);
        judulfilm.setText(text1);
        director.setText(text2);
        namadirector.setText(text3);
        release.setText(text4);
        tglrelease.setText(text5);
        description.setText(text6);
        datadescription.setText(text7);
    }
}