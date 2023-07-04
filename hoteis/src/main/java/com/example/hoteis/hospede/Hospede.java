package com.example.hoteis.hospede;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "hospedes")
@Entity(name = "hospedes")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Hospede {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String image;
    private Integer comanda;

    public Hospede(HospedeRequestDTO data){
        this.nome = data.nome();
        this.email = data.email();
        this.image = data.image();
        this.comanda = data.comanda();
    }
}

