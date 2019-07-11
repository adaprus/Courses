public class Category {
    String name;
    String description;

    Category(String na, String des){
        name = na;
        description = des;
    }

    String categoryInfo(){
        String info = ", category: " + name + ". Category description: " + description;
        return info;
    }
}
