package Entities;

import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Pais extends Base{

    private String nombre;
    private Set<Provincia> provincias = new HashSet<>();

    public Pais(String nombre) {
        this.nombre = nombre != null ? nombre : "Sin nombre";

    }

    public void agregarProvincia(Provincia provincia) {
        provincias.add(provincia);
        provincia.setPais(this);
    }
}


