package com.gestion.empleados.service.impl;

import com.gestion.empleados.exception.ResourceNotFoundException;
import com.gestion.empleados.model.Departamento;
import com.gestion.empleados.repository.DepartamentoRepository;
import com.gestion.empleados.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class DepartamentoServiceImpl implements DepartamentoService {

    @Autowired
    private DepartamentoRepository departamentoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Departamento> listarTodos() {
        return departamentoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Departamento buscarPorId(Long id) {
        return departamentoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Departamento no encontrado ID: " + id));
    }

    @Override
    public Departamento guardar(Departamento departamento) {
        if(departamentoRepository.existsByNombre(departamento.getNombre())){
            throw new IllegalArgumentException("El departamento ya existe: " + departamento.getNombre());
        }
        return departamentoRepository.save(departamento);
    }

    @Override
    public Departamento actualizar(Long id, Departamento detalles) {
        Departamento depto = buscarPorId(id);
        depto.setNombre(detalles.getNombre());
        depto.setDescripcion(detalles.getDescripcion());
        return departamentoRepository.save(depto);
    }

    @Override
    public void eliminar(Long id) {
        if(!departamentoRepository.existsById(id)){
            throw new ResourceNotFoundException("Departamento no encontrado ID: " + id);
        }
        departamentoRepository.deleteById(id);
    }
}