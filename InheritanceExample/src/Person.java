public class Person
{
private String firstName ; // store the first name
private String lastName ; // store the last name
// Default constructor
// Initialize firstName and lastName to an empty string .
public Person ()
{
firstName = "";
lastName = "";
}
// Constructor with parameters
// Set firstName and lastName according to the parameters .
public Person ( String first , String last )
{
setName (first , last );
}
// Method to output the first name and last name
public String toString ()
{
return ( firstName + " " + lastName );
}
// Method to set firstName and lastName according to the parameters 
public void setName ( String first , String last )
{
firstName = first ;
lastName = last ;
}
// Method to return firstName .
public String getFirstName ()
{
return firstName ;
}
// Method to return lastName .
public String getLastName ()
{
return lastName ;
}
}

