package com.example.springbootmaven.demoMavenwebapp.service;



import com.example.springbootmaven.demoMavenwebapp.model.Danhmuc;
import com.example.springbootmaven.demoMavenwebapp.model.Nhacungcap;
import com.example.springbootmaven.demoMavenwebapp.respositories.NhacungcapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NhacungcapService {
    @Autowired
    private NhacungcapRepository repository;

    public Nhacungcap saveNhacungcap(Nhacungcap nhacungcap){
        return repository.save(nhacungcap);
    }
    public List<Nhacungcap> saveNhacungcaps(List<Nhacungcap> nhacungcaps){
        return repository.saveAll(nhacungcaps);
    }
    public List<Nhacungcap> getNhacungcaps(){
        return repository.findAll();
    }
    public Nhacungcap getNhacungcapById(int id){
        return repository.findById(id).orElse(null);
    }
    public Nhacungcap getNhacungcapByName(String tennhacungcap){
        return repository.findByTennhacungcap(tennhacungcap);
    }
    public String deleteNhacungcap(int id){
        repository.deleteById(id);
        return "Sản phẩm remove ||"+ id;
    }
    public Nhacungcap updateNhacungcap(Nhacungcap nhacungcap){
        Nhacungcap existingNhacungcap = repository.findById(nhacungcap.getIdnhacungcap()).orElse(null);
        existingNhacungcap.setTennhacungcap(nhacungcap.getTennhacungcap());
        return repository.save(existingNhacungcap);
    }


}
