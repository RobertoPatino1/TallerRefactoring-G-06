
import com.mycompany.juegoppt.model.Choice;
import com.mycompany.juegoppt.model.Paper;
import com.mycompany.juegoppt.model.Rock;
import com.mycompany.juegoppt.model.Scissors;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex_
 */
public class Jugador {
    private String nombre;
    private int numeroVictorias;
    private Choice jugada;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.numeroVictorias = 0;
    }

    public int getNumeroVictorias() {
        return numeroVictorias;
    }

    public void setNumeroVictorias(int numeroVictorias) {
        this.numeroVictorias = numeroVictorias;
    }

    public void uodateNumberWins(){
        this.numeroVictorias++;
    }

    public Choice getJugada() {
        return jugada;
    }
    
    public void setJugada(Choice jugada) {
        this.jugada = jugada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static ArrayList<Choice> enlistarJugadas(){
        ArrayList<Choice> resultado = new ArrayList<>();

        Choice roca = new Rock();
        Choice papel = new Paper();
        Choice scissor = new Scissors();

        resultado.add(roca);
        resultado.add(papel);
        resultado.add(scissor);

        return resultado;
    }

    public Choice generarJugadaAleatoria(){
        List<Choice> jugadas = enlistarJugadas();
        int randomIndex = (int) Math.round(Math.random()*3-1);
        if (randomIndex < 0){
            randomIndex++;
        }
        System.out.println(randomIndex);

        return jugadas.get(randomIndex);
    }


}