package se.iths.Josefine.Projektuppgift1.VG;

public class Main {
    public static void main(String[] args) {
        //HelloWorld uppgift
        ArrayExercise helloWorld = new ArrayExercise();
        System.out.println(helloWorld.helloWorld(""));

        //Uppgift för VG
        //maxArray
        ArrayExercise array = new ArrayExercise();
        System.out.println("Det största talet i listan är: " + array.maxArray());
        System.out.println();

        //Double parameter
        ArrayExercise double1 = new ArrayExercise();
        System.out.println("Det största decimaltalet är: " + double1.maxDouble(1.6, 4.8));
        System.out.println();

        //String parametrar
        ArrayExercise string = new ArrayExercise();
        System.out.println("Hej! " + string.name("Kalle", "Karlsson"));

    }
}
