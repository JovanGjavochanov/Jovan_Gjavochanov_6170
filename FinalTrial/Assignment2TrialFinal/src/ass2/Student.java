package ass2;

public class Student {
    private String fullName;
    private String yearOfStudy;
    private double id;

    public Student() {}

    public Student(String fullName, String yearOfStudy, double id) {
        this.fullName = fullName;
        this.yearOfStudy = yearOfStudy;
        this.id = id;
    }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getYearOfStudy() { return yearOfStudy; }
    public void setYearOfStudy(String yearOfStudy) { this.yearOfStudy = yearOfStudy; }

    public double getId() { return id; }
    public void setId(double id) { this.id = id; }

    public void print() {
        System.out.println("Student:");
        System.out.println(" Name: " + fullName);
        System.out.println(" Year: " + yearOfStudy);
        System.out.println(" ID: " + id);
    }
}
