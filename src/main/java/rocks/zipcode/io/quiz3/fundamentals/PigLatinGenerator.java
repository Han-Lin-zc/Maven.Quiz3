package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {

    public String translate(String str) {
        String[] arr = str.split(" ");
        StringBuilder newStr = new StringBuilder();

        for (String s : arr) {
            newStr.append(pigLatin(s)).append(" ");
        }
        return newStr.toString().substring(0, newStr.length() - 1);
    }


    public String pigLatin(String string) {

        if (!VowelUtils.hasVowels(string)) {
            return string + "ay";

        } else if (VowelUtils.startsWithVowel(string)) {
            return string + "way";

        } else if (!VowelUtils.startsWithVowel(string)) {
            int index = VowelUtils.getIndexOfFirstVowel(string);
            return string.substring(index) + string.substring(0,index) + "ay";
        }
        return null;
    }

}
