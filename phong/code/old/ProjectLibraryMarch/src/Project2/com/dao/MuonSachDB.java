/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2.com.dao;

import Project2.com.entitys.MuonSach;
import Project2.com.entitys.QuyenSach;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Minh PC
 */
public class MuonSachDB {
     public static void addData(String MaNhanVien, String MaNguoiDoc, String MaSach, float GiaThue, String NgayMuonSach, String NgayTraSach,String TrangThai) throws ClassNotFoundException, SQLException {
        //To change body of generated methods, choose Tools | Templates.
        try {
            Connection con = Project2.com.dao.ConnectionDB.ketNoi();
            Statement stateMent = con.createStatement();
            stateMent.executeUpdate("insert into muonsach(MaNhanVien,MaNguoiDoc,MaSach,GiaThue,NgayMuon,NgayTra,TrangThai) values(" + MaNhanVien + "," + MaNguoiDoc + ",'" + MaSach + "','" + GiaThue + "','" + NgayMuonSach + "','" + NgayTraSach + "','" + TrangThai + "')");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(QuyenSach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       public static void updateData(int MaForm,String MaNhanVien, String MaNguoiDoc, String MaSach, float GiaThue, String NgayMuonSach, String NgayTraSach,String TrangThai) {
        try {
            Connection con = Project2.com.dao.ConnectionDB.ketNoi();
            Statement stateMent = con.createStatement();
            stateMent.executeUpdate("update muonsach set MaNhanVien='" + MaNhanVien + "', MaNguoiDoc='" + MaNguoiDoc + "',MaSach='" + MaSach + "',GiaThue='" + GiaThue + "',NgayMuon='" + NgayMuonSach + "',NgayTra='" + NgayTraSach + "',TrangThai='" + TrangThai + "' where MaSach='" + MaForm + "'");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(QuyenSach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       public static void deleteData(int MaForm) {
        try {
            Connection con = Project2.com.dao.ConnectionDB.ketNoi();
            Statement stateMent = con.createStatement();
            stateMent.executeUpdate("delete from muonsach where MaMuonSach='" + MaForm + "'");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MuonSach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
