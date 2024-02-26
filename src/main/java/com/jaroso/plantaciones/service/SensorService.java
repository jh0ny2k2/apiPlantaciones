package com.jaroso.plantaciones.service;

import com.jaroso.plantaciones.entity.RegistroEntity;
import com.jaroso.plantaciones.entity.SensorEntity;
import com.jaroso.plantaciones.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SensorService {

    @Autowired
    private final SensorRepository sensorRepository;

    public SensorService(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    // METODO PARA CREAR SENSOR
    public void crearSensor(SensorEntity sensor) {
        sensorRepository.save(sensor);
    }

    // METODO PARA LISTAR TODOS LOS SENSORES
    public List<SensorEntity> findAll() {
        return this.sensorRepository.findAll();
    }

    // METODO PARA LISTAR SENSOR POR ID
    public SensorEntity obtenerSensorPorId(Long id){
        return sensorRepository.findById(id).orElse(null);
    }

    // METODO PARA ACTUALIZAR EL SENSOR
    public void actualizarSensor(SensorEntity sensor) {
        sensorRepository.save(sensor);
    }

    // METODO PARA ELIMINAR UN SENSOR
    public void eliminarSensor(Long id) {
        sensorRepository.deleteById(id);
    }


}
