package com.example.springbootmaven.demoMavenwebapp.dto;

import com.example.springbootmaven.demoMavenwebapp.model.Sanpham;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Set;


@Data
@AllArgsConstructor
public class DanhmucDTO {
    private int iddanhmuc;
    private String tendanhmuc;
    private List<Sanpham> sanpham;
}
