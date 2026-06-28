package GUI;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Logica.ISistema;
import Logica.Sistema;

public class Ventana {
	private static Sistema sistema = Sistema.getInstancia();
	private static JPanel panelCentral = new JPanel();
	
	
	public static void iniciar() {
        JFrame ventana = new JFrame("Pokemon");
        ventana.setSize(800, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.getContentPane().add(createGUI());
        ventana.setVisible(true);
        System.out.println("dou");
    }
	
	private static JPanel createGUI() {
		JPanel mainPanel = new JPanel(new BorderLayout());
		
		JPanel botonera= new JPanel();
        botonera.setLayout(new BoxLayout(botonera, BoxLayout.X_AXIS)); 
        
        JButton admin = crearBotonAdmin();
        JButton colecciones = crearBotonColeccion();
        
        botonera.add(admin);
        botonera.add(colecciones);
        
        mainPanel.add(botonera, BorderLayout.NORTH);
        mainPanel.add(panelCentral, BorderLayout.CENTER);
        
        return mainPanel;
        

	}

	private static JButton crearBotonColeccion() {
		JButton b = new JButton("Administración");
        b.addActionListener(e -> mostrarPanelAdmin());
        return b;
		
	}
	
	private static JButton crearBotonAdmin() {
		JButton b = new JButton("Ver Colección");
        b.addActionListener(e -> mostrarPanelColeccion());
        return b;
	}

	private static void mostrarPanelAdmin() {
		panelCentral.removeAll();
        panelCentral.add(crearPanelAdmin());
        panelCentral.revalidate();
        panelCentral.repaint();
	}

	

	private static void mostrarPanelColeccion() {
		panelCentral.removeAll();
        panelCentral.add(crearPanelColeccion());
        panelCentral.revalidate();
        panelCentral.repaint();
	}
	
	private static JPanel crearPanelAdmin() {
        JPanel panel = new JPanel();
        return panel;
    }

    private static JPanel crearPanelColeccion() {
        JPanel panel = new JPanel();
        return panel;
    }
	
	
}
