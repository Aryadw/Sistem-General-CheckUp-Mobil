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
public class Servis extends Konsumen{
    String part;
    int kerusakan;

    public void Servis(int kode, String nama, String alamat, String part, int kerusakan) {
        super.Konsumen(kode, nama, alamat);
        this.part = part;
        this.kerusakan = kerusakan;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public int getKerusakan() {
        return kerusakan;
    }

    public void setKerusakan(int kerusakan) {
        this.kerusakan = kerusakan;
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
