package vectors;

/**
 * Создать векторы фиксированной размерности.
 Реализовать методы:
 -доступа к элементам вектора (получения значения и изменения значения),
 -получения «длины» вектора (количества его элементов),
 -поиска минимального и максимального значений из элементов вектора,
 -сортировки вектора (по возрастанию или убыванию – на ваш выбор),
 -нахождения евклидовой нормы,
 -умножения вектора на число,
 -сложения двух векторов,
 -нахождения скалярного произведения двух векторов
 */
public class Main {

    private static final Vector test1 = new Vector(1,-2,10);
    private static final Vector test2 = new Vector(-3,1,-11);

    public static void main(String args[]) {
        System.out.println("Максимальная координата вектора один: " + test1.printArray() + " = " + Operations.max(test1));
        System.out.println("Минимальная координата вектора один: " + test1.printArray() + " = " + Operations.min(test1));
        System.out.println("«Длинна» вектора один  " + test1.printArray() + " = " + test1.getCount());
        System.out.println("«Длинна» вектора два   " + test2.printArray() + " = " + test2.getCount());
        System.out.println("Евклидова норма вектора один  " + test1.printArray() + " = " + Operations.evclNorma(test1));
        System.out.println("Умножение вектора один на число 3: " + test1.printArray() + " = " + Operations.multNVect(test1,3).printArray());

        System.out.println(test1.printArray() + " +  " +
                test2.printArray() + " =  " +
                Operations.sum(test1, test2).printArray());

        System.out.println("Скалярное произведение (" + test1.printArray() + ") and ( " +
                test2.printArray() + ") = " +
                Operations.dotProduct(test1, test2));

        System.out.println("Получение длинны вектора (" + test1.printArray() + ") = "
                + Operations.length(test1));
    }
}