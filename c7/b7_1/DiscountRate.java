package c7.b7_1;

public class DiscountRate {
    public static final double serviceDiscountPremium = 0.2;
    public static final double serviceDiscountGold = 0.15;
    public static final double serviceDiscountSilver = 0.1;
    public static final double productDiscountPremium = 0.1;
    public static final double productDiscountGold = 0.1;
    public static final double productDiscountSilver = 0.1;


    public static double getServiceDiscountRate(String type){
        switch (type){
            case "Premium": return serviceDiscountPremium;
            case "Gold": return serviceDiscountGold;
            case "Silver": return serviceDiscountSilver;
            default: return 0;
        }
    }
    public static double getProductDiscountRate(String type){
        switch (type){
            case "Premium" : return productDiscountPremium;
            case "Gold" : return productDiscountGold;
            case "Silver" : return productDiscountSilver;
            default: return 0;
        }
    }



}
