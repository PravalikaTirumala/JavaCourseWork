/**
(b) Design the class Bill with data members to store a patient's ID and the patient's
hospital charges such as pharmacy charges for medicine, the doctor's fee, and the
room charges. Add appropriate constructors and methods to initialize, access, and
manipulate the data members.
*
 */
public class Bill {

	String patient_ID;
	double phar_Charge;
	double doctor_Fee;
	double room_Charge;

	public Bill()
		{
		patient_ID = null;
		phar_Charge = 0;
		doctor_Fee = 0;
		room_Charge = 0;
		
		}
	public Bill(String p_ID, double pharCharge, double doctorFee, double roomCharge)
		{
		patient_ID = p_ID;
		phar_Charge = pharCharge;
		doctor_Fee = doctorFee;
		room_Charge = roomCharge; 
		}
	public void setPatientID(String p_ID)
		{
		patient_ID = p_ID;
		}
	public void setMedicineCharge(double p_Charge)	
		{
		phar_Charge = p_Charge;
		}
	public void setDoctorFee(double doc_Fee)
		{
		doctor_Fee = doc_Fee;
		}
	public void setRoomCharge(double r_Charge)
		{
		room_Charge = r_Charge;
		}
	public String getPatientID()
		{
			return patient_ID;
		}
	public double getPharmCharge()
		{
		return phar_Charge;
		}
	public double getDocFee()
		{
		return doctor_Fee;
		}
	public double getRoomCharge()
		{
		return room_Charge;
		}

	public String toString()
		{
		return "Patient ID is " + patient_ID + "Pharmacy charges are  " + phar_Charge +
				"Doctors fee is " + doctor_Fee + "Room Charge is " + room_Charge ;
		}
	}

