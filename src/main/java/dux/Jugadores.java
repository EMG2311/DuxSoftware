package dux;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Jugadores {
	private String nombre;
	private int puntos;
	private int SetsGanados;
	private Integer puntoTeabreak;
	private Integer gamesGanados;
	private boolean saca;
	private double probabilidadDeGanar;
	private List<Integer> puntosSets= new ArrayList<Integer>();
	private List<Integer> puntosTeabreak= new ArrayList<Integer>();

	public void cargarPuntosSets(int setActual) {
		puntosSets.add(setActual, this.gamesGanados);
	}
	public List<Integer> getPuntosSets() {
		return puntosSets;
	}
	public void setPuntosSets(ArrayList<Integer> puntosSets) {
		this.puntosSets = puntosSets;
	}
	public Jugadores() {
		puntos=0;
		SetsGanados=0;
		gamesGanados=0;
		saca=false;
		puntoTeabreak=0;
	}
	public Jugadores(Jugadores jugador) {
		this.nombre=jugador.getNombre();
		this.gamesGanados=jugador.getGamesGanados();
		this.probabilidadDeGanar=jugador.getProbabilidadDeGanar();
		this.puntos=jugador.getPuntos();
		this.saca=jugador.getSaca();
		this.SetsGanados=jugador.getSetsGanados();
		this.puntoTeabreak=jugador.getPuntoTeabreak();
	}
	public Jugadores(String nombre) {
		super();
		this.nombre = nombre;
		puntos=0;
		SetsGanados=0;
		gamesGanados=0;
		saca=false;
		puntoTeabreak=0;
	}

	public Integer getPuntoTeabreak() {
		return puntoTeabreak;
	}
	public void setPuntoTeabreak(Integer puntoTeabreak) {
		this.puntoTeabreak = puntoTeabreak;
	}
	public void sumarPuntoTeabreak() {
		puntoTeabreak+=1;
	}

	public void setSaca(boolean saca) {
		this.saca = saca;
	}
	public boolean getSaca() {
		return saca;
	}

	public Integer getGamesGanados() {
		return gamesGanados;
	}

	public void setGamesGanados(Integer gamesGanados) {
		this.gamesGanados = gamesGanados;
	}

	public int getSetsGanados() {
		return SetsGanados;
	}

	public List<Integer> getPuntosTeabreak() {
		return puntosTeabreak;
	}
	public void setPuntosTeabreak(List<Integer> puntosTeabreak) {
		this.puntosTeabreak = puntosTeabreak;
	}
	public void cargarPuntosTeabreak(int setActual) {
		puntosTeabreak.add(setActual, this.puntoTeabreak);
	}
	public void setSetsGanados(int setsGanados) {
		SetsGanados = setsGanados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void cargarNombre() {
		this.nombre=(JOptionPane.showInputDialog("Ingrese nombre del jugador"));
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public double getProbabilidadDeGanar() {
		return probabilidadDeGanar;
	}

	public void setProbabilidadDeGanar(double probabilidadDeGanar) {
		this.probabilidadDeGanar = probabilidadDeGanar;
	}
	public void sumarPunto() {
		if(this.puntos==30) {
			puntos+=10;
		}else {
			puntos+=15;
		}
	}
	public void SumarSet() {
		SetsGanados+=1;
	}

	public void sumarGame() {

		gamesGanados=gamesGanados+1;
	}

	public void restarPunto() {
		if(this.puntos>=30 &&this.puntos<=40) {
			puntos-=10;
		}
		else {
			puntos-=15;
		}
	}
	public void reiniciarPersonaje(){
		this.puntos=0;
		this.puntosSets.clear();
		this.gamesGanados=0;
		this.SetsGanados=0;
		this.puntosTeabreak.clear();
		this.puntoTeabreak=0;
	}

}