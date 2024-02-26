package com.jaroso.plantaciones.service;

import com.jaroso.plantaciones.controller.RegistroController;
import com.jaroso.plantaciones.entity.RegistroEntity;
import com.jaroso.plantaciones.entity.SensorEntity;
import com.jaroso.plantaciones.repository.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistroService {

    @Autowired
    private final RegistroRepository registroRepository;

    public RegistroService(RegistroRepository registroRepository) {
        this.registroRepository = registroRepository;
    }
/*
    // METODO PARA CREAR UN NUEVO REGISTRO
    public void crearRegistro(RegistroEntity registro) {
        registroRepository.save(registro);
    }

    // METODO PARA SACAR TODOS LOS REGISTROS
    public List<RegistroEntity> findAll() {
        return this.registroRepository.findAll();
    }

    // METODO PARA SACAR UN REGISTRO POR ID
    public RegistroEntity obtenerRegistroPorId(Long id){
        return this.registroRepository.findById(id).orElse(null);
    }

    // METODO PARA ACTUALIZAR UN REGISTRO
    public void actualizarRegistro (RegistroEntity registro) {
        registroRepository.save(registro);
    }

    // METODO PARA ELIMAR UN REGISTRO
    public void eliminarRegistro (Long id) {
        registroRepository.deleteById(id);
    }
 */
}
