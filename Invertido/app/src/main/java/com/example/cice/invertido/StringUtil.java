package com.example.cice.invertido;

/**
 * Created by vale on 11/05/16.
 */
public class StringUtil {

    public static String mensajeSalida (String nombre)
    {
        String mensaje = null;
        String nombreInvertido = "";

        for (int x=nombre.length()-1;x>=0;x--)
            nombreInvertido = nombreInvertido + nombre.charAt(x);


            mensaje = "El nombre invertido es: " + nombreInvertido;

        return mensaje;
    }
}
