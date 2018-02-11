package zadanie8;

public class Zadanie8 {

    public int getPosition(int[] inputArray) {
        if(inputArray == null || inputArray.length < 1){
            return -1;
        }
        int result = -1;
        int maxIndex = inputArray.length-1;
        int maxValue = inputArray[0];

        for (int i = 1; i < maxIndex; i++) {
            if(inputArray[i] >= maxValue) {
                maxValue = inputArray[i];
                if(maxValue > inputArray[i-1] && maxValue> inputArray[i+1]){
                    result = i;
                }
            }
        }

        if(inputArray[maxIndex] > maxValue && inputArray[maxIndex] > inputArray[maxIndex -1 ]){
            return maxIndex;
        }
        if(inputArray[0] >= maxValue && inputArray[0] > inputArray[1]){
            return 0;
        }

        return result;
    }
}
