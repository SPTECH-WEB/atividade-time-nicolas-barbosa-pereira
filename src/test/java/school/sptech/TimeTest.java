package school.sptech;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    private static final Logger logger = Logger.getLogger(TimeTest.class.getName());
    private Time time;

    @BeforeEach
    void setUp() {
        time = new Time();
    }

    @Test
    @DisplayName("Registrar uma vitória e verificar se o contador de vitórias aumenta")
    void testRegistrarVitoria() {
        try {
            Method registrarVitoria = Time.class.getDeclaredMethod("registrarVitoria");
            registrarVitoria.invoke(time);
            
            Field vitorias = Time.class.getDeclaredField("vitorias");
            vitorias.setAccessible(true);
            assertEquals(1, vitorias.get(time));
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Falha ao registrar vitória: " + e.getMessage(), e);
            fail("Falha ao registrar vitória: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Registrar um empate e verificar se o contador de empates aumenta")
    void testRegistrarEmpate() {
        try {
            Method registrarEmpate = Time.class.getDeclaredMethod("registrarEmpate");
            registrarEmpate.invoke(time);

            Field empates = Time.class.getDeclaredField("empates");
            empates.setAccessible(true);
            assertEquals(1, empates.get(time));
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Falha ao registrar empate: " + e.getMessage(), e);
            fail("Falha ao registrar empate: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Registrar uma derrota e verificar se o contador de derrotas aumenta")
    void testRegistrarDerrota() {
        try {
            Method registrarDerrota = Time.class.getDeclaredMethod("registrarDerrota");
            registrarDerrota.invoke(time);

            Field derrotas = Time.class.getDeclaredField("derrotas");
            derrotas.setAccessible(true);
            assertEquals(1, derrotas.get(time));
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Falha ao registrar derrota: " + e.getMessage(), e);
            fail("Falha ao registrar derrota: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Calcular os pontos corretamente com base nas vitórias e empates")
    void testCalcularPontos() {
        try {
            Field vitorias = Time.class.getDeclaredField("vitorias");
            Field empates = Time.class.getDeclaredField("empates");

            vitorias.setAccessible(true);
            empates.setAccessible(true);

            vitorias.set(time, 1);
            empates.set(time, 1);

            Method getPontos = Time.class.getDeclaredMethod("getPontos");
            Integer pontos = (Integer) getPontos.invoke(time);

            assertEquals(4, pontos);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Falha ao calcular pontos: " + e.getMessage(), e);
            fail("Falha ao calcular pontos: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Calcular o total de partidas corretamente somando vitórias, empates e derrotas")
    void testCalcularTotalPartidas() {
        try {
            Field vitorias = Time.class.getDeclaredField("vitorias");
            Field empates = Time.class.getDeclaredField("empates");
            Field derrotas = Time.class.getDeclaredField("derrotas");

            vitorias.setAccessible(true);
            empates.setAccessible(true);
            derrotas.setAccessible(true);

            vitorias.set(time, 1);
            empates.set(time, 1);
            derrotas.set(time, 1);

            Method getTotalPartidas = Time.class.getDeclaredMethod("getTotalPartidas");
            Integer totalPartidas = (Integer) getTotalPartidas.invoke(time);

            assertEquals(3, totalPartidas);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Falha ao calcular total de partidas: " + e.getMessage(), e);
            fail("Falha ao calcular total de partidas: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Calcular o aproveitamento corretamente com base no número de vitórias e total de partidas")
    void testCalcularAproveitamento() {
        try {
            Field vitorias = Time.class.getDeclaredField("vitorias");
            Field derrotas = Time.class.getDeclaredField("derrotas");

            vitorias.setAccessible(true);
            derrotas.setAccessible(true);

            vitorias.set(time, 2);
            derrotas.set(time, 2);

            Method getAproveitamento = Time.class.getDeclaredMethod("getAproveitamento");
            Integer aproveitamento = (Integer) getAproveitamento.invoke(time);

            assertEquals(50, aproveitamento);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Falha ao calcular aproveitamento: " + e.getMessage(), e);
            fail("Falha ao calcular aproveitamento: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Comparar o aproveitamento de dois times corretamente")
    void testCompararAproveitamento() {
        try {
            Time adversario = new Time();

            Field vitoriasTime = Time.class.getDeclaredField("vitorias");
            Field derrotasField = Time.class.getDeclaredField("derrotas");
            Field vitoriasAdversario = Time.class.getDeclaredField("vitorias");
            Field derrotasAdversario = Time.class.getDeclaredField("derrotas");

            vitoriasTime.setAccessible(true);
            derrotasField.setAccessible(true);
            vitoriasAdversario.setAccessible(true);
            derrotasAdversario.setAccessible(true);

            vitoriasTime.set(time, 1);
            derrotasField.set(time, 1);
            vitoriasAdversario.set(adversario, 2);
            derrotasAdversario.set(adversario, 0);

            Method compararAproveitamento = Time.class.getDeclaredMethod("compararAproveitamento", Time.class);
            compararAproveitamento.invoke(time, adversario);

            Method getAproveitamento = Time.class.getDeclaredMethod("getAproveitamento");
            Integer aproveitamentoTime = (Integer) getAproveitamento.invoke(time);
            Integer aproveitamentoAdversario = (Integer) getAproveitamento.invoke(adversario);

            assertTrue(aproveitamentoTime < aproveitamentoAdversario);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Falha ao comparar aproveitamento: " + e.getMessage(), e);
            fail("Falha ao comparar aproveitamento: " + e.getMessage());
        }
    }
}
