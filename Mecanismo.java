/**
 * Abstract class Mecanismo - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Mecanismo
{
    private int clave;
    
    public Mecanismo(int clave){
        this.clave = clave;
    }
    
    /**
     * Método que devuelve la clave
     */
    public int getClave(){
        return clave;
    }
}
