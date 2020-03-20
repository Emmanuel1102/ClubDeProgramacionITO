import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.applet.Applet;

public class Principal extends JFrame{
	 //Distribucion que ayudara a crear la galeria
	 private CardLayout Imagenes;
	 
	 //Panel donde se colocan los labels (y en los labels van las imagenes)
	 private JPanel ap[]; 
	 private JLabel la[];
	
     // iconos de los botones para recorrer la galeria
	 ImageIcon atras1 = new ImageIcon("C:\\Users\\Emmanuel\\Desktop\\imagenesproyecto\\framespf\\atrasOne.png");
	 ImageIcon adelante1 = new ImageIcon("C:\\Users\\Emmanuel\\Desktop\\imagenesproyecto\\framespf\\adelanteOne.png");
	
     //Rutas donde estan las imagenes
	 private  String nImagenes []={
			 "C:\\Users\\Emmanuel\\Desktop\\imagenesproyecto\\framespf\\baner.jpg",
			 "C:\\Users\\Emmanuel\\Desktop\\imagenesproyecto\\framespf\\baner1.jpg",
			 "C:\\Users\\Emmanuel\\Desktop\\imagenesproyecto\\framespf\\GIF1.gif",
			 "C:\\Users\\Emmanuel\\Desktop\\imagenesproyecto\\framespf\\baner2.jpg",
			 "C:\\Users\\Emmanuel\\Desktop\\imagenesproyecto\\framespf\\baner3.jpg",
			 "C:\\Users\\Emmanuel\\Desktop\\imagenesproyecto\\framespf\\GIF2.gif",
			 "C:\\Users\\Emmanuel\\Desktop\\imagenesproyecto\\framespf\\baner4.jpg",
			 "C:\\Users\\Emmanuel\\Desktop\\imagenesproyecto\\framespf\\baner5.jpg",
			 "C:\\Users\\Emmanuel\\Desktop\\imagenesproyecto\\framespf\\GIF3.gif",
			 "C:\\Users\\Emmanuel\\Desktop\\imagenesproyecto\\framespf\\baner6.jpg",
			 "C:\\Users\\Emmanuel\\Desktop\\imagenesproyecto\\framespf\\baner7.jpg",
			 "C:\\Users\\Emmanuel\\Desktop\\imagenesproyecto\\framespf\\GIF4.gif",
			 "C:\\Users\\Emmanuel\\Desktop\\imagenesproyecto\\framespf\\baner8.jpg",
			 "C:\\Users\\Emmanuel\\Desktop\\imagenesproyecto\\framespf\\baner9.jpg",
			 "C:\\Users\\Emmanuel\\Desktop\\imagenesproyecto\\framespf\\GIF5.gif"};
	//agregando las imagenes al arreglo
	 private Icon  icons[]={new ImageIcon(nImagenes[0]),new ImageIcon(nImagenes[1]),new ImageIcon(nImagenes[2]),new ImageIcon(nImagenes[3]),new ImageIcon(nImagenes[4]),new ImageIcon(nImagenes[5]),new ImageIcon(nImagenes[6]),new ImageIcon(nImagenes[7]),new ImageIcon(nImagenes[8]), new ImageIcon(nImagenes[9]), new ImageIcon(nImagenes[10]), new ImageIcon(nImagenes[11]), new ImageIcon(nImagenes[12]),new ImageIcon(nImagenes[13]), new ImageIcon(nImagenes[14])};
	 //Inicializacion de nuestro arreglo de imagenes
	 int contar=0;
	 
	 Principal(){
		 
		//Construccion del entorno grafico
		JPanel cabecera;
		cabecera = new JPanel();
		cabecera.setBackground(new Color(0,0,0,10));
		cabecera.setBounds(0,0,1366,136);
		setTitle("www.cineito.com.mx");
		setSize(1366,768);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel Retro = new JPanel();
		Retro.setLayout(null);
		Retro.setBackground(Color.black);
		Retro.setBounds(0,0,110,127);

		JPanel BotonesArriba = new JPanel();
		BotonesArriba.setLayout(null);
		BotonesArriba.setBackground(new Color (0,0,0,100));
		BotonesArriba.setBounds(73,136,1225,50);
		
	
		JButton cartelera= new JButton("Cartelera");
		cartelera.setBackground(Color.decode("#B9090B"));
		cartelera.setBounds(1,1,1,1);
		cartelera.setSize(296,50);
		cartelera.setBorder(null);
		cartelera.setForeground(Color.white);
		BotonesArriba.add(cartelera);
	
		JButton dulceria= new JButton("Dulcería");
		dulceria.setBackground(Color.decode("#B9090B"));
		dulceria.setBounds(309,1,1,1);
		dulceria.setSize(314,50);
		dulceria.setBorder(null);
		dulceria.setForeground(Color.white);
		BotonesArriba.add(dulceria);
		
		////BotonOriginal
		JButton contacto= new JButton("Contacto");
		contacto.setBackground(Color.decode("#B9090B"));

		contacto.setBounds(630,1,1,1);
		contacto.setSize(314,50);
		contacto.setBorder(null);
		contacto.setForeground(Color.white);
		BotonesArriba.add(contacto);
		
		
		JButton mas= new JButton("Más");
		mas.setBackground(Color.decode("#B9090B"));
		mas.setBounds(950,1,1,1);
		mas.setSize(290,50);
		mas.setBorder(null);
		mas.setForeground(Color.white);
		BotonesArriba.add(mas);
		
		
		 JPanel botonAtras = new JPanel();
		 botonAtras.setLayout(null);
		 botonAtras.setBackground(new Color (0,0,0,100));
		 botonAtras.setBounds(73,370,51,87);
		

		JPanel botonAdelante = new JPanel();
		botonAdelante.setLayout(null);
		botonAdelante.setBackground(new Color (0,0,0,100));
		botonAdelante.setBounds(1245,370,51,87);
	
		
		JButton atras= new JButton("Atrás");
		atras.setBackground(Color.BLACK);
		atras.setBounds(1,1,1,1);
		atras.setSize(51,87);
		atras.setIcon(atras1);
		atras.setBorder(null);
		 botonAtras.add(atras);
		
		JButton adelante= new JButton("Adelante");
		adelante.setBackground(Color.BLACK);
		adelante.setBounds(1,1,1,1);
		adelante.setSize(51,87);
		adelante.setIcon(adelante1);
		adelante.setBorder(null);
		botonAdelante.add(adelante);

		JPanel reproducir= new JPanel();
		reproducir.setLayout(null);
		reproducir.setBackground(Color.decode("#B9090B"));
		reproducir.setBounds(1027,642,272,50);
		
        //usando cardlayout para usar un panel y mostrar las imagenes	
		Imagenes=new CardLayout(); 
		final JPanel ImagenPanel = new JPanel();
		ImagenPanel.setLayout(null);
		ImagenPanel.setBounds(132,200,1105,420);
		
		 la =new JLabel[ nImagenes.length]; 
		 ap=new JPanel[icons.length];   
		 ImagenPanel.setLayout(Imagenes);
        //algoritmo que añade paneles y etiquetas al arreglo	
		 for(int z=0; z<nImagenes.length;z++){
			    la[z]=new JLabel(icons[z]); 
			    ap[z ]=new JPanel(); 
			    ap[z].add(la[z]);
			    ap[z].setBackground(Color.BLACK);
			    ImagenPanel.add(ap[z],String.valueOf(z));
			}
         //añadiendo la funcion a lo botones que recorre el arreglo nImagenes
		 adelante.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent arg0) {
			 if (contar < nImagenes.length) {
			 contar += 1;
			 Imagenes.show( ImagenPanel,"" + (contar));
			 }
			 }
			 });
			
			 atras.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent arg0) {
			 if (contar > 0) {
			 contar -= 1;
			 Imagenes.show( ImagenPanel, "" + (contar));
			 }
			 
			 
			 }
			 });
	    //Colocando una imagen de fondo y dandole propiedades
		ImageIcon background_imagen= new ImageIcon("C:\\Users\\Emmanuel\\Desktop\\imagenesproyecto\\framespf\\nuevo1.jpg");
		Image fondo = background_imagen.getImage();
		Image temp_img = fondo.getScaledInstance(1366,768,Image.SCALE_SMOOTH);
		background_imagen = new ImageIcon(temp_img);
		JLabel background = new JLabel("",background_imagen,JLabel.CENTER);
		//Añadiendo los componentes a nuestro panel
		background.add(cabecera);
		background.add(BotonesArriba);
		background.add( botonAtras);
		background.add(botonAdelante);
		background.add( ImagenPanel);
		background.add(reproducir);
		background.add(Retro);
		background.setBounds(0,0,1366,768);
		add(background );
		setVisible(true);	
	}
public static void main(String[] args) {
new Principal();
}	
}
