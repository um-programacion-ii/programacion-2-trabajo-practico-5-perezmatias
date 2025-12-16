package com.gestion.empleados.service.impl;

import com.gestion.empleados.exception.ResourceNotFoundException;
import com.gestion.empleados.model.Proyecto;
import com.gestion.empleados.repository.ProyectoRepository;
import com.gestion.empleados.service.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class ProyectoServiceImpl implements ProyectoService {

    @Autowired
    private ProyectoRepository proyectoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Proyecto> listarTodos() {
        return proyectoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Proyecto buscarPorId(Long id) {
        return proyectoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Proyecto no encontrado ID: " + id));
    }

    @Override
    public Proyecto guardar(Proyecto proyecto) {
        return proyectoRepository.save(proyecto);
    }

    @Override
    public Proyecto actualizar(Long id, Proyecto detalles) {
        Proyecto proy = buscarPorId(id);
        proy.setNombre(detalles.getNombre());
        proy.setDescripcion(detalles.getDescripcion());
        proy.setFechaInicio(detalles.getFechaInicio());
        proy.setFechaFin(detalles.getFechaFin());
        return proyectoRepository.save(proy);
    }

    @Override
    public void eliminar(Long id) {
        if(!proyectoRepository.existsById(id)){
            throw new ResourceNotFoundException("Proyecto no encontrado ID: " + id);
        }
        proyectoRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Proyecto> listarProyectosActivos() {
        return proyectoRepository.findProyectosActivos();
    }
}