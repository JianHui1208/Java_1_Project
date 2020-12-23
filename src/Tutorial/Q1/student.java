package Tutorial.Q1;

public class student {
    String StuName, StuID, StuPhoNumber;
    static int CountofStudens;
    subject[] StuSubject;

    public student() {
    }

    public student(String newStuName, String newStuID, String newStuPhoNumber) {
        StuName = newStuName;
        StuID = newStuID;
        StuPhoNumber = newStuPhoNumber;
        CountofStudens++;
    }

    public void setStudentsName(String newStuName) {
        StuName = newStuName;
    }

    public String getStudentsName() {
        return StuName;
    }

    public void setStudentsID(String newStuID) {
        StuID = newStuID;
    }

    public String getStudentsID() {
        return StuID;
    }

    public void setStudentsPhoNumber(String newStuPhoNumber) {
        StuPhoNumber = newStuPhoNumber;
    }

    public String getStudentsPhoNumber() {
        return StuPhoNumber;
    }

    public void setStuSubject(subject[] newStuSubject) {
        StuSubject = newStuSubject;
    }

    public subject[] getStuSubject() {
        return StuSubject;
    }

    public static int getCountStudents() {
        return CountofStudens;
    }

    public void DisplayStudent() {
        System.out.println(" Name: " + getStudentsName() + "\n" + " Student id: " + getStudentsID() + "\n"
                + " Phone number: " + getStudentsPhoNumber());
        System.out.println(" Lists of subjects: ");
        for (int i = 0; i < StuSubject.length; i++) {
            System.out.println("  " + (i + 1) + ". " + StuSubject[i].DisplaySubject());
        }
        System.out.println();
    }
}
