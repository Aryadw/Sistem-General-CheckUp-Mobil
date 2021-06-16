/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class KoneksiDB {
    static Connection con;
    
    public static Connection getConnection(){
        if (con == null){
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("db_pbo");
            data.setUser("root");
            data.setPassword("");
             
             try {
                 con = (Connection) data.getConnection();
                 System.out.println("Koneksi Berhasil");
             } catch (SQLException e){
                 System.out.println("Tidak konek");
                 e.printStackTrace();
             } 
        } 
        return con;
    }
}
