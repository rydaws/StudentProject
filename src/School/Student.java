package School;

public class Student {

    private String name;
    private double GPA;
    private int absences;

    public Student(String name, double GPA, int absences) {
        this.name = name;
        this.GPA = GPA;
        this.absences = absences;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public int getAbsences() {
        return absences;
    }

    public void setAbsences(int absences) {
        this.absences = absences;
    }

    public void incrementAbsences() {
        this.absences++;
    }
}
