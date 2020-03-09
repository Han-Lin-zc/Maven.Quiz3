package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {

    public String translate(String str) {
        String[] s = str.split(" ");

        for (String newStr : s) {

            if (!VowelUtils.hasVowels(newStr)) {
                return newStr + "ay";
            } else if (VowelUtils.startsWithVowel(newStr)) {
                return newStr + "way";
            } else if (!VowelUtils.startsWithVowel(newStr)) {
                int index = VowelUtils.getIndexOfFirstVowel(str);
                return newStr.substring(index) + newStr.substring(0,index) + "ay";
            }
        }
        return null;
    }
}
