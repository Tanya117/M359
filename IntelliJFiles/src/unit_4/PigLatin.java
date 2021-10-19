package unit_4;

public class PigLatin {

        public static String translateWordToPigLatin (String w){
            w = "";
            if (w.substring(0,1).equalsIgnoreCase("a")
                    || w.substring(0,1).equalsIgnoreCase("e")
                    || w.substring(0,1).equalsIgnoreCase("i")
                    || w.substring(0,1).equalsIgnoreCase("o")
                    || w.substring(0,1).equalsIgnoreCase("u")){

                w += "yay";
                return w;


            }else{
                String consonant = "";

                if(w.indexOf("a")>0){
                    consonant = w.substring(0,w.indexOf("a")); //black
                }else if(w.indexOf("e")>0){
                    consonant = w.substring(0,w.indexOf("e"));
                }else if(w.indexOf("i")>0){
                    consonant = w.substring(0,w.indexOf("i"));
                }else if(w.indexOf("o")>0){
                    consonant = w.substring(0,w.indexOf("o"));
                }else if(w.indexOf("u")>0){
                    consonant = w.substring(0,w.indexOf("u"));
                }else if(w.indexOf("y")>0) {
                    consonant = w.substring(0,w.indexOf("y"));
                }

                w = w.substring(consonant.length()) + consonant + "ay";
                return w;

            }

        }



        public static String toPigLatin(String phrase) {
        String pigPhrase = " ";
        String str = phrase.substring(0,phrase.indexOf(" "));
        while(phrase.indexOf(" ") > 0 ){ pigPhrase += translateWordToPigLatin(str);
        phrase = phrase.substring(str.length());
           }
        return pigPhrase;
        }

    }












}
