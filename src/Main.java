
import simpletree.TreeClass;

/**
 * This project is an school assignment, it's purpose is for me to learn.
 * I'm learning how to create and use data structures called 'trees'.
 * In this specific case, I'm asked to build a tree to store a list of
 * patients with their names, gender (male, female), 
 * blood pressure (high, normal, low) and blood type(A, B, AB, O)
 */


/**
 *
 * @author Jorge Ricardo Escobar Carrasco. AL12509938@unadmexico.mx 
 */
public class Main {

    /**
     * I'm using this Main class to execute the methods I create for the assigment.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TreeClass arbol;
        arbol = new TreeClass();
        System.out.println("Esta vacio? "+ arbol.root());
    }
    
}