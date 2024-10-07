package procesos;

public class Nodo {
    public int info;  // Cambiado a int
    public Nodo sgte;

    // Constructor
    public Nodo(int info) {
        this.info = info;
        this.sgte = null;
    }

    public Nodo() {
        this.sgte = null;
    }
}
