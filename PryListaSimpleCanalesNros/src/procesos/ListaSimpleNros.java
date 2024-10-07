package procesos;

public class ListaSimpleNros {
    public Nodo inicio;

    public ListaSimpleNros() {
        inicio = null;
    }

    public Nodo retornarUltimo() {
        Nodo p = inicio;

        while (p != null && p.sgte != null) // Verificar que p no sea null
            p = p.sgte;

        return p;
    }

    public Nodo retornarAnterior(Nodo q) {
        Nodo p = inicio;

        while (p != null && p.sgte != q) // Verificar que p no sea null
            p = p.sgte;

        return p;
    }

    public void adicionar(int dato) { // Cambiar a int
        Nodo nuevo, ultimo;
        nuevo = new Nodo(dato); // Crear el nodo directamente con el valor

        if (inicio == null)
            inicio = nuevo;
        else {
            ultimo = retornarUltimo();
            if (ultimo != null) {
                ultimo.sgte = nuevo;
            }
        }
    }

    public int contar() {
        int conta = 0;
        Nodo p = inicio;

        while (p != null) {
            conta++;
            p = p.sgte;
        }
        return conta;
    }

    public Nodo buscar(int dato) { // Cambiar a int
        Nodo p = inicio;

        while (p != null) {
            if (p.info == dato)
                return p;

            p = p.sgte;
        }
        return null;
    }
    
    public boolean eliminar(int dato) {
    Nodo nodoAEliminar = buscar(dato);
    if (nodoAEliminar != null) {
        eliminar(nodoAEliminar);
        return true; // El nodo fue eliminado
    }
    return false; // No se encontró el nodo
}

    
    public void eliminar(Nodo actual) {
        Nodo anterior;

        if (actual == inicio) {
            inicio = actual.sgte;
        } else {
            anterior = retornarAnterior(actual);
            if (anterior != null) {
                anterior.sgte = actual.sgte;
            }
        }
    }
    
    public void ordenar() {
        Nodo p, q;
        int tempo;
        
        p = inicio;
        while (p != null && p.sgte != null) {
            q = p.sgte;
            while (q != null) {
                if (p.info > q.info) {
                    tempo = p.info;
                    p.info = q.info;
                    q.info = tempo;
                }
                q = q.sgte;
            }
            p = p.sgte;
        }
    }
    
    public void insertarAlInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.sgte = inicio;
        inicio = nuevo;
    }
    
    
}
