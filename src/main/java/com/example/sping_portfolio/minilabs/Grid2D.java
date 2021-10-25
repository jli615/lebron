package com.example.sping_portfolio.minilabs;
import java.util.Scanner;

public class Grid2D{

    public static void main(String args[]){

        System.out.print("Enter 2D array row and column size: ");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();

        System.out.println("Enter array elements: ");

        int array[][]=new int[rows][columns];


        for(int i=0; i<rows;i++)
        {
            for(int j=0; j<columns;j++)
            {
                array[i][j]=sc.nextInt();
            }
        }
        System.out.print("Grid: \n");
        for(int []x:array){
            for(int element:x){
                System.out.print(element+"        ");
            }
            System.out.println();
        }

    }
}
