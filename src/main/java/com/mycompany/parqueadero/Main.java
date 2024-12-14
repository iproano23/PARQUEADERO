
package com.mycompany.parqueadero;


public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero(2);


        Vehiculo vehiculo1 = new Vehiculo("ABC123", "carro");

        Vehiculo vehiculo2 = new Vehiculo("XYZ789", "moto");


        parqueadero.agregarVehiculo(vehiculo1);

        parqueadero.agregarVehiculo(vehiculo2);

        parqueadero.listarVehiculos();


        // Remover un vehículo

        Vehiculo vehiculoRemovido = parqueadero.removerVehiculo("ABC123");


        // Registrar salida

        if (vehiculoRemovido != null) {

            Registro registro = new Registro(vehiculoRemovido);

            registro.registrarSalida();

        }

    }
    }

