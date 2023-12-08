package com.example.springbootmaven.demoMavenwebapp.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;

// Đánh dấu đây là table trong db
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="nhacungcap")
public class Nhacungcap {

    @Id //Đánh dấu là primary key
    @GeneratedValue // Giúp tự động tăng
    private int idnhacungcap;
    private String tennhacungcap;
    private String sodt;


    @ManyToOne
    @JoinColumn(name = "idsanpham")
    @JsonManagedReference
    private Sanpham sanpham;




}
