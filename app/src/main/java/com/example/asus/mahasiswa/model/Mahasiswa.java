package com.example.asus.mahasiswa.model;

// kelas pojo
public class Mahasiswa {
    private String nama, nim, email, foto; //variabel

    public Mahasiswa(){} //Constructor

    public Mahasiswa(String nama, String nim, String email, String foto) {
        this.nama = nama;
        this.nim = nim;
        this.email = email;
        this.foto = foto;
    }

    //Getter and Senter
    //fungsi mendapatkan variabel nama
    public String getNama() {
        return nama;
    }

    //fungsi mengisi vaiabel nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
