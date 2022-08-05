/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex_
 */
public class Partida {
    private int puntosVictoria;
    private int rondasJugadas;
    private int rondasEmpatadas;
    private Ronda rondaInicial;


    public Partida(int puntosVictoria) {
        this.puntosVictoria = puntosVictoria;
        this.rondasJugadas = 1;
    }

    public int getPuntosVictoria() {
        return puntosVictoria;
    }


    public void setPuntosVictoria(int puntosVictoria) {
        this.puntosVictoria = puntosVictoria;
    }

    public int getRondasJugadas() {
        return rondasJugadas;
    }

    public void setRondasJugadas(int rondasJugadas) {
        this.rondasJugadas = rondasJugadas;
    }

    public int getRondasEmpatadas() {
        return rondasEmpatadas;
    }

    public void setRondasEmpatadas(int rondasEmpatadas) {
        this.rondasEmpatadas = rondasEmpatadas;
    }

    public Ronda getRondaInicial() {
        return rondaInicial;
    }

    public void setRondaInicial(Ronda rondaInicial) {
        this.rondaInicial = rondaInicial;
    }


    public static void main(String[] args) {
        Jugador j1 = new Jugador("Julio");
        Jugador j2 = new Jugador("Daniel");

        Ronda round = new Ronda(j1, j2);

        for (int i = 0; i < 10; i++) {
            j1.setJugada(j1.generarJugadaAleatoria());
            j2.setJugada(j2.generarJugadaAleatoria());
            //System.out.println();

            Jugador ganador = round.decidirGanador(j1, j2);

            round.setRoundWinner(ganador);

            if (ganador != null) {
                System.out.println("La ronda " + 5 + "la gana el jugador: "+ganador.getNombre());
            } else {
                System.out.println("Empate!!");
            }
        }


    }
}