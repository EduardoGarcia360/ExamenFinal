package IPC1A;
import java.io.*;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Archivo {
	Lista list = new Lista();
	public void YODA(String ruta){
		File archivo = new File(ruta);
		StringTokenizer tokens;
		int Contador = 1;
		try{
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
				String aux="", caso="", cadena="", texto="", tmp="";
				
				while(true){
					aux = br.readLine();
					if(aux != null){ //SI NO ES NULA Y CONTIENE UN DATO
						
						tokens = new StringTokenizer(aux, " ");
							while(tokens.hasMoreTokens()){
								list.Agregar(tokens.nextToken());
							}
						
						cadena = list.FinInicio().toString();
						tmp = Integer.toString(Contador);
						texto = "Caso #"+ tmp +": " + cadena + "\n";
						list.LimpiarLista();
					}else{
						JOptionPane.showMessageDialog(null, "fjds");
						break;
					}
				}
				
				//CREACION DE TXT
				
				try{
					
					JFileChooser file = new JFileChooser();
					file.showSaveDialog(file);
					File guarda = file.getSelectedFile();
					
					if(guarda != null){
						FileWriter save = new FileWriter(guarda + ".txt");
						save.write(texto);
						save.close();
					}
					
				}catch(Exception e){}
				
				br.close();
			
		}catch(Exception e){}
		
	}
	
}
