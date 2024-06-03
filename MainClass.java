package Design_Pattern.SingleTone;

public class MainClass {

    public static void main(String[] args) {
        RegularCitizen r1 = new RegularCitizen("Adam",10000);
        RegularCitizen r2 = new RegularCitizen("Bob",20000);
        System.out.println(r1.getAnnualTax());
        System.out.println(r2.getAnnualTax());

        GovtCitizen gv1 = new GovtCitizen("Salek",1000);
        GovtCitizen gv2 = new GovtCitizen("Malek",5000);
        System.out.println(gv1.getAnnualTax());
        System.out.println(gv2.getAnnualTax());

    }
}
