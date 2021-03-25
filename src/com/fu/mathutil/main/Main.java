
        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil.main;

import com.fu.mathutil.MathUtility;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("1st upload from Local to GitHub!!!");
//        System.out.println("Welcome to GitHub");

        //TEST trâu bò, tức là dùng mắt để nhìn đúng sai
        long expected = 120; //ki vong ham tinh giai thua tra ve 120 
        long actual; //neu dua vao 5
        int input = 5; //dau vao 5
        actual = MathUtility.getFactorial(input); // xem KQ ra nhiu
        System.out.println("5!: Expected: " + expected + "; Actual: " + actual);

        //1 test case, 1 tinh huong xai ham, test ham, dung ham 
        
        //case 2: 0! thi sao????
        expected = 1;
        input = 0;
        actual = MathUtility.getFactorial(input); // xem KQ ra nhiu
        System.out.println("0!: Expected: " + expected + "; Actual: " + actual);
        
        
        //case 3: 2! thi sao????
        expected = 2;
        input = 2;
        actual = MathUtility.getFactorial(input); // xem KQ ra nhiu
        System.out.println("2!: Expected: " + expected + "; Actual: " + actual);
        
        
        //case 4: -1! thi sao????
        //expected = ?????; //ngoai le, ko ss dc, ko phai la value ma no ci=hi xuat hien thoi
        input = -1;
        actual = MathUtility.getFactorial(input); // xem KQ ra nhiu
        //ko in dc ngoai le, chi coi no co xuat hien duoc hay ko????
        
        //CHÚNG TA PHẢI NHÌN ĐỂ KẾT LUẬN, NHÌN NHIỀU CASES
        //CHƠI TRÒ THÔNG MINH HƠN - TEST AUTOMATION DÙNG THƯ VIỆN 
    }
    
}
