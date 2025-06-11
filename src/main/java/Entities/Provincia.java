package Entities;

import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Provincia {

    private String nombre;
    private Set<Localidad> localidades = new HashSet<>();
    private Pais pais;
    public Provincia(String nombre, Pais pais, Set<Localidad> localidades) {
        this.nombre = nombre != null ? nombre : "Sin nombre";
        this.pais = pais != null ? pais : new Pais("Desconocido");
        this.localidades = localidades != null ? new HashSet<>(localidades) : new HashSet<>();
    }

    public void agregarLocalidad(Localidad localidad) {
        if (localidad != null) {
            localidades.add(localidad);
            localidad.setProvincia(this);
        }
    }

    @Override
    public String toString() {
        return nombre + ", " + (pais != null ? pais.getNombre() : "sin país") +
                ", " + (localidades.isEmpty() ? "sin localidades" : localidades.toString());
    }
}



