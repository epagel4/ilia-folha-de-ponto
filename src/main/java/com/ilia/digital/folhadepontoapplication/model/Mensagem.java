package com.ilia.digital.folhadepontoapplication.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data

public class Mensagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String msg;
}
