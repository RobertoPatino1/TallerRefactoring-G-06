/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juegoppt.model;

/**
 *
 * @author alex_
 */
public class Scissors implements Choice {

    @Override
    public int procesarJugadas(Choice jugadaJugador2) {
        boolean esRoca = jugadaJugador2 instanceof Rock;
        boolean esPapel = jugadaJugador2 instanceof Paper;

        if (esPapel) {
            //System.out.println("Tijera gana a papel");
            return 1;
        }
        if (esRoca) {
            //System.out.println("Tijera pierde a roca");
            return -1;
        }
        //System.out.println("Empate");
        return 0;
    }

}
