package code_wars.sixth_kyu;

public class FoldAnArray {

    public int[] foldArray(int[] inputArray, int runs) {
        int a;
        runs--;

        if (inputArray.length == 1) return inputArray;          //if original array contains only one element
        if (inputArray.length % 2 == 0) a = inputArray.length / 2; //determining resultArray.length
        else a = (inputArray.length - 1) / 2 + 1;                 //determining resultArray.length
        int[] resultArray = new int[a];


        if (inputArray.length % 2 == 0) {                         //if original array.length is even
            for (int y = 0; y < a; y++) resultArray[y] = inputArray[y] + inputArray[inputArray.length - 1 - y];
        } else {                                                //if original array.length is odd
            for (int y = 0; y < a - 1; y++) resultArray[y] = inputArray[y] + inputArray[inputArray.length - 1 - y];
            resultArray[a - 1] = inputArray[inputArray.length / 2];
        }

        if (runs > 0) return foldArray(resultArray, runs);
        else return resultArray;
    }

}
