/**
 * @author Daniel Teles
 * @version 1.0
 * @since 11/06/2020 - 23:03
 * @category Model
 */
public class Numero {

    /**
     *
     * @return Retorna os numeros de zero a vinte
     */
    public String mostrarNumerosZeroAVinte() {
        int contador = 0;
        StringBuilder numeros = new StringBuilder();
        while(contador <=20){
            numeros.append("\n" + contador);
            contador++;
        }
        return numeros.toString();
    }

    /**
     *
     * @return Retorna os numeros pares de zero a vinte
     */
    public String mostrarNumerosParesZeroAVinte() {
        int contador = 0;
        StringBuilder numeros = new StringBuilder();
        while(contador <=20){
            if(contador %2 == 0) {
                numeros.append("\n" + contador);
            }
            contador++;
        }
        return numeros.toString();
    }

    /**
     *
     * @return Retorna os numeros impares de zero a vinte
     */
    public String mostrarNumerosImparesZeroAVinte() {
        int contador = 0;
        StringBuilder numeros = new StringBuilder();
        while(contador <=20){
            if(contador %2 != 0) {
                numeros.append("\n" + contador);
            }
            contador++;
        }
        return numeros.toString();
    }

    /**
     *
     * @return Retorna os numeros conforme o intervalo desejado
     */
    public String mostrarNumerosConformeIntervalo(int inicio, int fim) {
        int contador = inicio;
        StringBuilder numeros = new StringBuilder();
        while(contador <= fim) {
            numeros.append("\n"+contador);
            contador++;
        }
        return numeros.toString();
    }

    /**
     *
     * @return Retorna os numeros conforme o intervalo desejado e pulando a quantidade desejada
     */
    public String mostrarNumerosConformeIntervaloStep(int inicio, int fim, int step) {
        int contador = inicio;
        StringBuilder numeros = new StringBuilder();
        while(contador <= fim) {
            numeros.append("\n"+contador);
            contador += step;
        }
        return numeros.toString();
    }
}
