package school.sptech;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class FidelidadeEspecificacaoTest {

    private static final Logger logger = Logger.getLogger(FidelidadeEspecificacaoTest.class.getName());

    @Test
    @DisplayName("Verificar existência e tipo do campo 'nome' na classe Time")
    void testFieldNomeExists() {
        try {
            Field nome = Time.class.getDeclaredField("nome");
            assertNotNull(nome);
            assertEquals(String.class, nome.getType());
        } catch (NoSuchFieldException e) {
            logger.log(Level.SEVERE, "Campo 'nome' não encontrado: " + e.getMessage(), e);
            fail("Campo 'nome' não encontrado: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Verificar existência e tipo do campo 'vitorias' na classe Time")
    void testFieldVitoriasExists() {
        try {
            Field vitorias = Time.class.getDeclaredField("vitorias");
            assertNotNull(vitorias);
            assertEquals(Integer.class, vitorias.getType());
        } catch (NoSuchFieldException e) {
            logger.log(Level.SEVERE, "Campo 'vitorias' não encontrado: " + e.getMessage(), e);
            fail("Campo 'vitorias' não encontrado: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Verificar existência e tipo do campo 'empates' na classe Time")
    void testFieldEmpatesExists() {
        try {
            Field empates = Time.class.getDeclaredField("empates");
            assertNotNull(empates);
            assertEquals(Integer.class, empates.getType());
        } catch (NoSuchFieldException e) {
            logger.log(Level.SEVERE, "Campo 'empates' não encontrado: " + e.getMessage(), e);
            fail("Campo 'empates' não encontrado: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Verificar existência e tipo do campo 'derrotas' na classe Time")
    void testFieldDerrotasExists() {
        try {
            Field derrotas = Time.class.getDeclaredField("derrotas");
            assertNotNull(derrotas);
            assertEquals(Integer.class, derrotas.getType());
        } catch (NoSuchFieldException e) {
            logger.log(Level.SEVERE, "Campo 'derrotas' não encontrado: " + e.getMessage(), e);
            fail("Campo 'derrotas' não encontrado: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Verificar existência e assinatura do método 'registrarVitoria' na classe Time")
    void testMethodRegistrarVitoriaExists() {
        try {
            Method registrarVitoria = Time.class.getDeclaredMethod("registrarVitoria");
            assertNotNull(registrarVitoria);
            assertEquals(void.class, registrarVitoria.getReturnType());
            assertEquals(0, registrarVitoria.getParameterCount());
        } catch (NoSuchMethodException e) {
            logger.log(Level.SEVERE, "Método 'registrarVitoria' não encontrado: " + e.getMessage(), e);
            fail("Método 'registrarVitoria' não encontrado: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Verificar existência e assinatura do método 'registrarEmpate' na classe Time")
    void testMethodRegistrarEmpateExists() {
        try {
            Method registrarEmpate = Time.class.getDeclaredMethod("registrarEmpate");
            assertNotNull(registrarEmpate);
            assertEquals(void.class, registrarEmpate.getReturnType());
            assertEquals(0, registrarEmpate.getParameterCount());
        } catch (NoSuchMethodException e) {
            logger.log(Level.SEVERE, "Método 'registrarEmpate' não encontrado: " + e.getMessage(), e);
            fail("Método 'registrarEmpate' não encontrado: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Verificar existência e assinatura do método 'registrarDerrota' na classe Time")
    void testMethodRegistrarDerrotaExists() {
        try {
            Method registrarDerrota = Time.class.getDeclaredMethod("registrarDerrota");
            assertNotNull(registrarDerrota);
            assertEquals(void.class, registrarDerrota.getReturnType());
            assertEquals(0, registrarDerrota.getParameterCount());
        } catch (NoSuchMethodException e) {
            logger.log(Level.SEVERE, "Método 'registrarDerrota' não encontrado: " + e.getMessage(), e);
            fail("Método 'registrarDerrota' não encontrado: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Verificar existência e assinatura do método 'getPontos' na classe Time")
    void testMethodGetPontosExists() {
        try {
            Method getPontos = Time.class.getDeclaredMethod("getPontos");
            assertNotNull(getPontos);
            assertEquals(Integer.class, getPontos.getReturnType());
            assertEquals(0, getPontos.getParameterCount());
        } catch (NoSuchMethodException e) {
            logger.log(Level.SEVERE, "Método 'getPontos' não encontrado: " + e.getMessage(), e);
            fail("Método 'getPontos' não encontrado: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Verificar existência e assinatura do método 'getTotalPartidas' na classe Time")
    void testMethodGetTotalPartidasExists() {
        try {
            Method getTotalPartidas = Time.class.getDeclaredMethod("getTotalPartidas");
            assertNotNull(getTotalPartidas);
            assertEquals(Integer.class, getTotalPartidas.getReturnType());
            assertEquals(0, getTotalPartidas.getParameterCount());
        } catch (NoSuchMethodException e) {
            logger.log(Level.SEVERE, "Método 'getTotalPartidas' não encontrado: " + e.getMessage(), e);
            fail("Método 'getTotalPartidas' não encontrado: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Verificar existência e assinatura do método 'getAproveitamento' na classe Time")
    void testMethodGetAproveitamentosExists() {
        try {
            Method getAproveitamentos = Time.class.getDeclaredMethod("getAproveitamento");
            assertNotNull(getAproveitamentos);
            assertEquals(Integer.class, getAproveitamentos.getReturnType());
            assertEquals(0, getAproveitamentos.getParameterCount());
        } catch (NoSuchMethodException e) {
            logger.log(Level.SEVERE, "Método 'getAproveitamentos' não encontrado: " + e.getMessage(), e);
            fail("Método 'getAproveitamentos' não encontrado: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Verificar existência e assinatura do método 'compararAproveitamento' na classe Time")
    void testMethodCompararAproveitamentoExists() {
        try {
            Method compararAproveitamento = Time.class.getDeclaredMethod("compararAproveitamento", Time.class);
            assertNotNull(compararAproveitamento);
            assertEquals(void.class, compararAproveitamento.getReturnType());
            assertEquals(1, compararAproveitamento.getParameterCount());
            assertEquals(Time.class, compararAproveitamento.getParameterTypes()[0]);
        } catch (NoSuchMethodException e) {
            logger.log(Level.SEVERE, "Método 'compararAproveitamento' não encontrado: " + e.getMessage(), e);
            fail("Método 'compararAproveitamento' não encontrado: " + e.getMessage());
        }
    }
}
