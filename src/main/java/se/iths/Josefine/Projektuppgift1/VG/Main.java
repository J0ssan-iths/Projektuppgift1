package se.iths.Josefine.Projektuppgift1.VG;

public class Main {
    public static void main(String[] args) {
        //HelloWorld uppgift
        ArrayExercise helloWorld = new ArrayExercise();
        helloWorld.helloWorld("");

        //Uppgift för VG
        //maxArray
        System.out.println("Det största talet i listan är: " + helloWorld.maxArray());
        System.out.println();

        //Double parameter
        System.out.println("Det största decimaltalet är: " + helloWorld.maxDouble(1.6, 4.8));
        System.out.println();

        //String parametrar
        System.out.println("Hej! " + helloWorld.name("Kalle", "Karlsson"));

    }
}
