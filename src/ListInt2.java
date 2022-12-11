public class ListInt2{

    //Composicion con la clase lista
    private final List lista = new List();

    //Añade un entero en la ultima posicion de los nodos
    public void appendIntC(Integer i) {
        lista.append(i);
    }

    //Añade un entero en la primera posicion de los nodos
    public void prependIntC(Integer i) {
        lista.prepend(i);
    }

    //Retorno del entero que se encuentra en la primera posicion de la lista
    public Integer valueFirstIntC() {
        return (Integer) lista.valueFirstNode();
    }

    //Retorno del entero que se encuentra en la ultima posicion de la lista
    public Integer valueLastIntC() {
        return (Integer) lista.valueLastNode();
    }

    //Elimina el ultimo entero de la lista
    public void deleteLastIntC() {
        lista.deleteLastNode();
    }

    //Elimina el primer entero de la lista
    public void deleteFirstIntC() {
        lista.deleteFirstNode();
    }

    //Elimina todos los valores de la lista
    public void clear() {
        lista.clear();
    }

    //Tamaño de la lista
    public int size() {
        return lista.size();
    }

    //Metodo para mostrar todos los enteros en la lista
    public java.util.List<Object> toList(){
        return lista.toList();
    }
}
