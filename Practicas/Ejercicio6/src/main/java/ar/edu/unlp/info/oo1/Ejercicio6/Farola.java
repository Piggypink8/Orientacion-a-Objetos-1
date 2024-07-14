package ar.edu.unlp.info.oo1.Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	private boolean luz = false;
	private List<Farola> farolas;
	
	public Farola() {
		this.farolas = new ArrayList<Farola>();
	}
	
	public void pairWithNeighbor(Farola farola) {
		if(!this.farolas.contains(farola)) {
			this.farolas.add(farola);
			farola.pairWithNeighbor(this);
		}
	}
	
	public List<Farola> getNeighbors(){
		return this.farolas;
	}
	
	public boolean isOn() {
		return this.luz;
	}
	
	public void turnOn() {
		if(!this.isOn()) {
			this.luz = true;
			
			for(Farola f : this.farolas) {
				f.turnOn();
				System.out.println("Se encendió la farola");
			}
			
		}
		
	}
	
	public void turnOff() {
		if(this.isOn()) {
			this.luz = false;
			for(Farola f : this.farolas) {
				f.turnOff();
				System.out.println("Se apagó la farola");
			}
		}
		
	}
}
