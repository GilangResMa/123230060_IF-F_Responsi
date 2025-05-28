/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model.Admin;
import java.util.List;

/**
 *
 * @author Lab Informatika
 */
public interface InterfaceDAOAdmin {
    public void insert(ModelAdmin penyewa);
    public void update(ModelAdmin penyewa);
    public void delete(int id);
    public List<ModelAdmin>getAll();
}
