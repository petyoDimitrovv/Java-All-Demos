package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 int [] arr = scanner.nextLine().split(" ").map

	 String input = "";

	 while(true){
	     input = scanner.nextLine();
	     if(input.equals("end")) {
             break;

         }
	     String[] command = input.split(" ")
	     if(command[0].equals("exchange")){
	             int positionToExchange = Integer.parseInt(command[1]);
	             if(positionToExchange >= 0 && positionToExchange < arr.length){
	                 exchange(arr , positionToExchange);
                 }

             }
         }
     }

    private static void exchange(String[] arr, int positionToExchange) {
        for (int i = 0; i <= positionToExchange; i++)
        {
            int firstNum = arr[0];

            for (int j = 0; j < arr.length-1; j++)
            {
                arr[j] = arr[j + 1];
            }

            arr[arr.length-1] = firstNum;
        }

    }


        }
        System.out.println(String.join(" ",arr));

