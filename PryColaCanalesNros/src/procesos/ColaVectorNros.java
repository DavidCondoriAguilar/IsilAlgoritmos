
package procesos;

public class ColaVectorNros
{
    private String elemento[];
    private int frente, fiinal, n;
    
    public ColaVectorNros(int tam)
    {
        elemento = new String[tam];
        n = tam;

        frente = -1;
        fiinal = -1;
    }
    
    public int getFrente()  { return frente; }

    public int getFinal()   { return fiinal; }

    public String getElemento(int pos)  { return elemento[pos]; }

    public void adicionar(String dato)
    {
        if (frente == -1)
        {
            frente = 0;
            fiinal = 0;
        }
        else
            if (fiinal == n - 1)
                fiinal = 0;
            else
                fiinal = fiinal + 1;

        elemento[fiinal] = dato;
    }

    public String atender()
    {
        String aux;
        
        aux = elemento[frente];
                
        if (frente == fiinal)
        {
            frente = -1;
            fiinal = -1;
        }
        else
            if (frente == n - 1)
                frente = 0;
            else
                frente = frente + 1;
        
        return aux;
    }
}