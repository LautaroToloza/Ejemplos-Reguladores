package ar.com.lautaro.test;

import java.util.*;

public class testReguladores {

    public static void main(String[] args) {
        /* Consignas: 
    1) Verificacion para un id de un empleado que debe empezar por:
    -> un número y tener luego entre 6 y 7 letras minusculas

    2) Verificar un número de telefono que debe tener:
    -> 54 351(6 numeros cualquiera)

    3) Verificar un correo electrónico que tenga lo siguiente:
    -> 4letras(mayusculas o minusculas) 2numeros @gmail.com
        
    4) Verificar un número de telefono ingresado por teclado que tenga:
    -> 351 0 354 separado de 7 números
    
         */
        
        // Prueba de la verificación del número de id empleado.
        System.out.println(verificacionID("9marxts"));
        System.out.println(verificacionID("9marxtsl"));
        System.out.println(verificacionID("9maLAts"));
        System.out.println(verificacionID("99marxts"));

        // Prueba de la verificación del número de teléfono.
        System.out.println(verificacionNumero("54 351808057"));
        System.out.println(verificacionNumero("54 3518080574"));
        System.out.println(verificacionNumero("54 35154 351808057"));
        System.out.println(verificacionNumero("54 354808057"));
        
        // Prueba de la verificación del correo electrónico.
        System.out.println(verificacionCorreo("AJlm56@gmail.com"));
        System.out.println(verificacionCorreo("AJLM56@gmail.com"));
        System.out.println(verificacionCorreo("ajlm56@gmail.com"));
        System.out.println(verificacionCorreo("AJlm569@gmail.com"));
        System.out.println(verificacionCorreo("AJlmXC56@gmail.com"));
        
        // Prueba de la verificación del número de teléfono.
        System.out.println("El número debe tener 351 o 354 separado de 7 números");
        String numeroT = cargarTexto("Ingrese un número de teléfono: ");
        System.out.println(numeroCorrecto(numeroT));
    }

    public static boolean verificacionID(String texto) {
        return texto.matches("^[0-9]{1}+[a-z]{6,7}$");

    }

    public static boolean verificacionNumero(String texto) {
        // Otra posibilidad:
        //return texto.matches("^[5]{1}+[4]{1}+[ ]+[3]{1}+[5]{1}+[1]{1}+[0-9]{6}$");
        return texto.matches("^(54 351){1}+[0-9]{6}$");

    }

    public static boolean verificacionCorreo(String tex) {
        return tex.matches("^[A-Z,a-z]{4}+[0-9]{2}+(@gmail.com)$");
    }

    public static String cargarTexto(String texto) {
        Scanner leer = new Scanner(System.in);
        System.out.println(texto);
        String tex = leer.nextLine();
        return tex;
    }

    public static boolean numeroCorrecto(String numero) {
        // match simil al interprete de expresiones. inicio: ^ fin: $
        return numero.matches("^(351 |354 ){1}+[0-9]{7}$");
    }
}
