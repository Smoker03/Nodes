public class Main {
    public static void main(String[] args) {
        var listInteger1 = new ListInt1();
        var listInteger2 = new ListInt2();

        System.out.println("Lista de enteros numero uno");
        System.out.println();
        listInteger1.appendInt(3);
        listInteger1.prependInt(7);
        listInteger1.prependInt(2);
        listInteger1.prependInt(4);

        var values = listInteger1.toList();
        for (var n : values) {
            System.out.print(n + " ");
        }

        System.out.println();
        System.out.println("\nEl valor del entero en la primera posicion de la lista es: " + listInteger1.valueFirstInt());
        System.out.println("El valor del entero en la ultima posicion de la lista es: " + listInteger1.valueLastInt());

        System.out.println("----------------------------");
        System.out.println("Lista de enteros numero dos");
        System.out.println();

        listInteger2.appendIntC(12);
        listInteger2.prependIntC(9);
        listInteger2.prependIntC(3);
        listInteger2.appendIntC(8);

        var valuesI = listInteger2.toList();
        for (var n : valuesI) {
            System.out.print(n + " ");
        }

        System.out.println();
        System.out.println("\nEl valor del entero en la primera posicion de la lista es: " + listInteger2.valueFirstIntC());
        System.out.println("El valor del entero en la ultima posicion de la lista es: " + listInteger2.valueLastIntC());
        System.out.println("El tamaño de la lista de enteros numero dos es: " + listInteger2.size());
        listInteger2.deleteLastIntC();
        listInteger2.deleteFirstIntC();
    }
}
