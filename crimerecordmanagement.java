import java.util.*; 
class CrimeRecord { 
  private String name; 
  private String crime; 
  private String location; 
  private int age; 
  public CrimeRecord(String name, String crime, String location, int age) { 
    this.name = name; 
    this.crime = crime; 
    this.location = location; 
    this.age = age; 
  } 
  public String getName() { 
    return name; 
  } 
  public String getCrime() { 
    return crime; 
  } 
  public String getLocation() { 
    return location; 
  } 
  public int getAge() { 
    return age; 
  } 
} 
public class crimerecordmanagement { 
  private static CrimeRecord[] records = new CrimeRecord[100]; 
  private static int count = 0; 
  public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in); 
    boolean running = true; 
    System.out.print("Enter verification code\t"); 
    String ver=scanner.next(); 
    if(ver.equals("ARIF@1234")) 
    { 
    while (running) {
        System.out.println("Crime Record Management System"); 
        System.out.println("1. Add a new record"); 
        System.out.println("2. Display all records"); 
        System.out.println("3. Search for a record by name"); 
        System.out.println("4. Exit"); 
        System.out.print("Enter your choice: "); 
        int choice = scanner.nextInt(); 
        switch (choice) { 
          case 1: 
            addRecord(scanner); 
            break; 
          case 2: 
            displayRecords(); 
            break; 
          case 3: 
            searchRecord(scanner); 
            break; 
          case 4: 
            running = false; 
            break; 
          default: 
            System.out.println("Invalid choice"); 
            break; 
        } 
      } 
     } 
  else  
  {System.out.println("Authentication error"); 
  } 
    } 
   
    private static void addRecord(Scanner scanner) { 
      System.out.print("Enter name: "); 
      String name = scanner.nextLine(); 
  name = scanner.nextLine(); 
      System.out.print("Enter crime: "); 
      String crime = scanner.nextLine(); 
      System.out.print("Enter location: "); 
      String location = scanner.next(); 
      System.out.print("Enter age: "); 
      int age = scanner.nextInt(); 
      CrimeRecord record = new CrimeRecord(name, crime, location, age); 
      records[count++] = record; 
      System.out.println("Record added successfully"); 
    } 
   
    private static void displayRecords() { 
      if (count == 0) { 
        System.out.println("No records found"); 
      } else { 
        System.out.println("Name\tCrime\tLocation\tAge"); 
        for (int i = 0; i < count; i++) { 
          CrimeRecord record = records[i]; 
          System.out.println(record.getName() + "\t" + record.getCrime() + "\t" + 
  record.getLocation() + "\t" + record.getAge()); 
        } 
      } 
    } 
   
    private static void searchRecord(Scanner scanner) { 
      System.out.print("Enter name to search: "); 
      String name = scanner.nextLine(); 
  name=scanner.nextLine(); 
      boolean found = false; 
      for (int i = 0; i < count; i++) { 
        CrimeRecord record = records[i]; 
        if (record.getName().equalsIgnoreCase(name)) { 
          System.out.println("Name\tCrime\tLocation\tAge"); 
          System.out.println(record.getName() + "\t" + record.getCrime() + "\t" + 
  record.getLocation() + "\t" + record.getAge()); 
          found = true; 
        } 
      } 
      if (!found) { 
        System.out.println("Record not found"); 
      }
    }
}  