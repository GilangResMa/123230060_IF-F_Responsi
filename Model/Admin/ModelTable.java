/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Admin;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lab Informatika
 */
public class ModelTable extends AbstractTableModel{
    List<ModelAdmin>daftarAdmin;
    public String kolom[]=["ID","Username","Password"};
}
