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
public class Paper implements Choice {

    @Override
    public int procesarJugadas(Choice jugadaJugador2) {
        boolean esTijera = jugadaJugador2 instanceof Scissors;
        boolean esRoca = jugadaJugador2 instanceof Rock;

        if (esTijera) {
            //System.out.println("Papel pierde a tijera");
            return -1;
        }
        if (esRoca) {
            //System.out.println("Papel gana a roca");
            return 1;
        }
        //System.out.println("Empate");
        return 0;
    }
    
}
