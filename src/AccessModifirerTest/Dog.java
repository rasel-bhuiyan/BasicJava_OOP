
package AccessModifirerTest;
 import javaapplication7.*;



public class Dog extends StdInfo {
    public static void main(String[] args) {
        
   
        StdInfo st = new StdInfo();
        st.setAge(42);
       System.out.println(st.getAge());
       
       Dog d = new Dog ();
       System.out.println(d.getAge());
        
        
        
    }

}
