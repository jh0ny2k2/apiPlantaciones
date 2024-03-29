package com.jaroso.plantaciones.repository;

import com.jaroso.plantaciones.entity.SensorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorRepository extends JpaRepository<SensorEntity, Long> {
}
