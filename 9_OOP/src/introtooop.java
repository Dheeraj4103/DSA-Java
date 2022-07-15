public class introtooop {
    public static void main(String[] args) {
        Student dheeraj = new Student("Dheeraj", 21, 89.9f);
        Student random = new Student(new String("Dheeraj"), 21, 89.9f);
        //System.out.println(random.name == dheeraj.name);
//        for (int i = 0; i < 100000000; i++) {
//            random = new Student();
//        }
    }
}

class Student {
    String name;
    int rollno;
    float marks;

    Student() {
        this ("Dheeraj", 45, 78.5f);
    }

    Student(String name, int rollon, float marks){
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("The Student Object is destroyed");
    }
}