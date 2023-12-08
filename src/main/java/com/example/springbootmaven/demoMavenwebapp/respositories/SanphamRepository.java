package com.example.springbootmaven.demoMavenwebapp.respositories;


import com.example.springbootmaven.demoMavenwebapp.model.Sanpham;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SanphamRepository extends JpaRepository<Sanpham,Integer> {
    Sanpham findByTensanpham(String tensanpham);
}
