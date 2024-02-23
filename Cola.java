class Cola<T> {
    private Nodo<T> frente;
    private Nodo<T> fin;

    public Cola() {
        this.frente = null;
        this.fin = null;
    }

    public void encolar(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (esVacia()) {
            frente = nuevoNodo;
            fin = nuevoNodo;
        } else {
            fin.siguiente = nuevoNodo;
            fin = nuevoNodo;
        }
    }

    public T desencolar() {
        if (!esVacia()) {
            T datoDesencolado = frente.dato;
            frente = frente.siguiente;
            if (frente == null) {
                fin = null;
            }
            return datoDesencolado;
        } else {
            return null; // Cola vacía
        }
    }

    public boolean esVacia() {
        return frente == null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Nodo<T> actual = frente;
        while (actual != null) {
            sb.append(actual.dato).append(" ");
            actual = actual.siguiente;
        }
        return sb.toString();
    }
}