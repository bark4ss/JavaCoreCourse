package jsonmarshalling;

import jsonmarshalling.model.Car;
import jsonmarshalling.model.Comfort;
import jsonmarshalling.model.User;
import jsonmarshalling.util.JsonConverter;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class App {

    private static final List<Car> cars = List.of(
            new Car("yellow", "renault", Comfort.COMPACT),
            new Car("green", "porsche", Comfort.LUX),
            new Car("red", "bmw", Comfort.SPORT)
    );

    private static final User user = new User(11,"Denis","999","Middle");

    public static void main(String[] args) throws IOException {
        //https://www.baeldung.com/jackson-object-mapper-tutorial
        //https://www.baeldung.com/jackson-annotations
        JsonConverter<Car> carJsonConverter = new JsonConverter<>();
        JsonConverter<User> userJsonConverter = new JsonConverter<>();
        File carJsonFile = new File("car.json");
        File carJsonArrFile = new File("cars.json");

        File userJsonFile = new File("user.json");

        String carToJson = carJsonConverter.convertObjToJson(carJsonFile,cars.get(0));
        System.out.println(carToJson);

        String carsToJson = carJsonConverter.convertObjArrayToJson(carJsonArrFile,cars);
        System.out.println(carsToJson);

        Car car = carJsonConverter.convertJsonToObj(carToJson,Car.class);
        System.out.println(car);


        Car carFromJsonFile = carJsonConverter.convertJsonToObj(carToJson, Car.class);
        System.out.println(carFromJsonFile);

        List<Car> carArray = carJsonConverter.convertJsonToObjArr(carJsonArrFile);
        System.out.println("List of cars:" + carArray);

        String color = carJsonConverter.getObjJsonNode(carToJson, "color");
        System.out.println(color);

        Map<String, Object> carMapFromJson = carJsonConverter.convertJsonToMap(carJsonFile);
        System.out.println(carMapFromJson);

        String userToJson = userJsonConverter.convertObjToJsonWithRoot(userJsonFile,user);
        System.out.println(userToJson);

    }
}
