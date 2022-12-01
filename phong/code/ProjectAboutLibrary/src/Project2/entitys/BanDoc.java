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
public class BanDoc {
    private int idBanDoc;
    private String tenBanDocs, diaChis, loaiBanDoc, sDT;
    private String ngaySinhs;

    public BanDoc(int idBanDoc, String tenBanDocs, String diaChis, String loaiBanDoc, String sDT, String ngaySinhs) {
        this.idBanDoc = idBanDoc;
        this.tenBanDocs = tenBanDocs;
        this.diaChis = diaChis;
        this.loaiBanDoc = loaiBanDoc;
        this.sDT = sDT;
        this.ngaySinhs = ngaySinhs;
    }

    public BanDoc() {
    }
    
    public int getIdBanDoc() {
        return idBanDoc;
    }

    public void setIdBanDoc(int idBanDoc) {
        this.idBanDoc = idBanDoc;
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

    public String getLoaiBanDoc() {
        return loaiBanDoc;
    }

    public void setLoaiBanDoc(String loaiBanDoc) {
        this.loaiBanDoc = loaiBanDoc;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public String getNgaySinhs() {
        return ngaySinhs;
    }

    public void setNgaySinhs(String ngaySinhs) {
        this.ngaySinhs = ngaySinhs;
    }
    
}
