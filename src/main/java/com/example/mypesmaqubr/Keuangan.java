package com.example.mypesmaqubr;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Keuangan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String keterangan;
    private double jumlah;
    private String jenis; // "Pemasukan" atau "Pengeluaran"
    private LocalDate tanggal; // Tambahan kolom tanggal

    // Getter dan Setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getKeterangan() { return keterangan; }
    public void setKeterangan(String keterangan) { this.keterangan = keterangan; }

    public double getJumlah() { return jumlah; }
    public void setJumlah(double jumlah) { this.jumlah = jumlah; }

    public String getJenis() { return jenis; }
    public void setJenis(String jenis) { this.jenis = jenis; }

    public LocalDate getTanggal() { return tanggal; }
    public void setTanggal(LocalDate tanggal) { this.tanggal = tanggal; }
}