import java.util.ArrayList;

public class collection {
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>();

        name.add("omkar");
        name.add("meow");
        name.add("roma");

        System.out.println(name.get(0));
        System.out.println(name.size());

        //remove element
        //name.remove("roma");
        System.out.println(name.get(2));

        // if contains -- will return true

        System.out.println(name.contains("meow"));


        System.out.println(name.isEmpty());     //self explanatory


        //give index of



    }
}
