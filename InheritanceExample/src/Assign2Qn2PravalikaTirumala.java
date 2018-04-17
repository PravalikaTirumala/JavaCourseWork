/**
 * (d) Use the test _le Assign2Qn2XX.java to guide your design and test your classes,
where XX should be replaced with your _rst name and last name. You can also
add code to test your classes as needed.

 */
import java.util.*;

public class Assign2Qn2PravalikaTirumala
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        Patient newPatient = new Patient();
        Doctor doc = new Doctor ();
        Bill bill = new Bill();

        String str1, str2, str3;

        System.out.print("Enter patient's ID: ");
        str1 = console.next();
        System.out.println();

        newPatient.setPatientID(str1);
        bill.setPatientID(str1);

        System.out.print("Enter patient's first name: ");
        str1 = console.next();
        System.out.println();

        System.out.print("Enter patient's last name: ");
        str2 = console.next();
        System.out.println();

        newPatient.setName(str1, str2);

        System.out.print("Enter doctor's first name: ");
        str1 = console.next();
        System.out.println();

        System.out.print("Enter doctor's last name: ");
        str2 = console.next();
        System.out.println();
        console.nextLine();

        newPatient.setName(str1, str2);

        System.out.print("Enter doctor's speciality: ");
        str1 = console.nextLine();
        System.out.println();

        doc.setSpeciality(str1);

        newPatient.setAdmittedDate());
        newPatient.setDisDate(4, 21, 2009);

        bill.setPharmacyCharges(245.50);
        bill.setRoomRent(2500);
        bill.setDoctorFee(3500.38);

        System.out.println(newPatient);
        System.out.println(bill);
		
		// code to test the classes as needed
    }
}
