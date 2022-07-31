public class Dinglemouse {

  private final String firstName;
  private final String lastName;
  
  public Dinglemouse(final String firstName, final String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
  
  public String getFullName() { 
    return (firstName + " " + lastName).trim(); 
  }
  
}
