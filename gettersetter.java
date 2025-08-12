public class gettersetter {
    private  String name;
    private int age;

    public String getname()
    {
        return name;
    }


    public void setname(String name)
    {
        this.name = name;
    }

    public int getage()
    {
        return age;
    }

    public void setage(int age)
    {
        this.age = age;
    }


    public static void main(String[] args) {
        
        gettersetter s1 = new gettersetter();
       
        s1.setname("hello");
        System.out.println(s1.getname());
        s1.setage(22);
        System.out.println(s1.getage());

    }
}
