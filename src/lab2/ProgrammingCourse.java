package lab2;

/**
 * This is the Programming Course Interface. It defines what methods must be
 * implemented in any classes which use it. These are the methods which are
 * common to all the classes. It does not have the prerequisites methods, as
 * that should not be implemented by all subclasses.
 *
 * @author Jennifer
 */
public interface ProgrammingCourse {

    public abstract void setCourseNumber(String courseNumber);

    public abstract String getCourseNumber();

    public abstract void setCredits(double credits);

    public abstract double getCredits();

    public abstract void setCourseName(String courseName);

    public abstract String getCourseName();

}
