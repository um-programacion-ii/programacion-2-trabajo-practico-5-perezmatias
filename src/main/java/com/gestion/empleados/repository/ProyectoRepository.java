package com.gestion.empleados.repository;

import com.gestion.empleados.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Long> {
    @Query("SELECT p FROM Proyecto p WHERE p.fechaFin > CURRENT_DATE")
    List<Proyecto> findProyectosActivos();
}