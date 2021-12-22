public class NumValuesLessThanTen {

    /* Schreiben Sie eine Methode, die ein int[] values übergeben bekommt und die Anzahl der Werte, die kleiner als 10 sind, zurückgibt.
    Lagern Sie dabei die Abfrage, ob ein Wert kleiner als 10 ist, in eine eigene Methode aus.*/
    public static int intArrayNumValuesLessThanTenWithMethod(int[] values, int ten) {
        return 0;
    }

    public static void main(String[] args) {
        int[] testArray = {23, 5, 17, 98, 9, 10, 62, 13, 4, -10};
        int ten = 10;
        int testNum = intArrayNumValuesLessThanTenWithMethod(testArray, ten);

        if(testNum == 4) {
            System.out.print("Correct!");
        } else {
            System.out.println("Your solution was " + testNum + " but 4 is correct.");
        }
    }
}
