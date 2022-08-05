/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex_
 */
public class Ronda {
    private Jugador j1;
    private Jugador j2;
    private Jugador roundWinner;


    public Ronda(Jugador j1, Jugador j2) {
        this.j1 = j1;
        this.j2 = j2;
    }


    public Jugador getJ1() {
        return j1;
    }


    public void setJ1(Jugador j1) {
        this.j1 = j1;
    }


    public Jugador getJ2() {
        return j2;
    }


    public void setJ2(Jugador j2) {
        this.j2 = j2;
    }


    public Jugador getRoundWinner() {
        return roundWinner;
    }


    public void setRoundWinner(Jugador roundWinner) {
        this.roundWinner = roundWinner;
    }

    public Jugador decidirGanador(Jugador j1, Jugador j2){
        int resultado = j1.getJugada().procesarJugadas(j2.getJugada());

        if (resultado == 1) {
            j1.uodateNumberWins();
            //System.out.println(j1.getNombre());
            return j1;
        } 
        if (resultado == -1) {
            j2.uodateNumberWins();
            //System.out.println(j2.getNombre());
            return j2;
        }
        return new Jugador("Empate");

    }  
    
    
}
