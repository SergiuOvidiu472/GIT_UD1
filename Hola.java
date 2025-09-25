import java.util.Scanner;
public class Hola {
    public static String preguntarNombre ()
    {
        System.out.print ("Como te llamas?: ");
        String nombre = new Scanner (System.in).nextLine ();
        return nombre;
    }
    public static boolean nombreValido (String nombre)
    {
        boolean[] error = new boolean [2];
        error [0] = (nombre == null);
        if (!error [0]) {
            error [1] = nombre.equals ("");
        }
        return (!error [0] && !error [1]);
    }
    public static String saludar (String nombre)
    {
        return "! Hola, " + nombre + "!";
    }
    public static void main(String[] args)
    {
        String nombre = null;
        String saludo = null;
        while (!nombreValido (nombre)) {
            nombre = preguntarNombre ();
            saludo = saludar (nombre);
        }
        System.out.println (saludo);
    }
}