package codewars;

public class WeightSort {

  public static String orderWeight(String strng) {


    final String[] strings = strng.split(" ");

    for(int i = 0; i < strings.length; i++){
      int minW = 999999;
      int minWIndex = -1;
      for(int j = i; j < strings.length; j++){
        int weightOfString = countWeightOfString(strings[j]);
        if(weightOfString < minW){
          minW = weightOfString;
          minWIndex = j;
        }else if(weightOfString == minW){
          if(strings[j].compareTo(strings[minWIndex]) < 0) {
            minWIndex = j;
          }
        }
      }
      swap(strings, i, minWIndex);
    }

    return String.join(" ", strings);

  }

  private static void swap(final String[] strings, final int i, final int minWIndex) {
    String a = strings[i];
    String b = strings[minWIndex];
    strings[i] = b;
    strings[minWIndex] = a;
  }

  private static int countWeightOfString(final String input) {
    int w = 0;
    for (Character ch : input.toCharArray()) {
      w += Character.getNumericValue(ch);
    }
    return w;
  }

}