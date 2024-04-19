package com.example;
import static org.junit.Assert.assertEquals;



import org.junit.Test;

public class JuegoTest {
    @Test
    public void testGanadorEmpate() {
        Juego juego = new Juego();
        String resultado = juego.ganador("PIEDRA", "PIEDRA");
        assertEquals("EMPATE", resultado);
    }

    @Test
    public void testGanadorJugador2() {
        Juego juego = new Juego();
        String resultado = juego.ganador("PIEDRA", "PAPEL");
        assertEquals("Gana el jugador 2", resultado);
    }

    @Test
    public void testGanadorJugador1() {
        Juego juego = new Juego();
        String resultado = juego.ganador("TIJERA", "PIEDRA"); // Está puesto al revés para forzar el fallo
        assertEquals("Gana el jugador 1", resultado); 
    }
}
