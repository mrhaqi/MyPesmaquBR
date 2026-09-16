package com.example.mypesmaqubr;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PenggunaRepository extends JpaRepository<Pengguna, Long> {
    Pengguna findByUsername(String username);
}