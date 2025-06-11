package Entities;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Empresa extends Base{
    private String nombre;
    private String razonSocial;
    private long cuil;
    private Set<Sucursal> sucursales;

    public void agregarSucursal(Sucursal sucursal) {
        if (sucursales == null) {
            sucursales = new HashSet<>(); // Asegurar que no sea null
        }
        sucursales.add(sucursal);
    }
}

