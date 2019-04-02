package vectors;

public class Operations {

    public static Vector sum (Vector v1, Vector v2) {
        Vector result = null;
        if (v1.getCount()==v2.getCount()) {
            int size = v1.getCount();
            int tmpValue;
            result = new Vector(size);
            for (int i=0; i<size; i++) {
                tmpValue = v1.getValue(i) + v2.getValue(i);
                result.setValue(i,tmpValue);
            }
        }
        return result;
    }

    public static double evclNorma(Vector v1){
        int size = v1.getCount();
        int tmpValue = 0;
        for (int i=0; i<size; i++) {
            tmpValue = tmpValue + (v1.getValue(i))*(v1.getValue(i));
        }
        return Math.sqrt(tmpValue);
    }

    public static Vector mult(Vector v1, Vector v2) {
        Vector result = null;
        if (v1.getCount()==v2.getCount()) {
            int size = v1.getCount();
            int tmpValue;
            result = new Vector(size);
            for (int i=0; i<size; i++) {
                tmpValue = v1.getValue(i) * v2.getValue(i);
                result.setValue(i,tmpValue);
            }
        }
        return result;
    }

    public static Vector multNVect (Vector v1,int n) {
        Vector result = null;
        int size = v1.getCount();
        int tmpValue;
        result = new Vector(size);
        for (int i=0; i<size; i++) {
            tmpValue = v1.getValue(i) * n;
            result.setValue(i,tmpValue);
        }
        return result;
    }

    public static int dotProduct(Vector v1, Vector v2) {
        Vector tmpArray = mult(v1,v2);
        int result = 0, size = tmpArray.getCount();
        for (int i=0; i<size; i++) {
            result += tmpArray.getValue(i);
        }
        return result;
    }

    public static int length(Vector v1) {
        return dotProduct(v1,v1);
    }

    public static int max(Vector v1){
        int size = v1.getCount();
        int max = 0;
        for (int i = 0 ; i < size; i++) {
            if (v1.getValue(i)> max){
                max = v1.getValue(i);
            }
        }
        return max;
    }

    public static int min (Vector v1){
        int size = v1.getCount();
        int min = 1000;
        for (int i = 0 ; i < size; i++) {
            if (v1.getValue(i)< min){
                min = v1.getValue(i);
            }
        }
        return min;
    }
}