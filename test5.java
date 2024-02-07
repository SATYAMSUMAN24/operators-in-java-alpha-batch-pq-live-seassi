// find the output

import java.util.*;
public class test5{
    public static void main(String args[]) {
        double x = 2.06, y = 9.5;

        double exp1 = (y * (x / y + x / y));
        double exp2 = (y * x / y + y * x / y);

        System.out.println(exp1);
        System.out.println(exp2);
    }
}