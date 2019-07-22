package org.array;

public class MinHeap {

    private int[] harr;
    private int heapSize;

    public MinHeap(int[] arr, int size) {
        this.harr = arr;
        this.heapSize = size;
    }

    public void buildHeap() {
        int i = (heapSize - 1) / 2;
        while (i >= 0) {
            minHeapify(i);
            i--;
        }
    }

    private void minHeapify(int i) {
        int l = left(i);
        int r = right(i);
        int smallest = i;
        if (l < heapSize && harr[l] < harr[i]) {
            smallest = l;
        }
        if (r < heapSize && harr[r] < harr[smallest]) {
            smallest = r;
        }
        if (smallest != i) {
            int temp = harr[i];
            harr[i] = harr[smallest];
            harr[smallest] = temp;
            minHeapify(smallest);
        }
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private int left(int i) {
        return (2 * i + 1);
    }

    private int right(int i) {
        return (2 * i + 2);
    }

    public int extractMin() {
        if (heapSize == 0) {
            return Integer.MAX_VALUE;
        }
        int root = harr[0];
        if (heapSize > 1) {
            harr[0] = harr[heapSize - 1];
            minHeapify(0);
        }
        heapSize--;
        return root;
    }

    public int getMin() {
        return harr[0];
    }

    public void replaceMin(int x) {
        harr[0] = x;
        minHeapify(0);
    }

}
