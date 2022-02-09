package com.example.proyectopmdmlistacompra;

import android.net.Uri;

public class Producto {
    private String nombre;
    private String marca;
    private Uri rutaFoto;
    private int cantidad;
    private double precio;

    public Producto() {
    }

    public Producto(String nombre, String marca, Uri rutaFoto, int cantidad, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.rutaFoto = rutaFoto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Uri getRutaFoto() {
        return rutaFoto;
    }

    public void setRutaFoto(Uri rutaFoto) {
        this.rutaFoto = rutaFoto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
