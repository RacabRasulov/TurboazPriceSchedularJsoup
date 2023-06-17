package com.example.demo.entity;

import lombok.*;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.persistence.*;

@Entity
@Builder
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Price")
public class TurboazPEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    String date;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
