package com.lusia.bazychyba;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.room.Room;
import androidx.room.RoomDatabase;

public class MainActivity extends AppCompatActivity {
    FilmyDataBase filmyDataBase;
    Button buttondodaj;
    EditText tytul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        filmyDataBase = Room.databaseBuilder(
                getApplicationContext(),FilmyDataBase.class,"kino_db"
        ).allowMainThreadQueries().build();
        //filmyDataBase.zwrocFilmyDAO().wstawDoBazyFilm(new Film("iron man", 2005, "sci-fi"));
        buttondodaj = findViewById(R.id.button);
        tytul = findViewById(R.id.editTextText);
        buttondodaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Film film = new Film(tytul.getText().toString(), 2000, "animacja");
                filmyDataBase.zwrocFilmyDAO().wstawDoBazyFilm(film);
            }
        });
    }
}