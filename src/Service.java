

public class Service implements Runnable {


    static int[] array;
    static int sum;

    public Service(int[] array) {
        Service.array = array;
    }


    public static int[][] converter(int[] arr, int thread) {

        int sizeOfNewArray;
        if (arr.length % thread != 0) {
            sizeOfNewArray = (arr.length / thread) + 1;
        } else
            sizeOfNewArray = (arr.length / 3);

        int[][] arrNew = new int[thread][sizeOfNewArray];
        arrNew[thread-1] = new int[arr.length / thread + arr.length % thread];

        int k = 0;
        for (int i = 0; i < arrNew.length; i++) {
            for (int j = 0; j < arrNew[i].length; j++) {
                if (k < arr.length) {
                    arrNew[i][j] = arr[k++];
                } else
                    arrNew[i][j] = 0;
            }
        }
        return arrNew;
    }


    @Override
    public void run() {

        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        Service.sum += sum;
    }


}
