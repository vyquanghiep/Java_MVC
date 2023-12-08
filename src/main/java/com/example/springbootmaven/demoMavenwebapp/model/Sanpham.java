package com.example.springbootmaven.demoMavenwebapp.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;
import java.util.Set;

// Đánh dấu đây là table trong db
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="sanpham")
public class Sanpham {

    @Id //Đánh dấu là primary key
    @GeneratedValue // Giúp tự động tăng
    private int idsanpham;
    private String tensanpham;
    private String gia;

    @ManyToOne
    @JoinColumn(name = "iddanhmuc")
    @JsonManagedReference
    private Danhmuc danhmuc;

    @OneToMany(mappedBy = "sanpham",cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Nhacungcap> nhacungcap;


}
