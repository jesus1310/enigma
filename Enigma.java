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
        else if (mecanismo instanceof MecanismoOffset){
            if (numero > 10){
                String numeroCadena = Integer.toString(numero);
                for (int i = 0; i < numeroCadena.length(); i++){
                    String digitoCadena = numeroCadena.substring(1,numeroCadena.length()-i);
                    if (digitoCadena.length() >= 1){
                        int digito = Integer.parseInt(digitoCadena) % 10 + mecanismo.getClave();
                        if (digito < 10){
                            numero += mecanismo.getClave() * (Math.pow(10,i));
                        }
                        else {
                            numero += mecanismo.getClave() * (Math.pow(10,i));
                            numero -= (Math.pow(10,i + 1));
                        }
                    }
                }
                valorDevuelto = numero;
            }
        }
        return valorDevuelto;
    }

    /**
     * Método para desencriptar
     */
    public int desencripta(Mecanismo mecanismo, int numero){
        int valorDevuelto = -1;
        int numeroOriginal = numero;
        if (mecanismo instanceof MecanismoMultiplicacionPrimo){
            if (numero / mecanismo.getClave() > 10){
                valorDevuelto = numero / mecanismo.getClave();
            }
        }
        else if (mecanismo instanceof MecanismoOffset){
            if (numero > 10){
                String numeroCadena = Integer.toString(numero);
                for (int i = 0; i < numeroCadena.length(); i++){
                    String digitoCadena = numeroCadena.substring(1,numeroCadena.length()-i);
                    if (digitoCadena.length() >= 1){
                        int digito = Integer.parseInt(digitoCadena) % 10 + mecanismo.getClave();
                        if ((Integer.parseInt(digitoCadena) % 10 - mecanismo.getClave()) >= 0){
                            numero -= mecanismo.getClave() * (Math.pow(10,i));
                        }
                        else {
                            numero -= mecanismo.getClave() * (Math.pow(10,i));
                            numero += (Math.pow(10,i + 1));
                        }
                    }
                }
                if (numero < 10){
                    valorDevuelto = numero;
                }
            }
        }
        return valorDevuelto;
    }
}
