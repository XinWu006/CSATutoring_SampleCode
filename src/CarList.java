import java.util.ArrayList;

public class CarList {
    public static void main(String[] args) {
        // Create an ArrayList of String representing car brands
        ArrayList<String> carList = new ArrayList<>();

        /* Add car brands to the list
         * o.add(String)
         */
        carList.add("Toyota");
        carList.add("Tesla");
        carList.add("Ford");
        printCarArrayList(carList);
        /* Add car brands to a specific position in the list
         * o.add(int, String)
         */
        carList.add(1,"Benz");
        carList.add(0,"Su7");
        printCarArrayList(carList);


        /* Get the first car brand from the list
         * o.get(int)
         */
        System.out.println("My first car is " + carList.get(0));


        /* Get the size of the list
         * o.size()
         */
        int size = carList.size();
        System.out.println("\nNumber of car brands in the list: " + size);


        /* Remove a car brand from the list
         * remove(int)
         */
        carList.remove(1);
        printCarArrayList(carList);
        carList.remove(carList.size() - 1);
        printCarArrayList(carList);


        /* Check if the list contains a specific car brand
         * o.contains()
         */
        boolean containsTesla = carList.contains("Tesla");
        System.out.println("\nDoes the list contain the Tesla? " + containsTesla);
    }

    public static void printCarArrayList(ArrayList<String> carList) {
        System.out.println("\nCar brands in the list:");
        for (int i = 0; i < carList.size(); i++) {
            System.out.print(carList.get(i) + " ");
        }
//        for (String car : carList) {
//            System.out.print(car + " ");
//        }
        System.out.println();
    }
}