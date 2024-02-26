package com.jaroso.plantaciones.repository;

import com.jaroso.plantaciones.entity.RegistroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface RegistroRepository extends JpaRepository<RegistroEntity, Long> {

}
