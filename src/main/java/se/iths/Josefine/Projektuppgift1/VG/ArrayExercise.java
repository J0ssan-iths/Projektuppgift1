package se.iths.Josefine.Projektuppgift1.VG;

public class ArrayExercise {
    private int[] intarray = {1, 3, 10,20,8};

    public String HelloWorld(String HelloWorld) {
        String[] helloWorld = {"Hello", "World", "!"};
        for(String s: helloWorld) {
            System.out.println(s);
        }
        return "";
    }

    public int maxArray() {
        int max = 0;
        for (int i  = 0; i < intarray.length; i++) {
            if (intarray[i] > max) {
                max = intarray[i];
            }
        }
        return max;
    }

    public double maxDouble(double a, double b) {
        double max = 0;
        if (a > b) {
            max = a;
        } else if (a < b) {
            max = b;
        }
        return max;
    }

    public String name(String firstname, String lastname) {
        return firstname + " " + lastname;
    }
}
