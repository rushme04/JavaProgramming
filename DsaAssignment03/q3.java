package DsaAssignment03;
class MarksOutOfBoundException extends Exception {
    public MarksOutOfBoundException(String message) {
        super(message);
    }
}

class Student {
    String name;
    int mark;

    Student(String name, int mark) throws MarksOutOfBoundException {
        if (mark > 100) 
            throw new MarksOutOfBoundException("Mark cannot be greater than 100!");
        
        this.name = name;
        this.mark = mark;
    }

     void display() {
        System.out.println("Name: " + name + ", Mark: " + mark);
    }
}

	public class q3 {
    public static void main(String[] args) {
        try {
            Student s1 = new Student("Rashmi", 105); // >100
            s1.display();
        } catch (MarksOutOfBoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

