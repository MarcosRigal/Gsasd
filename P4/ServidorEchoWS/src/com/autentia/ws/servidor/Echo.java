package com.autentia.ws.servidor;
/**
 * <p>
 * Echo.java <br/> Clase que implementa la logica de nuestro web service
 * </p>
 * 
 * 
 * @author Ivan Garcia Puebla - www.autentia.com
 * @version 1.0
 */
public class Echo {
/**
	 * Metodo que implementa la funcionalidad de saludo
	 * 
	 * @param nombre
	 *            Nombre de la persona que invoca el servicio
	 * @return Cadena de saludo
	 */
	public String saludar(String nombre) {
		return "Hola " + nombre;
	}
/**
	 * 
	 * Metodo que implementa la funcionalidad de despedida
	 * 
	 * @param nombre
	 *            Nombre de la persona que invoca el servicio
	 * @return Cadena de despedida
	 */
	public String despedir(String nombre) {
		return "Adios " + nombre;
	}
 
}
