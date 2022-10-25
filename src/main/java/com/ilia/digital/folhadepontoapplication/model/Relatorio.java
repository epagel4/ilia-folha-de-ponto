package com.ilia.digital.folhadepontoapplication.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor


public class Relatorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String mes;

    @Column(nullable = false)
    private String horasTrabalhadas;

    @Column(nullable = false)
    private String horasExcedentes;

    @Column(nullable = false)
    private  String horasDevidas;
}
