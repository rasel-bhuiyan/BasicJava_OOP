package Has_Aggrigation;

import java.util.ArrayList;

public class Student {

    private String StdName;
    private String Stdid;
    private String hobby;
    private Depertment dep;
    private ArrayList<Courses> courses;

    public Student() {
    }

    public Student(String StdName, String Stdid, String hobby, Depertment dep, ArrayList<Courses> courses) {
        this.StdName = StdName;
        this.Stdid = Stdid;
        this.hobby = hobby;
        this.dep = dep;
        this.courses = courses;
    }

    public String getStdName() {
        return StdName;
    }

    public void setStdName(String StdName) {
        this.StdName = StdName;
    }

    public String getStdid() {
        return Stdid;
    }

    public void setStdid(String Stdid) {
        this.Stdid = Stdid;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Depertment getDep() {
        return dep;
    }

    public void setDep(Depertment dep) {
        this.dep = dep;
    }

    public ArrayList<Courses> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Courses> courses) {
        this.courses = courses;
    }

}
