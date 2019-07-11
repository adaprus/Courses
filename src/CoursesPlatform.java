public class CoursesPlatform {
    public static void main(String[] args) {

        Category category1 = new Category("Programming", "Best programming tutorials online");
        Category category2 = new Category("Self development", "Learn How to become the best version of Yourself Today");


        Course course1 = new Course("Java", 5400, category1, 199);
        Course course2 = new Course("Android", 3600, category1, 149);
        Course course3 = new Course("Fast Reading", 2200, category2, 139);

        course1.timeCounter();
        course2.timeCounter();
        course3.timeCounter();

        System.out.println("There are 3 courses in our database:");

        System.out.println(course1.courseInfo());
        System.out.println(course2.courseInfo());
        System.out.println(course3.courseInfo());

        SpecialOffer specialOffer = new SpecialOffer();
        double totalPrice = specialOffer.calculateTotalPrice(course1.price, course2.price, course3.price);
        System.out.println(totalPrice);
        int discount = 10;
        double discountPrice = specialOffer.calculateDiscount(discount, totalPrice);

        specialOffer.show(discount, totalPrice, discountPrice );

    }
}
