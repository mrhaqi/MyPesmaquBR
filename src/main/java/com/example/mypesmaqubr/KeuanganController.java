package com.example.mypesmaqubr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/keuangan")
public class KeuanganController {

    @Autowired
    private KeuanganRepository keuanganRepository;

    @GetMapping
    public List<Keuangan> getAllKeuangan() {
        return keuanganRepository.findAll();
    }

    @PostMapping
    public Keuangan tambahKeuangan(@RequestBody Keuangan keuangan) {
        return keuanganRepository.save(keuangan);
    }

    @DeleteMapping("/{id}")
    public void hapusKeuangan(@PathVariable Long id) {
        keuanganRepository.deleteById(id);
    }
}