package com.example.hoteis.hospede;

public record HospedeResponseDTO(Long id, String nome, String email,String image, Integer comanda ) {
    public HospedeResponseDTO(Hospede hospede){
        this(hospede.getId(), hospede.getNome(), hospede.getEmail(), hospede.getImage(), hospede.getComanda());
    }
}
