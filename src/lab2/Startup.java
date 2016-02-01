package lab2;

/**
 * Because I have implemented both of these labs in the same manner- all methods and properties are implemented in the same way,
 my comments for Polymorphism, LSP, and  exactly the same as they have been provided in the startup class for lab one. At this moment,
 I cannot think of anything different that I have discovered between the two. If I do, I shall add my findings here. 

The Liskov Substitution principle can be used when it is preferable to only access members of the superclass (abstract class)  and to not provide 
access to the members of the subclass.
can't do course1.setPrerequisites because ProgrammingCourse does not have that method
        
I think that interfaces are a good choice for abstraction because you are forced to redeclare
all methods in subclasses and there is no chance of inheriting invisible properties/methods. 
Interfaces also just seem more flexible because each method can be tailor, and therefore the interface can be more 
broadly used. Also, I like that Interfaces make it possible to set up rules for how a subclass should function, but allow the
actual implementation of the functionality to be specified by each individual class. 
One bad thing about interfaces is that is can be more code writing and time spent.
 * 

 * @author Jennifer
 */
public class Startup {
    
    public static void main(String[] args) {
 
        ProgrammingCourse[] courses = {new AdvancedJavaCourse(), new IntroJavaCourse(), new IntroToProgrammingCourse()};
        courses[0].setCourseName("Advanced Java");
        courses[1].setCourseName("Introduction to Java");
        courses[2].setCourseName("Introduction to Programming");
        for (ProgrammingCourse pc : courses) {
            System.out.println(pc.getCourseName());
        }
        
        ProgrammingCourse course1 = new AdvancedJavaCourse();
        ProgrammingCourse course2 = new IntroToProgrammingCourse();
        ProgrammingCourse course3 = new IntroJavaCourse();
        
        AdvancedJavaCourse courseOne = new AdvancedJavaCourse();
        IntroToProgrammingCourse courseTwo = new IntroToProgrammingCourse();
        IntroJavaCourse courseThree = new IntroJavaCourse();
        courseOne.setCourseName("Adv. Java");
        courseOne.setCourseNumber("152-111");
        courseTwo.setCourseNumber("number");
        courseTwo.setCourseName("Intro Programming");
        courseTwo.setCredits(1);
        courseThree.setCourseName("Java");
        courseThree.setCredits(3);
        courseThree.setCourseNumber("152");
        course1.setCourseName("ad. java");
        course1.setCourseNumber("123");
        course1.setCredits(.5);
        
        course2.setCredits(2);
        course3.setCredits(4);
        
        courseOne.setPrerequisites("pre-");
        courseThree.setPrerequisites("-recs");

        System.out.println(course1.getCourseName() + " " + course1.getCourseNumber());
        System.out.println(course1.getCredits());
        System.out.println(" ");
        
        System.out.println(course2.getCourseName() + " " + course2.getCourseNumber());
        System.out.println(course2.getCredits());
        System.out.println(" ");
        
        System.out.println(course3.getCourseName() + " " + course3.getCourseNumber());
        System.out.println(course3.getCredits());
        System.out.println(" ");
        
        System.out.println(courseOne.getCourseName() + " " + courseOne.getCourseNumber());
        System.out.println(courseOne.getCredits() + " " + courseOne.getPrerequisites());
        System.out.println("");
        
        System.out.println(courseTwo.getCourseName() + " " + courseTwo.getCourseNumber());
        System.out.println(courseTwo.getCredits() + " " + courseTwo.getCourseNumber());
        System.out.println("");
        
        System.out.println(courseThree.getCourseName() + " " + courseThree.getCourseNumber());
        System.out.println(courseThree.getCredits() + " " + courseThree.getCourseNumber());
        
    }
}
