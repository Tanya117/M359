package unit_4;

public class PigLatin {

        public static String translateWordToPigLatin(String w) {
            w = w.toLowerCase();
            if (vowelChecker(w) == true) {

                w += "yay";
            }
            else{
                String consonant = "";
                while(vowelChecker(w.substring(0,1)) != true) {
                    consonant += w.substring(0,1);
                    w = w.substring(1);
                }
                w = w + consonant + "ay";
            }
            return w;
        }

        public static boolean vowelChecker(String w) {
            if (w.substring(0, 1).equals("a") || w.substring(0, 1).equals("e") || w.substring(0, 1).equals("i")
                    || w.substring(0, 1).equals("o") || w.substring(0, 1).equals("u")) {
                return true;
            }
            else{
                return false;
            }
        }

        public static String toPigLatin(String phrase) {
            String pigPhrase = " ";

            while(phrase.indexOf(" ") >= 0){
                String specificWord = phrase.substring(0,phrase.indexOf(" "));
                pigPhrase += translateWordToPigLatin(specificWord) + " ";
                phrase = phrase.substring(phrase.indexOf(" ")+1);
            }
            pigPhrase += translateWordToPigLatin(phrase);
            String letterOne = pigPhrase.substring(0,1).toUpperCase();
            pigPhrase = pigPhrase.substring(1);
            return letterOne + pigPhrase;
        }




    }













