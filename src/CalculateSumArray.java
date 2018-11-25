import java.security.SecureRandom;

public class CalculateSumArray {

    public static int calculateSize(int[] arr) {
        int sizeOfNewArray;
        if (arr.length % 3 != 0) {
            sizeOfNewArray = (arr.length / 3) + 1;
        } else
            sizeOfNewArray = (arr.length / 3);

        return sizeOfNewArray;
    }

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        int[] arr = new int[random.nextInt(15) + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println("Array size: " + arr.length);
        int thread = 3;
//        int sizeOfNewArray = calculateSize(arr);
//
//        int[][] arrNew = new int[3][sizeOfNewArray];
//        arrNew[2] = new int[arr.length / 3 + arr.length % 3];
//
//        int k = 0;
//        for (int i = 0; i < arrNew.length; i++) {
//            for (int j = 0; j < arrNew[i].length; j++) {
//                if (k < arr.length) {
//                    arrNew[i][j] = arr[k++];
//                } else
//                    arrNew[i][j] = 0;
//            }
//        }
//


        for (int[] i : Service.convertor(arr, thread)) {
            System.out.println();
            for (int j : i) {
                System.out.print(j + " ");
            }
        }

        System.out.println();
        for (int i = 0; i < Service.convertor(arr, thread).length; i++) {
            new Service(Service.convertor(arr, thread)[i]).run();
            System.out.println("Sum is: " + Service.sum);

        }

    }
}
