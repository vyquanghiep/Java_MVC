package com.example.springbootmaven.demoMavenwebapp.respositories;

import com.example.springbootmaven.demoMavenwebapp.model.Danhmuc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DanhmucRepository extends JpaRepository<Danhmuc,Integer> {
    Danhmuc findByTendanhmuc(String tendanhmuc);

}
