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
    
    public static void iniciarPartida(int puntosVictoria){
        Partida nuevaPartida = new Partida(puntosVictoria);

        Jugador j1 = new Jugador("Jugador 1");
        Jugador j2 = new Jugador("Jugador 2");
        Ronda round = new Ronda(j1,j2);

        while(j1.getNumeroVictorias()<nuevaPartida.getPuntosVictoria() && j2.getNumeroVictorias()<nuevaPartida.getPuntosVictoria()){
            System.out.println("***Round: " + nuevaPartida.getRondasJugadas() + "***");
            System.out.println("***Numero de empates: " + nuevaPartida.getRondasEmpatadas() + "***");
            
            j1.setJugada(j1.generarJugadaAleatoria());
            j2.setJugada(j2.generarJugadaAleatoria());

            Jugador ganador = round.decidirGanador(j1,j2);
            round.setRoundWinner(ganador);
            if(!ganador.getNombre().equals("Empate")){
                System.out.println("El ganador es: "+ganador.getNombre());
            }else{
                System.out.println("Empate!!!");
                nuevaPartida.rondasEmpatadas++;
            }
            nuevaPartida.rondasJugadas++;
        }
        
        if (j1.getNumeroVictorias() == nuevaPartida.puntosVictoria){
            System.out.println("\nEl ganador de la partida es: "+j1.getNombre());
        } else {
            System.out.println("\nEl ganador de la partida es: "+j2.getNombre());
        }
    }
}