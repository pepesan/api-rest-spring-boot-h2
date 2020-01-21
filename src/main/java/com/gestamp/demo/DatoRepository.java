package com.gestamp.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatoRepository extends
        JpaRepository<Dato,Long> {}
