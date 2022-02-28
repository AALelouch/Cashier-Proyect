package model;

public class primeNumbers {
    double number;

    public primeNumbers(double number) {
        this.number = number;
    }

    public double factorialNumber(){
        double factorial = 1;
        for (int count=2; count<=number; count++){
            factorial =factorial * count;
        }
        return factorial;
    }

    public String calculateWilsonTheorem(){
        double wilsonTheorem = (factorialNumber()+1)%number;

        if (number == 1){
            return "It's prime number";
        }
        else if (wilsonTheorem == 0){
            return "It's prime number";
        }else{
            return "It's compound number";
        }
    }

    public String analiseNumber(){
        int numberOfDivisor = 0;
        for(int count = 1; count<=number+1; count++){
            if (number%count==0){
                numberOfDivisor = numberOfDivisor + 1;
            }
        }
        if (numberOfDivisor==2){
            return "It's prime number";
        }else if (number==1){
            return "It isn't prime or compound";
        } else {
            return "It's compound number";
        }
    }

}
