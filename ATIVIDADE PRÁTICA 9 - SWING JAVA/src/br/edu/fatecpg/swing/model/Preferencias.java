package br.edu.fatecpg.swing.model;

import java.awt.Color;

public class Preferencias {
	private Color colorBg;
	private Color colorFg;
	
	public Preferencias(Color colorBg, Color colorFg) {
		this.colorBg = colorBg;
		this.colorFg = colorFg;
	}

	public Color getColorBg() {
		return colorBg;
	}

	public void setColorBg(Color colorBg) {
		this.colorBg = colorBg;
	}

	public Color getColorFg() {
		return colorFg;
	}

	public void setColorFg(Color colorFg) {
		this.colorFg = colorFg;
	}
	
}
