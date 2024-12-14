/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parqueadero;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Parqueadero {
    
  private int capacidad;

    private List<Vehiculo> vehiculos;


    public Parqueadero(int capacidad) {

        this.capacidad = capacidad;

        this.vehiculos = new ArrayList<>();

    }


    public void agregarVehiculo(Vehiculo vehiculo) {

        if (!esFull()) {

            vehiculos.add(vehiculo);

            vehiculo.registrarEntrada();

            System.out.println("Vehículo " + vehiculo.getMatricula() + " agregado al parqueadero.");

        } else {

            System.out.println("El parqueadero está lleno.");

        }

    }


    public Vehiculo removerVehiculo(String matricula) {

        for (Vehiculo vehiculo : vehiculos) {

            if (vehiculo.getMatricula().equals(matricula)) {

                vehiculos.remove(vehiculo);

                System.out.println("Vehículo " + matricula + " removido del parqueadero.");

                return vehiculo;

            }

        }

        System.out.println("Vehículo no encontrado.");

        return null;

    }


    public void listarVehiculos() {

        if (vehiculos.isEmpty()) {

            System.out.println("No hay vehículos en el parqueadero.");

        } else {

            for (Vehiculo vehiculo : vehiculos) {

                System.out.println("Vehículo: " + vehiculo.getMatricula() + ", Tipo: " + vehiculo.getTipo() + ", Hora de entrada: " + vehiculo.getHoraEntrada());

            }

        }

    }


    public boolean esFull() {

        return vehiculos.size() >= capacidad;

    }

}




