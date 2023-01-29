package TrafficLights;

import java.util.Objects;

public class TrafficLights {
    /*You're writing code to control your town's traffic lights.
    You need a function to handle each change from green, to yellow, to red, and then to green again.
    Complete the function that takes a string as an argument representing the current state of the light
    and returns a string representing the state the light should change to.
    For example, when the input is green, output should be yellow.*/

    public static void main(String[] args) {
        System.out.println(updateLight("yellow"));
    }

    public static String updateLight(String current) {
        if (Objects.equals(current, "green")) {
            return "yellow";
        } else if(Objects.equals(current, "yellow")) {
            return "red";
        } else{
            return "green";
        }
    }

    //Solution with swith
    /*public static String updateLight(String current) {
        switch (current) {
            case "red": return "green";
            case "yellow": return "red";
            case "green": return "yellow";
            default: throw new IllegalArgumentException();
        }
    }*/

    //Solutionn with ternary operator
    /*public static String updateLight(String current) {

        return (current.equals("red") ? "green" : current.equals("yellow") ? "red" : "yellow");

    }*/
}
