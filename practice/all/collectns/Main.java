package collectns;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    ArrayList<String> colorList = new ArrayList<>();
    colorList.add("Red");
    colorList.add("Green");
    colorList.add("Blue");
    colorList.add("Yellow");
    colorList.add("Orange");

    System.out.println("Colors in the ArrayList:");
    for (String color : colorList) {
      System.out.println(color);
    }
  }
}
