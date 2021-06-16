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
    
    public static void main(String[] args){
        
        ArrayList<Kendaraan> mobil = new ArrayList<Kendaraan>();
        mobil.add(new Kendaraan(1, "Adentya", "Semarang", "Panther", 4, "Solar", "Oli", 40));
        mobil.add(new Kendaraan(2, "Yosua", "Wonogiri", "Innova", 4, "Pertamax", "Bemper depan", 30));
        mobil.add(new Kendaraan(3, "Arya", "Jogja", "Bentley", 4, "Pertamax plus", "Rem Hidrolik", 80));
        mobil.add(new Kendaraan(4, "Yusuf", "Jepara", "Panther", 4, "Pertamax plus", "Body", 60));
        
        for (int i = 0; i < mobil.size(); i++){
            System.out.println("-----------------------------------------");
            System.out.println("Servis ke - "+ (i+1));
            System.out.println("Pemilik             : "+ mobil.get(i).getNama());
            System.out.println("alamat              : "+ mobil.get(i).getAlamat());
            System.out.println("Mobil               : "+ mobil.get(i).getMobil());
            System.out.println("Roda                : "+ mobil.get(i).getRoda());
            System.out.println("Bahan bakar         : "+ mobil.get(i).getJbakar());
            System.out.println("Check up bagian     : "+ mobil.get(i).getPart());
            System.out.println("Tingkat kerusakan   : "+ mobil.get(i).getKerusakan()+"%");
            System.out.println("Kategori            : "+ mobil.get(i).kategori(mobil.get(i).getKerusakan()));
        }
    }
}
