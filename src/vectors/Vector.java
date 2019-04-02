package vectors;

public class Vector {

    private int[] array;

    public Vector(int... array) {
        this.array = array;
    }

    public Vector(int size) {
        this.array = new int[size];
    }

    public int[] getArray() {
        return this.array;
    }

    public int getValue(int index) {
        return this.array[index];
    }

    public int getCount() {
        return this.array.length;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setValue(int index, int value) {
        this.array[index] = value;
    }

    public String printArray() {
        String result = "";
        for (int element : array) {
            result += String.valueOf(element)+" ";
        }
        return result;
    }
}