/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2.com.dao;

import Project2.com.entitys.QuyenSach;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Minh PC
 */
public class QuyenSachDB {
    static PreparedStatement pst;
    static Connection con;
    public static void addData( String ten, String theloai, String nXB, float giatien,String anh) throws ClassNotFoundException, SQLException {
        //To change body of generated methods, choose Tools | Templates.
        try {
            Connection con = Project2.com.dao.ConnectionDB.ketNoi();
//            Statement stateMent = con.createStatement();
//                stateMent.executeUpdate("insert into quyensach(TenSach,TheLoai,NXB,GiaTien,Anh) values('" + ten + "','" + theloai + "','" + nXB + "','" + giatien + "','" + anh + "')");
                String sql = "INSERT INTO `quyensach`(`TenSach`,`TheLoai`,`NXB`,`GiaTien`,`Anh`) VALUES (?,?,?,?,?)";
             try{
                 pst = con.prepareStatement(sql);
//                  pst.setString(1, jTextFieldFullName.getText());
                    pst.setString(1, ten);
//                   pst.setInt(2, Integer.parseInt(jTextFieldPhoneNumber.getText()));
                   pst.setString(2, theloai);
//                   pst.setString(3, jTextFieldEmail.getText());
                     pst.setString(3, nXB);
                  
//                    pst.setString(4, jPasswordField.getText());
                      pst.setFloat(4, giatien);
                   
                   pst.setString(5, anh);
//                     pst.setString(6, nhanvien.getUsername_nhanvien());
                     
                    pst.executeUpdate();
             }catch (Exception e) {
                 System.out.println(e);
                // TODO: handle exception
    }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(QuyenSach.class.getName()).log(Level.SEVERE, null, ex);
        }
//            String  ten1111 = Project2.Common.maNV ;
//            System.out.println("Ten la : " + ten1111);
    }
    public static void updateData(int ma, String ten, String theloai, String nXB, float giatien,String anh) {
        try {
            Connection con = Project2.com.dao.ConnectionDB.ketNoi();
            Statement stateMent = con.createStatement();
            System.out.println("....."+anh);
//            stateMent.executeUpdate("update quyensach set TenSach='" + ten + "',TheLoai='" + theloai + "',NXB='" + nXB + "',GiaTien='" + giatien + "',Anh='" + anh + "' where MaSach='" + ma + "'");
                 String sql = "UPDATE `db_quanlysach`.`quyensach` SET `TenSach`=?,`TheLoai`=?,`NXB`=?,`GiaTien`=?,`Anh`=?  WHERE MaSach="+ma;
             try{
                pst = con.prepareStatement(sql);

                  pst.setString(1, ten);

                    pst.setString(2, theloai);

                   pst.setString(3, nXB);

                    pst.setFloat(4, giatien);
                   pst.setString(5, anh);

                    pst.executeUpdate();
             }catch (Exception e) {
                 System.out.println(e);
                // TODO: handle exception
    }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(QuyenSach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void deleteData(int ma) {
        try {
            Connection con = Project2.com.dao.ConnectionDB.ketNoi();
            Statement stateMent = con.createStatement();
            stateMent.executeUpdate("delete from quyensach where MaSach='" + ma + "'");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(QuyenSach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
