package GenericMethod;

public class MaxFloatUC2 {
    public static void main(String[] args) {
        System.out.println("Program to find Maximum among three float values");
        Float a = 10.0F, b = 15.5F, c = 10.3F;
        getMaximum(a,b,c);

    }
    public static Float getMaximum(Float f1, Float f2, Float f3) {
        //Initializing the Variable
        Float max1 = f1;
        if (f2.compareTo(f1) > 0)
            max1 = f2;

        if (f3.compareTo(max1) > 0)
            max1 = f3;

        System.out.println("Maximum float value among three value is: "+max1);
        return max1;
    }
}
