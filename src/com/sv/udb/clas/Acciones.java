/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clas;

import java.util.Timer;
import java.util.TimerTask;
import com.sv.udb.forms.frmTablero;

/**
 *
 * @author Estudiante
 */

public class Acciones {
    Timer timer = new Timer(); // El timer que se encarga de administrar los tiempo de repeticion
	public int segundos; // manejar el valor del contador
	public boolean frozen; // manejar el estado del contador TIMER AUTOMATICO -- True Detenido | False Corriendo
 
	// clase interna que representa una tarea, se puede crear varias tareas y asignarle al timer luego
	class MiTarea extends TimerTask {
		public void run() {
			segundos++;
			System.out.println(segundos);
			// aqui se puede escribir el codigo de la tarea que necesitamos ejecutar
		}// end run()
	}// end SincronizacionAutomatica
 
	public void Start(int pSeg) throws Exception {
		frozen = false;
		// le asignamos una tarea al timer
		timer.schedule(new MiTarea(), 0, pSeg * 1000);
	}// end Start
 
	public void Stop() {
		System.out.println("Stop");
		frozen = true;
	}// end Stop
 
    public void Reset() {
		System.out.println("Reset");
		frozen = true;
		segundos = 0;
	}// end Reset
}
