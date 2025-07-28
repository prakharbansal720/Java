// import java.util.Scanner;
import java.util.ArrayList;

public class arraya {
    public static void main(String[] args) {
  
        // Scanner sc = new Scanner(System.in);

        // System.out.println("enter the size of array : ");
        // int num = sc.nextInt();
        // int arr[][][]= {{{1,2,3},{3,4,5},{5,6,7}},{{1,2,3},{3,4,5},{5,6,7}}};

        // for(int i = 0 ; i<num ; i++)
        // {
        //     System.out.println("enter the num : ");
        //     arr[i] = sc.nextInt();
        // }

        // System.out.println(arr[1][2]);
  
        // for(int i = 0 ;  i < arr.length ;  i++ )
        // {
        //     for(int j = 0 ; j < arr[i].length ; j++)
        //     {
        //         for(int k = 0 ; k < arr[i][j].length ; k++)
        //         {
        //             System.out.print(arr[i][j][k] + "\t");
        //         }
        //         System.out.print("\n");
        //     }
        //     System.out.print("\n");
        // }
        // System.out.println(arr[3]);



        // char arr1[] = new char[5];
        // arr1[0] = '6' ;
        // System.out.println(arr1[0]);

        
        
        
        // int arra[] = {2 , 3};
        // arra[0] = 5;

        // System.out.println(arra[0]);




        ArrayList<String> arr2 = new ArrayList<>();

        arr2.add("hello");
        arr2.add("hi");
        arr2.add("hi");

        arr2.remove(2);

        System.out.println(arr2);


        ArrayList<Integer> arr3 = new ArrayList<>();

        arr3.add(5);
        arr3.add(7);
        arr3.add(9);

        arr3.remove(2);

        // arr3.clear();

        System.out.println(arr2.size());

        for(String name : arr2)
        {
            System.out.println(name);
        }

}
}
