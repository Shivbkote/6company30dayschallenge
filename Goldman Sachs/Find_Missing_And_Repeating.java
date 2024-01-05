
class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
         int num = arr.length;

        int[] data = new int[2];

        // duplicate number
        for (int i = 0; i < num; i++) {
            if (arr[Math.abs(arr[i]) - 1] > 0) {
                arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
            } else {
                data[0] = Math.abs(arr[i]);
            }
        }

       //missing num
        for (int i = 0; i < num; i++) {
            if (arr[i] > 0) {
                data[1] = i + 1;
                break;
            }
        }

        return data;
    }
    
    
}