package Entities;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Imagen extends Base{
    private String denominacion;
    private List<Promocion> promociones;
    private List<Articulo> articulos;
    public Imagen(String denominacion, List<Promocion> promociones, List<Articulo>articulos ) {
        this.denominacion = denominacion;
        this.promociones = new ArrayList<>(promociones);
        this.articulos = new ArrayList<>(articulos);
    }
}
