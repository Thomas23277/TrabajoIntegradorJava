package Entities;

import java.util.LinkedHashSet;
import java.util.Set;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor

public class ArticuloManufacturado extends Articulo {
    private String descripcion;
    private Integer tiempoEstimadoMinutos;
    private String preparacion;
    private Set<ArticuloManofacturadoDetalle> detalles = new LinkedHashSet<>();
public ArticuloManufacturado(String denominacion, Double precioVenta,String descripcion, Integer tiempoEstimadoMinutos, String preparacion) {
   super (denominacion, precioVenta);
    this.descripcion = descripcion;
    this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
    this.preparacion = preparacion;

}
    @Override
    public String toString() {
        return "ArticuloManufacturado{" +
                "descripcion='" + descripcion + '\'' +
                ", tiempoEstimadoMinutos=" + tiempoEstimadoMinutos +
                ", preparacion='" + preparacion + '\'' +
                ", detalles=" + detalles +
                '}';
    }
}
