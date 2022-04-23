package vista;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PantallaPrincipal extends JFrame{
	
	private BorderLayout layoutPrincipal;
	
	public PantallaPrincipal() {
		this.setSize(500, 500);
		this.setTitle("LightsOut");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		Contador contador = new Contador();
		this.add(contador, BorderLayout.SOUTH);
		
		Juego juego = new Juego();
		this.add(juego, BorderLayout.WEST);
		
		PanelConfiguraciones configuraciones = new PanelConfiguraciones();
		this.add(configuraciones, BorderLayout.NORTH);
		
		PanelMenu menu = new PanelMenu();
		this.add(menu, BorderLayout.EAST);
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		PantallaPrincipal pPrincipal = new PantallaPrincipal();
		pPrincipal.setVisible(true);
	}

}
