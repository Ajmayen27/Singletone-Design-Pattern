package Design_Pattern.SingleTone;

public class RegularCitizen {

    private String name;
    private int Income;

    public RegularCitizen(String name, int income) {
        System.out.println("RegularCitizen Created");
        this.name = name;
        this.Income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIncome() {
        return Income;
    }

    public void setIncome(int income) {
        Income = income;
    }

    public Integer getAnnualTax(){
        GetLogicClass g1 = GetLogicClass.getInstance();
        return g1.calculatetax(getIncome(),5);
    }



}
