package com.dilara.entity;

import com.dilara.utility.enums.EBookType;
import com.dilara.utility.enums.EStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="tblbook")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //id için otomatik artan bir HB sequence oluşturur
    private Long id;
    private String title;
    private EBookType bookType;
    private int pageCount;
    private Long authorId;
    //her kitabın bir yazarı olduğunu varsayıyoruz
    private EStatus status;
}
