package com.example.mypesmaqubr;

import jakarta.persistence.*;

@Entity
public class Barang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String namaBarang;
    private int stok;
    private String kondisi;

    // Getter dan Setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNamaBarang() { return namaBarang; }
    public void setNamaBarang(String namaBarang) { this.namaBarang = namaBarang; }

    public int getStok() { return stok; }
    public void setStok(int stok) { this.stok = stok; }

    public String getKondisi() { return kondisi; }
    public void setKondisi(String kondisi) { this.kondisi = kondisi; }
}