package egg.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private Long id;

    @Column(name = "codigo_empleado")
    private String codEmpleado;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "puesto")
    private String puesto;

    @Column(name = "email")
    private String email;

    @Column(name = "extension")
    private String extension;

    public Empleado() {
    }

    // FK
    @ManyToOne // Un empleado puede pertenecer a una oficina (1 a 1) y una oficina puede tener muchos empleados (1 a muchos)
    @JoinColumn(name = "id_oficina")
    private Oficina idOficina;

    @ManyToOne // Un empleado puede tener un jefe (1 a 1) y un jefe puede tener muchos empleados (1 a muchos)
    @JoinColumn(name = "id_jefe")
    private Empleado idJefe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Oficina getIdOficina() {
        return idOficina;
    }

    public void setIdOficina(Oficina idOficina) {
        this.idOficina = idOficina;
    }

    public Empleado getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(Empleado idJefe) {
        this.idJefe = idJefe;
    }
}
