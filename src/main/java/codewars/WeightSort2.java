package codewars;

import java.util.*;

public class WeightSort2 {

  public static String orderWeight(String strng) {

    final String[] strings = strng.split(" ");

    List<String> stringList = Arrays.asList(strings);


    stringList.sort((s1, s2) -> {
      if(countWeightOfString(s1) == countWeightOfString(s2)){
        return s1.compareTo(s2);
      }else{
        return countWeightOfString(s1) - countWeightOfString(s2);
      }
    });

    return String.join(" ", stringList);

  }

  private static int countWeightOfString(final String input) {
    int w = 0;
    for (Character ch : input.toCharArray()) {
      w += Character.getNumericValue(ch);
    }
    return w;
  }

}