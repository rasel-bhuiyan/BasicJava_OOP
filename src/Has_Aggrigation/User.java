package Has_Aggrigation;

import java.util.ArrayList;
import java.util.Iterator;

public class User {

    public static void main(String[] args) {

        Student st = new Student();

        Courses c1 = new Courses("Bangla", "101", 4.00);
        Courses c2 = new Courses("English", "102", 3.00);

        ArrayList<Courses> cs = new ArrayList<Courses>();
        cs.add(c1);
        cs.add(c2);

       // st.setCourses(courses);

     /*   Iterator itr = courses.iterator();
        while (itr.hasNext()) {
            Courses cs = (Courses) itr.next();
            System.out.println(cs.getCourseName() + " " + cs.getCourseCode() + " " + cs.getCourseCredit());
        }

*/
     
     System.out.println(cs.size());
  
        
    }
}
