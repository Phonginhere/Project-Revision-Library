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
public class MuonSach {
      public int idForm, idNguoiDoc, idSach;
    private float giaTien;
    String tenNguoiDocs, tenSachs, trangThai,ngayMuons,ngayTras;

    public MuonSach(int idForm, int idNguoiDoc, int idSach, float giaTien, String tenNguoiDocs, String tenSachs, String trangThai, String ngayMuons, String ngayTras) {
        this.idForm = idForm;
        this.idNguoiDoc = idNguoiDoc;
        this.idSach = idSach;
        this.giaTien = giaTien;
        this.tenNguoiDocs = tenNguoiDocs;
        this.tenSachs = tenSachs;
        this.trangThai = trangThai;
        this.ngayMuons = ngayMuons;
        this.ngayTras = ngayTras;
    }

    public MuonSach() {
    }
    
    public int getIdForm() {
        return idForm;
    }

    public void setIdForm(int idForm) {
        this.idForm = idForm;
    }

    public int getIdNguoiDoc() {
        return idNguoiDoc;
    }

    public void setIdNguoiDoc(int idNguoiDoc) {
        this.idNguoiDoc = idNguoiDoc;
    }

    public int getIdSach() {
        return idSach;
    }

    public void setIdSach(int idSach) {
        this.idSach = idSach;
    }

    public float getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(float giaTien) {
        this.giaTien = giaTien;
    }

    public String getTenNguoiDocs() {
        return tenNguoiDocs;
    }

    public void setTenNguoiDocs(String tenNguoiDocs) {
        this.tenNguoiDocs = tenNguoiDocs;
    }

    public String getTenSachs() {
        return tenSachs;
    }

    public void setTenSachs(String tenSachs) {
        this.tenSachs = tenSachs;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getNgayMuons() {
        return ngayMuons;
    }

    public void setNgayMuons(String ngayMuons) {
        this.ngayMuons = ngayMuons;
    }

    public String getNgayTras() {
        return ngayTras;
    }

    public void setNgayTras(String ngayTras) {
        this.ngayTras = ngayTras;
    }
    
    
    
}
