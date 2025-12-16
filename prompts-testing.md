# Prompts de Testing

## Prompt 1: Tests Unitarios con Mockito

### Prompt Utilizado:
"Necesito testear la clase EmpleadoService.
1. Usa JUnit 5 y Mockito.
2. Crea un test para el método 'guardar' que verifique que si el email no existe, llama al repository.save().
3. Crea un test que verifique que si el email YA existe, lance una IllegalArgumentException y NO llame a save().
4. Usa @ExtendWith(MockitoExtension.class) e inyecta los mocks correctamente."

### Respuesta Recibida:
[Código de la clase de test unitario con verificaciones y aserciones correctas]

### Aprendizajes Obtenidos:
- Cómo usar `@Mock` para simular dependencias externas y `@InjectMocks` para la clase bajo prueba.
- El uso de `verify()` para asegurar que ciertos métodos del repositorio se llamen o no.

---

## Prompt 2: Tests de Integración con @DataJpaTest

### Prompt Utilizado:
"Genera un test de integración para el EmpleadoRepository usando @DataJpaTest.
1. Usa TestEntityManager para persistir datos de prueba (un Departamento y varios Empleados).
2. Prueba el método custom 'findBySalarioBetween'.
3. Verifica que la consulta traiga solo los empleados dentro del rango correcto."

### Respuesta Recibida:
[Código del test de repositorio usando base de datos en memoria H2]

### Aprendizajes Obtenidos:
- `@DataJpaTest` carga solo la capa de persistencia, haciéndolo más rápido que un `@SpringBootTest` completo.
- `TestEntityManager` es útil para preparar el escenario de datos antes de ejecutar la consulta del repositorio.