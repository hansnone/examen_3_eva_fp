package com.example;

public class Coche extends Vehiculo {
 public Coche(String marca, String modelo, int anio, double velocidadMaxima) throws VelocidadInvalidaException {
     super(marca, modelo, anio, velocidadMaxima);
 }
 @Override
 public void arrancar() {
     System.out.println("El coche ruge al arrancar.");
 }
}
