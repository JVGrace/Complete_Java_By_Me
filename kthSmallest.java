import java.util.PriorityQueue;

public class kthSmallest {
    public static int kthSmallestElement(int[] arr, int N, int K) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            minHeap.add(arr[i]);
        }
        for (int i = 0; i < K - 1; i++) {
            minHeap.poll();
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] arr = {42, 49, 12, 11, 73, 85, 39};
        int N = arr.length;
        int K = 4;
        System.out.println("K'th smallest element is " + kthSmallestElement(arr, N, K));
    }
}