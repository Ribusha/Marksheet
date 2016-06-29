/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.maarksheet;

import java.util.Scanner;

/**
 *
 * @author MUKESH
 */
public class Output {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        double total = 0;
        double percentage = 0;

        String[] students = {"Ribusha", "Ramesh"};
        String[] subjects = {"English", "Nepali", "Maths", "Science", "Social"};
        double[] marks = new double[subjects.length];
        double[] totals=new double[subjects.length];
       

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter the name of Student " + students[i]);

            for (int j = 0; j < subjects.length; j++) {
                System.out.println("Enter Marks for " + subjects[j]);
                marks[j] = input.nextDouble();
                total= total + marks[j];
               
            }
            for(int t=0; t<totals.length;t++){
                totals[t]=total;
                 if (total < 160) {
                    System.out.println("Sorry,You've failed :|");

                } else {
                    System.out.println("Congratulation!You've passed :D");

                    
                    System.out.println("Your total marks is " + totals[t]);

                    percentage = (total / 500) * 100;
                    System.out.println("Your percentage is " + percentage);

                    if (percentage >= 80) {
                        System.out.println("You've acheived Distintion");

                    } else if (percentage >= 60 && percentage < 80) {
                        System.out.println("You've acheived First Division");
                    } else if (percentage >= 45 && percentage < 60) {
                        System.out.println("You've achieved Second Division");
                    } else if(percentage >= 32 && percentage < 45) {
                        System.out.println("Babu,dherai gali khane vayoou");

                    }
                }
                total=0;
                
               
            }
           
//            for (int j = 0; j < subjects.length; j++) {
//
//                if (marks[j] < 32) {
//                    System.out.println("Sorry,You've failed :|");
//
//                } else {
//                    System.out.println("Congratulation!You've passed :D");
//
//                    total = total + marks[j];
//                    System.out.println("Your total marks is " + total);
//
//                    percentage = (total / 500) * 100;
//                    System.out.println("Your percentage is " + percentage);
//
//                    if (percentage >= 80) {
//                        System.out.println("You've acheived Distintion");
//
//                    } else if (percentage >= 60 && percentage < 80) {
//                        System.out.println("You've acheived First Division");
//                    } else if (percentage >= 45 && percentage < 60) {
//                        System.out.println("You've achieved Second Division");
//                    } else if (percentage >= 32 && percentage < 45) {
//                        System.out.println("Babu,dherai gali khane vayoou");
//
//                        break;
//
//                    }
//                }
//
//            }

        }
    }
}
