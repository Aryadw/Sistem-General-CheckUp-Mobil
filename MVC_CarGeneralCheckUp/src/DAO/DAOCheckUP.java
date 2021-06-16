/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAOInterface.ICheckUP;
import Helper.KoneksiDB;
import Model.MCheckUP;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class DAOCheckUP implements ICheckUP {

    Connection con;
    
    public DAOCheckUP()
    {
        con = KoneksiDB.getConnection();
    }
    
    //SQL QUERY
    final String insert = "INSERT INTO tabel_gui (kode, pemilik, alamat, mobil, roda, bhn_bakar, bgn_check, kerusakan, kategori) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
    final String delete = "DELETE FROM tabel_gui WHERE kode=?";
    final String update = "UPDATE tabel_gui SET pemilik=?, alamat=?, mobil=?, roda=?, bhn_bakar=?, bgn_check=?, kerusakan=?, kategori=? WHERE kode=?";
    final String select = "SELECT * FROM tabel_gui";
    
    @Override
    public List<MCheckUP> getAll() {
        List<MCheckUP> listcheck = null;
        try
        {
            listcheck = new ArrayList<MCheckUP>();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next())
            {
                MCheckUP chk = new MCheckUP();
                chk.setKode(rs.getInt("kode"));
                chk.setPemilik(rs.getString("pemilik"));
                chk.setAlamat(rs.getString("alamat"));
                chk.setMobil(rs.getString("mobil"));
                chk.setRoda(rs.getInt("roda"));
                chk.setBhn_bakar(rs.getString("bhn_bakar"));
                chk.setBgn_check(rs.getString("bgn_check"));
                chk.setKerusakan(rs.getInt("kerusakan"));
                chk.setKategori(rs.getString("kategori"));
                listcheck.add(chk);
            }
        }
        catch(SQLException e)
                {
                    System.out.println("Error"+e);
                }
        return listcheck;
    }

    @Override
    public void insert(MCheckUP mchk) {
       PreparedStatement statement = null;
       try
       {
           statement = con.prepareStatement(insert);
           statement.setInt(1, mchk.getKode());
           statement.setString(2, mchk.getPemilik());
           statement.setString(3, mchk.getAlamat());
           statement.setString(4, mchk.getMobil());
           statement.setInt(5, mchk.getRoda());
           statement.setString(6, mchk.getBhn_bakar());
           statement.setString(7, mchk.getBgn_check());
           statement.setInt(8, mchk.getKerusakan());
           statement.setString(9, mchk.getKategori());
           statement.execute();
           
       }
       catch(SQLException e)
       {
           System.out.println("Gagal input");
       }
       finally
       {
           try {
               statement.close();
           } catch (SQLException ex) {
               System.out.println("Gagal input");
               ex.printStackTrace();
           }
       }
    }

    @Override
    public void update(MCheckUP mchk) {
        PreparedStatement statement = null;
       try
       {
           statement = con.prepareStatement(update);
           statement.setString(1, mchk.getPemilik());
           statement.setString(2, mchk.getAlamat());
           statement.setString(3, mchk.getMobil());
           statement.setInt(4, mchk.getRoda());
           statement.setString(5, mchk.getBhn_bakar());
           statement.setString(6, mchk.getBgn_check());
           statement.setInt(7, mchk.getKerusakan());
           statement.setString(8, mchk.getKategori());
           statement.setInt(9, mchk.getKode());
           statement.execute();
           
       }
       catch(SQLException e)
       {
           System.out.println("Gagal Update");
           e.printStackTrace();
       }
       finally
       {
           try {
               statement.close();
           } catch (SQLException ex) {
               ex.printStackTrace();
           }
       }
    }

    @Override
    public void delete(int kode) {
       PreparedStatement statement = null;
       try
       {
           statement = con.prepareStatement(delete);
           statement.setInt(1, kode);
           statement.execute();
           
       }
       catch(SQLException e)
       {
           System.out.println("Gagal Hapus");
           e.printStackTrace();
       }
       finally
       {
           try {
               statement.close();
           } catch (SQLException ex) {
               ex.printStackTrace();
           }
       }
    }
    
    
}
