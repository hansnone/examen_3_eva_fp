package com.example;

public class Patinete extends Vehiculo {
 public Patinete(String marca, String modelo, int anio, double velocidadMaxima) throws VelocidadInvalidaException {
     super(marca, modelo, anio, velocidadMaxima);
 }
 @Override
 public void arrancar() {
     System.out.println("El patinete se enciende silenciosamente.");
 }
}
