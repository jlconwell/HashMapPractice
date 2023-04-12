import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ArrayList<HashMap<String, String>> jake = new ArrayList();
        HashMap<String, String> faves = new HashMap<>();
        faves.put("Jake", "Triangle Strategy");
        faves.put("Pat", "Zelda");
        faves.put("Chris", "Fortnite");



//        jake.add(HashMapCreator.hashMapCreator("Pat", "Zelda"));
//        jake.add(HashMapCreator.hashMapCreator("Chris", "Fortnite"));
//
        jake.add(faves);

//        System.out.println(faves.keySet());
        System.out.println("Favorite Games of Favorite People");
        for (HashMap<String, String> titles : jake) {
            for(Map.Entry<String, String> list : titles.entrySet()) {
                System.out.println(list.getKey() + ": " + list.getValue());
            }
        }
    }
}