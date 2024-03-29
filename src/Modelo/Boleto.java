/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Victor
 */
public class Boleto {
    private Integer idBoleto;
    private String Origen;
    private String Destino;
    private Integer CantidadBoletos;
    private String FechaSalida;
    private String HoraSalida;
    private String FechaCompra;
    private Integer NumeroAsiento;
    private Float PrecioUnitario;
    private Integer Iva;
    private String Descuento;
    private Float PrecioFinal;

    public Boleto() {
        
    }

    public Boleto(Integer idBoleto, String Origen, String Destino, Integer CantidadBoletos, String FechaSalida, String HoraSalida, String FechaCompra, Integer NumeroAsiento, Float PrecioUnitario, Integer Iva, String Descuento, Float PrecioFinal) {
        this.idBoleto = idBoleto;
        this.Origen = Origen;
        this.Destino = Destino;
        this.CantidadBoletos = CantidadBoletos;
        this.FechaSalida = FechaSalida;
        this.HoraSalida = HoraSalida;
        this.FechaCompra = FechaCompra;
        this.NumeroAsiento = NumeroAsiento;
        this.PrecioUnitario = PrecioUnitario;
        this.Iva = Iva;
        this.Descuento = Descuento;
        this.PrecioFinal = PrecioFinal;
    }

    public Integer getIdBoleto() {
        return idBoleto;
    }

    public void setIdBoleto(Integer idBoleto) {
        this.idBoleto = idBoleto;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public Integer getCantidadBoletos() {
        return CantidadBoletos;
    }

    public void setCantidadBoletos(Integer CantidadBoletos) {
        this.CantidadBoletos = CantidadBoletos;
    }

    public String getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(String FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public String getHoraSalida() {
        return HoraSalida;
    }

    public void setHoraSalida(String HoraSalida) {
        this.HoraSalida = HoraSalida;
    }

    public String getFechaCompra() {
        return FechaCompra;
    }

    public void setFechaCompra(String FechaCompra) {
        this.FechaCompra = FechaCompra;
    }

    public Integer getNumeroAsiento() {
        return NumeroAsiento;
    }

    public void setNumeroAsiento(Integer NumeroAsiento) {
        this.NumeroAsiento = NumeroAsiento;
    }

    public Float getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(Float PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    public Integer getIva() {
        return Iva;
    }

    public void setIva(Integer Iva) {
        this.Iva = Iva;
    }

    public String getDescuento() {
        return Descuento;
    }

    public void setDescuento(String Descuento) {
        this.Descuento = Descuento;
    }

    public Float getPrecioFinal() {
        return PrecioFinal;
    }

    public void setPrecioFinal(Float PrecioFinal) {
        this.PrecioFinal = PrecioFinal;
    }

    @Override
    public String toString() {
        return "Boleto{" + "idBoleto=" + idBoleto + ", Origen=" + Origen + ", Destino=" + Destino + ", CantidadBoletos=" + CantidadBoletos + ", FechaSalida=" + FechaSalida + ", HoraSalida=" + HoraSalida + ", FechaCompra=" + FechaCompra + ", NumeroAsiento=" + NumeroAsiento + ", PrecioUnitario=" + PrecioUnitario + ", Iva=" + Iva + ", Descuento=" + Descuento + ", PrecioFinal=" + PrecioFinal + '}';
    }

}
