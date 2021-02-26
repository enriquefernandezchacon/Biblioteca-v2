/**
 * 
 */
package org.iesalandalus.programacion.biblioteca.mvc.modelo;

import org.iesalandalus.programacion.biblioteca.mvc.modelo.negocio.*;
/**
 * @author Enrique
 *
 */
public interface IFuenteDatos {
	
	IAlumnos crearAlumnos();
	ILibros crearLibros();
	IPrestamos crearPrestamos();
	
}
