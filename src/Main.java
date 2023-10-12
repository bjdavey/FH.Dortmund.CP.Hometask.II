import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.time.Year;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        var cars = new ArrayList<Car>();
        // Fill with dummy Data
        for (int i = 1; i <= 30; i++) {
            cars.add(new Car(i, "makeTest" + i, "modelTest" + i, 1990 + i, "colorTest" + i, 5000 + 100 * i, "t" + i));
        }
        // ------------
        saveToFile(cars, "All");

        // a) a list of cars of a given brand
        var brand = "makeTest9";
        ArrayList<Car> listA = (ArrayList<Car>) cars.stream().filter(x -> x.make.equals(brand))
                .collect(Collectors.toList());
        saveToFile(listA, "listA");

        // b) a list of cars of a given model that have been in use for more than n
        // years
        var model = "modelTest5";
        var nYears = 20;
        int currentYear = Year.now().getValue();
        ArrayList<Car> listB = (ArrayList<Car>) cars.stream()
                .filter(x -> x.model.equals(model) && (currentYear - x.yearOfManufacture) > nYears)
                .collect(Collectors.toList());
        saveToFile(listB, "listB");

        // c) a list of cars of a given year of manufacture, the price of which is
        // higher than the specified one
        var yearOfManufacture = 2001;
        var priceThreshold = 5700;
        ArrayList<Car> listC = (ArrayList<Car>) cars.stream()
                .filter(x -> x.yearOfManufacture == yearOfManufacture && x.price > priceThreshold)
                .collect(Collectors.toList());
        saveToFile(listC, "listC");
    }

    static void saveToFile(ArrayList<Car> cars, String fileName) {
        PrintWriter writer;
        try {
            writer = new PrintWriter("output/" + fileName + ".txt", "UTF-8");
            for (var x : cars) {
                var str = "Id: " + x.id + ", Make: " + x.make + ", Model: " + x.model + ", Year Of Manufacture: "
                        + x.yearOfManufacture
                        + ", Color: " + x.color + ", Price: " + x.price + ", Registration Number: "
                        + x.registrationNumber;
                writer.println(str);
            }
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}