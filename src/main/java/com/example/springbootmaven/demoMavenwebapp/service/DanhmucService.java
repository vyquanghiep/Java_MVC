package com.example.springbootmaven.demoMavenwebapp.service;

import com.example.springbootmaven.demoMavenwebapp.dto.DanhmucDTO;
import com.example.springbootmaven.demoMavenwebapp.model.Danhmuc;
import com.example.springbootmaven.demoMavenwebapp.respositories.DanhmucRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DanhmucService {
    @Autowired
    private DanhmucRepository repository;
    public Danhmuc saveDanhmuc(Danhmuc danhmuc){
        return repository.save(danhmuc);

    }
    public List<Danhmuc> saveDanhmucs(List<Danhmuc> danhmucs){
        return repository.saveAll(danhmucs);
    }
    public List<Danhmuc> getDanhmucs(){
        return repository.findAll();

    }
    public Danhmuc getDanhmucById(int id){
        return repository.findById(id).orElse(null);
    }
    public Danhmuc getDanhmucByName(String tendanhmuc){
        return repository.findByTendanhmuc(tendanhmuc);
    }
    public String deleteDanhmuc(int id){
        repository.deleteById(id);
        return "Danh muc remove ||"+ id;
    }
    public Danhmuc updateDanhmuc(Danhmuc danhmuc){
        Danhmuc existingDanhmuc = repository.findById(danhmuc.getIddanhmuc()).orElse(null);
        existingDanhmuc.setTendanhmuc(danhmuc.getTendanhmuc());
        return repository.save(existingDanhmuc);
    }


}
