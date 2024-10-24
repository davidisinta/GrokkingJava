package SearchEngine;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Searcher {
    List<String> dataBank;
    public Searcher(){
        dataBank = new ArrayList<>();
        dataBank.add("David");
        dataBank.add("Ndeti");
        dataBank.add("Momodou");
        dataBank.add("Che");
        dataBank.add("Evanilson");
        dataBank.add("Dragushin");
    }
    public List<String> processQuery(String searchParam){
        for(String text: dataBank){
            if(text.contains(searchParam)) return Arrays.asList(text);
        }
        return Arrays.asList("Sorry your search yielded no results!!");

    }
    public void addToDataBank(String text){
        dataBank.add(text);

    }
}
