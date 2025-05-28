/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Admin;
import Model.Admin.*;
import View.Admin.*;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Lab Informatika
 */
public class ControllerAdmin {
    LoginPage halamanLogin;
    InputData halamanInput;
    EditData halamanEdit;
    ViewData halamanView;
    
    InterfaceDAOAdmin daoAdmin;
    List<ModelAdmin>daftarPenyewa;
    
    public ControllerAdmin(LoginPage halamanLogin){
        this.halamanLogin = halamanLogin;
        this.daoAdmin = new DAOAdmin();
    }
    public ControllerAdmin(InputData halamanInput){
        this.halamanInput = halamanInput;
        this.daoAdmin = new DAOAdmin();
    }
    public ControllerAdmin(EditData halamanEdit){
        this.halamanEdit = halamanEdit;
        this.daoAdmin = new DAOAdmin();
    }
    public ControllerAdmin(ViewData halamanView){
        this.halamanView = halamanView;
        this.daoAdmin = new DAOAdmin();
    }

    public void insertPenyewa(){
        try {
            ModelAdmin penyewaBaru = new ModelAdmin();
            String nama = halamanInput.getInputNama();
            String kontak = halamanInput.getInputKontak();
            if("".equals(nama)||"".equals(kontak)){
                throw new Exception("Data Penyewa tidak boleh kosong!");
                penyewaBaru.setNama(nama);
                penyewaBaru.setKontak(kontak);
                daoAdmin.insert(penyewaBaru);
                JOptionPane.showMessageDialog(null, "Data Penyewa Baru Berhasil Ditambahkan!");
                halamanInput.dispose();
                new ViewData();
            }
        } catch (Exception e) {JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    public void editPenyewa(){
        try {
            ModelAdmin editPenyewa = new ModelAdmin();
            String nama = halamanEdit.getInputNama();
            String kontak = halamanEdit.getInputKontak();
            if("".equals(nama)||"".equals(kontak)){
                throw new Exception("Data Penyewa tidak boleh kosong!");
                editPenyewa.setId(id);
                editPenyewa.setNama(nama);
                editPenyewa.setKontak(kontak);
                daoAdmin.update(editPenyewa);
                JOptionPane.showMessageDialog(null, "Data Penyewa Berhasil Diubah!");
                halamanInput.dispose();
                new ViewData();
            }
        } catch (Exception e) {JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
    public void deletePenyewa(Integer baris){
        Integer id = (int)halamanView.getTablePenyewa().getValueAt(baris,0);
        String nama = halamanView.getTableDosen().getValueAt(baris,1).toString();
        int input = JOptionPane.showConfirmDialog(null,"Hapus " + nama + " ?", "Hapus Penyewa", JOptionPane.YES_NO_OPTION);
        if (input == 0) {
            daoAdmin.delete(id);
            JOptionPane.showMessageDialog(null, "Berhasil menghapus data penyewa.");
            showAllPenyewa();
        }
    }
    
}
