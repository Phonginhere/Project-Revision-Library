/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2.entitys;

/**
 *
 * @author Phong
 */
public class QuyenSach {
    private int id;
    private float money;
    private String name, kieu,dob; 

    public QuyenSach(int id, float money, String name, String kieu, String dob) {
        this.id = id;
        this.money = money;
        this.name = name;
        this.kieu = kieu;
        this.dob = dob;
    }

    public QuyenSach() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKieu() {
        return kieu;
    }

    public void setKieu(String kieu) {
        this.kieu = kieu;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
}
