package com.example;

public class Bicicleta extends Vehiculo {
 public Bicicleta(String marca, String modelo, int anio, double velocidadMaxima) throws VelocidadInvalidaException {
     super(marca, modelo, anio, velocidadMaxima);
 }
 @Override
 public void arrancar() {
     System.out.println("La bicicleta comienza a pedalear.");
 }
}
