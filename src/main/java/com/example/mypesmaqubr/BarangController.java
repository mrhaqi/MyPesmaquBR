package com.example.mypesmaqubr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/barang")
public class BarangController {

    @Autowired
    private BarangRepository barangRepository;

    @GetMapping
    public List<Barang> getAllBarang() {
        return barangRepository.findAll();
    }

    @PostMapping
    public Barang tambahBarang(@RequestBody Barang barang) {
        return barangRepository.save(barang);
    }

    // Tambahan fungsi untuk menghapus barang berdasarkan ID
    @DeleteMapping("/{id}")
    public void hapusBarang(@PathVariable Long id) {
        barangRepository.deleteById(id);
    }
}