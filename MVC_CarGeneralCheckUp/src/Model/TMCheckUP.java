/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author USER
 */
public class TMCheckUP extends AbstractTableModel{
    List<MCheckUP> listcheck;
    
    public TMCheckUP(List<MCheckUP> listcheck){
        this.listcheck = listcheck;
    }
    @Override
    public int getRowCount() {
        return this.listcheck.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return listcheck.get(row).getKode();
            case 1:
                return listcheck.get(row).getPemilik();
            case 2:
                return listcheck.get(row).getAlamat();
            case 3:
                return listcheck.get(row).getMobil();
            case 4:
                return listcheck.get(row).getRoda();
            case 5:
                return listcheck.get(row).getBhn_bakar();
            case 6:
                return listcheck.get(row).getBgn_check();
            case 7:
                return listcheck.get(row).getKerusakan();
            case 8: 
                return listcheck.get(row).getKategori();
            default :
                return null;
        }}
    
    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "Kode";
            case 1:
                return "Pemiliki";
            case 2:
                return "Alamat";
            case 3:
                return "Mobil";
            case 4:
                return "Roda";
            case 5:
                return "Bahan Bakar";   
            case 6:
                return "Bagian Check";
            case 7:
                return "Kerusakan";
            case 8:
                return "Kategori";
            default:
                return null;
        }
    }
}
