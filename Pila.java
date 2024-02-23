class Pila<T> {
    private Nodo<T> cima;

    public Pila() {
        this.cima = null;
    }

    public void apilar(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
    }

    public T desapilar() {
        if (!esVacia()) {
            T datoDesapilado = cima.dato;
            cima = cima.siguiente;
            return datoDesapilado;
        } else {
            return null; // Pila vacía
        }
    }

    public boolean esVacia() {
        return cima == null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Nodo<T> actual = cima;
        while (actual != null) {
            sb.append(actual.dato).append(" ");
            actual = actual.siguiente;
        }
        return sb.toString();
    }
}