package com.gestion.empleados.service;

import com.gestion.empleados.model.Empleado;
import com.gestion.empleados.repository.EmpleadoRepository;
import com.gestion.empleados.service.impl.EmpleadoServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class EmpleadoServiceTest {

    @Mock
    private EmpleadoRepository empleadoRepository;

    @InjectMocks
    private EmpleadoServiceImpl empleadoService;

    @Test
    void guardarEmpleado_CuandoEmailNoExiste_DeberiaGuardar() {
        // Arrange
        Empleado empleado = new Empleado();
        empleado.setEmail("test@test.com");
        empleado.setSalario(BigDecimal.valueOf(50000));

        when(empleadoRepository.existsByEmail(anyString())).thenReturn(false);
        when(empleadoRepository.save(any(Empleado.class))).thenReturn(empleado);

        // Act
        Empleado resultado = empleadoService.guardar(empleado);

        // Assert
        assertNotNull(resultado);
        assertEquals("test@test.com", resultado.getEmail());
        verify(empleadoRepository, times(1)).save(empleado);
    }

    @Test
    void guardarEmpleado_CuandoEmailExiste_DeberiaLanzarExcepcion() {
        // Arrange
        Empleado empleado = new Empleado();
        empleado.setEmail("duplicado@test.com");

        when(empleadoRepository.existsByEmail("duplicado@test.com")).thenReturn(true);

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            empleadoService.guardar(empleado);
        });

        verify(empleadoRepository, never()).save(any(Empleado.class));
    }
}