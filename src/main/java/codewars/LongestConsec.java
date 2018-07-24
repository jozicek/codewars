package codewars;

/**
 * Hlada najdlhsiu seqvenciu za sebou iducich k retazcov z pola strarr.
 */
public class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {

        if (strarr.length == 0 || strarr.length < k || k <= 0) {
            return "";
        }

        String max = "";

        for (int i = 0; i <= strarr.length - k ; i++) {
            StringBuilder temp = new StringBuilder();
            for (int j = i; j < i + k; j++){
                temp.append(strarr[j]);
            }
            if(temp.length() > max.length()) {
                max = temp.toString();
            }
        }

        return max;
    }
}
