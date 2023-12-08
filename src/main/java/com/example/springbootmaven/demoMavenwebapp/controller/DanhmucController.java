package com.example.springbootmaven.demoMavenwebapp.controller;

import com.example.springbootmaven.demoMavenwebapp.dto.DanhmucDTO;
import com.example.springbootmaven.demoMavenwebapp.model.Danhmuc;
import com.example.springbootmaven.demoMavenwebapp.service.DanhmucService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/danhmuc")
@CrossOrigin
public class DanhmucController {

    @Autowired
    private DanhmucService service;

    @PostMapping("/add")
    public Danhmuc addDanhmuc(@RequestBody Danhmuc danhmuc  ){

        return service.saveDanhmuc(danhmuc);
    }


    @GetMapping
    public List<Danhmuc> findAllDanhmucs(){
        return service.getDanhmucs();
    }
    @GetMapping("seek/{id}")
    public Danhmuc findDanhmucById(@PathVariable int id){
        return service.getDanhmucById(id);
    }
    @GetMapping("seek2/{name}")
    public Danhmuc findDanhmucByName(@PathVariable String name){
        return service.getDanhmucByName(name);
    }
    @PutMapping
    public Danhmuc updateDanhmuc(@RequestBody Danhmuc danhmuc){
        return service.updateDanhmuc(danhmuc);
    }

    @DeleteMapping("/{id}")
    public String deleteDanhmuc(@PathVariable int id){
        return service.deleteDanhmuc(id);
    }



}
