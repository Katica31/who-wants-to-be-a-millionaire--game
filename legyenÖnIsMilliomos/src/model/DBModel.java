/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBModel implements IModel {

    Connection conn;
    private PreparedStatement getAllKerdesPstmt;
    private PreparedStatement removeKerdesPstmt;
    private PreparedStatement addKerdesPstmt;
    private PreparedStatement getKerdesByKerdesPstmt;
    
    public DBModel(Connection conn) throws SQLException {

        this.conn = conn;
        getAllKerdesPstmt = conn.prepareStatement("SELECT * FROM kerdes");
        removeKerdesPstmt = conn.prepareStatement("DELETE FROM kerdes WHERE kerdes=?");
        addKerdesPstmt = conn.prepareStatement("INSERT INTO kerdes ( id, kerdes, valasz0, valasz1, valasz2, valasz3, helyesvalasz) VALUE ( ?, ?, ?, ?, ?, ?, ?)");
        getKerdesByKerdesPstmt = conn.prepareStatement("Select * FROM kerdes WHERE kerdes LIKE ?");
    }

    @Override
    public void close() throws SQLException {
        this.conn.close();
    }

    @Override
    public Vector<Kerdes> getAllKerdes() throws SQLException {

        Vector<Kerdes> kerdesek = new Vector<>();
        ResultSet rs = getAllKerdesPstmt.executeQuery();
        while (rs.next()) {
            Kerdes kerdes = new Kerdes(
                    rs.getInt("id"),
                    rs.getString("kerdes"),
                    rs.getString("valasz0"),
                    rs.getString("valasz1"),
                    rs.getString("valasz2"),
                    rs.getString("valasz3"),
                    rs.getInt("helyesvalasz"));
            kerdesek.add(kerdes);

//            System.out.println(kerdes);
        }
        return kerdesek;
    }

    @Override
    public int removKerdes(Kerdes k) throws SQLException {
        removeKerdesPstmt.setString(1, k.getKerdes());
        return removeKerdesPstmt.executeUpdate();

    }

    @Override
    public int addKerdes( int id, String kerdes, String valasz0, String valasz1, String valasz2, String valasz3, int helyesvalasz) throws SQLException {

       addKerdesPstmt.setInt(1, id);
        addKerdesPstmt.setString(2, kerdes);
        addKerdesPstmt.setString(3, valasz0);
        addKerdesPstmt.setString(4, valasz1);
        addKerdesPstmt.setString(5, valasz2);
        addKerdesPstmt.setString(6, valasz3);
        addKerdesPstmt.setInt(7, helyesvalasz);

        return addKerdesPstmt.executeUpdate();

    }

    @Override
    public Kerdes getKerdesByKerdes(String kerdes) throws SQLException {
        
           
        getKerdesByKerdesPstmt.setString(1, kerdes);
        ResultSet rs = getKerdesByKerdesPstmt.executeQuery();
        Kerdes k = null;
        while (rs.next()) {
                k = new Kerdes(
                    rs.getInt("id"),
                    rs.getString("kerdes"),
                    rs.getString("valasz0"),
                    rs.getString("valasz1"),
                    rs.getString("valasz2"),
                    rs.getString("valasz3"),
                    rs.getInt("helyesvalasz"));
                   
        
        }
        return k;
    }


}
