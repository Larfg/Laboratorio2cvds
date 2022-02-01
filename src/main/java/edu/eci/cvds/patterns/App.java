package edu.eci.cvds.patterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String nombres = new String();
        if (args.length > 0){
            for (String nombre:args){
                nombres += nombre + " ";
            }
            nombres = nombres.trim();
            System.out.println("Hello "+nombres+"!");
        }
        else {
            System.out.println( "Hello World!" );
        }
    }
}
