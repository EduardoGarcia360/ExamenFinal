package IPC1A;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
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
		File archivotxt = new File(ruta);
	
		
		int opcion = 0;
		do{
			System.out.println("\n----- EXAMEN FINAL IPC1 'A' - EDUARDO GARCIA 2012-12961----\n"
							
							+ "Eliga un ejercicio\n"
							+ "1. Maestro YODA\n"
							+ "2. Teclado T9\n"
							+ "3. Numeros\n"
							+ "4. Salir");
			Scanner o = new Scanner(System.in);
			opcion = o.nextInt();
			
			switch(opcion){
			case 1:
				JOptionPane.showMessageDialog(null, "Se inicio ejercicio: Maestro YODA");
				
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
								texto =texto + "Caso # "+ tmp+": " + cadena + ".\n";
								
							}else{
								JOptionPane.showMessageDialog(null, "El Mestro YODA ha terminado!");
								break;
							}
						}
						String no = "YODA";
						Main.Creacion(texto,no);
						br.close();
				}catch(Exception e){}
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Se inicio ejercicio: Teclado T9");
				try{
					FileReader fr = new FileReader(archivotxt);
					BufferedReader br = new BufferedReader(fr);
					String aux="", cadena="", texto="", caso ="";
					int conta=0, conta1=0;
					while(true){
						aux = br.readLine();
						if(aux != null){ //SI NO ES NULA Y CONTIENE UN DATO
								if(cadena != ""){
									cadena = "";
								}
								for(int i=0; i < aux.length(); i++){
									if(aux.charAt(i) == 48 || aux.charAt(i) == 32){ //ESPACIO
										cadena = cadena + " ";
									}else if (aux.charAt(i) == 97){ //A
										cadena = cadena + "2";
									}else if (aux.charAt(i) == 98){ //B
										cadena = cadena + "22";
									}else if (aux.charAt(i) == 99){ //C
										cadena = cadena + "222";
									}else if (aux.charAt(i) == 100){ //D
										cadena = cadena + "3";
									}else if (aux.charAt(i) == 101){ //E
										cadena = cadena + "33";
									}else if (aux.charAt(i) == 102){ //F
										cadena = cadena + "333";
									}else if (aux.charAt(i) == 103){ //G
										cadena = cadena + "4";
									}else if (aux.charAt(i) == 104){ //H
										cadena = cadena + "44";
									}else if (aux.charAt(i) == 105){ //I
										cadena = cadena + "444";
									}else if (aux.charAt(i) == 106){ //J
										cadena = cadena + "5";
									}else if (aux.charAt(i) == 107){ //K
										cadena = cadena + "55";
									}else if (aux.charAt(i) == 108){ //L
										cadena = cadena + "555";
									}else if (aux.charAt(i) == 109){ //M
										cadena = cadena + "6";
									}else if (aux.charAt(i) == 110){ //N
										cadena = cadena + "66";
									}else if (aux.charAt(i) == 241){ //Ñ
										cadena = cadena + "?";
									}else if (aux.charAt(i) == 111){ //O
										cadena = cadena + "666";
									}else if (aux.charAt(i) == 112){ //P
										cadena = cadena + "7";
									}else if (aux.charAt(i) == 113){ //Q
										cadena = cadena + "77";
									}else if (aux.charAt(i) == 114){ //R
										cadena = cadena + "777";
									}else if (aux.charAt(i) == 115){ //S
										cadena = cadena + "7777";
									}else if (aux.charAt(i) == 116){ //T
										cadena = cadena + "8";
									}else if (aux.charAt(i) == 117){ //U
										cadena = cadena + "88";
									}else if (aux.charAt(i) == 118){ //V
										cadena = cadena + "888";
									}else if (aux.charAt(i) == 119){ //W
										cadena = cadena + "9";
									}else if (aux.charAt(i) == 120){ //X
										cadena = cadena + "99";
									}else if (aux.charAt(i) == 121){ //Y
										cadena = cadena + "999";
									}else if (aux.charAt(i) == 122){ //Z
										cadena = cadena + "9999";
									}
									
								} //FIN FOR
							conta1 = conta++;
							caso = Integer.toString(conta1);
							texto = texto + "Caso # "+ caso +": " + cadena + "\n";
						}else{
							JOptionPane.showMessageDialog(null, "Fin de Teclado T9!");
							break;
						}
					}
					String nom = "T9";
					Main.Creacion(texto,nom);
					br.close();
					
				}catch(Exception e){}
				
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Se inicio ejercicio: Numeros");
				double funcion;
				int resultado, n;
				try{
					FileReader fr = new FileReader(archivotxt);
					BufferedReader br = new BufferedReader(fr);
					String aux="", cadena="", nocaso="";
					int contar=1, contar1=1;
					while(true){
						aux = br.readLine();
						if(aux != null){
							n = Integer.parseInt(aux);
							funcion = (3 + Math.sqrt(5));
							resultado = (int) Math.pow(funcion, n);
								if(resultado > 1000){
									resultado = resultado%1000;	
								}
								contar1 = contar++;
								nocaso = Integer.toString(contar1);
								cadena = cadena + "Caso # " + nocaso + ": " + resultado + "\n";
						}else{
							JOptionPane.showMessageDialog(null, "Fin de ejercicio numeros!");
							break;
						}
						
					}
					String nom = "numeros";
					Main.Creacion(cadena,nom);
					br.close();
				}catch(Exception e){}
				break;
			}
		}while(opcion!=4);
		JOptionPane.showMessageDialog(null, "Realizado por: EduardoGarcia 2012-12961");
		
		
	}

	private static void Creacion(String tex, String nombre) {
		
		File a;
		FileWriter escritor;
		String nombrearchivo="";
		if(nombre == "YODA"){
			nombrearchivo = "Output_MAESTROYODA_2012-12961.txt";
		}else if(nombre == "T9"){
			nombrearchivo = "Output_TECLADOT9_2012-12961.txt";
		}else if(nombre == "numeros"){
			nombrearchivo = "Output_NUMEROS_2012-12961.txt";
		}
		try{
			a = new File(nombrearchivo);
			escritor = new FileWriter(a);
			BufferedWriter bw = new BufferedWriter(escritor);
			PrintWriter salida = new PrintWriter(bw);
			
			salida.write(tex);
			
			salida.close();
			bw.close();
			
			
		}catch(Exception e){}
		
	}

	

}
