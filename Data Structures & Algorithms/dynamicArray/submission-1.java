class DynamicArray {

    private int capacity;
    private int size;
    private int[] array;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.array = new int[capacity];
    }

    public int get(int i) {
        return this.array[i];
    }

    public void set(int i, int n) {
        this.array[i] = n;
    }

    public void pushback(int n) {
        if (this.size == this.capacity) {
            this.resize();
        }
        this.array[this.size] = n;
        this.size++;
    }

    public int popback() {
        this.size--;
        return this.array[this.size];
    }

    public void resize() {
        this.capacity *= 2;
        int[] new_array = new int[this.capacity];
        for (int i = 0; i < this.size; i++) {
            new_array[i] = this.array[i];
        }
        this.array = new_array;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}