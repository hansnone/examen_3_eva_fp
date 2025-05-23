package com.example;

public class Camion extends Vehiculo {
 public Camion(String marca, String modelo, int anio, double velocidadMaxima) throws VelocidadInvalidaException {
     super(marca, modelo, anio, velocidadMaxima);
 }
 @Override
 public void arrancar() {
     System.out.println("El camión hace un ruido fuerte de motor.");
 }
}
