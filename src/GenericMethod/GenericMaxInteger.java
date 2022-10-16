package GenericMethod;

public class GenericMaxInteger<T extends  Comparable<T>> {
    public T firstValue, secondValue, thirdValue;
    public GenericMaxInteger(T firstInput, T secondInput, T thirdInput) {
        this.firstValue = firstInput;
        this.secondValue = secondInput;
        this.thirdValue = thirdInput;
    }
    public T getMaximum() {
        return GenericMaxInteger.getMaximum(firstValue, secondValue, thirdValue);
    }
    //Generic method
    public static <T extends Comparable<T>> T getMaximum(T f1, T f2, T f3) {
        //Initializing the Variable
        T max1 = f1;
        if (f2.compareTo(f1) > 0)
            max1 = f2;

        if (f3.compareTo(max1) > 0)
            max1 = f3;

        //Printing the max value
        printOut(f1, f2, f3, max1);
        return max1;
    }
    public static <T> void printOut(T i, T j, T k, T large) {
        //Printing the max value
        System.out.printf("Maximum from %s, %s and %s is:  %s\n",i,j,k,large);
    }
}

