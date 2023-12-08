package com.example.springbootmaven.demoMavenwebapp.controller;


import com.example.springbootmaven.demoMavenwebapp.model.Nhacungcap;

import com.example.springbootmaven.demoMavenwebapp.service.NhacungcapService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/nhacungcap")
public class NhacungcapController {
    @Autowired
    private NhacungcapService service;
    @PostMapping
    public Nhacungcap addNhacungcap(@RequestBody Nhacungcap nhacungcap){
        return service.saveNhacungcap(nhacungcap);
    }

    @GetMapping
    public List<Nhacungcap> findAllNhacungcaps(){
        return service.getNhacungcaps();
    }
    @GetMapping("/{id}")
    public Nhacungcap findNhacungcapById(@PathVariable int id){
        return service.getNhacungcapById(id);
    }
    @GetMapping("/{name}")
    public Nhacungcap findNhacungcapByName(@PathVariable String name){
        return service.getNhacungcapByName(name);
    }
    @PutMapping
    public Nhacungcap updateNhacungcap(@RequestBody Nhacungcap nhacungcap){
        return service.updateNhacungcap(nhacungcap);
    }

    @DeleteMapping("/{id}")
    public String deleteNhacungcap(@PathVariable int id){
        return service.deleteNhacungcap(id);
    }

}
