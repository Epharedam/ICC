// 1. Definimos la clase Nodo que representa un nodo de la lista simplemente ligada.
//public class Nodo {
//    int valor;
//    Nodo siguiente;

//    public Nodo(int valor) {
//        this.valor = valor;
//    }
//}

// 2. Definimos la clase Main que contiene el método para obtener el valor decimal del número binario representado por la lista.
public class Main {
    public int obtenDecimal(Nodo cabeza) {
        // 3. Inicializamos una variable para mantener el valor decimal en 0.
        int decimal = 0;
        Nodo actual = cabeza;

        // 4. Recorremos la lista desde la cabeza hasta el final.
        while (actual != null) {
            // 5. En cada paso, multiplicamos el valor actual por 2 y sumamos el valor del nodo actual (0 o 1).
            decimal = decimal * 2 + actual.valor;
            actual = actual.siguiente;
        }

        // 6. Devolvemos el valor decimal del número binario representado por la lista.
        return decimal;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Nodo nodo1 = new Nodo(1);
        Nodo nodo2 = new Nodo(0);
        Nodo nodo3 = new Nodo(1);

        nodo1.siguiente = nodo2;
        nodo2.siguiente = nodo3;

        // 7. Llamamos al método obtenDecimal para obtener el valor decimal.
        int resultado = main.obtenDecimal(nodo1);

        // 8. Imprimimos la entrada y el resultado en la consola.
        System.out.println("Entrada: cabeza = [1, 0, 1]");
        System.out.println("Salida: " + resultado); // Debería imprimir 5
    }
}
