import java.util.ArrayList;

class student{
    int rollno;
    String name;
    ArrayList <Integer> marks = new ArrayList<>();
    int avg;

    void addstudentdetails(int rollno , String name)
    {
        this.rollno = rollno;
        this.name = name;
    }

    void addmarks(int physics , int maths , int che , int eng)
    {
        marks.add(physics);
        marks.add(maths);
        marks.add(che);
        marks.add(eng);
    }

    void avg()
    {
        for(int nom : marks)
        {
            avg =+ nom;
        }
        System.out.println("the avg is : " + (avg/marks.size()));
    }
}

public class assi2 {

    public static void main(String[] args) {
        
        student s1 = new student();
        s1.addstudentdetails(92, "prakhar");
        s1.addmarks(30, 30, 40, 40);
        s1.avg();
    }
}
