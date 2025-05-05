public class Course {
    private String courseName;
    private String courseCode;
    private String description;

    public Course(String courseName, String courseCode, String description) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.description = description;
    }

    // Getters and setters
    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public String getCourseCode() { return courseCode; }
    public void setCourseCode(String courseCode) { this.courseCode = courseCode; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    // Display info
    @Override
    public String toString() {
        return "Course: " + courseName + " (" + courseCode + ")\nDescription: " + description + "\n";
    }
}
