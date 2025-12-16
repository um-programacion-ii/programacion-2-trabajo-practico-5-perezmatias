package com.gestion.empleados.service;

import com.gestion.empleados.model.Proyecto;
import java.util.List;

public interface ProyectoService {
    List<Proyecto> listarTodos();
    Proyecto buscarPorId(Long id);
    Proyecto guardar(Proyecto proyecto);
    Proyecto actualizar(Long id, Proyecto proyectoDetails);
    void eliminar(Long id);
    List<Proyecto> listarProyectosActivos();
}