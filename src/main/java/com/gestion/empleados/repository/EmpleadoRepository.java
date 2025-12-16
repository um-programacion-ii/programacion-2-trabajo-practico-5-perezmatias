package com.gestion.empleados.repository;

import com.gestion.empleados.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    boolean existsByEmail(String email);
    Optional<Empleado> findByEmail(String email);
    List<Empleado> findByDepartamentoNombre(String nombreDepartamento);
    List<Empleado> findBySalarioBetween(BigDecimal min, BigDecimal max);

    @Query("SELECT e FROM Empleado e WHERE e.departamento.id = :departamentoId")
    List<Empleado> buscarPorIdDepartamento(Long departamentoId);
}