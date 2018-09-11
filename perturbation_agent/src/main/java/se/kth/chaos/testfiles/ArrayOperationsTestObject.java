package se.kth.chaos.testfiles;

public class ArrayOperationsTestObject {
    public void testOperations() {
        int[] testArray = {100, 200, 300, 400, 500, 600, 700, 800, 900};
        int[][] twoDArray = {{111, 222}, {333, 444}, {555, 666, 777}};
        int localInt0 = 6;
        int localInt1 = 6;
        int localInt2 = 6;
        int localInt3 = 6;
        int localInt4 = 6;
        int localInt5 = 6;

        int tmp = testArray[2] + 100;

        System.out.println(testArray[2]);
        System.out.println(testArray[8]);
        System.out.println(testArray[1+2+3]);
        System.out.println(testArray[localInt5]);

        System.out.println(testArray.length);
        boolean compared = localInt5 >= testArray.length;

        /*
        System.out.println("init an int array: {100, 200, 300, 400, 500}");
        System.out.println("local variable index: 6");

        System.out.println("----array read test began----");

        System.out.println("local variable tmp = testArray[2] + 100: " + tmp);
        System.out.println("testArray[4]: " + testArray[4]);
        System.out.println("testArray[5]: (failure here) " + testArray[5]); // failure
        System.out.println("testArray[5]: (failure here) " + testArray[index]); // failure
        System.out.println("twoDArray[index][5]: (failure here) " + twoDArray[index][5]); // double failures

        try {
            System.out.println("testArray[index]: (failure here, because in a wrong try block) " + testArray[index]);
        } catch (IllegalArgumentException e) {
            System.out.println("catch an IllegalArgumentException when print testArray[index]");
        }

        try {
            System.out.println(testArray[index]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException catch block when print testArray[index]");
        }

        try {
            System.out.println(testArray[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException catch block when print testArray[index]");
        }

        System.out.println("----array read test ended----");

        System.out.println("----array write test began----");

        System.out.println("set testArray[4] = 555");
        testArray[4] = 555;
        System.out.println("set testArray[5] = 666 + 777 (failure here)");
        testArray[5] = 666 + 777; // failure
        System.out.println("set testArray[6] = tmp + 666 (failure here)");
        testArray[6] = tmp + 666; // failure
        System.out.println("set testArray[index] = 888 (failure here)");
        testArray[index] = 888; // failure
        System.out.println("set twoDArray[0][0] = 1111");
        twoDArray[0][0] = 1111;
        System.out.println("set twoDArray[1][3] = 4444 (failure here)");
        twoDArray[1][3] = 4444; // failure
        System.out.println("set twoDArray[index][5] = 9999 (failure here)");
        twoDArray[index][5] = 9999; // failure

        System.out.println("----array write test ended----");
        */
    }
}