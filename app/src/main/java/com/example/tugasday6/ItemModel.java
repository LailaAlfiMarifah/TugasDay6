package com.example.tugasday6;

public class ItemModel {
    private String namaBarang, DeskBarang, DeskDetailBarang, HargaBarang;
    private int photoBarang;
    private int id;

    public ItemModel(int id, String namaBarang, String deskBarang, String deskDetailBarang, String hargaBarang, int photoBarang) {
        this.id = id;
        this.namaBarang = namaBarang;
        DeskBarang = deskBarang;
        DeskDetailBarang = deskDetailBarang;
        HargaBarang = hargaBarang;
        this.photoBarang = photoBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getDeskBarang() {
        return DeskBarang;
    }

    public void setDeskBarang(String deskBarang) {
        DeskBarang = deskBarang;
    }

    public String getDeskDetailBarang() {
        return DeskDetailBarang;
    }

    public void setDeskDetailBarang(String deskDetailBarang) {
        DeskDetailBarang = deskDetailBarang;
    }

    public String getHargaBarang() {
        return HargaBarang;
    }

    public void setHargaBarang(String hargaBarang) {
        HargaBarang = hargaBarang;
    }

    public int getPhotoBarang() {
        return photoBarang;
    }

    public void setPhotoBarang(int photoBarang) {
        this.photoBarang = photoBarang;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
