package GenericMethod;

public class MaxIntegerUC1 {
    public static void main(String[] args) {
        System.out.println("Program to find Maximum among three float values");
        Integer num1 = 45, num2 = 89, num3 = 58;
        maximum(num1,num2,num3);

    }
    public static Integer maximum(Integer n1, Integer n2, Integer n3) {

        //Initializing the Variable
        Integer max = n1;
        if (n2.compareTo(n1) > 0)
            max = n2;

        if (n3.compareTo(max) > 0)
            max = n3;

        System.out.println("Maximum Integer value among three value is: "+max);
        return max;
    }
}
