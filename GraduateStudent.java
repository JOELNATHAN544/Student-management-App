
public class GraduateStudent extends Student {

    private String thesisTitle;
    private String advisorName;

    public GraduateStudent(String name, int age, String studentId, int[] grades, String thesisTitle, String advisorName) {
        super(name, age, studentId, grades);
        this.thesisTitle = thesisTitle;
        this.advisorName = advisorName;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Thesis Title: " + thesisTitle + ", Advisor: " + advisorName);
    }

    @Override
    public String toString() {
        return "GraduateStudent{" + "name='" + name + "', age=" + age
                + ", ID=" + studentId + ", Thesis='" + thesisTitle + "', Advisor='" + advisorName + "'}";
    }
}
