class Student {
    private String name;
    private int rollNumber;

    void setStudentDetails(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    void getStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentDetails("Jayashish", 8385);
        student1.getStudentDetails();
    }
}
