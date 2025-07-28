import java.util.Scanner;

public class arraymulti {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("enter no of rows for 1st matrix");
        int r1 = scn.nextInt();
        System.out.println("enter no of coloums for 1st matrix");
        int c1 = scn.nextInt();
        int arr[][] = new int[r1][c1];

        System.out.println("enter no of rows for the 2nd matrix");
        int r2 = scn.nextInt();
        System.out.println("enter the no of columns for the 2nd matrix");
        int c2 = scn.nextInt();
        int brr[][] = new int[r2][c2];

        int c[][] ={};

        for(int i = 0 ; i<arr.length ; i++)
        {
            for(int j = 0 ; j<arr[0].length ; j++)
            {
                    arr[i][j] = scn.nextInt();
            }
        }

        for(int i = 0 ; i<arr.length ; i++)
        {
            for(int j = 0 ; j<arr[0].length ; j++)
            {
                    brr[i][j] = scn.nextInt();
            }
        }

        for(int i = 0 ; i<arr.length ; i++)
        {
            for(int j = 0 ; j<arr[0].length ; j++)
            {
                System.out.println(arr[i][j] + "\t");
            }
            System.out.println();
        }

        for(int i = 0 ; i<brr.length ; i++)
        {
            for(int j = 0 ; j<brr[0].length ; j++)
            {
                System.out.println(brr[i][j] + "\t");
            }
            System.out.println();
        }

        for(int i = 0 ; i<arr.length ; i++)
        {
            for(int j = 0 ; j<arr[0].length ; j++)
            {
                c[i][j] = arr[i][j] + brr[i][j];
                System.out.println(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
