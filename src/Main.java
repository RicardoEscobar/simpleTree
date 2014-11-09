
import java.util.ArrayList;
import java.util.ListIterator;
import simpletree.TreeClass;
import yupengluTree.*;
import patient.*;
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
        
        // Creating basic tree structures
        Tree<String> male = new Tree("Masculino");
        Tree<String> female = new Tree("Femenino");
        Tree<String> gender = new Tree("Género", male, female);
            
        Tree<String> A = new Tree("A");        
        Tree<String> B = new Tree("B");
        Tree<String> AB = new Tree("AB");
        Tree<String> O = new Tree("O");
        Tree<String> bloodType = new Tree("Típo de sangre",A, B, AB, O);
        
        Tree<String> high = new Tree("Alta");
        Tree<String> normal = new Tree("Normal");
        Tree<String> low = new Tree("Baja");
        Tree<String> bloodPressure = new Tree("Presión sanguínea", high, normal, low);
        
        // Creating the Patients
        ArrayList<Patient> patients = new ArrayList<Patient>();
        patients.add(new Patient("Alicia", "Femenino", "A", "Alta"));
        patients.add(new Patient("Idra", "Masculino", "B", "Normal"));
        patients.add(new Patient("Nestea", "Femenino", "AB", "Baja"));
        patients.add(new Patient("Boxer", "Masculino", "O", "Alta"));
        //Patient patient1 =  new Patient("Alicia", "Femenino", "A", "Alta");
        
        // Adding patients in order using iterators
        ListIterator<Patient> patientIterator = patients.listIterator();
        while (patientIterator.hasNext()) {
            Patient next = patientIterator.next();
            String s = next.toString();
            // ... by gender
            if (next.getGender().equalsIgnoreCase("Masculino")) {
                male.addChild(new Tree<String> (s));
            } else if (next.getGender().equalsIgnoreCase("Femenino")) {
                female.addChild(new Tree<String> (s));
            }
            
            // ... by blood type
            if (next.getBloodType().equalsIgnoreCase("A")) {
                A.addChild(new Tree<String> (s));
            } else if (next.getBloodType().equalsIgnoreCase("B")) {
                B.addChild(new Tree<String> (s));
            } else if (next.getBloodType().equalsIgnoreCase("AB")) {
                AB.addChild(new Tree<String> (s));
            } else if (next.getBloodType().equalsIgnoreCase("O")) {
                O.addChild(new Tree<String> (s));
            }
            
            // ... by blood pressure
            if (next.getBloodPressure().equalsIgnoreCase("Alta")) {
                high.addChild(new Tree<String> (s));
            } else if (next.getBloodPressure().equalsIgnoreCase("Normal")) {
                normal.addChild(new Tree<String> (s));
            } else if (next.getBloodPressure().equalsIgnoreCase("Baja")) {
                low.addChild(new Tree<String> (s));
            }
            
        }
        
        // Printing output
        System.out.println("Nodos de pacientes: \n"+ patients.toString());
        System.out.println("Arboles:");
        System.out.println(gender);
        System.out.println(bloodType);
        System.out.println(bloodPressure);

    }
    
}