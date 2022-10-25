package com.ilia.digital.folhadepontoapplication.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class MomentoDTO {

    @Id
    @NotNull
    private Long id;

//    @NotEmpty
//    @Size(min = 20, message = "ok")
    @Pattern(regexp = "^([0-9]{4})-?(1[0-2]|0[1-9])-?(3[01]|0[1-9]|[12][0-9])↵●(2[0-3]|[01][0-9]):?([0-5][0-9]):?([0-5][0-9])$",
            message = "Data e hora em formato inválido.")
    private String dataHora;

}
