package com.gestion.empleados.service;

import com.gestion.empleados.model.Empleado;
import java.math.BigDecimal;
import java.util.List;

public interface EmpleadoService {
    List<Empleado> listarTodos();
    Empleado buscarPorId(Long id);
    Empleado guardar(Empleado empleado);
    Empleado actualizar(Long id, Empleado empleadoDetails);
    void eliminar(Long id);
    List<Empleado> buscarPorDepartamento(String nombreDepartamento);
    List<Empleado> buscarPorSalario(BigDecimal min, BigDecimal max);
}