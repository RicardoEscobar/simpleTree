/*
 * Free
 * @author Jorge Ricardo Escobar Carrasco. * 
 * AL12509938@unadmexico.mx * 
 */
package patient;

/**
 *
 * @author ricardo
 */
public class Patient {
    private String name;
    private String gender;
    private String bloodType;
    private String bloodPressure;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }
    
    public Patient(String nam){
        name = nam;
        gender = bloodType = bloodPressure = null;
    }    
    
    public Patient(String nam, String gen, String bt, String bp){
        name = nam;
        gender = gen;
        bloodType = bt;
        bloodPressure = bp;
    }    
    
    @Override
    public String toString() {
        return "["+ name + ", "+ gender + ", "+ bloodType + ", "+ bloodPressure +"]";
        
    }
    
}
