public class Arithmetic {

    //constructor
    public Arithmetic(){

    }



    public static void sum( Result sumaResult, double a, double b){
        double operation = a+b;
        sumaResult.setResultSum(operation);
    }

    public static void  substraction( Result substractionResult, double a, double b){
        double operation = a-b;
        substractionResult.setResultSubstraction(operation);
    }

    public static void  multiplication( Result multiplicationResult, double a, double b){
        double operation = a*b;
        multiplicationResult.setResultMultiplication(operation);
    }

    public static void  division( Result divisionResult, double a, double b){
        double operation = a/b;
        divisionResult.setResultDivison(operation);
    }


}
