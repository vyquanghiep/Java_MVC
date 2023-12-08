package com.example.springbootmaven.demoMavenwebapp.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.core.SpringVersion;

import java.util.Collection;
import java.util.List;
import java.util.Set;

// Đánh dấu đây là table trong db
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="danhmuc")
public class Danhmuc {

    @Id //Đánh dấu là primary key
    @GeneratedValue (strategy =GenerationType.IDENTITY)// Giúp tự động tăng
    private int iddanhmuc;
    @Column(name = "tendanhmuc")
    private String tendanhmuc;

    @OneToMany(mappedBy = "danhmuc",cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Sanpham> sanpham;

}

