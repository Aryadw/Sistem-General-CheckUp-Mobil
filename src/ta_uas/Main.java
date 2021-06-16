/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_uas;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Main {
    public static Kendaraan getArrayKendaraan(ArrayList<Kendaraan>obj, int kode){
        for (int i = 0; i < obj.size(); i++){
            if (obj.get(i).getKode() == kode){
                return obj.get(i);
            }
        }
        return null;
    }
    
    public static Konsumen getArrayKonsumen(ArrayList<Konsumen>obj, int kode){
        for (int i = 0; i < obj.size(); i++){
            if (obj.get(i).getKode() == kode){
                return obj.get(i);
            }
        }
        return null;
    }
    
    public static void main(String[] args){
        
//        ArrayList<Kendaraan> mobil = new ArrayList<Kendaraan>();
//        mobil.add(new Kendaraan(1, "Panther", 4, "Solar"));
//        mobil.add(new Kendaraan(2, "Innova", 4, "Pertamax"));
//        mobil.add(new Kendaraan(3, "Bentley", 4, "Pertamax plus"));
//        
//        ArrayList<Konsumen> orang = new ArrayList<Konsumen>();
//        orang.add(new Konsumen(1, "Adentya", "Semarang"));
//        orang.add(new Konsumen(2, "Yosua", "Wonogiri"));
//        orang.add(new Konsumen(3, "Arya", "Jogja"));
//        
//        ArrayList<Servis> fix = new ArrayList<Servis>();
//        fix.add(new Servis("Oli", 40));
//        fix.add(new Servis("Bemper depan", 30));
//        fix.add(new Servis("Rem Hidrolik", 80));
//        
//        for (int i = 0; i < mobil.size(); i++){
//            System.out.println("-----------------------------------------");
//            System.out.println("Servis ke - "+ (i+1));
//            System.out.println("Pemilik             : "+ orang.get(i).getNama());
//            System.out.println("alamat              : "+ orang.get(i).getAlamat());
//            System.out.println("Mobil               : "+ mobil.get(i).getNama());
//            System.out.println("Roda                : "+ mobil.get(i).getRoda());
//            System.out.println("Bahan bakar         : "+ mobil.get(i).getJbakar());
//            System.out.println("Check up bagian     : "+ fix.get(i).getPart());
//            System.out.println("Tingkat kerusakan   : "+ fix.get(i).getKerusakan());
//            System.out.println("Kategori            : "+ fix.get(i).kategori(fix.get(i).getKerusakan()));
//        }
    }
}
