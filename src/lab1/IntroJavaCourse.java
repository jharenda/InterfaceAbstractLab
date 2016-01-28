package lab1;

/**
 * This class is responsible for setting it's own name and courseNumber.
 * Prerequisites and credits come from the AdvancedProgrammingCourse superclass, which in turn,
 * inherits from the ProgrammingCourse superclass. 
 *
 * @author Jennifer
 * @version 1.00
 */
public class IntroJavaCourse extends AdvancedProgrammingCourse {

    private String courseName;
    private String courseNumber;
    //Overridable method call in constructor
//http://stackoverflow.com/questions/3404301/whats-wrong-with-overridable-method-calls-in-constructors

    public IntroJavaCourse(String courseName, String courseNumber) {
//        this.setCourseName(courseName);
//        this.setCourseNumber(courseNumber);
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

}
