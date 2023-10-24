/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.numericsystemsconverter;

/**
 *
 * @author Mateus Manhani
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the numeric systems translator!");
        System.out.println("A for Decimal");
        System.out.println("B for Binary");
        System.out.println("C for Octa");
        System.out.println("D for Hexadecimal");
        System.out.println("Please Choose the letter corresponding to the input numeric system: ");
        
        String inputFormat = scanner.nextLine().toUpperCase();
        
        
        int decimalRep = 0;
        String binaryRep = "";
        String hexRep = "";
        String octalRep = "";
        
        
        switch (inputFormat){
            
            case "A":
                System.out.println("Enter a decimal number to see its representation in other numeric systems: ");
                int decimalInput = scanner.nextInt();
                binaryRep = Integer.toBinaryString(decimalInput);
                hexRep = Integer.toHexString(decimalInput);
                octalRep = Integer.toOctalString(decimalInput);
                
                System.out.println(decimalInput+ " in binary is: " + binaryRep);
                System.out.println(decimalInput+ " in Hexadecimal is: " + hexRep);
                System.out.println(decimalInput+ " in octa is: " + octalRep);
                break;
            
            case "B":
                System.out.println("Enter a binary number to see its representation in other numeric systems: ");
                String binaryInput = scanner.next();
                
                decimalRep = Integer.parseInt(binaryInput,2);
                hexRep = Integer.toHexString(decimalRep);
                octalRep = Integer.toOctalString(decimalRep);
                
                System.out.println(binaryInput+ " in Decimal is: " + decimalRep);
                System.out.println(binaryInput+ " in Hexadecimal is: " + hexRep);
                System.out.println(binaryInput+ " in octa is: " + octalRep);
                break;
            
            case "C":
                System.out.println("Enter a octal number to see its representation in other numeric systems: ");
                String octalInput = scanner.next();
                
                decimalRep = Integer.parseInt(octalInput,8);
                binaryRep = Integer.toBinaryString(decimalRep);
                hexRep = Integer.toHexString(decimalRep);
                
                System.out.println(octalInput+ " in Decimal is: " + decimalRep);
                System.out.println(octalInput+ " in binary is: " + binaryRep);
                System.out.println(octalInput+ " in Hexadecimal is: " + hexRep);
                break;
            
            case "D":
                System.out.println("Enter a hexadecimal number to see its representation in other numeric systems: ");
                String hexInput = scanner.next();
                
                decimalRep = Integer.parseInt(hexInput,16);
                binaryRep = Integer.toBinaryString(decimalRep);
                octalRep = Integer.toOctalString(decimalRep);
                
                System.out.println(hexInput+ " in Decimal is: " + decimalRep);
                System.out.println(hexInput+ " in binary is: " + binaryRep);
                System.out.println(hexInput+ " in octal is: " + octalRep);
                break;
                
            default:
                System.out.println("Invalid Input Format.");
        }
           
    }
    }
    
    

   

