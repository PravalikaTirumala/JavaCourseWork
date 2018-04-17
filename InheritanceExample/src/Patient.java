/**
 * (c) Design the class Patient, inherited from the class Person with additional data
members to store a patient's ID, age, date of birth, attending physician's name,
the date when the patient was admitted in the hospital, and the date when the
patient was discharged from the hospital. (Use the class Date to store the date
of birth, admit date, discharge date, and the class Doctor to store the attending
physician's name.) Add appropriate constructors and methods to initialize, access,
and manipulate the data members.

 */
import java.util.Date;

public class Patient extends Person  
	{
	String patient_ID;
	int age;
	Date dob;
	String physician_Name;
	Date admitted;
	Date discharge_Date;

	public Patient()
	{
		patient_ID = null;
		physician_Name = " ";
		age = 0;
		dob = null;
		admitted = null;
		discharge_Date = null;
	}
	public Patient( String pat_ID, String physicianName,
			int pat_age, Date pat_Dob, Date adm, Date dis)
	{
		patient_ID = pat_ID;
		physician_Name = physicianName;
		age = pat_age;
		dob = pat_Dob;
		admitted = adm;
		discharge_Date = dis;
	}
	public void setPatientID(String pat_ID)
	{
		patient_ID = pat_ID;
	}
	public void setPatientAttendingPhysicianName(String attending_PhysicianName)
	{
		physician_Name = attending_PhysicianName;
	}
	public void setAge(int pat_age)
	{
		age = pat_age;
	}
	public void setDateOfBirth(Date DOB_pat)
	{
		dob = DOB_pat;
	}
	public void setAdmittedDate(Date admit_Date)
	{
		admitted = admit_Date;
	}
	public void setDischargeDate(Date discharge_date)
	{
		discharge_Date = discharge_date;
	}
	public String getPatientID()
	{
		return patient_ID;
	}
	public String getPatientAttendingPhysicianName()
	{
		return physician_Name;
	}
	public int getAge()
	{
		return age;
	}
	public Date getDateOfBirth()
	{
		return dob;
	}
	public Date getAdmittedDate()
	{
		return admitted;
	}
	public Date getDischargeDate()
	{
		return discharge_Date;
	}
	public String toString()
	{
		return super.toString() + "Patient ID is " + patient_ID +
				"Attending Physician Name " + physician_Name + "Age: " + age +
				"Date of birth: " + dob + "Admitted Date: " + admitted +
				"Discharge Date: " + discharge_Date;
	}
	}