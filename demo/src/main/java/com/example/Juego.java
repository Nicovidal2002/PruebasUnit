package com.example;

public class Juego {
    public String ganador(String jugada1, String jugada2) {
        String resultado; 
        if(jugada1.equals(jugada2)){
            resultado = "EMPATE";
        }else if(jugada1.equals("PIEDRA") && jugada2.equals("PAPEL") ){
            resultado = "Gana el jugador 2";
        }else if(jugada1.equals("PAPEL") && jugada2.equals("TIJERA") ){
            resultado = "Gana el jugador 2";
        }else if(jugada1.equals("TIJERA") && jugada2.equals("PIEDRA") ){
            resultado = "Gana el jugador 2";
        }else{
            resultado = "Gana el jugador 1";
        }
        return resultado;
    }
}