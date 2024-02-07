// find the output

import java.util.*;
public class test3{
    public static void main(String args[]) {
        int x, y, z;
        x = y = z = 3;
        x += y;
        y -= z;
        z /= (x + y);

        System.out.println(x + " " + y + " " + z);
    }
}