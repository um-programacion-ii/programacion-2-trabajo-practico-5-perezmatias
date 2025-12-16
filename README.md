# 🚀 Trabajo Práctico: Sistema de Gestión de Empleados con JPA y Spring Boot

![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.5.0-green)
![Spring Cloud](https://img.shields.io/badge/Spring_Cloud-2025.0.0-blue)
![Java](https://img.shields.io/badge/Java-21-orange)
![Maven](https://img.shields.io/badge/Maven-3.9.0-red)
![JPA](https://img.shields.io/badge/JPA-3.0-blue)
![Hibernate](https://img.shields.io/badge/Hibernate-6.4-purple)
![Docker](https://img.shields.io/badge/Docker-24.0-cyan)
![MySQL](https://img.shields.io/badge/MySQL-8.0-orange)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-16-blue)
![H2](https://img.shields.io/badge/H2-2.2-green)

## ⚠️ Importante: Antes de Comenzar

1. **Lectura Completa**
   - Es **OBLIGATORIO** leer la consigna completa antes de comenzar a trabajar
   - Asegúrate de entender todos los requisitos y etapas
   - Consulta las dudas antes de iniciar el desarrollo

2. **Configuración del Repositorio**
   - La rama `main` debe estar protegida
   - No se permiten pushes directos a `main`
   - Todo el desarrollo debe realizarse en ramas feature
   - Los cambios deben integrarse mediante Pull Requests

## 🔧 Configuración Inicial del Repositorio

### 1. Protección de la Rama Main
1. En "Branch name pattern" escribir `main`
2. Marcar la siguiente opción:
   - ✓ Require a pull request before merging
3. Hacer clic en "Create"

> 💡 **Nota**: La protección de la rama main es obligatoria y asegura que:
> - No se puedan hacer cambios directos en la rama main
> - Todos los cambios deben hacerse a través de Pull Requests
> - Esto ayuda a mantener un historial de cambios ordenado y a seguir buenas prácticas de desarrollo

### 2. Configuración de Issues y Pull Requests
1. Ir a Settings > General
2. En la sección "Features":
   - ✓ Habilitar Issues
   - ✓ Habilitar Pull Requests (para trabajo individual con ramas)
3. En la sección "Pull Requests":
   - ✓ Habilitar "Allow merge commits"
   - ✓ Habilitar "Allow squash merging"
   - ✓ Deshabilitar "Allow rebase merging"

### 3. Configuración de Project Board
1. Ir a la pestaña "Projects"
2. Crear nuevo proyecto "Sistema de Gestión de Empleados"
3. Configurar las siguientes columnas:
   - To Do
   - In Progress
   - Code Review (auto-revisión)
   - Done

### 4. Configuración de Milestones
1. Ir a la pestaña "Milestones"
2. Crear los siguientes milestones:
   - Etapa 1: Configuración y Entidades JPA
   - Etapa 2: Repositories y Services
   - Etapa 3: Controllers y Profiles
   - Etapa 4: Docker y Testing

### 5. Configuración de Labels
1. Ir a Issues > Labels
2. Crear las siguientes etiquetas:
   - `enhancement` (verde)
   - `bug` (rojo)
   - `documentation` (azul)
   - `testing` (amarillo)
   - `setup` (gris)
   - `jpa` (morado)
   - `service` (naranja)
   - `controller` (rosa)
   - `docker` (turquesa)
   - `profile` (lila)

### 6. Configuración de Git Local
```bash
# Clonar el repositorio
git clone <URL_DEL_REPOSITORIO>
cd <NOMBRE_DEL_REPOSITORIO>

# Crear rama de desarrollo
git checkout -b develop

# Subir la rama develop
git push -u origin develop
```

> 💡 **Nota**: Aunque este trabajo se realiza individualmente, se utilizan Pull Requests para mantener un historial de cambios ordenado y seguir buenas prácticas de desarrollo. Los Pull Requests serán auto-aprobados por el mismo estudiante.

## 🎯 Objetivo General

Desarrollar un sistema de gestión de empleados utilizando Spring Boot con JPA, implementando diferentes profiles para trabajar con múltiples bases de datos (H2, MySQL y PostgreSQL). El sistema deberá manejar empleados, departamentos y proyectos, utilizando Docker para containerizar las bases de datos y aplicando las mejores prácticas de JPA.

## ⏰ Tiempo Estimado y Entrega

- **Tiempo estimado de realización:** 30-35 horas

### Desglose estimado por etapa:
- Configuración inicial y entidades JPA: 8-10 horas
- Repositories y Services: 8-10 horas
- Controllers y Profiles: 7-8 horas
- Docker, Testing y documentación: 7-8 horas

> 💡 **Nota**: Esta estimación considera la complejidad de configurar múltiples bases de datos, Docker y el aprendizaje de JPA. El tiempo incluye la configuración de profiles y la containerización de las bases de datos.

## 👨‍🎓 Información del Alumno
- **Nombre y Apellido**: [Matias Agustin Perez]
- **Legajo**: [61218]

> ⚠️ **IMPORTANTE**: Este trabajo práctico se realiza **INDIVIDUALMENTE**. Aunque se utilizan herramientas de colaboración como Pull Requests y Code Review, estas son para mantener buenas prácticas de desarrollo y un historial ordenado. Todo el desarrollo debe ser realizado por el mismo estudiante.

## 📋 Requisitos Previos

- Java 21 o superior
- Maven 3.9.0 o superior
- Docker y Docker Compose
- Conocimientos básicos de:
  - Programación orientada a objetos
  - Spring Framework básico
  - Conceptos básicos de bases de datos
  - Docker básico

## 🧩 Tecnologías y Herramientas

- Spring Boot 3.5.0
- Spring Cloud 2025.0.0
- Spring Data JPA
- Spring Web
- Spring Test
- Hibernate 6.4
- H2 Database
- MySQL 8.0
- PostgreSQL 16
- Docker y Docker Compose
- JUnit 5.10.1
- Mockito 5.8.0
- Git y GitHub

## 📊 Casos de Uso del Sistema

### CU-001: Gestionar Empleados
**Actor Principal**: Administrador de Recursos Humanos

**Descripción**: El administrador debe poder gestionar la información de los empleados de la empresa, incluyendo su registro, modificación, consulta y eliminación.

**Flujo Principal**:
1. El administrador accede al sistema
2. Selecciona la opción "Gestionar Empleados"
3. El sistema muestra la lista de empleados
4. El administrador puede realizar las siguientes operaciones:
   - Registrar nuevo empleado
   - Consultar información de empleado
   - Modificar datos de empleado
   - Eliminar empleado
   - Asignar empleado a departamento
   - Asignar empleado a proyectos

**Casos de Uso Relacionados**:
- CU-002: Gestionar Departamentos
- CU-003: Gestionar Proyectos

### CU-002: Gestionar Departamentos
**Actor Principal**: Administrador de Recursos Humanos

**Descripción**: El administrador debe poder gestionar los departamentos de la empresa, incluyendo su creación, modificación y consulta de empleados asignados.

**Flujo Principal**:
1. El administrador accede al sistema
2. Selecciona la opción "Gestionar Departamentos"
3. El sistema muestra la lista de departamentos
4. El administrador puede realizar las siguientes operaciones:
   - Crear nuevo departamento
   - Consultar información de departamento
   - Modificar datos de departamento
   - Eliminar departamento
   - Consultar empleados del departamento
   - Calcular salario promedio del departamento

### CU-003: Gestionar Proyectos
**Actor Principal**: Gerente de Proyectos

**Descripción**: El gerente de proyectos debe poder gestionar los proyectos de la empresa, incluyendo su creación, asignación de empleados y seguimiento.

**Flujo Principal**:
1. El gerente accede al sistema
2. Selecciona la opción "Gestionar Proyectos"
3. El sistema muestra la lista de proyectos
4. El gerente puede realizar las siguientes operaciones:
   - Crear nuevo proyecto
   - Consultar información de proyecto
   - Modificar datos de proyecto
   - Eliminar proyecto
   - Asignar empleados al proyecto
   - Consultar empleados del proyecto
   - Filtrar proyectos por estado (activo/inactivo)

### CU-004: Consultar Reportes
**Actor Principal**: Gerente General

**Descripción**: El gerente general debe poder consultar reportes sobre empleados, departamentos y proyectos para la toma de decisiones.

**Flujo Principal**:
1. El gerente accede al sistema
2. Selecciona la opción "Reportes"
3. El sistema muestra las opciones de reportes disponibles:
   - Empleados por departamento
   - Salario promedio por departamento
   - Proyectos activos
   - Empleados por rango de salario
   - Empleados contratados en un período específico

## 🔄 Diagramas de Secuencia

### Diagrama de Secuencia: Registrar Empleado
```
Cliente HTTP          EmpleadoController    EmpleadoService    EmpleadoRepository    Base de Datos
     |                       |                     |                    |                    |
     | POST /api/empleados   |                     |                    |                    |
     |---------------------->|                     |                    |                    |
     |                       |                     |                    |                    |
     |                       | validarEmpleado()   |                    |                    |
     |                       |-------------------->|                    |                    |
     |                       |                     |                    |                    |
     |                       |                     | findByEmail()      |                    |
     |                       |                     |------------------->|                    |
     |                       |                     |                    | SELECT * FROM...   |
     |                       |                     |                    |------------------->|
     |                       |                     |                    |                    |
     |                       |                     |                    |<-------------------|
     |                       |                     |<-------------------|                    |
     |                       |                     |                    |                    |
     |                       |                     |                    | save()             |
     |                       |                     |------------------->|                    |
     |                       |                     |                    | INSERT INTO...     |
     |                       |                     |                    |------------------->|
     |                       |                     |                    |                    |
     |                       |                     |                    |<-------------------|
     |                       |                     |<-------------------|                    |
     |                       |<--------------------|                    |                    |
     |                       |                     |                    |                    |
     | 201 Created           |                     |                    |                    |
     |<----------------------|                     |                    |                    |
```

### Diagrama de Secuencia: Consultar Empleados por Departamento
```
Cliente HTTP          EmpleadoController    EmpleadoService    EmpleadoRepository    Base de Datos
     |                       |                     |                    |                    |
     | GET /api/empleados/   |                     |                    |                    |
     | departamento/{nombre} |                     |                    |                    |
     |---------------------->|                     |                    |                    |
     |                       |                     |                    |                    |
     |                       | buscarPorDepartamento()                 |                    |
     |                       |-------------------->|                    |                    |
     |                       |                     |                    |                    |
     |                       |                     | findByNombreDepartamento()              |
     |                       |                     |------------------->|                    |
     |                       |                     |                    | SELECT e.* FROM... |
     |                       |                     |                    |------------------->|
     |                       |                     |                    |                    |
     |                       |                     |                    |<-------------------|
     |                       |                     |<-------------------|                    |
     |                       |<--------------------|                    |                    |
     |                       |                     |                    |                    |
     | 200 OK                |                     |                    |                    |
     |<----------------------|                     |                    |                    |
```

### Diagrama de Secuencia: Asignar Empleado a Proyecto
```
Cliente HTTP          ProyectoController     ProyectoService     ProyectoRepository    Base de Datos
     |                       |                     |                    |                    |
     | PUT /api/proyectos/   |                     |                    |                    |
     | {id}/empleados        |                     |                    |                    |
     |---------------------->|                     |                    |                    |
     |                       |                     |                    |                    |
     |                       | buscarPorId()       |                    |                    |
     |                       |-------------------->|                    |                    |
     |                       |                     | findById()         |                    |
     |                       |                     |------------------->|                    |
     |                       |                     |                    | SELECT * FROM...   |
     |                       |                     |                    |------------------->|
     |                       |                     |                    |                    |
     |                       |                     |                    |<-------------------|
     |                       |                     |<-------------------|                    |
     |                       |<--------------------|                    |                    |
     |                       |                     |                    |                    |
     |                       | asignarEmpleados()  |                    |                    |
     |                       |-------------------->|                    |                    |
     |                       |                     |                    |                    |
     |                       |                     | save()             |                    |
     |                       |                     |------------------->|                    |
     |                       |                     |                    | UPDATE proyecto... |
     |                       |                     |                    |------------------->|
     |                       |                     |                    |                    |
     |                       |                     |                    |<-------------------|
     |                       |                     |<-------------------|                    |
     |                       |<--------------------|                    |                    |
     |                       |                     |                    |                    |
     | 200 OK                |                     |                    |                    |
     |<----------------------|                     |                    |                    |
```

## 📘 Etapas del Trabajo

### Etapa 1: Configuración del Proyecto y Entidades JPA

#### Objetivos
- Configurar un proyecto Spring Boot con JPA
- Implementar las entidades JPA del sistema
- Configurar las relaciones entre entidades
- Aplicar anotaciones JPA correctamente

#### Tareas
1. Crear proyecto Spring Boot con las dependencias necesarias:
   - `spring-boot-starter-data-jpa`
   - `spring-boot-starter-web`
   - `spring-boot-starter-test`
   - `h2` (para desarrollo)
   - `mysql-connector-java`
   - `postgresql`

2. Implementar las siguientes entidades JPA:
   - `Empleado` (id, nombre, apellido, email, fechaContratacion, salario, departamento)
   - `Departamento` (id, nombre, descripcion, empleados)
   - `Proyecto` (id, nombre, descripcion, fechaInicio, fechaFin, empleados)

3. Configurar las relaciones:
   - Un empleado pertenece a un departamento (ManyToOne)
   - Un departamento tiene muchos empleados (OneToMany)
   - Un empleado puede trabajar en muchos proyectos (ManyToMany)
   - Un proyecto puede tener muchos empleados (ManyToMany)

#### Ejemplo de Implementación
```java
@Entity
@Table(name = "empleados")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, length = 100)
    private String nombre;
    
    @Column(nullable = false, length = 100)
    private String apellido;
    
    @Column(unique = true, nullable = false)
    private String email;
    
    @Column(name = "fecha_contratacion", nullable = false)
    @Temporal(TemporalType.DATE)
    private LocalDate fechaContratacion;
    
    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal salario;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "departamento_id")
    private Departamento departamento;
    
    @ManyToMany
    @JoinTable(
        name = "empleado_proyecto",
        joinColumns = @JoinColumn(name = "empleado_id"),
        inverseJoinColumns = @JoinColumn(name = "proyecto_id")
    )
    private Set<Proyecto> proyectos = new HashSet<>();
}

@Entity
@Table(name = "departamentos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, length = 100, unique = true)
    private String nombre;
    
    @Column(length = 500)
    private String descripcion;
    
    @OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Empleado> empleados = new ArrayList<>();
}

@Entity
@Table(name = "proyectos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, length = 100)
    private String nombre;
    
    @Column(length = 1000)
    private String descripcion;
    
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private LocalDate fechaInicio;
    
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.DATE)
    private LocalDate fechaFin;
    
    @ManyToMany(mappedBy = "proyectos")
    private Set<Empleado> empleados = new HashSet<>();
}
```

### Etapa 2: Implementación de Repositories y Services

#### Objetivos
- Implementar repositories JPA usando Spring Data JPA
- Crear servicios que utilicen los repositories
- Implementar consultas personalizadas
- Aplicar transacciones correctamente

#### Tareas
1. Crear interfaces de repositorio:
   - `EmpleadoRepository`
   - `DepartamentoRepository`
   - `ProyectoRepository`

2. Implementar consultas personalizadas:
   - Buscar empleados por departamento
   - Buscar empleados por rango de salario
   - Buscar proyectos activos (fecha fin > hoy)
   - Buscar empleados por email

3. Implementar servicios:
   - `EmpleadoService` (interface)
   - `EmpleadoServiceImpl` (implementación)
   - `DepartamentoService` (interface)
   - `DepartamentoServiceImpl` (implementación)
   - `ProyectoService` (interface)
   - `ProyectoServiceImpl` (implementación)

#### Ejemplo de Implementación
```java
@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    Optional<Empleado> findByEmail(String email);
    List<Empleado> findByDepartamento(Departamento departamento);
    List<Empleado> findBySalarioBetween(BigDecimal salarioMin, BigDecimal salarioMax);
    List<Empleado> findByFechaContratacionAfter(LocalDate fecha);
    
    @Query("SELECT e FROM Empleado e WHERE e.departamento.nombre = :nombreDepartamento")
    List<Empleado> findByNombreDepartamento(@Param("nombreDepartamento") String nombreDepartamento);
    
    @Query("SELECT AVG(e.salario) FROM Empleado e WHERE e.departamento.id = :departamentoId")
    Optional<BigDecimal> findAverageSalarioByDepartamento(@Param("departamentoId") Long departamentoId);
}

// Interface del servicio
public interface EmpleadoService {
    Empleado guardar(Empleado empleado);
    Empleado buscarPorId(Long id);
    List<Empleado> buscarPorDepartamento(String nombreDepartamento);
    List<Empleado> buscarPorRangoSalario(BigDecimal salarioMin, BigDecimal salarioMax);
    BigDecimal obtenerSalarioPromedioPorDepartamento(Long departamentoId);
    List<Empleado> obtenerTodos();
    Empleado actualizar(Long id, Empleado empleado);
    void eliminar(Long id);
}

// Implementación del servicio
@Service
@Transactional
public class EmpleadoServiceImpl implements EmpleadoService {
    private final EmpleadoRepository empleadoRepository;
    private final DepartamentoRepository departamentoRepository;
    
    public EmpleadoServiceImpl(EmpleadoRepository empleadoRepository, 
                              DepartamentoRepository departamentoRepository) {
        this.empleadoRepository = empleadoRepository;
        this.departamentoRepository = departamentoRepository;
    }
    
    @Override
    public Empleado guardar(Empleado empleado) {
        if (empleadoRepository.findByEmail(empleado.getEmail()).isPresent()) {
            throw new EmailDuplicadoException("El email ya está registrado: " + empleado.getEmail());
        }
        return empleadoRepository.save(empleado);
    }
    
    @Override
    public Empleado buscarPorId(Long id) {
        return empleadoRepository.findById(id)
            .orElseThrow(() -> new EmpleadoNoEncontradoException("Empleado no encontrado con ID: " + id));
    }
    
    @Override
    public List<Empleado> buscarPorDepartamento(String nombreDepartamento) {
        return empleadoRepository.findByNombreDepartamento(nombreDepartamento);
    }
    
    @Override
    public List<Empleado> buscarPorRangoSalario(BigDecimal salarioMin, BigDecimal salarioMax) {
        return empleadoRepository.findBySalarioBetween(salarioMin, salarioMax);
    }
    
    @Override
    public BigDecimal obtenerSalarioPromedioPorDepartamento(Long departamentoId) {
        return empleadoRepository.findAverageSalarioByDepartamento(departamentoId)
            .orElse(BigDecimal.ZERO);
    }
    
    @Override
    public List<Empleado> obtenerTodos() {
        return empleadoRepository.findAll();
    }
    
    @Override
    public Empleado actualizar(Long id, Empleado empleado) {
        if (!empleadoRepository.existsById(id)) {
            throw new EmpleadoNoEncontradoException("Empleado no encontrado con ID: " + id);
        }
        empleado.setId(id);
        return empleadoRepository.save(empleado);
    }
    
    @Override
    public void eliminar(Long id) {
        if (!empleadoRepository.existsById(id)) {
            throw new EmpleadoNoEncontradoException("Empleado no encontrado con ID: " + id);
        }
        empleadoRepository.deleteById(id);
    }
}
```

### Etapa 3: Implementación de Controllers y Profiles

#### Objetivos
- Implementar controladores REST
- Configurar diferentes profiles para H2, MySQL y PostgreSQL
- Manejar excepciones HTTP
- Implementar validaciones

#### Tareas
1. Crear controladores REST:
   - `EmpleadoController`
   - `DepartamentoController`
   - `ProyectoController`

2. Configurar profiles:
   - `dev` (H2 en memoria)
   - `mysql` (MySQL con Docker)
   - `postgres` (PostgreSQL con Docker)

3. Implementar endpoints básicos:
   - GET /api/empleados
   - GET /api/empleados/{id}
   - POST /api/empleados
   - PUT /api/empleados/{id}
   - DELETE /api/empleados/{id}
   - GET /api/empleados/departamento/{nombre}
   - GET /api/empleados/salario?min=X&max=Y

#### Ejemplo de Implementación
```java
@RestController
@RequestMapping("/api/empleados")
@Validated
public class EmpleadoController {
    private final EmpleadoService empleadoService;
    
    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }
    
    @GetMapping
    public List<Empleado> obtenerTodos() {
        return empleadoService.obtenerTodos();
    }
    
    @GetMapping("/{id}")
    public Empleado obtenerPorId(@PathVariable Long id) {
        return empleadoService.buscarPorId(id);
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Empleado crear(@Valid @RequestBody Empleado empleado) {
        return empleadoService.guardar(empleado);
    }
    
    @PutMapping("/{id}")
    public Empleado actualizar(@PathVariable Long id, @Valid @RequestBody Empleado empleado) {
        return empleadoService.actualizar(id, empleado);
    }
    
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id) {
        empleadoService.eliminar(id);
    }
    
    @GetMapping("/departamento/{nombre}")
    public List<Empleado> obtenerPorDepartamento(@PathVariable String nombre) {
        return empleadoService.buscarPorDepartamento(nombre);
    }
    
    @GetMapping("/salario")
    public List<Empleado> obtenerPorRangoSalario(
            @RequestParam BigDecimal min, 
            @RequestParam BigDecimal max) {
        return empleadoService.buscarPorRangoSalario(min, max);
    }
}
```

#### Configuración de Profiles
```yaml
# application.yml
spring:
  profiles:
    active: dev

---
spring:
  config:
    activate:
      on-profile: dev
  datasource:
    url: jdbc:h2:mem:testdb
    driver-class-name: org.h2.Driver
    username: sa
    password: 
  h2:
    console:
      enabled: true
      path: /h2-console
  jpa:
    hibernate:
      ddl-auto: create-drop
    show-sql: true
    properties:
      hibernate:
        format_sql: true

---
spring:
  config:
    activate:
      on-profile: mysql
  datasource:
    url: jdbc:mysql://localhost:3306/empleados_db?useSSL=false&serverTimezone=UTC
    driver-class-name: com.mysql.cj.jdbc.Driver
    username: empleados_user
    password: empleados_pass
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
    properties:
      hibernate:
        dialect: org.hibernate.dialect.MySQL8Dialect
        format_sql: true

---
spring:
  config:
    activate:
      on-profile: postgres
  datasource:
    url: jdbc:postgresql://localhost:5432/empleados_db
    driver-class-name: org.postgresql.Driver
    username: empleados_user
    password: empleados_pass
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
    properties:
      hibernate:
        dialect: org.hibernate.dialect.PostgreSQLDialect
        format_sql: true
```

### Etapa 4: Docker, Testing y Documentación

#### Objetivos
- Configurar Docker Compose para las bases de datos
- Implementar tests unitarios y de integración
- Documentar la API y el código
- Asegurar la calidad del código

#### Tareas
1. Crear Docker Compose para MySQL y PostgreSQL
2. Implementar tests:
   - Tests unitarios para servicios
   - Tests de integración para controladores
   - Tests de repositorios con diferentes bases de datos

3. Documentar:
   - Documentar endpoints con comentarios
   - Actualizar README con instrucciones
   - Documentar configuración de Docker

#### Docker Compose
```yaml
# docker-compose.yml
services:
  mysql:
    image: mysql:8.0
    container_name: empleados_mysql
    environment:
      MYSQL_ROOT_PASSWORD: root_password
      MYSQL_DATABASE: empleados_db
      MYSQL_USER: empleados_user
      MYSQL_PASSWORD: empleados_pass
    ports:
      - "3306:3306"
    volumes:
      - mysql_data:/var/lib/mysql
    networks:
      - empleados_network
    healthcheck:
      test: ["CMD", "mysqladmin", "ping", "-h", "localhost"]
      timeout: 20s
      retries: 10

  postgres:
    image: postgres:16
    container_name: empleados_postgres
    environment:
      POSTGRES_DB: empleados_db
      POSTGRES_USER: empleados_user
      POSTGRES_PASSWORD: empleados_pass
    ports:
      - "5432:5432"
    volumes:
      - postgres_data:/var/lib/postgresql/data
    networks:
      - empleados_network
    healthcheck:
      test: ["CMD-SHELL", "pg_isready -U empleados_user -d empleados_db"]
      timeout: 20s
      retries: 10

volumes:
  mysql_data:
  postgres_data:

networks:
  empleados_network:
    driver: bridge
```

#### Ejemplo de Test
```java
@SpringBootTest
@Transactional
@ActiveProfiles("test")
class EmpleadoServiceIntegrationTest {
    private final EmpleadoService empleadoService;
    private final EmpleadoRepository empleadoRepository;
    private final DepartamentoRepository departamentoRepository;
    
    public EmpleadoServiceIntegrationTest(EmpleadoService empleadoService,
                                        EmpleadoRepository empleadoRepository,
                                        DepartamentoRepository departamentoRepository) {
        this.empleadoService = empleadoService;
        this.empleadoRepository = empleadoRepository;
        this.departamentoRepository = departamentoRepository;
    }
    
    @Test
    void cuandoGuardarEmpleado_entoncesSePersisteCorrectamente() {
        // Arrange
        Departamento departamento = new Departamento();
        departamento.setNombre("IT");
        departamento.setDescripcion("Departamento de Tecnología");
        departamento = departamentoRepository.save(departamento);
        
        Empleado empleado = new Empleado();
        empleado.setNombre("Juan");
        empleado.setApellido("Pérez");
        empleado.setEmail("juan.perez@empresa.com");
        empleado.setFechaContratacion(LocalDate.now());
        empleado.setSalario(new BigDecimal("50000.00"));
        empleado.setDepartamento(departamento);
        
        // Act
        Empleado empleadoGuardado = empleadoService.guardar(empleado);
        
        // Assert
        assertNotNull(empleadoGuardado.getId());
        assertEquals("juan.perez@empresa.com", empleadoGuardado.getEmail());
        assertTrue(empleadoRepository.existsById(empleadoGuardado.getId()));
    }
    
    @Test
    void cuandoBuscarPorEmailExistente_entoncesRetornaEmpleado() {
        // Arrange
        Empleado empleado = crearEmpleadoDePrueba();
        empleadoRepository.save(empleado);
        
        // Act
        Optional<Empleado> resultado = empleadoRepository.findByEmail("test@empresa.com");
        
        // Assert
        assertTrue(resultado.isPresent());
        assertEquals("test@empresa.com", resultado.get().getEmail());
    }
}
```

## ✅ Entrega y Flujo de Trabajo con GitHub

1. **Configuración del Repositorio**
   - Proteger la rama `main`
   - Configurar para trabajo individual

2. **Project Kanban**
   - `To Do`
   - `In Progress`
   - `Code Review` (auto-revisión)
   - `Done`

3. **Milestones**
   - Etapa 1: Configuración y Entidades JPA
   - Etapa 2: Repositories y Services
   - Etapa 3: Controllers y Profiles
   - Etapa 4: Docker y Testing

4. **Issues y Pull Requests (Trabajo Individual)**
   - Crear Issues detallados para cada funcionalidad
   - Asociar cada Issue a un Milestone
   - Implementar en ramas feature
   - Auto-revisar código antes de merge
   - Los Pull Requests serán aprobados por el mismo estudiante

## ✅ Requisitos para la Entrega

- ✅ Implementación completa de todas las etapas
- ✅ Configuración de profiles para H2, MySQL y PostgreSQL
- ✅ Docker Compose funcional para MySQL y PostgreSQL
- ✅ Código bien documentado
- ✅ Tests unitarios y de integración
- ✅ Todos los Issues cerrados
- ✅ Todos los Milestones completados
- ✅ Pull Requests auto-aprobados (trabajo individual)
- ✅ Project actualizado
- ✅ README.md completo con:
  - Instrucciones de instalación
  - Requisitos del sistema
  - Ejemplos de uso
  - Documentación de endpoints
  - Instrucciones para Docker
- ✅ **Documentación de Prompts**: Archivos MD que incluyan:
  - `prompts-desarrollo.md`: Prompts utilizados para el desarrollo del código
  - `prompts-testing.md`: Prompts utilizados para la implementación de tests
  - `prompts-docker.md`: Prompts utilizados para la configuración de Docker
  - `prompts-documentacion.md`: Prompts utilizados para la documentación
  - Cada archivo debe incluir:
    - El prompt completo utilizado
    - La respuesta recibida
    - Modificaciones realizadas al código generado
    - Explicación de por qué se usó ese prompt
    - Aprendizajes obtenidos del uso de IA

## 🐳 Instrucciones para Docker

### Levantar Bases de Datos
```bash
# Levantar MySQL y PostgreSQL
docker compose up -d

# Verificar que los contenedores estén corriendo
docker compose ps

# Ver logs de los contenedores
docker compose logs -f
```

### Ejecutar Aplicación con Diferentes Profiles
```bash
# Con H2 (desarrollo)
./mvnw spring-boot:run -Dspring-boot.run.profiles=dev

# Con MySQL
./mvnw spring-boot:run -Dspring-boot.run.profiles=mysql

# Con PostgreSQL
./mvnw spring-boot:run -Dspring-boot.run.profiles=postgres
```

### Detener Bases de Datos
```bash
# Detener contenedores
docker compose down

# Detener y eliminar volúmenes
docker compose down -v
```

## 📚 Recursos Adicionales

- [Documentación de Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Hibernate User Guide](https://hibernate.org/orm/documentation/)
- [Spring Boot Profiles](https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.profiles)
- [Docker Compose Documentation](https://docs.docker.com/compose/)
- [MySQL Docker Hub](https://hub.docker.com/_/mysql)
- [PostgreSQL Docker Hub](https://hub.docker.com/_/postgres)
- [JPA Best Practices](https://www.baeldung.com/jpa-hibernate-persistence-context)
- [Spring Boot Testing](https://spring.io/guides/gs/testing-web/)

## 📋 Guía de Testing con JPA

### 1. Testing de Repositorios
- Usar `@DataJpaTest` para pruebas de repositorios
- Configurar `@TestPropertySource` para usar H2 en tests
- Usar `@Transactional` para rollback automático
- Probar consultas personalizadas y métodos derivados

### 2. Testing de Servicios
- Usar `@SpringBootTest` para pruebas de integración
- Mockear repositorios cuando sea necesario
- Probar transacciones y rollbacks
- Verificar validaciones de negocio

### 3. Testing de Controladores
- Usar `@WebMvcTest` para pruebas de controladores
- Mockear servicios con `@MockBean`
- Usar `MockMvc` para simular peticiones HTTP
- Probar diferentes tipos de contenido y respuestas

### 4. Testing con Diferentes Bases de Datos
- Configurar profiles específicos para testing
- Usar `@ActiveProfiles` para activar el profile correcto
- Probar compatibilidad entre diferentes bases de datos
- Verificar que las consultas funcionen en todas las bases

### 5. Buenas Prácticas de Testing con JPA
- Usar `@DirtiesContext` cuando sea necesario
- Limpiar datos entre tests
- Usar `@Sql` para cargar datos de prueba
- Probar casos edge y validaciones

## 📝 Consideraciones Éticas sobre el Uso de IA

El uso de Inteligencia Artificial (IA) en este trabajo práctico debe seguir las siguientes pautas:

1. **Transparencia**
   - Documentar el uso de IA en el desarrollo
   - Explicar las modificaciones realizadas al código generado
   - Mantener un registro de las herramientas utilizadas
   - **Documentar todos los prompts utilizados en archivos MD separados**

2. **Aprendizaje**
   - La IA debe usarse como herramienta de aprendizaje
   - Comprender y ser capaz de explicar el código generado
   - Utilizar la IA para mejorar la comprensión de conceptos de JPA
   - **Reflexionar sobre los aprendizajes obtenidos de cada prompt**

3. **Integridad Académica**
   - El trabajo final debe reflejar tu aprendizaje
   - No se permite la presentación de código sin comprensión
   - Debes poder explicar y defender cualquier parte del código
   - **Los prompts documentados deben mostrar el proceso de aprendizaje**

4. **Responsabilidad**
   - Verificar la corrección del código generado
   - Asegurar que el código cumple con los requisitos
   - Mantener la calidad y estándares de código
   - **Asumir responsabilidad por el código final, independientemente de su origen**

5. **Desarrollo Individual**
   - La IA puede usarse para facilitar el aprendizaje
   - Documentar el proceso de desarrollo
   - Mantener un registro del progreso
   - **Cada prompt debe incluir una reflexión personal sobre su utilidad**

### 📋 Documentación Obligatoria de Prompts

Como parte de la entrega, debes incluir los siguientes archivos:

#### `prompts-desarrollo.md`
- Prompts utilizados para crear entidades JPA
- Prompts para implementar repositories y services
- Prompts para configurar controllers
- Explicación de las decisiones de diseño tomadas

#### `prompts-testing.md`
- Prompts para crear tests unitarios
- Prompts para implementar tests de integración
- Prompts para configurar testing con diferentes bases de datos
- Reflexiones sobre la importancia del testing

#### `prompts-docker.md`
- Prompts para configurar Docker Compose
- Prompts para resolver problemas de containerización
- Prompts para optimizar la configuración
- Aprendizajes sobre DevOps y containerización

#### `prompts-documentacion.md`
- Prompts para generar documentación técnica
- Prompts para crear diagramas de secuencia
- Prompts para documentar casos de uso
- Reflexiones sobre la importancia de la documentación

### 📝 Formato de Documentación de Prompts

Cada archivo debe seguir este formato:

```markdown
# Prompts de [Categoría]

## Prompt 1: [Descripción breve]

### Prompt Utilizado:
```
[Prompt completo aquí]
```

### Respuesta Recibida:
```
[Respuesta completa aquí]
```

### Modificaciones Realizadas:
- [Lista de cambios realizados al código generado]
- [Explicación de por qué se modificó]

### Explicación del Prompt:
[Explicar por qué se usó este prompt específico]

### Aprendizajes Obtenidos:
- [Lista de aprendizajes]
- [Conceptos nuevos comprendidos]
- [Buenas prácticas identificadas]

---

## Prompt 2: [Descripción breve]
[Repetir estructura para cada prompt]
```

## 📝 Licencia

Este trabajo es parte del curso de Programación II de Ingeniería en Informática. Uso educativo únicamente.