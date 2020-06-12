import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Daniel Teles
 * @version 1.0
 * @since 11/06/2020 - 23:21
 * @category Test
 */
class NumeroTest {

    private Numero numero = new Numero();

    /**
     * Testa o método mostrarNumerosZeroAVinte()
     */
    @org.junit.jupiter.api.Test
    void mostrarNumerosZeroAVinte() {
        assertEquals("\n0\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20", numero.mostrarNumerosZeroAVinte());
    }

    /**
     * Testa o método mostrarNumerosParesZeroAVinte()
     */
    @org.junit.jupiter.api.Test
    void mostrarNumerosParesZeroAVinte() {
        assertEquals("\n0\n2\n4\n6\n8\n10\n12\n14\n16\n18\n20", numero.mostrarNumerosParesZeroAVinte());
    }

    /**
     * Testa o método mostrarNumerosImparesZeroAVinte()
     */
    @org.junit.jupiter.api.Test
    void mostrarNumerosImparesZeroAVinte() {
        assertEquals("\n1\n3\n5\n7\n9\n11\n13\n15\n17\n19", numero.mostrarNumerosImparesZeroAVinte());
    }

    /**
     * Testa o método mostrarNumerosConformeIntervalo()
     */
    @org.junit.jupiter.api.Test
    void mostrarNumerosConformeIntervalo() {
        assertEquals("\n4\n5\n6\n7\n8", numero.mostrarNumerosConformeIntervalo(4,8));
    }

    /**
     * Testa o método mostrarNumerosConformeIntervaloStep()
     */
    @org.junit.jupiter.api.Test
    void mostrarNumerosConformeIntervaloStep() {
        assertEquals("\n0\n2\n4\n6\n8", numero.mostrarNumerosConformeIntervaloStep(0,8,2));
    }
}