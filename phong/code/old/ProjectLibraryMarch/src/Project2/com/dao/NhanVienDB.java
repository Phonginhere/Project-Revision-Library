/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2.com.dao;

import Project2.com.entitys.NhanVien;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Minh PC
 */
public class NhanVienDB {
     public static void addData( String TenNhanVien, String DiaChi, String NgaySinh, String Email, String sDT,String uname, String mahoa,String loai) throws ClassNotFoundException, SQLException {
        //To change body of generated methods, choose Tools | Templates.
        try {
            Connection con = Project2.com.dao.ConnectionDB.ketNoi();
            Statement stateMent = con.createStatement();
            stateMent.executeUpdate("insert into nhanvien(TenNhanVien,DiaChi,NgaySinh,Email,SoDienThoai,TenTaiKhoan,MatKhau,Loai) values('" + TenNhanVien + "','" + DiaChi + "','" + NgaySinh + "','" + Email + "','" + sDT + "','" + uname + "','" + mahoa + "','" + loai + "')");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public static void deleteData(int Ma) {
        try {
            Connection con = Project2.com.dao.ConnectionDB.ketNoi();
            Statement stateMent = con.createStatement();
            stateMent.executeUpdate("delete from nhanvien where MaNhanVien='" + Ma + "'");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      public static void updateData( int IdNhanVien, String TenNhanVien, String DiaChi, String NgaySinh, String Email, String sDT,String uname, String mahoa,String loai) {
        try {
            Connection con = Project2.com.dao.ConnectionDB.ketNoi();
            Statement stateMent = con.createStatement();
            stateMent.executeUpdate("update nhanvien set TenNhanVien='" + TenNhanVien + "',DiaChi='" + DiaChi + "',NgaySinh='" + NgaySinh + "',Email='" + Email + "',SoDienThoai='" + sDT + "',TenTaiKhoan='" + uname + "',MatKhau='" + mahoa + "',Loai='" + loai + "' where MaNhanVien='" + IdNhanVien + "'");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
