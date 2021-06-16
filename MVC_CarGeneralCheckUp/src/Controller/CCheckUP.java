/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOCheckUP;
import DAOInterface.ICheckUP;
import Model.MCheckUP;
import Model.TMCheckUP;
import View.VCheckUP;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class CCheckUP {
    VCheckUP frame;
    ICheckUP implcheck;
    List<MCheckUP> listcheck;
    
    public CCheckUP(VCheckUP frame)
    {
        this.frame = frame;
        implcheck = new DAOCheckUP();
        
    }
    
    public void isiTable()
    {
       listcheck = implcheck.getAll();
       TMCheckUP tabelChk = new TMCheckUP(listcheck);
       frame.getTbl_data().setModel(tabelChk);
    }
    public void insert()
    {
       if(!frame.getTxt_nama().getText().trim().isEmpty() & !frame.getTxt_nama().getText().trim().isEmpty()){
            MCheckUP mchk = new MCheckUP();
            
            mchk.setKode(Integer.valueOf(frame.getTxt_no().getText()));
            mchk.setPemilik(frame.getTxt_nama().getText());
            mchk.setAlamat(frame.getTxt_alamat().getText());
            mchk.setMobil(frame.getTxt_mobil().getText());
            mchk.setRoda(Integer.valueOf(frame.getTxt_roda().getText()));
            mchk.setBhn_bakar(frame.getTxt_bhnbakar().getText());
            mchk.setBgn_check(frame.getTxt_part().getText());
            mchk.setKerusakan(Integer.valueOf(frame.getTxt_kondisi().getText()));
            mchk.setKategori(mchk.kategori(Integer.valueOf(frame.getTxt_kondisi().getText())));
            
            implcheck.insert(mchk);
            JOptionPane.showMessageDialog(null,"Data Tersimpan");
        } else {
            JOptionPane.showMessageDialog(null,"Data Tidak Tersimpan");
         
            }
        }
    public void selectField(int row)
    {
        frame.getTxt_no().setEnabled(false);
        frame.getTxt_no().setText(Integer.toString(listcheck.get(row).getKode()));
        frame.getTxt_nama().setText(listcheck.get(row).getPemilik());
        frame.getTxt_alamat().setText(listcheck.get(row).getAlamat());
        frame.getTxt_mobil().setText(listcheck.get(row).getMobil());
        frame.getTxt_roda().setText(Integer.toString(listcheck.get(row).getRoda()));
        frame.getTxt_bhnbakar().setText(listcheck.get(row).getBhn_bakar());
        frame.getTxt_part().setText(listcheck.get(row).getBgn_check());
        frame.getTxt_kondisi().setText(Integer.toString(listcheck.get(row).getKerusakan()));
    }
    
    public void reset()
    {
        if(!frame.getTxt_no().isEnabled())
            frame.getTxt_no().setEnabled(true);
        frame.getTxt_no().setText("");
        frame.getTxt_nama().setText("");
        frame.getTxt_alamat().setText("");
        frame.getTxt_mobil().setText("");
        frame.getTxt_roda().setText("");
        frame.getTxt_bhnbakar().setText("");
        frame.getTxt_part().setText("");
        frame.getTxt_kondisi().setText("");
       
    }
    
    public void update()
    {
        
            MCheckUP mchk = new MCheckUP();
            
            mchk.setPemilik(frame.getTxt_nama().getText());
            mchk.setAlamat(frame.getTxt_alamat().getText());
            mchk.setMobil(frame.getTxt_mobil().getText());
            mchk.setRoda(Integer.valueOf(frame.getTxt_roda().getText()));
            mchk.setBhn_bakar(frame.getTxt_bhnbakar().getText());
            mchk.setBgn_check(frame.getTxt_part().getText());
            mchk.setKerusakan(Integer.valueOf(frame.getTxt_kondisi().getText()));
            mchk.setKategori(mchk.kategori(Integer.valueOf(frame.getTxt_kondisi().getText())));
            mchk.setKode(Integer.parseInt(frame.getTxt_no().getText()));
            implcheck.update(mchk);
            
            JOptionPane.showMessageDialog(null,"Update Berhasil");
    }
    
    public void delete()
    {
        MCheckUP mchk = new MCheckUP();
 
        implcheck.delete(Integer.parseInt(frame.getTxt_no().getText()));

        JOptionPane.showMessageDialog(null,"Delete Berhasil");
    }
}
