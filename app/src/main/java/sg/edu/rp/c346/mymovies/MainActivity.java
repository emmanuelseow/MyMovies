package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.graphics.Color;
import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMovies;
    ArrayList<movie> alMovieList;
    CustomAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovies = findViewById(R.id.listviewmovies);
        alMovieList = new ArrayList<>();

        movie mov1 = new movie("The Avengers", "2012", "pg13", "Action | Sci-Fi", "15/12/2014", "Golden Village - Bishan", "Nick Fury of S.H.I.E.L.D assembles a team of superheroes to save the planet from Loki and his army.");
        alMovieList.add(mov1);

        caMovie = new CustomAdapter(this, R.layout.row, alMovieList);
        lvMovies.setAdapter(caMovie);


        }

    }
