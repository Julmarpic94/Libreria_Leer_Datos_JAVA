package libreria_leer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Leer {

    //--------------------------------------------------------------------------
    //MÉTODO PARA LEER UN ENTERO (INT)
    //--------------------------------------------------------------------------
    /**
     * Método para almacenar un entero (Int) en una variable a través de un
     * String.
     * @param msj
     * @return
     */
    public static int leerInt(String msj) {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        String auxiliar;
        int valor = 0;
        boolean error;

        do {
            error = false; //Ejecuta el bluce con error en falso, es decir, no hay error
            try {
                System.out.print(msj);
                auxiliar = teclado.readLine();
                valor = Integer.parseInt(auxiliar);

            } catch (IOException | NumberFormatException e) {
                error = true; // si hay error
                System.err.println("\tError en el método leerInt: formato del número no válido");
                System.out.println(e.getMessage());
            }
        } while (error);

        return valor;
    }

    //--------------------------------------------------------------------------
    //METODO PARA LEER ENTERO (INT) MAYOR QUE CERO
    //--------------------------------------------------------------------------
    /**
     * Método para almacenar un entero (Int) en una variable a través de un
     * String si es mayor o igual 0.
     * @param msj
     * @return
     */
    public static int leerIntMayorACero(String msj) {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        String auxiliar;
        int valor = 0;
        boolean error;

        do {
            error = false;
            try {
                do {
                    System.out.print(msj);
                    auxiliar = teclado.readLine();
                    valor = Integer.parseInt(auxiliar);
                    if (valor < 0) {
                        System.err.println("\tError: el valor introducido debe ser mayor a cero.");
                    }
                } while (valor < 0);

            } catch (IOException | NumberFormatException e) {
                error = true;
                System.err.println("\tError en método leerIntMayorACero: formato del número no válido");
                System.out.println(e.getMessage());
            }
        } while (error);
        return valor;
    }

    //--------------------------------------------------------------------------
    //METODO PARA LEER ENTERO (INT) ENTRE X E Y
    //--------------------------------------------------------------------------
    /**
     * Método para almacenar un entero (Int) en una variable a través de un
     * String entre X e Y Usos: leerDia, Mes, Ano...
     * @param msj
     * @param x
     * @param y
     * @return
     */
    public static int leerIntEntreXeY(String msj, int x, int y) {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        String auxiliar;
        int valor = 0;
        boolean error;

        do {
            error = false;
            try {
                do {
                    System.out.print(msj);
                    auxiliar = teclado.readLine();
                    valor = Integer.parseInt(auxiliar);
                    if (valor < x || valor > y) {
                        System.err.println("\tError: el valor introducido no esta entre " + x + " y " + y);
                    }
                } while (valor < x || valor > y);

            } catch (IOException | NumberFormatException e) {
                error = true;
                System.err.println("\tError en método leerIntMayorACero: formato del número no válido");
                System.out.println(e.getMessage());
            }
        } while (error);
        return valor;
    }

    //--------------------------------------------------------------------------
    //METODO PARA LEER FLOAT (DECIMAL)
    //--------------------------------------------------------------------------
    /**
     * Método para almacenar un decimal (Float) en una variable a través de un
     * String.
     * @param msj
     * @return
     */
    public static float leerFloat(String msj) {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        String auxiliar;
        float valor = 0;
        boolean error;
        do {
            error = false;
            try {
                System.out.print(msj);
                auxiliar = teclado.readLine();
                valor = Float.parseFloat(auxiliar);
            } catch (IOException | NumberFormatException e) {
                error = true;
                System.err.println("\tError en método leerFloat: formato del número no válido");
                System.out.println(e.getMessage());
            }
        } while (error);
        return valor;
    }

    //--------------------------------------------------------------------------
    //METODO PARA LEER FLOAT (DECIMAL) MAYOR A CERO
    //--------------------------------------------------------------------------
    /**
     * Método para almacenar un decimal (Float) en una variable a través de un
     * String si es mayor o igual a cero.
     * @param msj
     * @return
     */
    public static float leerFloatMayorACero(String msj) {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        String auxiliar;
        float valor = 0;
        boolean error;

        do {
            error = false;
            try {
                do {
                    System.out.print(msj);
                    auxiliar = teclado.readLine();
                    valor = Float.parseFloat(auxiliar);
                    if (valor <= 0) {
                        System.err.println("\tError: el valor introducido debe ser mayor a cero.");
                    }
                } while (valor <= 0);

            } catch (IOException | NumberFormatException e) {
                error = true;
                System.err.println("\tError en método leerIntMayorACero: formato del número no válido");
                System.out.println(e.getMessage());
            }
        } while (error);
        return valor;
    }
    //--------------------------------------------------------------------------
    //METODO PARA LEER DECIMAL(FLOAT) ENTRE X E Y
    //--------------------------------------------------------------------------
    /**
     * Método para almacenar un entero (Int) en una variable a través de un
     * String entre X e Y Usos: leerDia, Mes, Ano...
     * @param msj
     * @param x
     * @param y
     * @return
     */
    public static float leerFloarEntreXeY(String msj, float x, float y) {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        String auxiliar;
        float valor = 0;
        boolean error;

        do {
            error = false;
            try {
                do {
                    System.out.print(msj);
                    auxiliar = teclado.readLine();
                    valor = Integer.parseInt(auxiliar);
                    if (valor < x || valor > y) {
                        System.err.println("\tError: el valor introducido no esta entre " + x + " y " + y);
                    }
                } while (valor < x || valor > y);

            } catch (IOException | NumberFormatException e) {
                error = true;
                System.err.println("\tError en método leerIntMayorACero: formato del número no válido");
                System.out.println(e.getMessage());
            }
        } while (error);
        return valor;
    }
    
    //--------------------------------------------------------------------------
    //METODO PARA LEER UN CHAR (LETRA O CARÁCTER)
    //--------------------------------------------------------------------------

    /**
     * Método para almacenar un char en una variable.
     * @param msj
     * @return
     */
    
    public static char leerLetra(String msj) {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        String cadena = "cadena";
        boolean error;
        do {
            error = false;
            try {
                System.out.print(msj);
                cadena = teclado.readLine();
            } catch (IOException e) {
                error = true;
                System.err.println("\tError en el método leerString");
                System.out.println(e.getMessage());
            }
        } while (error);
        return cadena.charAt(0);
    }
    
    //--------------------------------------------------------------------------
    //METODO PARA LEER LETRA ENTRE A y Z (CARÁCTER)
    //--------------------------------------------------------------------------

    /**
     * Método para almacenar un char en una variable entre A y Z.
     * @param msj
     * @param a
     * @param z
     * @return
     */
    public static char leerLetraEntreAYZ(String msj, char a, char z) {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        String cadena = "cadena";
        boolean error;
        do {
            error = false;
            try {
                System.out.print(msj);
                cadena = teclado.readLine();
            } catch (IOException e) {
                error = true;
                System.err.println("\tError en el método leerString");
                System.out.println(e.getMessage());
            }
        } while (error);
        return cadena.charAt(0);
    }
    
    
    //--------------------------------------------------------------------------
    //METODO PARA LEER STRING (CADENA DE TEXTO)
    //--------------------------------------------------------------------------
    /**
     * Método que muestra almacena un String en una variable.
     * @param msj
     * @return
     */
    public static String leerString(String msj) {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        String cadena = "cadena";
        boolean error;
        do {
            error = false;
            try {
                System.out.print(msj);
                cadena = teclado.readLine();
            } catch (IOException e) {
                error = true;
                System.err.println("\tError en el método leerString");
                System.out.println(e.getMessage());
            }
        } while (error);
        return cadena;
    }
    
    //--------------------------------------------------------------------------
    //METODO PARA LEER CADENA NO VACIA (STRING)
    //--------------------------------------------------------------------------
    /**
     * Método que muestra almacena un String en una variable.
     * @param msj
     * @return
     */
    public static String leerCadenaNoVacia(String msj) {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        String cadena = "cadena";
        boolean error;
        do {
            error = false;
            try {
                System.out.print(msj);
                cadena = teclado.readLine();
                if (cadena.isEmpty()) {
                    System.out.println("\tERROR no se puede dejar este campo vacío.");
                    error = true;
                }
            } catch (IOException e) {
                error = true;
                System.err.println("\tError en el método leerString");
                System.out.println(e.getMessage());
            }
        } while (error);
        return cadena;
    }
    
    //--------------------------------------------------------------------------
    //MÉTODO PARA LEER TELEFONO(STRING)
    //--------------------------------------------------------------------------
    /**
     * Método para leer un Telefono con 9 caracteres de longitud.
     * @param msj
     * @return
     */
     public static String leerTelefono(String msj) {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        String cadena = "cadena";
        cadena = cadena.strip();
        boolean longitud;
        do {
            longitud = false;
            try {
                System.out.print(msj);
                cadena = teclado.readLine();
                if (cadena.length() == 9) {
                    longitud = true;
                }
                if (!longitud) {
                    System.err.println("El formato no es correcto, el Telefono debe tener 9 caracteres");
                }

            } catch (IOException e) {
                System.err.println("\tError en el método leerTelefono");
                System.out.println(e.getMessage());
            }
        } while (!longitud);
        return cadena;
    }
     
    //--------------------------------------------------------------------------
    // VALIDA EL EMAIL INTRODUCIDO 
    //--------------------------------------------------------------------------
    /**
     * Valida un String, para que cumpla con los requisitos de un email
     * @return
     */
  public static String validarEmail() {    

        String email = "";
        boolean validado = false;

        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);

        do {
            System.out.println("Intoduce el email: ");

            try {
                email = teclado.readLine();
            } catch (IOException ex) {
                System.out.println("\tError: fallo en la lectura");
            }

            //Expresiones regulares para el formato del email
            // 
            String regex = "^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            boolean emailOK = matcher.matches();

            if (!emailOK){
                System.err.println("\tError: Formato de email incorrecto.");
            } else {
                validado = true;
            }
        } while (!validado);
        return email;
    }

  
    //--------------------------------------------------------------------------
    //MÉTODO PARA LEER UN DOUBLE (DECIMAL)
    //--------------------------------------------------------------------------
    /**
     * Método para almacenar un decimal (Double) en una variable a traves de un
     * String
     * @param msj
     * @return
     */
    public static double leerDouble(String msj) {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        String auxiliar;
        double valor = 0;
        boolean error;
        do {
            error = false;
            try {
                System.out.print(msj);
                auxiliar = teclado.readLine();
                valor = Double.parseDouble(auxiliar);
            } catch (IOException | NumberFormatException e) {
                System.err.println("\tError en método leerDouble");
                System.out.println(e.getMessage());
            }
        } while (error);
        return valor;
    }

    //--------------------------------------------------------------------------
    //METODO PARA DOUBLE (DECIMAL) ENTRE 0 Y 10
    //--------------------------------------------------------------------------
    /**
     * Método para almacenar un decimal (double) en una variable a través de un
     * String entre 0 y 10.
     * @param msj
     * @return
     */
    public static double leerDoubleEntre0y10(String msj) {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        String auxiliar;
        double valor = 0;
        boolean error;

        do {
            error = false;
            try {
                do {
                    System.out.print(msj);
                    auxiliar = teclado.readLine();
                    valor = Double.parseDouble(auxiliar);
                    if (valor < 0 || valor > 10) {
                        System.err.println("\tError: el valor introducido no esta entre 0 y 10.");
                    }
                } while (valor < 0 || valor > 10);

            } catch (IOException | NumberFormatException e) {
                error = true;
                System.err.println("\tError en método leerIntMayorACero: formato del número no válido");
                System.out.println(e.getMessage());
            }
        } while (error);
        return valor;
    }
  

    //--------------------------------------------------------------------------
    //MÉTODO PARA LEER UN STRING CON X NUMERO CARACTERES (STRING)
    //--------------------------------------------------------------------------
    /**
     * Método para leer un String con un x numero de caracteres.
     * @param msj
     * @param x
     * @return
     */
    public static String leerStringXlongitud(String msj, int x) {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        String cadena = "cadena";
        cadena = cadena.strip();
        boolean longitud;
        do {
            longitud = false;
            try {
                System.out.print(msj);
                cadena = teclado.readLine();
                if (cadena.length() == x) {
                    longitud = true;
                }
                if (!longitud) {
                    System.err.println("El formato no es correcto, el Telefono debe tener" + x + "caracteres");
                }

            } catch (IOException e) {
                System.err.println("\tError en el método leerString");
                System.out.println(e.getMessage());
            }
        } while (!longitud);
        return cadena;
    }
    //--------------------------------------------------------------------------
    //METODO PARA LEER UN CHAR (LETRA O CARÁCTER)
    //--------------------------------------------------------------------------

    /**
     * Método para almacenar un char en una variable.
     * @param msj
     * @return
     */
    
    public static char leerChar(String msj) {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        String cadena = "cadena";
        boolean error;
        do {
            error = false;
            try {
                System.out.print(msj);
                cadena = teclado.readLine();
            } catch (IOException e) {
                error = true;
                System.err.println("\tError en el método leerString");
                System.out.println(e.getMessage());
            }
        } while (error);
        return cadena.charAt(0);
    }

   
    //--------------------------------------------------------------------------
    //METODO PARA LEER UN Boolean por medio de un String SI o NO
    //--------------------------------------------------------------------------

    /**
     * Devuelve un boolean en true si escribe "SI o false si escribes "NO"
     * @param msj
     * @return
     */
    public static boolean leerSiNo(String msj) {
    InputStreamReader flujo = new InputStreamReader(System.in);
    BufferedReader teclado = new BufferedReader(flujo);
    String entrada;
    boolean error;
    boolean respuestaValida = false;

    do {
        try {
            System.out.print(msj);
            entrada = teclado.readLine();
            entrada = entrada.toUpperCase(); // Convertir a mayúsculas para comparación sin distinción de caso

            if (entrada.equals("SI") || entrada.equals("NO")) {
                respuestaValida = true;
                error = false;
                if (entrada.equals("NO")) {
                    respuestaValida = false;
                }
            } else {
                System.out.println("No válido, debe elegir entre [SI] o [NO]");
                error = true;
            }

        } catch (IOException e) {
            System.err.println("Error en el método leerStringSiNo");
            System.out.println(e.getMessage());
            error = true;
        }
    } while (error);

    // Devuelve true si la entrada es "SI", false si es "NO"
    return respuestaValida;
}
  
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
}
