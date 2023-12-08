package com.example.springbootmaven.demoMavenwebapp.controller;


import com.example.springbootmaven.demoMavenwebapp.model.Sanpham;

import com.example.springbootmaven.demoMavenwebapp.service.SanphamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sanpham")
public class SanphamController {
    @Autowired
    private SanphamService service;
    @PostMapping("add")
    public Sanpham addSanpham(@RequestBody Sanpham sanpham){
        return service.saveSanpham(sanpham);
    }

    @GetMapping
    public List<Sanpham> findAllSanphams(){
        return service.getSanphams();
    }
    @GetMapping("/{id}")
    public Sanpham findSanphamById(@PathVariable int id){
        return service.getSanphamById(id);
    }
    @GetMapping("/{name}")
    public Sanpham findSanphamByName(@PathVariable String name){
        return service.getSanphamByName(name);
    }
    @PutMapping
    public Sanpham updateSanpham(@RequestBody Sanpham sanpham){
        return service.updateSanpham(sanpham);
    }

    @DeleteMapping("/{id}")
    public String deleteSanpham(@PathVariable int id){
        return service.deleteSanpham(id);
    }

}
