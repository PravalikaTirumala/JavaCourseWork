/**(a) Design the class Doctor, inherited from the class Person with an additional data
*member to store a doctor's specialty. Add appropriate constructors and methods
*to initialize, access, and manipulate the data members.
*/


	public class Doctor extends Person
	{
		String speciality;
		
		public Doctor()
		{
		speciality=null;
		}
		public Doctor(String spec)
			{
			speciality=spec;
			}
		public Doctor(String name, String phoneNo, String spec)
			{

			super(name, phoneNo);
			speciality = spec;
			}
		public String getSpeciality()
			{
			return speciality;
			}
		public void setSpeciality(String speciality)
			{
			this.speciality = speciality;
			}

		public String toString()
		{
		return super.toString() + "Speciality is" + speciality;
		}
	}
