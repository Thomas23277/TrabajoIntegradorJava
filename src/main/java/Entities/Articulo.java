package Entities;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public abstract class Articulo {
    private String denominacion;
    private Double precioVenta;
    private Set<Promocion> promociones = new HashSet<>();
    private UnidadMedida unidadMedidas;
    public Articulo(String denominacion,Double precioVenta, UnidadMedida unidadMedidas) {
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
        this.unidadMedidas = unidadMedidas;
    }
    public Articulo(String denominacion, Double precioVenta) {
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
    }
}
