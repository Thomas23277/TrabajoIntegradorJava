package app;

import Entities.*;
import Enums.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        // Creación de un país y una provincia
        Pais pais = new Pais("Argentina");
        Provincia provincia = new Provincia("Mendoza", pais, new LinkedHashSet<>());
        Localidad localidad = new Localidad("Ciudad", provincia);

        // Creación de una empresa con una sucursal
        Empresa empresa = new Empresa("Delicias Mendoza", "Delicias S.A.", 30123456789L, null);
        Sucursal sucursal = new Sucursal("Sucursal Centro", LocalTime.of(8, 0), LocalTime.of(22, 0));
        empresa.agregarSucursal(sucursal);

        // Creación de un cliente con un usuario
        Usuario usuario = new Usuario("hashedPassword123", "thomasg");
        Cliente cliente = new Cliente("Thomas", "Gonzalez", "123456789", "thomas@email.com", LocalDate.of(2005, 12, 31));
        cliente.setUsuario(usuario);

        // Creación de un domicilio
        Domicilio domicilio = new Domicilio("Av. Principal", 123, 5501, localidad);

        // Creación de un artículo insumo
        UnidadMedida unidadMedida = new UnidadMedida("Kilogramo");
        ArticuloInsumo insumo = new ArticuloInsumo();
        insumo.setDenominacion("Harina");
        insumo.setUnidadMedidas(unidadMedida);
        insumo.setPrecioCompra(120.0);
        insumo.setStockActual(50);
        insumo.setStockMaximo(100);
        insumo.setEsParaElaborar(true);
        ArticuloInsumo harina = new ArticuloInsumo("Harina", 150.0, new UnidadMedida("Kilogramo"), 50.0, 20, 50, true);
        ArticuloInsumo carne = new ArticuloInsumo("Carne", 200.0, new UnidadMedida("Kilogramo"), 100.0, 30, 50, true);
        // Creación de un detalle de artículo manufacturado
        ArticuloManofacturadoDetalle detalle1 = new ArticuloManofacturadoDetalle(2, harina);
        ArticuloManofacturadoDetalle detalle2 = new ArticuloManofacturadoDetalle(2, carne);
        System.out.println("para hacerse una milanesa se necesita");
        // Creación de un artículo manufacturado
        ArticuloManufacturado articuloManufacturado = new ArticuloManufacturado("Pizza", 150.0, "Pizza a la Napolitana", 20, "Preparar y hornear");
        articuloManufacturado.setDetalles(new LinkedHashSet<>());
        articuloManufacturado.getDetalles().add(detalle1);
        System.out.println(articuloManufacturado);

        ArticuloManufacturado articuloManufacturado1 = new ArticuloManufacturado("Milanesa", 200.0, "Milanesa con cheddar", 20, "Preparar y freir");
        articuloManufacturado.setDetalles(new LinkedHashSet<>());
        articuloManufacturado.getDetalles().add(detalle2);
        System.out.println(articuloManufacturado1);

        // Creación de un detalle pedido
        DetallePedido detallePedido1 = new DetallePedido(1, 150.0);
        detallePedido1.setArticulo(articuloManufacturado);
        DetallePedido detallePedido2 = new DetallePedido(1, 200.0);
        detallePedido2.setArticulo(articuloManufacturado1);

        // Creación de un pedido con detalles
        Pedido pedido = new Pedido(
                LocalTime.of(12, 30),
                150.0,
                350.0,
                LocalDate.now(),
                TipoEnvio.Delivery,
                FormaPago.efectivo
        );
        pedido.agregarDetallePedido(detallePedido1);
        pedido.agregarDetallePedido(detallePedido2);
        System.out.println(pedido);

        // Creación de una factura

        Factura factura = new Factura(LocalDate.now(), 123456, 987654, "pref123", "MercadoPago", 350.0, FormaPago.MercadoPago);
        pedido.setFactura(factura);

        // Impresión de algunas instancias para verificar datos
        System.out.println("Empresa creada: " + empresa.getNombre());
        System.out.println("Sucursal de la empresa: " + sucursal.getNombre());
        System.out.println("Cliente creado: " + cliente.getNombre() + " " + cliente.getApellido());
        System.out.println("Domicilio del cliente: " + domicilio);
        System.out.println("Pedido realizado por: " + cliente.getNombre() + " con total: $" + pedido.getTotal());
        System.out.println("Factura del pedido: " + factura);

        //------------------------------------------------------------------------------------------------------\\

        // Creación de un segundo usuario y cliente
        Usuario usuario2 = new Usuario("hashedPassword456", "marianag");
        Cliente cliente2 = new Cliente("Mariana", "Gutiérrez", "407654321", "mariana@email.com", LocalDate.of(1998, 7, 15));
        cliente2.setUsuario(usuario2);

        // Creación de un domicilio para Mariana
        Domicilio domicilio2 = new Domicilio("Calle Perito Moreno", 456, 5501, localidad);

        // Creación de artículos insumo para las empanadas
        ArticuloInsumo pollo = new ArticuloInsumo("Pollo", 100.0, new UnidadMedida("Kilogramo"), 80.0, 25, 55, true);
        ArticuloInsumo masa = new ArticuloInsumo("Masa", 80.0, new UnidadMedida("Kilogramo"), 40.0, 20, 50, true);

        // Creación de detalles de artículo manufacturado
        ArticuloManofacturadoDetalle detalle3 = new ArticuloManofacturadoDetalle(2, pollo);
        ArticuloManofacturadoDetalle detalle4 = new ArticuloManofacturadoDetalle(2, masa);
        System.out.println("para hacerse unas empanadas de pollo se necesita");

        // Creación de artículo manufacturado (Empanadas de pollo)
        ArticuloManufacturado articuloManufacturado3 = new ArticuloManufacturado("Empanadas de pollo", 250.0, "Empanadas rellenas con pollo", 30, "Armar y hornear");
        articuloManufacturado3.setDetalles(new LinkedHashSet<>());
        articuloManufacturado3.getDetalles().add(detalle3);
        articuloManufacturado3.getDetalles().add(detalle4);
        System.out.println(articuloManufacturado3);

        // Creación de detalles de pedido
        DetallePedido detallePedido3 = new DetallePedido(1, 250.0);
        detallePedido3.setArticulo(articuloManufacturado3);

        // Creación de un nuevo pedido con empanadas de pollo
        Pedido pedido2 = new Pedido(
                LocalTime.of(13, 15),
                120.0,
                180.0,
                LocalDate.now(),
                TipoEnvio.Delivery,
                FormaPago.efectivo
        );
        pedido2.agregarDetallePedido(detallePedido3);
        System.out.println(pedido2);

        // Creación de una factura para el segundo pedido
        Factura factura2 = new Factura(LocalDate.now(), 654321, 876543, "pref456", "MercadoPago", 180.0, FormaPago.MercadoPago);
        pedido2.setFactura(factura2);

// Impresión de datos del nuevo cliente y pedido
        System.out.println("Empresa creada: " + empresa.getNombre());
        System.out.println("Sucursal de la empresa: " + sucursal.getNombre());
        System.out.println("Cliente creado: " + cliente2.getNombre() + " " + cliente2.getApellido());
        System.out.println("Domicilio del cliente: " + domicilio2);
        System.out.println("Pedido realizado por: " + cliente2.getNombre() + " con total: $" + pedido2.getTotal());
        System.out.println("Factura del pedido: " + factura2);
    }
}