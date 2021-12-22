public class NumValuesLessThanTen {

    /* Schreiben Sie eine Methode, die ein int[] values übergeben bekommt und die Anzahl der Werte, die kleiner als 10 sind, zurückgibt.
    Lagern Sie dabei die Abfrage, ob ein Wert kleiner als 10 ist, in eine eigene Methode aus.*/
    public static int intArrayNumValuesLessThanTenWithMethod(int[] values, int ten) {
        // Ist das Array leer wird 0 zurückgegeben.
        if(values == null || values.length == 0) {
            return 0;
        }

        int num = 0;

        // Das gesamte Array wird mit einer for-Schleife durchlaufen.
        // Für jede Zahl kleiner 10 wird num um 1 inkrementiert.
        for (int i = 0; i < values.length; i++) {
            if(isLessThanTen(values[i], ten)) {
                num++;
            }
        }

        return num;
    }

    // Diese Methode gibt true zurück, wenn die in value übergebene Zahl kleiner ist als die in ten übergebene Zahl.
    public static boolean isLessThanTen(int value, int ten) {
        if(value < ten) {
            return true;
        }
        return false;
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
