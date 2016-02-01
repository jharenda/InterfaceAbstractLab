package lab2;

/**
 * This is the Programming Course Interface. It defines what methods must be
 * implemented in any classes which use it. These are the methods which are
 * common to all the classes. It does not have the prerequisites methods, as
 * that should not be implemented by all subclasses.
 * 
 *  1/30/16- Changes:
 * Added pre-req getters and setters.
 * 
 * 
 *By making this an interface, I have allowed for tailored implementation in each subclass which implements it. 
 * This class should not need to modified in order to be successfully extended to any subclass, I can use any subclass with this
 and it will all work because it has the appropriate methods and properties(only those common to all courses)
the abstract methods guarantee that subclasses provide specific, tailored implementation.
    
All methods here are necessarily abstract, which prevents the 4 dangers of Concrete Inheritance as described below.
* 
In order to ensure compliance with the goal of the Open-Close Principle of classes being open to extension, but closed to change,
nothing in this class should change once in production as it could break/affect the subclasses. Instead, another interface/ superclass
would need to be created to implement new changes/additions.
* 
*Being an interface, I cannot have concrete methods that might not be marked final and cause problems elsewhere. This interface
* means that that classes which implement it are in a way closed to change(they must implement the prescribed methods, but 
they are also open to change in that they can all add their own unique methods without breaking other code associated with this 
* interface. 
* One bad thing I see about an interface in terms of the open-close principle is that if I did want to add a method here, it 
* would break all the implementing classes until I changed them all. 

Because all methods are abstract, I have the same explanation for all of them:
abstract methods- will have to be re-declared and given an implementation, which means no danger of inheriting bad code or erroneously over-riding
the original implementation (causing errors/ unexpected behavior). Further the subclass authors will know this method exists(eliminates
danger of not knowing what is being inherited.) Finally, since this is a method that would be common to any current/future course classes, 
there will be no inheriting un-needed methods.

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
    
    public abstract String getPrerequisites(); 

    public abstract void setPrerequisites(String prerequisites);  

}
