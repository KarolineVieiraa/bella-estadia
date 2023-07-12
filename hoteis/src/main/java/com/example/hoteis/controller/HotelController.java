package com.example.hoteis.controller;

import com.example.hoteis.hospede.Hospede;
import com.example.hoteis.hospede.HospedeRepository;
import com.example.hoteis.hospede.HospedeRequestDTO;
import com.example.hoteis.hospede.HospedeResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("hospede")
public class HotelController {
    @Autowired
    private HospedeRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveHospede(@RequestBody HospedeRequestDTO data){
        Hospede hospedeData = new Hospede(data);
        repository.save(hospedeData);
        return;
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<HospedeResponseDTO> getAll(){
        List<HospedeResponseDTO> hospedeList = repository.findAll().stream().map(HospedeResponseDTO::new).toList();

        return hospedeList;
    }
}
