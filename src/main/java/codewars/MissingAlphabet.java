package codewars;

public class MissingAlphabet {
  public static String insertMissingLetters(String inputString) {
    System.out.println(inputString);
    String AZ = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String az = "abcdefghijklmnopqrstuvwxyz";
    String s = "";
    String strEX = "";
    for (int i = 0; i < inputString.length(); i++) {
      AZ = AZ.replace(inputString.toUpperCase().charAt(i), '.');
    }
    for (int i = 0; i < inputString.length(); i++) {
      strEX += (s.indexOf(inputString.charAt(i)) != -1) ? inputString.charAt(i) : inputString.charAt(i) + AZ.substring(az.indexOf(inputString.charAt(i)));
      s += inputString.charAt(i);
    }
    strEX = strEX.replace(".", "");
    return strEX;
  }
}
