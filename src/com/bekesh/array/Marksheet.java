/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bekesh.array;

import java.util.Scanner;

/**
 *
 * @author bekesh
 */
public class Marksheet {
    
int java,asp,php,sql;
        int total=0;
        double percentage;
        int passMarks=32;
        Scanner input = new Scanner(System.in);
    
    public void getMarks(){
        
        System.out.println("enter the marks of java");
        java=input.nextInt();
        System.out.println("enter the marks of asp");
        asp=input.nextInt();
        System.out.println("enter the marks of php");
        php=input.nextInt();
        System.out.println("enter the marks of sql");
        sql=input.nextInt();
    }
    
    public void getTotal(){
        total=java+asp+php+sql;
        System.out.println("the total is"+total);
        
    }
    
    public void getPercentage(){
        if(java<passMarks || asp<passMarks || php<passMarks || sql<passMarks){
            System.out.println("fail");
        }
            else
            {
           percentage = total/4;
        System.out.println("the percentage is"+percentage);
                    
                    if(percentage<100 && percentage>80){
                    System.out.println("dist");
                    }
                    
                    else if(percentage<80 && percentage>60){
                        System.out.println("first");
                    }
                        else if(percentage<60 && percentage>50){
                            System.out.println("second");
                        }
                            else if(percentage<50 && percentage>32){
                                System.out.println("third");
                            }
                            else if(percentage<32 && percentage>0)
                                    System.out.println("fail");
                    }
    
}
}
