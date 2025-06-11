package Entities;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class ArticuloManofacturadoDetalle extends Base{
    private Integer cantidad;
    private ArticuloInsumo articuloInsumo;
public ArticuloManofacturadoDetalle( Integer cantidad, ArticuloInsumo articuloInsumo){
    this.cantidad = cantidad;
    this.articuloInsumo = articuloInsumo;
}
    @Override
    public String toString() {
        return "ArticuloManofacturadoDetalle{" +
                "cantidad=" + cantidad +
                ", articuloInsumo=" + (articuloInsumo != null ? articuloInsumo.getDenominacion() : "sin insumo") +
                '}';
    }

}
