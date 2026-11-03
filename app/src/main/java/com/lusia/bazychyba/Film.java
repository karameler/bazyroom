package com.lusia.bazychyba;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "filmy")
public class Film {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String tytul;
    @ColumnInfo(name = "rok")
    private int rokprodukcji;
    private String kategoria;

    public Film(String tytul, int rokprodukcji, String kategoria) {
        this.tytul = tytul;
        this.rokprodukcji = rokprodukcji;
        this.kategoria = kategoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public int getRokprodukcji() {
        return rokprodukcji;
    }

    public void setRokprodukcji(int rokprodukcji) {
        this.rokprodukcji = rokprodukcji;
    }
}
