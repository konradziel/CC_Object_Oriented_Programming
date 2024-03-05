package pl.edu.uwm.zad21;

public class Intern extends Employee1 {
    private int internshipLength;

    public Intern(String name, String department, double salary, int internshipLength) {
        super(name, department, salary);
        this.internshipLength = internshipLength;
    }

    public int getInternshipLength() {
        return internshipLength;
    }

    public void setInternshipLength(int internshipLength) {
        this.internshipLength = internshipLength;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "internshipLength=" + internshipLength +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        Intern intern = (Intern) o;

        return internshipLength == intern.internshipLength;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + internshipLength;
        return result;
    }
}
