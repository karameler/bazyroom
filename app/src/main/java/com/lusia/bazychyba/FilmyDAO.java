package com.lusia.bazychyba;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface FilmyDAO {
    @Insert
    public void wstawDoBazyFilm(Film film);

    public  void wstawListeFilmowDoBazy(Film ... film);
    @Delete
    public  void usunZBazy(Film film);
    @Update
    public  void aktualizujFilmWBazie(Film film);
    @Query("SELECT * FROM filmy")
    public List<Film> zwrocWszystkieFilmyZBazy();

    @Query("SELECT tytul FROM filmy WHERE rok>:rokParametr")
    public  List<String> zwrocTytulyFilmuODanymRoku(int rokParametr);


}
