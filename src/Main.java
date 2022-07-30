import SortingAlgorithms.Bubblesort;

public class Main {
    public static void main(String[] args) {

        System.out.println(" ------------ Shell Sort---------------- ");
        /** Shell Sort **/

        int[] intArray04 = {20, 35, -15, 7, 55, 1, -22};

        for (int gap = intArray04.length / 2; gap > 0; gap /= 2){

            for ( int i = gap;  i < intArray04.length; i++){
                int newElement = intArray04[i];

                int j = i;

                while (j >= gap && intArray04[j - gap] > newElement){
                    intArray04[j] = intArray04[j - gap];
                    j -= gap;
                }
                intArray04[j] = newElement;
            }
        }


        for (int i = 0; i < intArray04.length; i++){
            System.out.println("intArray04: " + intArray04[i]);
        }



        System.out.println(" ------------ Insertion Sort---------------- ");
        /** Insertion Sort **/

        int[] intArray03 = {20, 35, -15, 7, 55, 1, -22};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray03.length; firstUnsortedIndex++){
            int newElement = intArray03[firstUnsortedIndex];

            int i;

            for ( i = firstUnsortedIndex; i > 0  && intArray03[i - 1] > newElement; i--){
                intArray03[i] = intArray03[i-1];
            }

            intArray03[i] = newElement;
        }




        for(int i = 0; i< intArray03.length; i++){
            System.out.println("intArray03: " + intArray03[i]);
        }


        System.out.println(" ------------ Selection Sort---------------- ");
        /** Selection Sort **/
        int[] intArray02 = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = intArray02.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--){

            int largest = 0;

            for(int i = 1; i <= lastUnsortedIndex; i++){
                if(intArray02[i] > intArray02[largest]) {
                    largest = i;
                }
            }

            Bubblesort.swap(intArray02, largest, lastUnsortedIndex);
        }

        for(int i = 0; i< intArray02.length; i++){
            System.out.println("intArray02: " + intArray02[i]);
        }

        System.out.println(" ------------ Bubble Sort---------------- ");
        /** Bubble Sort **/
        int[] intArray01 = {20, 35, -15, 7, 55, 1, -22};

        for(int lastUnsortedIndexs = intArray01.length -1; lastUnsortedIndexs > 0; lastUnsortedIndexs--){
            for(int i = 0; i < lastUnsortedIndexs; i++){
                if(intArray01[i] > intArray01[i+1]){
                    Bubblesort.swap(intArray01, i,i+1);
                }
            }
        }

        for(int i = 0; i< intArray01.length; i++){
            System.out.println("intArray01: " + intArray01[i]);
        }

        System.out.println(" ------------ Arrays ---------------- ");
        /** Arrays **/
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        System.out.println("Array length: " + intArray.length);

        int index = -1;
        for (int i = 0; i < intArray.length; i++){
            if(intArray[i] == 7){
                index = i;
                break;
            }
        }

        System.out.println("index = " + index);



    }
}