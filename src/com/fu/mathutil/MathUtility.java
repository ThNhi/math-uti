/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author DELL
 */
public class MathUtility {
    //day la class mo phong lai class Math, chua cac ham sai chung
    //ham sai chung, ko luu lai dieu gi -> static

    public static final double PI = 3.1415;

    //ham tinh n!
    //n! tang rat nhanh ve gia tri
    //21! tran` kieu long, hon 18 so 0
    //bai nay ta tinh tu 0...20!. Am ko tinh dc, 0! = 1! = 1
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be betwen 0...20");
        }
        
        //sua code sua ham ! cho gon, dung de quy (recursion) : goi lai chinh minh voi 1 quy mo khac
        //STACKOVERFLOW.COM
        //song sot den day thi n = 0...20
        if (n == 0 || n == 1) {
            return 1;
        }
        return  n * getFactorial(n - 1);
        //n! = n * (n -1)!
//
//        long result = 1; //gia bo = 0
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//        return result;
    }
}
