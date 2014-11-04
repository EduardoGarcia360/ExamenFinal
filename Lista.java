package IPC1A;

public class Lista {
	
	private Nodo inicio, fin;
	
	public Lista(){
		inicio=fin = null;
	}
	
	public boolean Vacia(){
		return inicio==null;
	}
	
	public void Agregar(String el){
		if(Vacia()){
			inicio=fin = new Nodo(el);
		}else{
			fin = new Nodo(el, null, fin);
			fin.anterior.siguiente = fin;
		}
	}
	public String FinInicio(){
		String datos="";
		Nodo aux = fin;
			while(aux!=null){
				datos = datos + aux.dato + " ";
				aux = aux.anterior;
			}
		return datos;
	}
	
	public void LimpiarLista(){
		while (inicio != null){
			inicio = inicio.siguiente;
		}
		
	}
	
	

}
