/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOInterface;

import Model.MCheckUP;
import java.util.List;

/**
 *
 * @author USER
 */
public interface ICheckUP {
    // read data
    public List<MCheckUP> getAll();
    // Create Data
    public void insert (MCheckUP mchk);
//    Update data
    public void update (MCheckUP mchk);
//    Delete data
    public void delete(int kode);
}
