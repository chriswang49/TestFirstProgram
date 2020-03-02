
/*
 * This is a simple Java program.
 * Name this file "MyFirstProgram.java".
 */
public class MyFirstProgram {
    public void start() {

        int min = Math.min(10001,100);



        System.out.println(Math.sqrt(min) + "is the smae as " + Math.sqrt(Math.pow(10,2)));
    }

    // All Java programs begin with the method: main().
    public static void main(String[] args) {
        MyFirstProgram p = new MyFirstProgram();
        p.start();
    }
}