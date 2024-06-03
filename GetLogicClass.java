package Design_Pattern.SingleTone;

public class GetLogicClass {

    public static GetLogicClass instance = null;

    private GetLogicClass() {
        System.out.println("Tax Calculation logic");
    }
    public static GetLogicClass getInstance(){
         synchronized(GetLogicClass.class) {
             if (instance == null) {
                 instance = new GetLogicClass();
             }
             return instance;
         }
    }
    public Integer calculatetax(Integer income, Integer tax) {
        return income / tax;
    }
}
