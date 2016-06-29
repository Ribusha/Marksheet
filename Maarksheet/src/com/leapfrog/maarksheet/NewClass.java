/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.maarksheet;

/**
 *
 * @author MUKESH
 */
public class NewClass {
    
}
 marks[i] = input.nextDouble();
            if (marks[i]<32) {
                System.out.println("Sorry,You've failed :|");
                
            }
                
             else {
                 System.out.println("Congratulation!You've passed :D");

                total = total + marks[i];
                System.out.println("Your total marks is " + total);

                percentage = (total / 500) * 100;
                System.out.println("Your percentage is " + percentage);

                if(percentage >= 80) {
                    System.out.println("You've acheived Distintion");
                
                }
                else if (percentage>=60 && percentage<80){
                    System.out.println("You've acheived First Division");
                }
                else if(percentage>=45 && percentage <60){
                    System.out.println("You've achieved Second Division");
                }
                else if (percentage>=32 && percentage <45){
                    System.out.println("Babu,dherai gali khane vayoou");