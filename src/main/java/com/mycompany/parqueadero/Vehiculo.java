/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parqueadero;

import java.util.Date;


public class Vehiculo {
    
private String matricula;

    private String tipo;

    private Date horaEntrada;


    public Vehiculo(String matricula, String tipo) {

        this.matricula = matricula;

        this.tipo = tipo;

        this.horaEntrada = new Date();

    }


    public String getMatricula() {

        return matricula;

    }


    public String getTipo() {

        return tipo;

    }


    public Date getHoraEntrada() {

        return horaEntrada;

    }


    public void registrarEntrada() {

        this.horaEntrada = new Date();

    }

}
