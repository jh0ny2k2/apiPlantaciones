package com.jaroso.plantaciones.controller;

import com.jaroso.plantaciones.entity.PlantacionEntity;
import com.jaroso.plantaciones.entity.RegistroEntity;
import com.jaroso.plantaciones.repository.RegistroRepository;
import com.jaroso.plantaciones.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:9000")
@RequestMapping("/api/registro")
public class RegistroController {

    @Autowired
    private RegistroService registroService;




}
