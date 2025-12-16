package com.gestion.empleados.service.impl;

import com.gestion.empleados.exception.ResourceNotFoundException;
import com.gestion.empleados.model.Empleado;
import com.gestion.empleados.repository.EmpleadoRepository;
import com.gestion.empleados.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
@Transactional
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Empleado> listarTodos() {
        return empleadoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Empleado buscarPorId(Long id) {
        return empleadoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Empleado no encontrado con ID: " + id));
    }

    @Override
    public Empleado guardar(Empleado empleado) {
        if(empleadoRepository.existsByEmail(empleado.getEmail())) {
            throw new IllegalArgumentException("El email ya existe: " + empleado.getEmail());
        }
        return empleadoRepository.save(empleado);
    }

    @Override
    public Empleado actualizar(Long id, Empleado detalles) {
        Empleado empleado = buscarPorId(id);
        empleado.setNombre(detalles.getNombre());
        empleado.setApellido(detalles.getApellido());
        empleado.setEmail(detalles.getEmail());
        empleado.setSalario(detalles.getSalario());
        empleado.setDepartamento(detalles.getDepartamento());
        return empleadoRepository.save(empleado);
    }

    @Override
    public void eliminar(Long id) {
        if(!empleadoRepository.existsById(id)){
            throw new ResourceNotFoundException("Empleado no encontrado con ID: " + id);
        }
        empleadoRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Empleado> buscarPorDepartamento(String nombreDepartamento) {
        return empleadoRepository.findByDepartamentoNombre(nombreDepartamento);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Empleado> buscarPorSalario(BigDecimal min, BigDecimal max) {
        return empleadoRepository.findBySalarioBetween(min, max);
    }
}