/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.controlador;

import java.util.*;
import java.io.*;

/**
 *
 * @author Adolfo
 */
public class ControladorDirectorio {

    private String ruta;
    private File archivo;
    private File[] archivos;
    private List<String> lista;

    public ControladorDirectorio() {
        lista = new ArrayList<>();
    }

    /**
     *
     * @param ruta
     * @return
     */
    public List<String> listarArchivos(String ruta) {
        archivo = new File(ruta);
        archivos = archivo.listFiles();

        for (File elemento : archivos) {
            lista.add(elemento.getName());
        }

        return lista;
    }

    public List<String> listarArchivosOcultos(String ruta) {

        archivo = new File(ruta);
        archivos = archivo.listFiles();

        for (File elemento : archivos) {
            if (elemento.isHidden() && elemento.isFile()) {
                lista.add(elemento.getName());
            }
        }

        for (File elemento : archivos) {
            if (elemento.isDirectory()) {
                File[] subdirectorios = elemento.listFiles();
                for (File subelemento : subdirectorios) {
                    if (subelemento.isHidden()) {
                        lista.add(elemento.getName());
                    }

                }

            }
        }

        return lista;
    }

    public List<String> listarDirectoriosOcultos(String ruta) {

        archivo = new File(ruta);
        archivos = archivo.listFiles();

        for (File elemento : archivos) {
            if (elemento.isHidden() && elemento.isDirectory()) {
                lista.add(elemento.getName());
            }
        }
        return lista;
    }

}
