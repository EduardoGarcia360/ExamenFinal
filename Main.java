package IPC1A;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Main {
	
	public static void main(String[] args) {
		Lista list = new Lista();
		JFileChooser archivo = new JFileChooser();
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos TXT", "txt");
		archivo.setFileFilter(filtro);
		archivo.showOpenDialog(archivo);
		String ruta = archivo.getSelectedFile().getAbsolutePath();
		
	
		
		int opcion = 0;
		do{
			System.out.println("\n----- EXAMEN FINAL IPC1 'A' - EDUARDO GARCIA 2012-12961----\n"
							
							+ "Eliga un ejercicio\n"
							+ "1. Maestro YODA\n"
							+ "2. (MOSTRAR)Teclado T9\n"
							+ "3. Numeros\n"
							+ "4. Salir");
			Scanner o = new Scanner(System.in);
			opcion = o.nextInt();
			
			switch(opcion){
			case 1:
				JOptionPane.showMessageDialog(null, "inicio caso 1");
				File archivotxt = new File(ruta);
				StringTokenizer tokens;
				int Contador = 0, Contador1=0;
				try{
					FileReader fr = new FileReader(archivotxt);
					BufferedReader br = new BufferedReader(fr);
						String aux="", cadena="", tmp="", texto="";
						
						while(true){
							aux = br.readLine();
							if(aux != null){ //SI NO ES NULA Y CONTIENE UN DATO
									if(!list.Vacia()){
										list.LimpiarLista();
									}
								tokens = new StringTokenizer(aux, " ");
									while(tokens.hasMoreTokens()){
										list.Agregar(tokens.nextToken());
									}
								
								cadena = list.FinInicio().toString();
								Contador1 = Contador++;
								tmp = Integer.toString(Contador1);
								texto =texto + "Caso # "+ tmp+": " + cadena + ".\nFIN";
								//list.LimpiarLista();
							}else{
								JOptionPane.showMessageDialog(null, "fin de ciclo con tokens");
								break;
							}
						}
						Main.Creacion(texto);
						br.close();
				}catch(Exception e){}
				break;
			case 2:
				break;
			case 3:
				break;
			}
		}while(opcion!=4);
		
		
		
	}

	private static void Creacion(String tex) {
		try{
			
			JFileChooser file = new JFileChooser();
			file.showSaveDialog(file);
			File guarda = file.getSelectedFile();
			
			if(guarda != null){
				FileWriter save = new FileWriter(guarda + ".txt");
				save.write(tex);
				save.close();
			}
			
		}catch(Exception e){}
		
	}

	

}
