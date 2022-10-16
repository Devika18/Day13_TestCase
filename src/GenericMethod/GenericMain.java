package GenericMethod;

import static GenericMethod.GenericMaxInteger.*;

public class GenericMain<T extends Comparable<T>> {


    public static void main(String[] args) {
        System.out.println("Welcome to Test Case Program");

        Integer x=15, y=25, z=20;
        Float a=10.0f, b=15.5f, c=10.3f;
        String str1="Devika",str2="Bhagyashree",str3="Anjali";

        new GenericMaxInteger(x,y,z).getMaximum();
        new GenericMaxInteger(a,b,c).getMaximum();
        new GenericMaxInteger(str1,str2,str3).getMaximum();
    }
}

