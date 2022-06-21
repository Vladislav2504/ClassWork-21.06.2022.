import api.Response;
import api.Result;
import com.google.gson.Gson;
import example.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("DDK");
        try (Stream<String> lines = Files.lines(path)){
            lines.forEach(System.out::println);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
//
//        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
//        Stream<Integer> iterate = Stream.iterate(0, integer -> integer + 2);
//
//
//        integerStream.sorted(Comparator.reverseOrder()).forEach(System.out::println);

//        Supplier<Integer> supLier1 =() -> new Random().nextInt(10);
//
//        System.out.println(supLier1.get());
//        System.out.println(supLier1.get());
//        System.out.println(supLier1.get());
////        System.out.println(supLier1.get());
//
        Supplier<Response> supplier = Main::getUser;
        Response response0 = supplier.get();
//
////        Supplier<Integer> t = () -> new Random().nextInt(10);
////        Stream<Integer> test = Stream.generate(t);
////        test.forEach(integer -> System.out.println(integer));
//
        List<Result> results = response0.getResults();

//
//
//        Function<Result, City> func =  result ->
//                new City(result.getLocation().getCoordinates().getLatitude(),
//                        result.getLocation().getCoordinates().getLongitude(),
//                        result.getLocation().getCity());
//
//        results.stream().map(func).forEach(System.out::println);
//        System.out.println();
//
//
//
        Stream<Result> stream =  results.stream()
                .peek(result -> result.getName().setTitle(result.getName().getTitle().toUpperCase()))
                .peek(result -> System.out.println(result.getName().getFirst()))
                .filter(result -> result.getRegistered().getAge() > 15)
                .skip(19).distinct().filter(result -> result.getLocation().getCity().startsWith("M"));



        IntStream intStream = results.stream().mapToInt(value -> value.getRegistered().getAge());
        OptionalDouble average = intStream.average();
        if (average.isPresent()){
            System.out.println(average.getAsDouble());
        }
//        Stream<Result> stream1 = results.stream();
//        Stream<City> cityStream = stream.map(func);
//        cityStream.forEach(System.out::println);
//
        String s = null;
        Optional<String> v = Optional.of(s);
        v.ifPresent(System.out::println);

//        Optional<Result> any = stream1.filter(result -> result.getEmail().isEmpty()).findFirst();
//        any.ifPresent(result -> System.out.println(result));


        Function<Result, User> function = r -> new User(r.getName().getFirst(), r.getRegistered().getAge(), r.getGender());

//        Stream<Result> stream = results.stream();
        Stream<User> userStream = stream.map(function);


        Predicate<User> predicate = user -> user.getAge()<10 & user.getGender().equals("male");
        Stream<User> userStreamNew = userStream.filter(predicate);


        Consumer<User> consumer = System.out::println;

        userStreamNew.forEach(consumer);


    }


    public static Response getUser() {
        String uri = "https://randomuser.me/api/?results=1000";
        //TODO make different methods
        //String uri = "?results=10&noinfo";
        //String uri = "?gender=female";

        //String uri = "?format=csv";
        //JSON (default), PrettyJSON or pretty, CSV, YAML, XML
        //String uri = "?nat=gb(,fi)"
        //v1.3: AU, BR, CA, CH, DE, DK, ES, FI, FR, GB, IE, IR, NO, NL, NZ, TR, US
        //String uri = "?results=5&inc=name,gender,nat& noinfo";
        //String uri = "?inc=gender(,name)";
        //String uri = "?exc=login";
        String get = "GET";
        URL url;
        HttpURLConnection con;
        BufferedReader in;
        StringBuilder content = new StringBuilder();
        Gson gson = new Gson();
        Response response;
        try {
            url = new URL(uri);
            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod(get);
            con.getResponseCode();
            in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            response = gson.fromJson(content.toString(), Response.class);
            in.close();
            con.disconnect();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return response;
    }
}
