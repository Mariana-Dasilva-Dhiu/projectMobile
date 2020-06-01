package com.example.cafe;

public class Menu {
    private String nama,harga,gambar;

    public Menu(String dataNAma, String dataHarga, String dataGambar){
        nama=dataNAma;
        harga=dataHarga;
        gambar=dataGambar;
    }

    public String getNama() {
        return nama;
    }

    public String getHarga() {
        return harga;
    }

    public String getGambar() {
        return gambar;
    }
}
