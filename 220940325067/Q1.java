import java.util.ArrayList;

public class Q1{
    public static void main(String[] args) {
        ArrayList<String> colors =  new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Elements of array list are: ");
        for(String s:colors)
        {
            System.out.println(s);
        }
    }
}