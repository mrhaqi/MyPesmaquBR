package com.example.mypesmaqubr;

import jakarta.persistence.*;

@Entity
public class Dokumen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String judulDokumen;
    private String pemohon;
    private String status; // Contoh: "Pending", "Disetujui", "Ditolak"

    // Getter dan Setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getJudulDokumen() { return judulDokumen; }
    public void setJudulDokumen(String judulDokumen) { this.judulDokumen = judulDokumen; }
    public String getPemohon() { return pemohon; }
    public void setPemohon(String pemohon) { this.pemohon = pemohon; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}