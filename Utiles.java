/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria_leer;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author User
 */
public class Utiles {
    //--------------------------------------------------------------------------
    //METODO PARA LIMPIAR PANTALLA
    //--------------------------------------------------------------------------

    /**
     * Método para limpiar pantalla imprimiendo muchas filas en blanco. (20)
     *
     */
    public static void limpieza() {
        final int LIMPIEZA = 20;
        for (int i = 0; i < LIMPIEZA; i++) {
            System.out.println("");
        }
    }

    //--------------------------------------------------------------------------
    //METODO PARA PAUSAR LA LECTURA
    //--------------------------------------------------------------------------
    /**
     * Método para pusar la lectura y pedir un intro para continuar.
     *
     */
    public static void pausar() {
        //PAUSAR
        try {
            System.out.println("Pulsa Intro para continuar");
            System.in.read();
        } catch (IOException e) {
            System.out.println("\tERROR en el metodo pausar: " + e.getMessage());
        }
    }

    //--------------------------------------------------------------------------
    //METODO generar numeros aleatorios
    //--------------------------------------------------------------------------
    /**
     * Método para generar números aleatorios.
     *
     * @param minimo
     * @param maximo
     * @return
     */
    public static int numeroAleatorioEntreXeY(int minimo, int maximo) {
        return (int) (Math.random() * (maximo - minimo + 1)) + minimo;
    }

    //--------------------------------------------------------------------------
    //                CONTROL DE ACCESO
    //--------------------------------------------------------------------------
    /**
     * Método para validar usuario y contrasena, obtenido de la base de datos.
     *
     * @param usuarioIntro
     * @param contrasenaIntro
     * @param usuarioBD
     * @param contrasenaBD
     * @return
     */
    public static boolean validarAcceso(String usuarioIntro, String contrasenaIntro, String usuarioBD, String contrasenaBD) {
        boolean accesoValido = false;

        if (usuarioIntro.equals(usuarioBD) && contrasenaIntro.equals(contrasenaBD)) {
            System.out.println("Acceso permitido.");
            System.out.println("Bienvenido, " + usuarioIntro);
            accesoValido = true;
        } else {
            System.err.println("Acceso Denegado.");
            accesoValido = false;
        }
        return accesoValido;
    }
    
    // Obtenermos la fecha actual formateada en String

    public static String fechaActualString() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // formato de fecha
        Date fechaActual = new Date();
        return formatoFecha.format(fechaActual);
    }
}
