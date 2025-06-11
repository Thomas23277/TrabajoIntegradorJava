package Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Localidad extends Base{

    private String nombre;
    private Provincia provincia;
    private List<Domicilio> domicilio;

    public Localidad(String nombre, Provincia provincia) {
        this.nombre = nombre != null ? nombre : "Sin nombre";
        this.provincia = provincia;
    }
    @Override
    public String toString() {
        return nombre + ", " + (provincia != null ? provincia.getNombre() : "sin provincia");
    }
}