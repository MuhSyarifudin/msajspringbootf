package com.juaracoding.msajspringbootf.model;/*
Created By IntelliJ IDEA 2022.3.2 (Ultimate Edition)
Build #IU-223.8617.56, built on January 26, 2023
@Author Syarifudin a.k.a. Muhamad Syarifuidn
Java Developer
Created on 06/02/2023 21:45
@Last Modified 06/02/2023 21:45
Version 1.1
*/

public class Welcome {

    private String nama;
    private String alamat;
    private String jenisKelamin;

    private InnerWelcome welcomeDaleman;

    public InnerWelcome getWelcomeDaleman() {
        return welcomeDaleman;
    }

    public void setWelcomeDaleman(InnerWelcome welcomeDaleman) {
        this.welcomeDaleman = welcomeDaleman;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
}
