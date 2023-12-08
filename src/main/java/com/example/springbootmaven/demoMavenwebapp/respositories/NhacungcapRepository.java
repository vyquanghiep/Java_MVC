package com.example.springbootmaven.demoMavenwebapp.respositories;


import com.example.springbootmaven.demoMavenwebapp.model.Nhacungcap;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NhacungcapRepository extends JpaRepository<Nhacungcap,Integer> {
    Nhacungcap findByTennhacungcap(String tennhacungcap);
}
