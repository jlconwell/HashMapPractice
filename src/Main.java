import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ArrayList<HashMap<String, HashMap<String, String>>> jake = new ArrayList();
//        HashMap<String, String> faves = new HashMap<>();
//        faves.put("Jake", "Triangle Strategy");
//        faves.put("Pat", "Zelda");
//        faves.put("Chris", "Fortnite");
//
//
//
////        jake.add(HashMapCreator.hashMapCreator("Pat", "Zelda"));
////        jake.add(HashMapCreator.hashMapCreator("Chris", "Fortnite"));
////
//        jake.add(faves)
//
////        System.out.println(faves.keySet());
//        System.out.println("Favorite Games of Favorite People");
//        for (HashMap<String, String> titles : jake) {
//            for(Map.Entry<String, String> list : titles.entrySet()) {
//                System.out.println(list.getKey() + ": " + list.getValue());
//            }
//        }
//    }9
        HashMap test1 = new HashMap();
        HashMap test2 = new HashMap();
        HashMap test3 = new HashMap();

        test1.put("inner1key","inner1value");
        test2.put("inner2key","inner2value");
        test3.put("inner3key","inner3value");

        HashMap one = new HashMap();
        HashMap two = new HashMap();
        HashMap three = new HashMap();

        one.put("outerkey1", test1);
        two.put("outerkey2", test2);
        three.put("outerkey3", test3);

        jake.add(one);
        jake.add(two);
        jake.add(three);

        for (HashMap<String, HashMap<String, String>> outer : jake) {
            for (Map.Entry<String, HashMap<String, String>> inner: outer.entrySet()) {
                for (Map.Entry<String, String> mostInner: inner.getValue().entrySet()) {
                    if (mostInner.getValue() == "inner1value") {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }

                }
            }

        }

//        System.out.println((jake.get(0)).values());
//        System.out.println(jake);

    }
}