/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2;

import Project2.com.dao.ConnectionDB;
import Project2.QuyenSachView;
import Project2.entitys.MuonSach;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Minh PC
 */
public class SachInfo extends javax.swing.JFrame {

    /**
     * Creates new form SachInfo
     */
    public int IdTemp = 0;
    public String nameTemp = "";
    
//    class CollectionJava{
//    public Connection ketNoi() throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_quanlysach", "root", "");
//        //db_demo là tên của database, root là username và password là rỗng
//        return con;
//    
//  }
//}
    MuonSachView jtRowData = new MuonSachView();
    
    DefaultTableModel model;
    
    public SachInfo() {
        //show du lieu tren table
        initComponents();
        this.setLocationRelativeTo(null);
        model = (DefaultTableModel)Table.getModel();
        Vector vector = new Vector();
            try {
            Connection con = ConnectionDB.ketNoi();
            Statement stateMent = con.createStatement();
            ResultSet rs = stateMent.executeQuery("select * from quyensach");
            while(rs.next()){
                //System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+rs.getString(3));
                vector= new Vector();
                vector.add(rs.getInt(1));
                vector.add(rs.getString(2));
                vector.add(rs.getString(3));
                vector.add(rs.getString(4));
                vector.add(rs.getString(5));
                model.addRow(vector);        
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(QuyenSachView.class.getName()).log(Level.SEVERE, null, ex);
        }
            
//          Management.sachInfo_ = this; 
          
//          SachInfo si = new SachInfo();
//          Management.sachInfo_= si;
//          Management.kkkk =0;
//          Management.banDoc = null;
//          Management.namme ="abc";
            
//          Management.sachInfo_ = this; 
          
//          SachInfo si = new SachInfo();
//          Management.sachInfo_= si;
//          Management.kkkk =0;
//          Management.banDoc = null;
//          Management.namme ="abc";
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        FindName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabelClose = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(248, 148, 6));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(44, 63, 80));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sách", "Tên Sách", "Thể Loại", "Ngày Suất Bản", "Giá Tiền"
            }
        ));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nhập Tên Sách:");

        FindName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindNameActionPerformed(evt);
            }
        });
        FindName.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FindNamePropertyChange(evt);
            }
        });
        FindName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FindNameKeyTyped(evt);
            }
        });
        FindName.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                FindNameVetoableChange(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton1.setText("Back Page");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabelClose.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("-");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1042, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(FindName, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelClose)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FindName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_TableMouseClicked

    private void FindNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FindNameActionPerformed

    private void FindNamePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FindNamePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_FindNamePropertyChange

    private void FindNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FindNameKeyTyped
        // TODO add your handling code here:
        String query = FindName.getText();
        if(query != null && query.length() > 0){
            Filter(query);
        }
    }//GEN-LAST:event_FindNameKeyTyped

    private void FindNameVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_FindNameVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_FindNameVetoableChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jtRowData.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel7MouseClicked
        private void Filter(String query){
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model); 
        Table.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(query));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SachInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SachInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SachInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SachInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SachInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FindName;
    private javax.swing.JTable Table;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}