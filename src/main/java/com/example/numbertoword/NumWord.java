package com.example.numbertoword;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.text.NumberFormat;
import java.util.Scanner;

@RestController
public class NumWord {
    @RequestMapping("/word")

    public void numberWord(@RequestParam("num") int num) {
        String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};


        //check through every element in units and see if it coincides
        for (int i = 0; i < units.length; i++){

            if (num==i){
                System.out.println(units[i]);
            }

        }

        for (int i = 0; i < tens.length; i++){

            if (num%10==0)
                System.out.println(tens[i]);

        }

        //print the index value where it co incides
    }

  /*  public static void main (String[]args){

        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();

        numberWord(num);

    }*/
}
