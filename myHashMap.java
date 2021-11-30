import java.util.*;
public class myHashMap {
    public static void main(String[] args) {
        HashMap<String, String>  trackMap = new HashMap<String, String>();
        trackMap.put("fun times", "ninjas");
        trackMap.put("good times", "dojos");
        trackMap.put("sad times", "samurai");
        Set<String> keys = trackMap.keySet();
        for(String key : keys){
            //System.out.println(key);
            System.out.println(trackMap.get(key));
        }
    }
}