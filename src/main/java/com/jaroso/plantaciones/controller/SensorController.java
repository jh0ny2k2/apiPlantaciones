package com.jaroso.plantaciones.controller;

import com.jaroso.plantaciones.entity.RegistroEntity;
import com.jaroso.plantaciones.repository.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:9000")
public class SensorController {

/*    @Autowired
    private SensorController sensorService;

    @GetMapping("/api/informes/sensor/{sensor}/fechasInicio/{fi}/fechaFin/{ff}")
    public RegistroEntity obtenerInformeSensor(@PathVariable Long sensor,
                                              @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date fi,
                                              @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date ff) {
        return sensorService.obtenerInformeSensor(sensor, fi, ff);
    }

    @GetMapping("/api/plantacion/{idp}")
    public List<RegistroEntity> obtenerRegistrosPlantacion(@PathVariable Long idp) {
        return sensorService.obtenerRegistrosPlantacion(idp);
    }

    @GetMapping("/api/plantacion/{idp}/fecha/{fecha}")
    public List<RegistroEntity> obtenerRegistrosPlantacionFecha(@PathVariable Long idp,
                                                          @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date fecha) {
        return sensorService.obtenerRegistrosPlantacionFecha(idp, fecha);
    }

 */
}
