package com.dilara.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="tblborrow")
public class Borrow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //id için otomatik artan bir HB sequence oluşturur
    private Long id;
    private LocalDate borrowDate;
    private LocalDate returnDate;
    private Long userid;
    private Long bookid;
    @Transient //buradaki veriyi database'de tutmaz
    private int period;
}
