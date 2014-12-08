package pilascolas;

/**
 *
 * @author NetoSolis
 */
public class Pila {
    //Declaramos una variable tipo ListaLigada
    private ListaLigada pila;
    
    //Contructor. Inicializacion de la listaligada
    public Pila(){
        pila = new ListaLigada();
    }
    
    //Funcion que inserta un elemento a la pila
    public void push(Object dato){
        pila.insertarPrimero(dato);
    }
    
    //Funcion que elimina un elemento de la pila
    public Object pop(){
        Object Dato = pila.getElementos()[0];
        pila.eliminarPrimero();
        return Dato;
    }
    
    //Funcion que devuelve el tope de la pila
    public Object peek(){
        return pila.getElementos()[0];
    }
    
    //Funcion que devueleve el tamaño de la pila
    public int size(){
        return pila.getTamaño();
    }
    
    //Funcion que devuelve los elementos de la pila
    public Object[] getElementos(){
        return pila.getElementos();
    }
}
