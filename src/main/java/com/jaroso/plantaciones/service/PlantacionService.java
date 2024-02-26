package com.jaroso.plantaciones.service;

import com.jaroso.plantaciones.entity.PlantacionEntity;
import com.jaroso.plantaciones.repository.PlantacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlantacionService {

    @Autowired
    private final PlantacionRepository repository;

    public PlantacionService(PlantacionRepository repository) {
        this.repository = repository;
    }

    // METODO PARA CREAR UNA NUEVA PLANTACION
    public void crearPlantacion (PlantacionEntity plantacion) {
        repository.save(plantacion);
    }

    // METODO PARA SACAR TODAS LAS PRESENTACIONES
    public List<PlantacionEntity> findAll() {
        return this.repository.findAll();
    }

    // METODO PARA SACAR UNA PLANTACION POR ID
    public PlantacionEntity obtenerPlantacionPorId(Long id) {
        return this.repository.findById(id).orElse(null);
    }

    // METODO PARA ACTUALIZAR UNA PLANTACION
    public void actualizarPlantacion (PlantacionEntity plantacion) {
            repository.save(plantacion);
    }

    // METODO PARA ELIMINAR UNA PLANTACION
    public void eliminarPlantacion(Long id) {
        repository.deleteById(id);
    }
}
