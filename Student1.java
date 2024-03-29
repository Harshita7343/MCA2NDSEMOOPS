class Student {
    String name;
    String rollNumber;
    String phoneNumber;
    String address;

     Student(String name, String rollNumber, String phoneNumber, String address) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    
    void display(){
        System.out.println("Student Information:");
        System.out.println("Harshita- Roll Number: " + this.rollNumber);
        System.out.println("     Phone Number: " + this.phoneNumber);
        System.out.println("     Address: " + this.address);
    }  
}

public class Student1 {
    public static void main(String[] args) {
        
        Student Harshita = new Student("Harshita", "23mcano1", "9414967343", "House");
        Student ayushi = new Student("ayushi", "23bba02", "8107916244", "khumbha marg");

        
        Harshita.display();
        ayushi.display();
    }
}