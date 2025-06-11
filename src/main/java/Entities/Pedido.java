package Entities;

import Enums.FormaPago;
import Enums.TipoEnvio;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor

public class Pedido extends Base{
    private LocalTime horaEstimadaFinalizacion;
    private Double total;
    private Double totalCosto;
    private LocalDate FechaPedido;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private Domicilio domicilio;
    private Factura factura;
    private Set<DetallePedido> detallePedidos = new HashSet<>();

    public Pedido(LocalTime horaEstimadaFinalizacion, Double total, Double totalCosto, LocalDate fechaPedido, TipoEnvio tipoEnvio, FormaPago formaPago) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
        this.total = total;
        this.totalCosto = totalCosto;
        this.FechaPedido = fechaPedido;
        this.tipoEnvio = tipoEnvio;
        this.formaPago = formaPago;
    }


    public void agregarDetallePedido(DetallePedido detallePedido) {
        if (detallePedido != null) {
            detallePedidos.add(detallePedido);
        } else {
        System.out.println("No se puede agregar un detalle de pedido nulo.");
    }
    }
    @Override
    public String toString() {
        return "Pedido{" +
                "horaEstimadaFinalizacion=" + horaEstimadaFinalizacion +
                ", total=" + total +
                ", totalCosto=" + totalCosto +
                ", fechaPedido=" + FechaPedido +
                ", tipoEnvio=" + tipoEnvio +
                ", formaPago=" + formaPago +
                ", domicilio=" + (domicilio != null ? domicilio.toString() : "sin domicilio") +
                ", factura=" + (factura != null ? factura.toString() : "sin factura") +
                ", detallePedidos=" + (detallePedidos.isEmpty() ? "sin detalles" : detallePedidos.toString()) +
                '}';
    }
}

