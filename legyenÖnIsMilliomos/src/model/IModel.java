/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author Kata
 */
public interface IModel {
    
    void close()throws SQLException;
     Vector <Kerdes> getAllKerdes() throws SQLException;
    int addKerdes(int id, String kerdes, String valasz0, String valasz1, String valasz2, String valasz3, int helyesvalasz) throws SQLException;
    int removKerdes(Kerdes k) throws SQLException;
    Kerdes getKerdesByKerdes (String kerdes) throws SQLException;
}
