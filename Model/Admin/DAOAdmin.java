/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Admin;
import Model.Connector;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lab Informatika
 */
public class DAOAdmin implements InterfaceDAOAdmin{
    @Override
    public void insert(ModelAdmin penyewa){
        try {
            String query = "INSERT INTO penyewa (nama,kontak,ruang,durasi,total_harga,status) Values (?,?,?,?,?,?);";
            PreparedStatement statement;
            statement = Connector.Connect().prepareStatement(query);
            statement.setString(1,penyewa.getNama());
            statement.setString(2,penyewa.getKontak());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            System.out.println("Input Failed: " + e.getLocalizedMessage());
        }
    }
    @Override
    public void update(ModelAdmin penyewa){
        try {
            String query = "UPDATE penyewa SET nama=?,kontak=?,ruang=?,durasi=?,total_harga=?,status=? WHERE id=?;";
            PreparedStatement statement;
            statement = Connector.Connect().prepareStatement(query);
            statement.setString(1,penyewa.getNama());
            statement.setString(2,penyewa.getKontak());
            statement.setInt(3, penyewa.getId());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            System.out.println("Update Failed: " + e.getLocalizedMessage());
        }
    }
    @Override
    public void delete(int id){
       try {
            String query = "DELETE FROM penyewa WHERE id=?;";
            PreparedStatement statement;
            statement = Connector.Connect().prepareStatement(query);
            statement.setInt(1, penyewa.getId());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            System.out.println("Delete Failed: " + e.getLocalizedMessage());
        } 
    }
    public List<ModelAdmin>getAll(){
        List<ModelAdmin>listPenyewa = null;
        try {
            listPenyewa=new ArrayList<>();
            Statement statement=Connector.Connect().createStatement();
            String query = "SELECT * FROM penyewa;";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                ModelAdmin pny = new ModelAdmin();
                pny.setId(resultSet.getInt("id"));
                pny.setNama(resultSet.getString("nama"));
                pny.setKontak(resultSet.getString("kontak"));
                listPenyewa.add(pny);
            }
            statement.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getLocalizedMessage());
        }
        return listPenyewa;
    }
    
}

