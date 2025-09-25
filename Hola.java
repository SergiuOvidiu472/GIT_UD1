import java.util.Scanner;
public class Hola {
    public static String preguntarNombre ()
    {
        System.out.print ("Como te llamas?: ");
        String nombre = new Scanner (System.in).nextLine ();
        return nombre;
    }
    public static String saludo (String nombre)
    {
        return "Hola, " + nombre;
    }
    public static void main(String[] args) {
        String nombre = preguntarNombre ();
        String saludo = saludo (nombre);
        System.out.println(saludo);
    }
}