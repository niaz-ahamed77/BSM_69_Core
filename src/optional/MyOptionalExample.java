package optional;

import java.util.Optional;

public class MyOptionalExample {
    public static void main(String[] args) {
        //optional is class which is used to avoid null pointer exception
        //many predefined methods which return type of optional

        Optional<String> op = Optional.of("Allen");
        Optional empty = Optional.empty();
        Optional<String> value = Optional.ofNullable("Black");
        Optional<String> value1 = Optional.ofNullable(null);

        System.out.println(op+ "," + empty + "," + value);
        System.out.println(op.get()+ "," + empty.orElseGet(()->"null value") + "," + value.get());
        //? ternary operator

        String name = value.filter(x->x.equals("Allen")).orElse("Name is not matching or name is Null");
        System.out.println(name);
        
        String upperCaseValue = value1.map(String::toUpperCase).orElse("value is null");
        System.out.println(upperCaseValue);

        value1.filter(x->x.equals("Black"))
            .orElseThrow(() -> new IllegalArgumentException("Name is not matching"));

        if(value1.isPresent()){
            System.out.println(value1);
        } else{
            System.out.println("Name is not found");
        }

        value1.ifPresent((System.out::println));


        Optional<String> gender = Optional.ofNullable("MALE");
        System.out.println(gender.orElseGet(()->"N/A"));    //MALE
    }
}
