package com.dilara.entity;
import jakarta.persistence.*;
import lombok.*;
@Data //get set vs.içinde barındırıyor
@AllArgsConstructor //parametreli constructorların tümü
@NoArgsConstructor //default constructor
@Builder
@Entity
@Table(name = "tbluser")
public class User {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;
    @Column(name = "userName", unique = true, nullable = false, length = 64, updatable = false)
    private String username;
    @Column(nullable = false, length = 128)
    private String password;
    private Long userInformationid;
}
