package com.gestion.empleados.service;

import com.gestion.empleados.model.Departamento;
import java.util.List;

public interface DepartamentoService {
    List<Departamento> listarTodos();
    Departamento buscarPorId(Long id);
    Departamento guardar(Departamento departamento);
    Departamento actualizar(Long id, Departamento departamentoDetails);
    void eliminar(Long id);
}