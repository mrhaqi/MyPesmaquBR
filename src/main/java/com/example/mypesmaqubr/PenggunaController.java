package com.example.mypesmaqubr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class PenggunaController {

    @Autowired
    private PenggunaRepository penggunaRepository;

    @PostMapping("/register")
    public String register(@RequestBody Pengguna pengguna) {
        if(penggunaRepository.findByUsername(pengguna.getUsername()) != null) {
            return "Username sudah terdaftar!";
        }
        penggunaRepository.save(pengguna);
        return "Registrasi berhasil!";
    }

    @PostMapping("/login")
    public String login(@RequestBody Pengguna pengguna) {
        Pengguna user = penggunaRepository.findByUsername(pengguna.getUsername());
        if(user != null && user.getPassword().equals(pengguna.getPassword())) {
            return "Login berhasil!";
        }
        return "Username atau password salah!";
    }
}