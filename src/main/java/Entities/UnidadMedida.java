package Entities;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UnidadMedida extends Base{
    private String denominacion;
    public UnidadMedida(String denominacion) {
        this.denominacion = denominacion;
    }


}
