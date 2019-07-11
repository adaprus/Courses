public class SpecialOffer {

    double calculateTotalPrice(double pr1, double pr2, double pr3){
        double totalPrice = pr1 + pr2 + pr3;

        return totalPrice;
    }

    double calculateDiscount(int discount, double totalPrice){
        double cos= 1-(1.0*discount/100);
        double discountPrice = (totalPrice * cos);
        System.out.println(discount);
        System.out.println(discountPrice);
        return discountPrice;
    }

    void show(int discount, double totalPrice, double discountPrice){
        System.out.println("Special offer! Buy 3 courses and save " + discount + "%");
        System.out.printf("  > Price after discount: %.2fzl (before: %.2fzl)", discountPrice, totalPrice);
    }
}
