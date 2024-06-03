package Design_Pattern.SingleTone;

public class GovtCitizen {

    private String name;
    private Integer income;

    public GovtCitizen(String name, Integer income) {
        System.out.println("GovtCitizen Created");
        this.name = name;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    public Integer getAnnualTax(){
        GetLogicClass g1 = GetLogicClass.getInstance();
        return g1.calculatetax(getIncome(),5);
    }
}


