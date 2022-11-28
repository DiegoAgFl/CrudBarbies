

import java.io.*;
import java.util.ArrayList;

public class CrudBarbies {
	/*
	 * CRUD 
	 * Consult 
	 * Register 
	 * Update 
	 * Delete
	 * 
	 */

	ArrayList<Barbie> listadebarbies = new ArrayList();

	public ArrayList<Barbie> leerBarbies() throws IOException, ClassNotFoundException {
		ActuLista();
		return listadebarbies;
	}

	public void agregarProgramadora(Programadora p) throws IOException, ClassNotFoundException {
		ActuLista();
		listadebarbies.add(p);
		guardar();
	}

	public void agregarVeterinaria(Veterinaria v) throws IOException, ClassNotFoundException {
		ActuLista();
		listadebarbies.add(v);
		guardar();
	}

	public void agregarAcarreada(Acarreada P) throws IOException, ClassNotFoundException {
		ActuLista();
		listadebarbies.add(P);
		guardar();
	}

	public void agregarPintora(Pintora a) throws IOException, ClassNotFoundException {
		ActuLista();
		listadebarbies.add(a);
		guardar();
	}

	public void agregarAstronauta(Astronauta c) throws IOException, ClassNotFoundException {
		ActuLista();
		listadebarbies.add(c);
		guardar();
	}

	public Programadora buscarProgramadora(String nombre) throws IOException, ClassNotFoundException {
		Programadora encontrada = new Programadora();

		ActuLista();
		for (int i = 0; i < listadebarbies.size(); i++) {
			Barbie barbie = listadebarbies.get(i);
			if(barbie.tipobarbie().equals("Programadora")) {
				Programadora fullstack = (Programadora) listadebarbies.get(i);
				if (fullstack.getNombre().equals(nombre)) {
					return fullstack;
				}
			}
		}

		return encontrada;
	}

	public Veterinaria buscarVeterinaria(int cedulin) throws IOException, ClassNotFoundException {
		Veterinaria encontrada = new Veterinaria();

		ActuLista();
		for (int i = 0; i < listadebarbies.size(); i++) {
			Barbie barbie = listadebarbies.get(i);
			if(barbie.tipobarbie().equals("Veterinaria")) {
				Veterinaria vet = (Veterinaria) listadebarbies.get(i);
				if (vet.getCedulaprofesional() == (cedulin)) {
					return vet;
				}
			}
			
		}
		return encontrada;
	}

	public Acarreada buscarAcarreada(int ndespensa) throws IOException, ClassNotFoundException {
		Acarreada encontrada = new Acarreada();

		ActuLista();
		for (int i = 0; i < listadebarbies.size(); i++) {
			Barbie barbie = listadebarbies.get(i);
			if(barbie.tipobarbie().equals("Acarreada")) {
				Acarreada amlover = (Acarreada) listadebarbies.get(i);
				if (amlover.getN_Despensa() == (ndespensa)) {
					return amlover;
				}
			}
			
		}
		return encontrada;
	}

	public Astronauta buscarAstronauta(String nombre) throws IOException, ClassNotFoundException {
		Astronauta encontrada = new Astronauta();

		ActuLista();
		for (int i = 0; i < listadebarbies.size(); i++) {
			Barbie barbie = listadebarbies.get(i);
			if(barbie.tipobarbie().equals("Conductora")) {
				Astronauta trailera = (Astronauta) listadebarbies.get(i);
				if (trailera.getNombre().equals(nombre)) {
					return trailera;
				}
			}
			
		}
		return encontrada;
	}

	public Pintora buscarpPintora(String firma) throws IOException, ClassNotFoundException {
		Pintora encontrada = new Pintora();

		ActuLista();
		for (int i = 0; i < listadebarbies.size(); i++) {
			Pintora paint = (Pintora) listadebarbies.get(i);
			if (paint.getFirma().equals(firma)) {
				encontrada = paint;
			}
		}
		return encontrada;
	}

	public void actualizarProgramadora(Programadora p)throws FileNotFoundException, ClassNotFoundException, IOException {

		ActuLista();
		Programadora eliminar = buscarProgramadora(p.getNombre());
		listadebarbies.remove(eliminar);
		listadebarbies.add(p);
		guardar();
	}

	public void actualizarVeterinaria(Veterinaria v) throws FileNotFoundException, ClassNotFoundException, IOException {

		ActuLista();
		Veterinaria eliminar = buscarVeterinaria(v.getCedulaprofesional());
		listadebarbies.remove(eliminar);
		listadebarbies.add(v);
		guardar();

	}

	public void actualizarAcarreada(Acarreada P) throws FileNotFoundException, ClassNotFoundException, IOException {

		ActuLista();
		Acarreada eliminar = buscarAcarreada(P.getN_Despensa());
		listadebarbies.remove(eliminar);
		listadebarbies.add(P);
		guardar();

	}

	public void actualizarAstronauta(Astronauta c) throws FileNotFoundException, ClassNotFoundException, IOException {

		ActuLista();
		Astronauta eliminar = buscarAstronauta(c.getNombre());
		listadebarbies.remove(eliminar);
		listadebarbies.add(c);
		guardar();

	}

	public void actualizarPintora(Pintora a) throws FileNotFoundException, ClassNotFoundException, IOException {

		ActuLista();
		Pintora eliminar = buscarpPintora(a.getFirma());
		listadebarbies.remove(eliminar);
		listadebarbies.add(a);
		guardar();

	}

	public void eliminarProgramadora(Programadora p) throws ClassNotFoundException, IOException {
		ActuLista();
		listadebarbies.remove(p);
		guardar();
	}

	public void eliminarVeterinaria(Veterinaria v) throws ClassNotFoundException, IOException {
		ActuLista();
		listadebarbies.remove(v);
		guardar();
	}

	public void eliminarAcarreada(Acarreada P) throws ClassNotFoundException, IOException {
		ActuLista();
		listadebarbies.remove(P);
		guardar();
	}

	public void eliminarAstronauta(Astronauta c) throws ClassNotFoundException, IOException {
		ActuLista();
		listadebarbies.remove(c);
		guardar();
	}

	public void eliminarPintora(Pintora a) throws ClassNotFoundException, IOException {
		ActuLista();
		listadebarbies.remove(a);
		guardar();
	}

	public void eliminarBarbie(String nombre) {

	}

	public void guardar() throws IOException {
		// Para guardar el archivo tenemos que escribir una salida
		FileOutputStream archivo = new FileOutputStream("archivo.dat");
		// tenemos que definir el buffer de salida del archivo
		ObjectOutputStream salida = new ObjectOutputStream(archivo);

		// escribimos los datos del array
		salida.writeObject(listadebarbies);
		// cerramos el flujo
		salida.close();

	}

	public void ActuLista() throws IOException {
		boolean errores = false;
		do{
			try{
				FileInputStream archivo = new FileInputStream("archivo.dat");
				ObjectInputStream entrada = new ObjectInputStream(archivo);
				listadebarbies = (ArrayList) entrada.readObject();
				entrada.close();
				errores = false;
			}catch(Exception e){
				FileOutputStream archivo1 = new FileOutputStream("archivo.dat");
				ObjectOutputStream salida = new ObjectOutputStream(archivo1);
				ArrayList<Barbie> provicional = new ArrayList();
				salida.writeObject(provicional);
				archivo1.close();
				errores = true;
			}
		}while(errores);
	}
}
