package Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;
import java.time.LocalTime;
import java.util.LinkedHashSet;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Sucursal extends Base{
    private String nombre;
    private String nombreSucursal;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private Empresa empresa;
    private Domicilio domicilio;
    private LinkedHashSet<Promocion> promociones = new LinkedHashSet<>();
    private LinkedHashSet<Categoria> categorias = new LinkedHashSet<>();
    public Sucursal(String nombre,  LocalTime horarioApertura, LocalTime horarioCierre) {
        this.nombre = nombre;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "nombre='" + nombre + '\'' +
                ", horarioApertura=" + horarioApertura +
                ", horarioCierre=" + horarioCierre +
                ", empresa=" + (empresa != null ? empresa.getNombre() : "sin empresa") +
                ", domicilio=" + (domicilio != null ? domicilio.toString() : "sin domicilio") +
                '}';
    }
}
