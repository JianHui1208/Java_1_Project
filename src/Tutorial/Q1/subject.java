package Tutorial.Q1;

public class subject {
    String SubCode, SubName;
    int SubHours;

    public subject() {
    }

    public subject(String newSubCode, String newSubName, int newSubHours) {
        SubCode = newSubCode;
        SubName = newSubName;
        SubHours = newSubHours;
    }

    public void setSubjectCode(String newSubCode) {
        SubCode = newSubCode;
    }

    public String getSubjectCode() {
        return SubCode;
    }

    public void setSubjectName(String newSubName) {
        SubName = newSubName;
    }

    public String getSubjectName() {
        return SubName;
    }

    public void setSubjectHours(int newSubHours) {
        SubHours = newSubHours;
    }

    public int getSubjectHours() {
        return SubHours;
    }

    public String DisplaySubject() {
        String MSG = "Subject code: " + getSubjectCode() + "\n" + "    Subject name: " + getSubjectName()
                + "\n" + "    Credit hours: " + getSubjectHours();
        return MSG;
    }
}
