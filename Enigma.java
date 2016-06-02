/**
 * Write a description of class Enigma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enigma
{
    /**
     * Constructor for objects of class Enigma
     */
    public Enigma()
    {
    }
    
    /**
     * Método para encriptar
     */
    public int encripta(Mecanismo mecanismo, int numero){
        int valorDevuelto = -1;
        if (mecanismo instanceof MecanismoMultiplicacionPrimo){
            if (numero > 10){
                valorDevuelto = numero * mecanismo.getClave();
            }            
        }
        return valorDevuelto;
    }
    
    /**
     * Método para desencriptar
     */
    public int desencripta(Mecanismo mecanismo, int numero){
        int valorDevuelto = -1;
        if (mecanismo instanceof MecanismoMultiplicacionPrimo){
            if (numero / mecanismo.getClave() > 10){
                valorDevuelto = numero / mecanismo.getClave();
            }
        }
        return valorDevuelto;
    }
}
