package lab1;

/**
 * This is the abstract class used to outline what methods all subclasses should
 * have.
 *
 * By providing all abstract methods in this class, the class allows for tailored implementation in each subclass which might extend this class.
In adherence with the open-close principle, I could add final concrete methods to this class without breaking any of the subclasses.

This class should not need to be  modified in order to be successfully extended to any subclass. - 
I can use any subclass with this superclass, and it will all work because it has the appropriate methods and properties(only those common to all courses)
the abstract methods guarantee that subclasses provide specific, tailored implementation.
    
All methods in this superclass are marked abstract, which prevent the 4 dangers of Concrete Inheritance as I have described below. 
In order to ensure compliance with the goal of the Open-Close Principle of classes being open to extension, but closed to change,
nothing in this class should change once in production as it could break/affect the subclasses. Instead, another interface/ superclass
would need to be created to implement new changes/additions.

Because all methods are abstract, I have the same explanation for all of them:
abstract methods- will have to be re-declared and given an implementation, which means no danger of inheriting bad code or erroneously over-riding
 the original implementation (causing errors/ unexpected behavior). Further the subclass authors will know this method exists(eliminates
 danger of not knowing what is being inherited.) Finally, since this is a method that would be common to any current/future course classes, 
 there will be no inheriting un-needed methods.
    
    
Essentially, I have created an abstract class that functions as an interface, which leads me to believe that an interface is perhaps
 the better way to go for this particular problem. The only reason I can think of to use an abstract class is if there were some concrete
methods not involving getting/setting properties that could be marked final that all classes would need access to. 
 not involving getting/setting.
 * 
 * @author Jennifer
 */
public abstract class ProgrammingCourse {

    public abstract double getCredits();

    public abstract void setCredits(double credits);

    public abstract String getCourseName();

    public abstract void setCourseName(String courseName);

    public abstract String getCourseNumber();

    public abstract void setCourseNumber(String courseNumber);

    public abstract String getPrerequisites();

    public abstract void setPrerequisites(String prerequisites);
}
