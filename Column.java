import java.util.ArrayList;

public class Column{
    public static ArrayList<Column> all = new ArrayList<>();
    private final String name;
    private static int length;
    private ArrayList<Double> contents = new ArrayList<>();
    public Column(String nam, int len){
        name = nam;
        length = len;
        all.add(this);
    }
    public ArrayList<Double> addToContents(double con){
        if (contents.size() <= length) {
            contents.add(con);
        } else {
          contents.set(contents.size() - 1, con);
        }
        return contents;
    }
    public String getName(){
        return name;
    }
    public int getLength(){
        return length;
    }
    public ArrayList<Double> getContents(){
        return contents;
    }
}
