package org.kente.epi;

public class EvenOdd {

    public static int[] evenOdd(int[] array){
        int nextEven = 0;
        int nextOdd = array.length - 1;

        while(nextEven < nextOdd){
            if(array[nextEven] % 2 == 0){
                nextEven++;
            }else{
                int temp = array[nextEven];
                array[nextEven] = array[nextOdd];
                array[nextOdd] = temp;
                nextOdd--;
            }
        }

        return array;
    }
}
