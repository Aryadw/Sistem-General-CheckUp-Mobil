/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_uas;

/**
 *
 * @author USER
 */
public class Kendaraan extends Servis{
    String mobil;
    int roda;
    String jbakar;
    
    
    public Kendaraan (int kode, String nama, String alamat, String mobil, int roda, String jbakar, String part, int kerusakan){
        super.Servis(kode, nama, alamat, part, kerusakan);
        this.mobil = mobil;
        this.roda = roda;
        this.jbakar = jbakar;
    }
    
    public Kendaraan(){

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

    public String getJbakar() {
        return jbakar;
    }

    public void setJbakar(String jbakar) {
        this.jbakar = jbakar;
    }

    
}
