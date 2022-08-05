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
public class Rock implements Choice {

    //private String codigo = "piedra";
    
    @Override
    public int procesarJugadas(Choice jugadaJugador2) {
        boolean esTijera = jugadaJugador2 instanceof Scissors;
        boolean esPapel = jugadaJugador2 instanceof Paper;

        if (esTijera) {
            //System.out.println("Piedra gana a tijera");
            return 1;
        }
        if (esPapel) {
            //System.out.println("Piedra pierda a papel");
            return -1;
        }
        //System.out.println("Empate");
        return 0;
    }

}
