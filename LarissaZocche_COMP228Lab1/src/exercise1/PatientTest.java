package exercise1;

import javax.swing.JOptionPane;

public class PatientTest {

	public static void main(String[] args) {
	
		//provide user input for the patient 
		 String patientId = JOptionPane.showInputDialog("Enter Patient ID:");
	      String firstName = JOptionPane.showInputDialog("Patient First name:");
	      String lastName = JOptionPane.showInputDialog("Patient Last name:");
	      String address = JOptionPane.showInputDialog("Address:");
	      String city = JOptionPane.showInputDialog("City:");
	      String province = JOptionPane.showInputDialog("Province:");
	      String postalCode = JOptionPane.showInputDialog("Postal Code:");
	      
	      
	    //create (instantiate) an object of class Patient - 
	      Patient myPatient = new Patient (patientId, firstName, lastName, address, city, province, postalCode);
	      //Display patient information
	      JOptionPane.showMessageDialog(null, myPatient.getPatientInfo());

	}

}
