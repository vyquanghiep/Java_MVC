package com.example.springbootmaven.demoMavenwebapp.service;



import com.example.springbootmaven.demoMavenwebapp.model.Sanpham;
import com.example.springbootmaven.demoMavenwebapp.respositories.SanphamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SanphamService {
    @Autowired
    private SanphamRepository repository;
    public Sanpham saveSanpham(Sanpham sanpham){ return repository.save(sanpham);}
    public List<Sanpham> saveSanphams(List<Sanpham> sanphams){
        return repository.saveAll(sanphams);
    }
    public List<Sanpham> getSanphams(){
        return repository.findAll();

    }
    public Sanpham getSanphamById(int id){
        return repository.findById(id).orElse(null);
    }
    public Sanpham getSanphamByName(String tensanpham){
        return repository.findByTensanpham(tensanpham);
    }
    public String deleteSanpham(int id){
        repository.deleteById(id);
        return "Sản phẩm remove ||"+ id;
    }
    public Sanpham updateSanpham(Sanpham sanpham){
        Sanpham existingSanpham = repository.findById(sanpham.getIdsanpham()).orElse(null);
        existingSanpham.setTensanpham(sanpham.getTensanpham());
        existingSanpham.setGia(sanpham.getGia());
        return repository.save(existingSanpham);
    }


}
