/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author USER
 */
public class MCheckUP {
    private int kode;
    private String pemilik;
    private String alamat;
    private String mobil;
    private int roda;
    private String bhn_bakar;
    private String bgn_check;
    private int kerusakan;
    private String kategori;

    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getMobil() {
        return mobil;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    public int getRoda() {
        return roda;
    }

    public void setRoda(int roda) {
        this.roda = roda;
    }

    public String getBhn_bakar() {
        return bhn_bakar;
    }

    public void setBhn_bakar(String bhn_bakar) {
        this.bhn_bakar = bhn_bakar;
    }

    public String getBgn_check() {
        return bgn_check;
    }

    public void setBgn_check(String bgn_check) {
        this.bgn_check = bgn_check;
    }

    public int getKerusakan() {
        return kerusakan;
    }

    public void setKerusakan(int kerusakan) {
        this.kerusakan = kerusakan;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    
    public String kategori(int kerusakan){
        if (kerusakan <= 30){
            return "Ringan";
        } else if (kerusakan <= 70){
            return "Sedang";
        } else {
            return "Berat";
        }
    }
}
