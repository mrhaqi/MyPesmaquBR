package com.example.mypesmaqubr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dokumen")
public class DokumenController {

    @Autowired
    private DokumenRepository dokumenRepository;

    @GetMapping
    public List<Dokumen> getAllDokumen() {
        return dokumenRepository.findAll();
    }

    @PostMapping
    public Dokumen tambahDokumen(@RequestBody Dokumen dokumen) {
        return dokumenRepository.save(dokumen);
    }
}