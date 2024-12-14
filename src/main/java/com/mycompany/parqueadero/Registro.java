
package com.mycompany.parqueadero;

import java.util.Date;


public class Registro {
    
private Vehiculo vehiculo;

    private Date horaSalida;


    public Registro(Vehiculo vehiculo) {

        this.vehiculo = vehiculo;

    }


    public void registrarSalida() {

        this.horaSalida = new Date();

        long tiempoPermanencia = horaSalida.getTime() - vehiculo.getHoraEntrada().getTime();

        long minutos = (tiempoPermanencia / (1000 * 60)) % 60;

        long horas = (tiempoPermanencia / (1000 * 60 * 60)) % 24;

        System.out.println("Vehículo " + vehiculo.getMatricula() + " salió. Tiempo de permanencia: " + horas + " horas y " + minutos + " minutos.");

    }

}
