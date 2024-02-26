package com.jaroso.plantaciones.controller;

import com.jaroso.plantaciones.entity.RegistroEntity;
import com.jaroso.plantaciones.service.PlantacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:9000")
public class PlantacionController {

    @Autowired
    private PlantacionService plantacionService;
}
