public class example {
    static int staticvar = 100; //static variable 
    int instancevar = 50; //instance variable

    public void demo(){
        int localvar = 10;
        System.out.println("local variable" + localvar); 
        System.out.println("instance variable" + instancevar);
        System.out.println("static variavle" + staticvar);
    }

    public static void main(String[] args){
        example obj1 = new example();
        obj1.demo();
    }
}
