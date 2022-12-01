/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2.com.dao;

import Project2.com.entitys.BanDoc;
import Project2.com.entitys.QuyenSach;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Minh PC
 */
public class BanDocDB {
     private int idBanDoc;
    private String tenBanDocs, diaChis, loaiBanDoc, sDT;
//   String a =""+money  ;
    private Date ngaySinhs;

    /**
     * Creates new form Customer
     */


    public int getIdBanDoc() {
        return idBanDoc;
    }

    public void setIdBanDoc(int idBanDoc) {
        this.idBanDoc = idBanDoc;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public String getTenBanDocs() {
        return tenBanDocs;
    }

    public void setTenBanDocs(String tenBanDocs) {
        this.tenBanDocs = tenBanDocs;
    }

    public String getDiaChis() {
        return diaChis;
    }

    public void setDiaChis(String diaChis) {
        this.diaChis = diaChis;
    }

    public String getLoaiBanDocs() {
        return loaiBanDoc;
    }

    public void setLoaiBanDocs(String loaiBanDoc) {
        this.loaiBanDoc = loaiBanDoc;
    }

    public Date getNgaySinhs() {
        return ngaySinhs;
    }

    public void setNgaySinhs(Date ngaySinhs) {
        this.ngaySinhs = ngaySinhs;
    }
    
    private ArrayList<BanDoc> list;
    DefaultTableModel model;

    
     public static void addData( String TenBanDoc, String DiaChi, String NgaySinh, String sDT, String LoaiBanDoc) throws ClassNotFoundException, SQLException {
         //To change body of generated methods, choose Tools | Templates.
         try {
             Connection con = Project2.com.dao.ConnectionDB.ketNoi();
             Statement stateMent = con.createStatement();
             stateMent.executeUpdate("insert into nguoidoc(TenNguoiDoc,DiaChi,NgaySinh,SDT,LoaiNguoiDoc) values('" + TenBanDoc + "','" + DiaChi + "','" + NgaySinh + "','" + sDT + "','" + LoaiBanDoc + "')");
         } catch (ClassNotFoundException | SQLException ex) {
             Logger.getLogger(BanDoc.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     
      public static void updateData(int IdBanDoc, String TenBanDoc, String DiaChi, String NgaySinh, String sDT, String LoaiBanDoc) {
         try {
             Connection con = Project2.com.dao.ConnectionDB.ketNoi();
             Statement stateMent = con.createStatement();
             stateMent.executeUpdate("update nguoidoc set TenNguoiDoc='" + TenBanDoc + "',DiaChi='" + DiaChi + "',NgaySinh='" + NgaySinh + "',SDT='" + sDT + "',LoaiNguoiDoc='" + LoaiBanDoc + "' where MaNguoiDoc='" + IdBanDoc + "'");
         } catch (ClassNotFoundException | SQLException ex) {
             Logger.getLogger(BanDoc.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
      public static void deleteData(int IdBanDoc) {
         try {
             Connection con = Project2.com.dao.ConnectionDB.ketNoi();
             Statement stateMent = con.createStatement();
             
             stateMent.executeUpdate("delete from nguoidoc where MaNguoiDoc='" + IdBanDoc + "'");

         } catch (ClassNotFoundException | SQLException ex) {
             Logger.getLogger(BanDoc.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
}
