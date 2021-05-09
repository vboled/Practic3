public class Main {
    public static void main(String[] argv) {
        Address a = new Address();
        int numOfTest = 0;
        String test = "";
        try {
            numOfTest++;
            test = "Russia, Moscow obl, Moscow, Paper, 13, 1, 23";
            a.setAddress(test);
            System.out.println("Test: " + numOfTest + " +");
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong test: " + numOfTest);
            System.out.println("With String:  " + test);
        }

        try {
            numOfTest++;
            test = "Russia, Moscow obl, Moscow, Paper, 13, 1, 23";
            a.setAddress(test);
            System.out.println("Test: " + numOfTest + " +");
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong test: " + numOfTest);
            System.out.println("With String:  " + test);
        }

        try {
            numOfTest++;
            test = "Russia, ,   ,   ,, 1, 23";
            a.setAddress(test);
            System.out.println("Test: " + numOfTest + " +");
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong test: " + numOfTest);
            System.out.println("With String:  " + test);
        }

        try {
            numOfTest++;
            test = "Russia, , Moscow, Paper, 13, 1, 23";
            a.setAddress(test);
            System.out.println("Test: " + numOfTest + " +");
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong test: " + numOfTest);
            System.out.println("With String:  " + test);
        }

        try {
            numOfTest++;
            test = "Russia,            Moscow obl, Moscow, 13, 1, 23";
            a.setAddress(test);
            System.out.println("Test: " + numOfTest + " +");
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong test: " + numOfTest);
            System.out.println("With String:  " + test);
        }

        try {
            numOfTest++;
            test = "Russia,            Moscow obl, Moscow, Paer, 13, 1, 23";
            a.setAddress(test, ",");
            System.out.println("Test: " + numOfTest + " +");
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong test: " + numOfTest);
            System.out.println("With String:  " + test);
        }


        try {
            numOfTest++;
            test = "Russia;            Moscow obl; Moscow; Paper;13; 1; 23";
            a.setAddress(test, ";");
            System.out.println("Test: " + numOfTest + " +");
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong test: " + numOfTest);
            System.out.println("With String:  " + test);
        }
    }
}
