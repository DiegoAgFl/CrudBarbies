

import javax.swing.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.*;
import java.io.IOException;

public class MainFrame implements ActionListener{
	ArrayList<Barbie> barbieslist = new ArrayList();
	CrudBarbies Crud2 = new CrudBarbies();
	JFrame ventana = new JFrame("Barbies Diego Aguilar Flores 3IV8");
	JPanel paneldeventana, panel1 ,panelDatos;
	boolean tryAndcatch = true,bcaso1 = true,bcaso2 = true;
	String caso, caracteriztica1, caracteriztica2;
	String lenguajes, gafas, mascota, partido, cohete, Tripulacion, firma, pintura;
	int cedula, Nodespensa;
	
	//Primer paneñ
	private JLabel label1, label2 ,label3;
	private JLabel imgProgramadora, imgVeterinaria, imgAcarreada, imgPintora, imgAstronauta;
	private JButton btnProgramadora, btnVeterinaria, btnPRI, btnPintora, btnAstronauta, btnRegresar,btnMostrar;
	private ImageIcon iconoProgramadora,iconoVeterinaria,iconoAcarreada,iconoPintora,iconoAstronauta;
	
	
	private JTextField txtNombre, txtEdad, txtCar1, txtCar2,txtEliminar;
	private JLabel lblNombre, lblEdad, lblCar1, lblCar2 ,lbl1,lblEliminar;
	private JButton btnRegistrar,btnActualizar,btnEliminar, bCancelar,btnRemover;
	private String nombre, texto1,texto2,textoEliminar;
	private int edad;

	
	private JButton bPmAgregar;
	
	
	private JButton bVtAgregar;
	
	
	private JButton bPRIAgregar;
	
	
	private JButton bAtAgregar;
	
	
	private JButton bAStAgregar;
	

	private void Panel1(JPanel Panel) {
		Panel.setLayout(null);
		ventana.setBackground(Color.pink);
		ventana.add(Panel);
		Panel.setBackground(Color.pink);
		label1 = new JLabel("Bienvenido al sistema de barbies, elija una opcion.");
		label1.setBounds(10, 10, 690, 25);
		Panel.add(label1);
		label2 = new JLabel("Elija que tipo de barbie quiere modificar:");
		label2.setBounds(10,40,690,25);
		Panel.add(label2);
		label3 = new JLabel("Muestra todas las barbies, su nombre y que son");
		label3.setBounds(270,600,690,25);
		Panel.add(label3);
		btnProgramadora = new JButton("Programadora");
		btnProgramadora.setBounds(150,300,125,30);
		Panel.add(btnProgramadora);
		btnProgramadora.addActionListener(this);		
		btnVeterinaria = new JButton("Veterinaria");
		btnVeterinaria.setBounds(395,300,125,30);
		Panel.add(btnVeterinaria);
		btnVeterinaria.addActionListener(this);	
		btnPRI = new JButton("Acarreada");
		btnPRI.setBounds(650,300,125,30);
		Panel.add(btnPRI);
		btnPRI.addActionListener(this);	
		btnPintora = new JButton("Pintora");
		btnPintora.setBounds(520,500,125,30);
		Panel.add(btnPintora);
		btnPintora.addActionListener(this);	
		btnAstronauta = new JButton("Astronauta");
		btnAstronauta.setBounds(270,500,125,30);
		Panel.add(btnAstronauta);
		btnAstronauta.addActionListener(this);
		iconoProgramadora = new ImageIcon((getClass().getResource("BarbieProgramadora.jpg")));
		imgProgramadora = new JLabel();
		imgProgramadora = cargarImagen(iconoProgramadora);
		imgProgramadora.setBounds(150,99,125,200);
		Panel.add(imgProgramadora);
		iconoVeterinaria = new ImageIcon((getClass().getResource("BarbieVeterinaria.jpg")));
		imgVeterinaria = new JLabel();
		imgVeterinaria = cargarImagen(iconoVeterinaria);
		imgVeterinaria.setBounds(395,99,125,200);
		Panel.add(imgVeterinaria);
		iconoAcarreada = new ImageIcon((getClass().getResource("Acarreada.jpg")));
		imgAcarreada = new JLabel();
		imgAcarreada= cargarImagen(iconoAcarreada);
		imgAcarreada.setBounds(650,99,125,200);
		Panel.add(imgAcarreada);
		iconoAstronauta= new ImageIcon((getClass().getResource("Astronauta.jpg")));
		imgAstronauta = new JLabel();
		imgAstronauta = cargarImagen(iconoAstronauta);
		imgAstronauta.setBounds(270,300,125,200);
		Panel.add(imgAstronauta);
		iconoPintora= new ImageIcon((getClass().getResource("BarbiePintora.jpg")));
		imgPintora = new JLabel();
		imgPintora= cargarImagen(iconoPintora);
		imgPintora.setBounds(520,300,125,200);
		Panel.add(imgPintora);
		
		btnMostrar = new JButton("Mostrar barbies registradas");
		btnMostrar.setBounds(580,600,200,30);
		Panel.add(btnMostrar);
		btnMostrar.addActionListener(this);
		
		Panel.updateUI();
		
	
	}

	
	private void panelDatos(JPanel Panel) {
		Panel.setLayout(null);
		ventana.add(Panel);
		Panel.setBackground(Color.pink);
		ventana.setBackground(Color.pink);
		lbl1 = new JLabel("Elija la accion que quiere realizar: ");
		lbl1.setBounds(10,40,690,20);
		Panel.add(lbl1);
		//registrar
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(20,80,130,30);
		Panel.add(btnRegistrar);
		btnRegistrar.addActionListener(this);
		lblNombre = new JLabel("Ingresa el nombre de la barbie " + caso + ": ");
		lblNombre.setBounds(300, 75, 400, 10);
		lblNombre.setVisible(false);
		Panel.add(lblNombre);
		txtNombre = new JTextField();
		txtNombre.setBounds(300, 90, 400, 30);
		txtNombre.setVisible(false);
		Panel.add(txtNombre);
		lblEdad = new JLabel("Ingrese la edad de la barbie "+ caso + ": ");
		lblEdad.setBounds(300,135,400,10);
		lblEdad.setVisible(false);
		Panel.add(lblEdad);
		txtEdad = new JTextField();
		txtEdad.setBounds(300,150,400,30);
		txtEdad.setVisible(false);
		Panel.add(txtEdad);
		lblCar1 = new JLabel("Ingrese " + caracteriztica1 + " :");
		lblCar1.setBounds(300,195,400,10);
		lblCar1.setVisible(false);
		Panel.add(lblCar1);
		txtCar1 = new JTextField();
		txtCar1.setBounds(300,210,400,30);
		txtCar1.setVisible(false);
		Panel.add(txtCar1);
		lblCar2 = new JLabel("Ingrese " + caracteriztica2 + " :");
		lblCar2.setBounds(300,255,400,10);
		lblCar2.setVisible(false);
		Panel.add(lblCar2);
		txtCar2 = new JTextField();
		txtCar2.setBounds(300,270,400,30);
		txtCar2.setVisible(false);
		Panel.add(txtCar2);
		bPmAgregar = new JButton("Agregar");
		bPmAgregar.setBounds(580,450,200,30);
		bPmAgregar.setVisible(false);
		bPmAgregar.addActionListener(this);
		Panel.add(bPmAgregar);
		bVtAgregar = new JButton("Agregar");
		bVtAgregar.setBounds(580,450,200,30);
		bVtAgregar.setVisible(false);
		bVtAgregar.addActionListener(this);
		Panel.add(bVtAgregar);
		bPRIAgregar = new JButton("Agregar");
		bPRIAgregar.setBounds(580,450,200,30);
		bPRIAgregar.setVisible(false);
		bPRIAgregar.addActionListener(this);
		Panel.add(bPRIAgregar);		
		bAStAgregar = new JButton("Agregar");
		bAStAgregar.setBounds(580,450,200,30);
		bAStAgregar.setVisible(false);
		bAStAgregar.addActionListener(this);
		Panel.add(bAStAgregar);
		bAtAgregar = new JButton("Agregar");
		bAtAgregar.setBounds(580,450,200,30);
		bAtAgregar.setVisible(false);
		bAtAgregar.addActionListener(this);
		Panel.add(bAtAgregar);
		
		//Eliminiar
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(20,180,132,30);
		Panel.add(btnEliminar);
		btnEliminar.addActionListener(this);
		lblEliminar = new JLabel(textoEliminar);
		lblEliminar.setBounds(300, 75, 400, 10);
		lblEliminar.setVisible(false);
		Panel.add(lblEliminar);
		txtEliminar = new JTextField();
		txtEliminar.setBounds(300, 90, 400, 30);
		txtEliminar.setVisible(false);
		Panel.add(txtEliminar);
		btnRemover = new JButton("Remover");
		btnRemover.setBounds(580,450,200,30);
		btnRemover.setVisible(false);
		btnRemover.addActionListener(this);
		Panel.add(btnRemover);
		//Regresar
		btnRegresar = new JButton("Regresar");
		btnRegresar.setBounds(20,500,132,30);
		Panel.add(btnRegresar);
		btnRegresar.addActionListener(this);
		//Cancelar
		bCancelar = new JButton("Cancelar");
		bCancelar.setBounds(360,450,200,30);
		bCancelar.setVisible(false);
		Panel.add(bCancelar);
		bCancelar.addActionListener(this);
		
		
		Panel.updateUI();
	}
	

	private JLabel cargarImagen(ImageIcon icon){
		Image img = icon.getImage();
		Image nuevaImagen = img.getScaledInstance(132, 200, java.awt.Image.SCALE_SMOOTH);
		Icon nuevoIcono = new ImageIcon(nuevaImagen);
		JLabel lbl = new JLabel();
		lbl.setIcon(nuevoIcono); 
	
		return lbl;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnProgramadora) {
			panel1.setVisible(false);
			caso = "programadora";
			caracteriztica1 = "los lenguajes que maneja";
			caracteriztica2 = "los lentes que usa";
			textoEliminar = "Ingrese el nombre de la programadora a eliminar:";
			panelDatos = new JPanel();
			panelDatos(panelDatos);
			ventana.validate();
		}else if(e.getSource() == btnVeterinaria) {
			panel1.setVisible(false);
			caso = "veterinaria";
			caracteriztica1 = "el animal que cuida";
			caracteriztica2 = "su cedula profesional";
			textoEliminar = "Ingrese la cedula de la veterinaria a eliminar:";
			panelDatos = new JPanel();
			panelDatos(panelDatos);
			ventana.validate();
		}else if(e.getSource() == btnPRI) {
			panel1.setVisible(false);
			caso = "acarreada";
			caracteriztica1 = "el partido que apoya";
			caracteriztica2 = "el numero de su despensa";
			textoEliminar = "Ingrese el numero de despensa de la acarreada a eliminar";
			panelDatos = new JPanel();
			panelDatos(panelDatos);
			ventana.validate();
		}else if(e.getSource() == btnPintora) {
			panel1.setVisible(false);
			caso = "pintora";
			caracteriztica1 = "firma";
			caracteriztica2 = "su pintura mas famosa";
			textoEliminar = "Ingrese como firma la pintora a eliminar:";
			panelDatos = new JPanel();
			panelDatos(panelDatos);
			ventana.validate();
		}else if(e.getSource() == btnAstronauta) {
			panel1.setVisible(false);
			caso = "Astronauta";
			caracteriztica1 = "el cohete que maneja";
			caracteriztica2 = "la Tripulacion del cohete";
			textoEliminar = "Ingrese el nombre de la Astronauta a eliminar:";
			panelDatos = new JPanel();
			panelDatos(panelDatos);
			ventana.validate();
		}else if(e.getSource() == btnMostrar){
			try {
				barbieslist = Crud2.leerBarbies();
				if(barbieslist.size() == 0) {
					JOptionPane.showMessageDialog(ventana, "no se ha registrado ninguna barbie");
				}
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(ventana, "Ha ocurrido un error");
			}
			for(int i = 0; i < barbieslist.size(); i++) {
				
				Barbie b = barbieslist.get(i);

				if(b.tipobarbie() == "Programadora") {
					Programadora p = (Programadora) barbieslist.get(i);
					JOptionPane.showMessageDialog(ventana, "Barbie " + (i+1) + "\n" + "Nombre: " + b.getNombre() + "\n" + "Edad: " + b.getEdad() 
				+ "\n" + "Lenguajes que maneja: " + p.getFullstack() + "\n"+ "Los lentes que usa son: " + p.getLentes() + "\n" +"Oficio: " + b.tipobarbie());
				}else if(b.tipobarbie() == "Veterinaria") {
					Veterinaria v = (Veterinaria) barbieslist.get(i);
					JOptionPane.showMessageDialog(ventana, "Barbie " + (i+1) + "\n" + "Nombre: " + b.getNombre() + "\n" + "Edad: " + b.getEdad() 
				+ "\n" + "Mascota que cuida: " + v.getAnimalito() + "\n"+ "Su cedula profesional es: " + v.getCedulaprofesional() + "\n" +"Oficio: " + b.tipobarbie());
				}else if(b.tipobarbie() == "Acarreada") {
					Acarreada P = (Acarreada) barbieslist.get(i);
					JOptionPane.showMessageDialog(ventana, "Barbie " + (i+1) + "\n" + "Nombre: " + b.getNombre() + "\n" + "Edad: " + b.getEdad() 
				+ "\n" + "Partido que apoya: " + P.getPartido() + "\n"+ "Numero de su despensa: " + P.getN_Despensa() + "\n" +"Oficio: " + b.tipobarbie());
				}else if(b.tipobarbie() == "Pintora") {
					Pintora a = (Pintora) barbieslist.get(i);
					JOptionPane.showMessageDialog(ventana, "Barbie " + (i+1) + "\n" + "Nombre: " + b.getNombre() + "\n" + "Edad: " + b.getEdad() 
				+ "\n" + "Firma: " + a.getFirma() + "\n"+ "Cuadro famoso: " + a.getCuadroFamoso() + "\n" +"Oficio: " + b.tipobarbie());
				}else if(b.tipobarbie() == "Astronauta") {
					Astronauta c = (Astronauta) barbieslist.get(i);
					JOptionPane.showMessageDialog(ventana, "Barbie " + (i+1) + "\n" + "Nombre: " + b.getNombre() + "\n" + "Edad: " + b.getEdad() 
				+ "\n" + "Cohete que tripula: " + c.getCohete() + "\n"+ "Tripulacion a la que pertenece: " + c.getTripulacion() + "\n" +"Oficio: " + b.tipobarbie());
				}
				
			}
			
		}else if(e.getSource() == btnRegresar) {
			panel1.setVisible(true);
			ventana.remove(panelDatos);
		}
		
		
		if(e.getSource() == btnRegistrar) {
			mostrarDatosRegistro();
			
		}else if(e.getSource() == bPmAgregar) {
			recuperaDatos();
			if(tryAndcatch && SoloLetras(txtNombre.getText()) && bcaso1 && bcaso2) {
				
				Programadora p = new Programadora(lenguajes,gafas,nombre,edad);
				try {
					Crud2.agregarProgramadora(p);
				} catch (ClassNotFoundException | IOException e1) {
					JOptionPane.showMessageDialog(ventana, "ERROR ");
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(ventana, "Se agrego a la programadora, que tiene de datos: " + "\n" + "Nombre: " + nombre + "\n" + "Edad: " + edad 
						+ "\n" + "Lenguajes que maneja: " + lenguajes + "\n" + "Lentes que utiliza: " + gafas);
				ocultarRegistro();
			}else {
				JOptionPane.showMessageDialog(ventana, "Dato no valido");
			}
		}else if(e.getSource() == bVtAgregar) {
			recuperaDatos();
			if(tryAndcatch && SoloLetras(txtNombre.getText()) && bcaso1 && bcaso2) {
				Veterinaria v = new Veterinaria(cedula,mascota,nombre,edad);
				try {
					Crud2.agregarVeterinaria(v);
				} catch (ClassNotFoundException | IOException e1) {
					JOptionPane.showMessageDialog(ventana, "ERROR ");
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(ventana, "Se agrego a la veterinaria, que tiene de datos: " + "\n" + "Nombre: " + nombre + "\n" + "Edad: " + edad 
						+ "\n" + "Animal que cuida: " + mascota + "\n" + "Cedula profesional: " + cedula);
				ocultarRegistro();
			}else {
				JOptionPane.showMessageDialog(ventana, "Dato no valido");
			}
		}else if(e.getSource() == bPRIAgregar) {
			recuperaDatos();
			if(tryAndcatch && SoloLetras(txtNombre.getText()) && bcaso1 && bcaso2) {
				Acarreada P = new Acarreada(partido,Nodespensa,nombre,edad);
				try {
					Crud2.agregarAcarreada(P);
				} catch (ClassNotFoundException | IOException e1) {
					JOptionPane.showMessageDialog(ventana, "ERROR ");
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(ventana, "Se agrego a la acarreada, que tiene de datos: " + "\n" + "Nombre: " + nombre + "\n" + "Edad: " + edad 
						+ "\n" + "Partido que apoya: " + partido + "\n" + "Numero de despensa entregada: " + Nodespensa);
				ocultarRegistro();
			}else {
				JOptionPane.showMessageDialog(ventana, "Dato no valido");
			}
		}else if(e.getSource() == bAtAgregar) {
			recuperaDatos();
			Pintora a = new Pintora(firma,pintura,nombre,edad);
			try {
				Crud2.agregarPintora(a);
			} catch (ClassNotFoundException | IOException e1) {
				JOptionPane.showMessageDialog(ventana, "ERROR ");
				e1.printStackTrace();
			}
			if(tryAndcatch && SoloLetras(txtNombre.getText()) && bcaso1 && bcaso2) {
				JOptionPane.showMessageDialog(ventana, "Se agrego a la pintora, que tiene de datos: " + "\n" + "Nombre: " + nombre + "\n" + "Edad: " + edad 
						+ "\n" + "Firma caracteriztica: " + firma + "\n" + "Cuadro más famosos: " + pintura);
				ocultarRegistro();
			}else {
				JOptionPane.showMessageDialog(ventana, "Dato no valido");
			}
		}else if(e.getSource() == bAStAgregar) {
			recuperaDatos();
			Astronauta a = new Astronauta(cohete,Tripulacion,nombre,edad);
			try {
				Crud2.agregarAstronauta(a);
				} catch (ClassNotFoundException | IOException e1) {
				JOptionPane.showMessageDialog(ventana, "ERROR ");
				e1.printStackTrace();
			}
			if(tryAndcatch && SoloLetras(txtNombre.getText()) && bcaso1 && bcaso2) {
				JOptionPane.showMessageDialog(ventana, "Se agrego a la astronauta, que tiene de datos: " + "\n" + "Nombre: " + nombre + "\n" + "Edad: " + edad 
						+ "\n" + "Cohete que tripula: " + cohete + "\n" + "Tripulacion: " + Tripulacion);
				ocultarRegistro();
			}else {
				JOptionPane.showMessageDialog(ventana, "Dato no valido");
			}
		}else if(e.getSource() == bCancelar) {
			ocultarRegistro();
		}else if(e.getSource() == btnActualizar) {
			JOptionPane.showMessageDialog(ventana, "Actualizar no disponible de momento");
		}else if(e.getSource() == btnEliminar) {
			
			txtEliminar.setVisible(true);
			lblEliminar.setVisible(true);
			btnRemover.setVisible(true);
			btnRegistrar.setEnabled(false);
			btnEliminar.setEnabled(false);
			bCancelar.setVisible(true);
		}else if(e.getSource() == btnRemover) {
			
			if(caso.equals("programadora")) {
				if(SoloLetras(txtEliminar.getText())) {
					Programadora eliminar = new Programadora();
					try {
						eliminar = Crud2.buscarProgramadora(txtEliminar.getText());
					} catch (ClassNotFoundException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if(eliminar.getNombre() == null) {
						JOptionPane.showMessageDialog(ventana, "No se a encontrado esta barbie");
					}else{
						try {
							Crud2.eliminarProgramadora(eliminar);
							JOptionPane.showMessageDialog(ventana, "Se elimino la programadora: " + eliminar.getNombre());
						} catch (ClassNotFoundException | IOException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(ventana, "No se pudo eliminar");
						}
					}
				}else{
					JOptionPane.showMessageDialog(ventana, "Dato no valido");
				}
			}else if(caso.equals("veterinaria")) {
				boolean pasar = true;
				int cedulita = 0;
				try {
					cedulita = Integer.parseInt(txtEliminar.getText());
					pasar =true;
				}catch(Exception a){
					JOptionPane.showMessageDialog(ventana, "Solo numeros");
					pasar = false;
				}
				if(pasar) {
					Veterinaria eliminar = new Veterinaria();
					try {
						eliminar = Crud2.buscarVeterinaria(cedulita);
					} catch (ClassNotFoundException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if(eliminar.getNombre() == null) {
						JOptionPane.showMessageDialog(ventana, "No se a encontrado esta barbie");
					}else{
						try {
							Crud2.eliminarVeterinaria(eliminar);
							JOptionPane.showMessageDialog(ventana, "Se elimino la veterinaria: " + eliminar.getNombre());
						} catch (ClassNotFoundException | IOException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(ventana, "No se pudo eliminar");
						}
					}
				}else{
					JOptionPane.showMessageDialog(ventana, "Dato no valido");
				}
			}else if(caso.equals("acarreada")) {
				boolean pasar = true;
				int Nodespensa = 0;
				try {
					Nodespensa = Integer.parseInt(txtEliminar.getText());
					pasar =true;
				}catch(Exception a){
					JOptionPane.showMessageDialog(ventana, "Solo numeros");
					pasar = false;
				}
				if(pasar) {
					Acarreada eliminar = new Acarreada();
					try {
						eliminar = Crud2.buscarAcarreada(Nodespensa);
					} catch (ClassNotFoundException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if(eliminar.getNombre() == null) {
						JOptionPane.showMessageDialog(ventana, "No se a encontrado esta barbie");
					}else{
						try {
							Crud2.eliminarAcarreada(eliminar);
							JOptionPane.showMessageDialog(ventana, "Se elimino la acarreada: " + eliminar.getNombre());
						} catch (ClassNotFoundException | IOException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(ventana, "No se pudo eliminar");
						}
					}
				}else{
					JOptionPane.showMessageDialog(ventana, "Dato no valido");
				}
			}else if(caso.equals("pintora")) {
				if(SoloLetras(txtEliminar.getText())) {
					Pintora eliminar = new Pintora();
					try {
						eliminar = Crud2.buscarpPintora(txtEliminar.getText());
					} catch (ClassNotFoundException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if(eliminar.getNombre() == null) {
						JOptionPane.showMessageDialog(ventana, "No se a encontrado esta barbie");
					}else{
						try {
							Crud2.eliminarPintora(eliminar);
							JOptionPane.showMessageDialog(ventana, "Se elimino la pintora: " + eliminar.getNombre());
						} catch (ClassNotFoundException | IOException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(ventana, "No se pudo eliminar");
						}
					}
				}else{
					JOptionPane.showMessageDialog(ventana, "Dato no valido");
				}
			}else if(caso.equals("astronauta")) {
				if(SoloLetras(txtEliminar.getText())) {
					Astronauta eliminar = new Astronauta();
					try {
						eliminar = Crud2.buscarAstronauta(txtEliminar.getText());
					} catch (ClassNotFoundException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if(eliminar.getNombre() == null) {
						JOptionPane.showMessageDialog(ventana, "No se a encontrado esta barbie");
					}else{
						try {
							Crud2.eliminarAstronauta(eliminar);
							JOptionPane.showMessageDialog(ventana, "Se elimino la astronauta: " + eliminar.getNombre());
						} catch (ClassNotFoundException | IOException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(ventana, "No se pudo eliminar");
						}
					}
				}else{
					JOptionPane.showMessageDialog(ventana, "Dato no valido");
				}
			}
		}
	}
	
	public void mostrarDatosRegistro() {
		txtNombre.setVisible(true);
		lblNombre.setVisible(true);
		txtEdad.setVisible(true);
		lblEdad.setVisible(true);
		txtCar1.setVisible(true);
		lblCar1.setVisible(true);
		lblCar2.setVisible(true);
		txtCar2.setVisible(true);
		btnRegistrar.setEnabled(false);
		btnEliminar.setEnabled(false);
		//btnActualizar.setEnabled(false);
		bCancelar.setVisible(true);
		
		if(caso == "programadora") {
			bPmAgregar.setVisible(true);
		}else if(caso == "veterinaria") {
			bVtAgregar.setVisible(true);
		}else if(caso == "acarreada") {
			bPRIAgregar.setVisible(true);
		}else if(caso == "pintora") {
			bAtAgregar.setVisible(true);
		}else if(caso == "astronauta") {
			bAStAgregar.setVisible(true);
		}
	}
	
	public void ocultarRegistro() {
		txtNombre.setVisible(false);
		txtNombre.setText("");
		lblNombre.setVisible(false);
		txtEdad.setVisible(false);
		txtEdad.setText("");
		lblEdad.setVisible(false);
		txtCar1.setVisible(false);
		txtCar1.setText("");
		lblCar1.setVisible(false);
		lblCar2.setVisible(false);
		txtCar2.setVisible(false);
		txtCar2.setText("");
		btnRegistrar.setEnabled(true);
		btnEliminar.setEnabled(true);
		bPmAgregar.setVisible(false);
		bAtAgregar.setVisible(false);
		bPRIAgregar.setVisible(false);
		bAStAgregar.setVisible(false);
		bVtAgregar.setVisible(false);
		bCancelar.setVisible(false);
		txtEliminar.setVisible(false);
		lblEliminar.setVisible(false);
		btnRemover.setVisible(false);
	}
	
	public void recuperaDatos(){
		texto2 = txtCar2.getText();
		texto1 = txtCar1.getText();
		if(caso == "programadora") {
			if(SoloLetras(texto1)) {
				lenguajes = texto1;
				bcaso1 = true;
			}else {
				bcaso1 = false;
			}
			if(SoloLetras(texto2)) {
				gafas = texto2;
				bcaso2 = true;
			}else {
				bcaso2 = false;
			}
			
		}else if(caso == "veterinaria") {
			if(SoloLetras(texto1)) {
				mascota = texto1;
				bcaso1 = true;
			}else {
				bcaso1 = false;
			}
			try {
				cedula = Integer.parseInt(texto2);
				tryAndcatch = true;
			}catch(Exception e) {
				tryAndcatch = false;
			}
		}else if(caso == "maid") {
			if(SoloLetras(texto1)) {
				partido = texto1;
				bcaso1 = true;
			}else {
				bcaso1 = false;
			}
			try {
				Nodespensa = Integer.parseInt(texto2);
				tryAndcatch = true;
			}catch(Exception e) {
				tryAndcatch = false;
			}
		}else if(caso == "pintora") {
			if(SoloLetras(texto1)) {
				firma = texto1;
				bcaso1 = true;
			}else {
				bcaso1 = false;
			}
			if(SoloLetras(texto2)) {
				pintura = texto2;
				bcaso2 = true;
			}else {
				bcaso2 = false;
			}
		}else if(caso == "astronauta") {
			if(SoloLetras(texto1)) {
				cohete = texto1;
				bcaso1 = true;
			}else {
				bcaso1 = false;
			}
			if(SoloLetras(texto2)) {
				Tripulacion = texto2;
				bcaso2 = true;
			}else {
				bcaso2 = false;
			}
		}
			
		nombre = txtNombre.getText();
		try {
			edad = Integer.parseInt(txtEdad.getText());
			tryAndcatch = true;
		}catch(Exception e) {
			tryAndcatch = false;
		}
	}
	
	public boolean SoloLetras(String l) {
		Pattern pattern = Pattern.compile("[a-z,A-Z]");
		Matcher matcher = pattern.matcher(l);
		boolean matchFound = matcher.find();
		if(matchFound) {
		return true;
		} else {
		return false;
		}
	}
	public void Main() {
		ventana.setBounds(0, 0, 900, 700);
		ventana.setResizable(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setAlwaysOnTop(true);
		ventana.setLocationRelativeTo(null);
		ventana.setBackground(Color.pink);
		
		panel1 = new JPanel();
		Panel1(panel1);
		ventana.setVisible(true);
	}	
}