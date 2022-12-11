public class ListInt1 extends List {

    //Añade un entero en la ultima posicion de los nodos
    public void appendInt(Integer i){
        super.append(i);
    }

    //Añade un entero en la primera posicion de los nodos
    public void prependInt(Integer i){
        super.prepend(i);
    }

    //Retorno del entero que se encuentra en la primera posicion de la lista
    public Integer valueFirstInt(){
        return (Integer) super.valueFirstNode();
    }

    //Retorno del entero que se encuentra en la ultima posicion de la lista
    public Integer valueLastInt(){
        return (Integer) super.valueLastNode();
    }
}
