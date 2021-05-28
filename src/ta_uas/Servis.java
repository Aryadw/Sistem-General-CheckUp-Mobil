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
**//checking by Arya Dewa Wijaya

public class Servis extends Part{
    private int kerusakan;

    public Servis(int kerusakan, String namaPart) {
        super(namaPart);
        this.kerusakan = kerusakan;
    }
    
    public int getKerusakan() {
        return kerusakan;
    }

    public void setKerusakan(int kerusakan) {
        this.kerusakan = kerusakan;
    }
    
//    public String kategori(int kerusakan){
//        if (kerusakan <= 30){
//            return "Ringan";
//        } else if (kerusakan <= 70){
//            return "Sedang";
//        } else {
//            return "Berat";
//        }
//    }
}
