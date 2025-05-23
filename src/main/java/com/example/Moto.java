package com.example;

public class Moto extends Vehiculo {
 public Moto(String marca, String modelo, int anio, double velocidadMaxima) throws VelocidadInvalidaException {
     super(marca, modelo, anio, velocidadMaxima);
 }
 @Override
 public void arrancar() {
     System.out.println("La moto acelera con fuerza.");
 }
}
