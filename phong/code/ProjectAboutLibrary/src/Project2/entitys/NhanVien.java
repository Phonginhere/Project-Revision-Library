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
public class NhanVien {
        private int maEmployee;
    private String employeeName, address, Email, phonenumber, tenTaiKhoan, matKhau, loai;
    private String birthDate;

    public NhanVien(int maEmployee, String employeeName, String address, String Email, String phonenumber, String tenTaiKhoan, String matKhau, String loai, String birthDate) {
        this.maEmployee = maEmployee;
        this.employeeName = employeeName;
        this.address = address;
        this.Email = Email;
        this.phonenumber = phonenumber;
        this.tenTaiKhoan = tenTaiKhoan;
        this.matKhau = matKhau;
        this.loai = loai;
        this.birthDate = birthDate;
    }

    public NhanVien() {
    }
    
    public int getMaEmployee() {
        return maEmployee;
    }

    public void setMaEmployee(int maEmployee) {
        this.maEmployee = maEmployee;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    
    
}
