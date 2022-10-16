package GenericMethod;

public class MaxStringUC3 {
    public static void main(String[] args) {
        System.out.println("Program for finding maximum string");
        String str1 = "Devika", str2 = "Yash", str3 = "Bhagyashree";
        MaxString(str1,str2,str3);

    }
    public static String MaxString(String u, String v, String w) {
        //Initializing the Variable
        String max2 = u;
        if (v.compareTo(u) > 0) {
            max2 = v;
        }
        if (w.compareTo(max2) > 0) {
            max2 = w;
        }
        System.out.println("Maximum string is: "+max2);
        return max2;
    }
}


