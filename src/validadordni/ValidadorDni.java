package validadordni;
import java.util.HashMap;

public class ValidadorDni {
    static final String FORMATO_DNI = "[0-9]{8}[A-Z]";
    static final Integer MODULO_DNI = 23;
    static final HashMap<Integer, Character> MAPA_LETRA;

    static {
        MAPA_LETRA = new HashMap<>();
        MAPA_LETRA.put(0, 'T');
        MAPA_LETRA.put(1, 'R');
        MAPA_LETRA.put(2, 'W');
        MAPA_LETRA.put(3, 'A');
        MAPA_LETRA.put(4, 'G');
        MAPA_LETRA.put(5, 'M');
        MAPA_LETRA.put(6, 'Y');
        MAPA_LETRA.put(7, 'F');
        MAPA_LETRA.put(8, 'P');
        MAPA_LETRA.put(9, 'D');
        MAPA_LETRA.put(10, 'X');
        MAPA_LETRA.put(11, 'B');
        MAPA_LETRA.put(12, 'N');
        MAPA_LETRA.put(13, 'J');
        MAPA_LETRA.put(14, 'Z');
        MAPA_LETRA.put(15, 'S');
        MAPA_LETRA.put(16, 'Q');
        MAPA_LETRA.put(17, 'V');
        MAPA_LETRA.put(18, 'H');
        MAPA_LETRA.put(19, 'L');
        MAPA_LETRA.put(20, 'C');
        MAPA_LETRA.put(21, 'K');
        MAPA_LETRA.put(22, 'E');
    }

    //Este metodo comprueba si el tiene 8 numeros y una letra.
    static boolean comprobarFormato(String dni) {
        //Lo convertimos todo a mayuscula y lo comparamos con la constante definida.
        if (dni.toUpperCase().matches(FORMATO_DNI) == false){
            System.out.println("Formato DNI incorrecto (no cumple la expresión regular)");
            return false;
        }else System.out.println("Formato DNI correcto, siguiente paso: "); return true;
    }

    //Este metodo comprueba si la letra del DNI es correcta.
    static boolean comprobarLetra(String dni) {
        //Obtenemos la subcadena del DNI que contiene solo los números.
        String subcadenaNumero = dni.substring(0, dni.length() - 1);
        // Convertimos la subcadena de números a entero.
        int numeroDni = Integer.parseInt(subcadenaNumero);
        Integer modulo = numeroDni % MODULO_DNI;
        Character letraDni = Character.toUpperCase(dni.charAt(dni.length() - 1));

        // Comparamos la letra del DNI con la letra correspondiente al módulo.
        if (letraDni != MAPA_LETRA.get(modulo)) {
        System.out.println("Letra incorrecta en DNI. ");
            return false;
        }
        return true;
    }

    /*En este metodo llamamos a los otros 2 metodos definidos.
      Este comprobará ambos boolean anteriores para devolver uno solo. */
    public static boolean comprobarDni(String dni) {
        if (comprobarFormato(dni) == false) {
          return false;
        }
        if (comprobarLetra(dni) == false) {
          return false;
        }
        return true;
    }
}
