/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kirit
 */
public class foo {
    static boolean foo(int n){
        if (n < 0) {return false;}
        if (n == 0) {return true;}
        else {
            int s = n;
            int r = 0;
            int whileC = 0;
            int forC = 0;
            while (s != 0){
                whileC++;
                int remainder = s%10;
                r = r * 100 + remainder;
                s = s/10;
            }
            System.out.print(whileC);
            boolean res = false;
            for (int i = 4; i <= n; i = i+20){
                forC++;
                if (n % 2 == 1)
                    res = true;
            }
            System.out.print(forC);
            if (((n == r) == true) && ((n <= 2 || res == true) == true)){
                System.out.print("return true");
                return true;}
            else{
                System.out.print("return false");
                return false;}
        }
    }
    public static void main(String args[]){
        foo(24);
    }
}


