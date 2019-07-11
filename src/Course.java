public class Course {

    String name;
    int length; //minutes
    double price; //zl
    Category category;
//    int hoursAmount;
//    int minutesAmount;

    Course(String na, int len, Category cat, double pri){
        name = na;
        length = len;
        price = pri;
        category = cat;
    }

    String timeCounter(){
        int hoursAmount = length/60;
        int minutesAmount = length%60;
        return hoursAmount + " h " + minutesAmount + " min ";
    }

    String courseInfo(){
       String info = (name +  ", length: " + timeCounter() + "price: " + price + " zl.") + category.categoryInfo();
        return info;
    }
}
