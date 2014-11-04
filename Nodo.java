package IPC1A;

public class Nodo {
	
	String dato;
	Nodo siguiente, anterior;
	
	public Nodo(String el){
		this(el, null, null);
	}
	
	public Nodo(String el, Nodo s, Nodo a){
		dato = el;
		siguiente = s;
		anterior = a;
	}

}
