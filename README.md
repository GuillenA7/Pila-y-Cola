# Practica 2 - Pila y Cola - Estructuras de Datos y Algoritmia

## Estructuras de Datos: Cola y Pila en Java

Esta practica Java implementa las estructuras de datos de Cola y Pila utilizando programación genérica. Ambas estructuras están construidas sobre la base de la clase `Nodo<T>`, que representa un nodo en una estructura enlazada.

### Contenido del Proyecto

#### Clase `Nodo<T>`

La clase `Nodo<T>` define un nodo básico que contiene un dato de tipo genérico `T` y una referencia al siguiente nodo en la estructura. Este nodo es utilizado por las clases `Cola<T>` y `Pila<T>` para construir listas enlazadas.

```java
class Nodo<T> {
    T dato;
    Nodo<T> siguiente;

    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
```
#### Clase `Cola<T>`

La clase Cola<T> implementa una cola genérica, que sigue el principio FIFO (First In, First Out). Permite operaciones como encolar y desencolar elementos.

```java
class Cola<T> {
    private Nodo<T> frente;
    private Nodo<T> fin;

    public Cola() {
        this.frente = null;
        this.fin = null;
    }

    public void encolar(T dato) {
        // Implementación de encolar
    }

    public T desencolar() {
        // Implementación de desencolar
    }

    public boolean esVacia() {
        // Método para verificar si la cola está vacía
    }

    @Override
    public String toString() {
        // Método toString para representar la cola como cadena
    }
}
```
#### Clase Pila<T>
La clase `Pila<T>` implementa una pila genérica, que sigue el principio LIFO (Last In, First Out). Ofrece operaciones para apilar y desapilar elementos.

```java
class Pila<T> {
    private Nodo<T> cima;

    public Pila() {
        this.cima = null;
    }

    public void apilar(T dato) {
        // Implementación de apilar
    }

    public T desapilar() {
        // Implementación de desapilar
    }

    public boolean esVacia() {
        // Método para verificar si la pila está vacía
    }

    @Override
    public String toString() {
        // Método toString para representar la pila como cadena
    }
}
```
Uso y Ejemplos
Ejemplo de Uso:
```java
public static void main(String[] args) {
    Cola<String> cola = new Cola<>();
    Pila<String> pila = new Pila<>();

    // Ejemplos de operaciones con cola y pila
    cola.encolar("A");
    cola.encolar("B");
    System.out.println("Cola: " + cola);

    pila.apilar("X");
    pila.apilar("Y");
    System.out.println("Pila: " + pila);
}
```
