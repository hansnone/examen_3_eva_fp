package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        try {
            vehiculos.add(new Coche("Toyota", "Corolla", 2020, 180.0));
            vehiculos.add(new Moto("Honda", "CBR", 2019, 200.0));
            vehiculos.add(new Bicicleta("Trek", "Mountain", 2021, 30.0));
            vehiculos.add(new Camion("Volvo", "FH16", 2018, 120.0));
            vehiculos.add(new Patinete("Xiaomi", "Mi Scooter", 2022, 25.0));
            for (Vehiculo vehiculo : vehiculos) {
                System.out.println(vehiculo.toString());
                vehiculo.arrancar();
                System.out.println(); 
            }
        } catch (VelocidadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}