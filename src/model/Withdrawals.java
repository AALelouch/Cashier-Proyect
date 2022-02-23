package model;

public class Withdrawals {
    private int cashRequest = 0;
    private short fiftyBill = 0;
    private short twentyBill = 0;
    private short tenBill = 0;

    short[] arrayOfBills = {this.fiftyBill, this.twentyBill, this.tenBill};

    public Withdrawals(int cashRequest) {
        if (validatorCashRequest(cashRequest)) {
            this.cashRequest = cashRequest;
        } else{
            throw new IllegalArgumentException("The cash request is a invalid value");
        }
    }

    //Validator for the cash request value
    public boolean validatorCashRequest(int cashRequestValue) {
        return (cashRequestValue % 10000) == 0 && cashRequestValue >= 10000;
    }

    //Method to deploy cash
    public void calculateTheNumberOfBills() {
        while (this.cashRequest > 0) {
            if (this.cashRequest >= 100000) {
                this.arrayOfBills[0] += 1;
                this.cashRequest -= 50000;
                continue;
            }
            if (this.cashRequest >= 30000) {
                this.arrayOfBills[1] += 1;
                this.cashRequest -= 20000;
                continue;
            }
            if (this.cashRequest >= 20000 || this.cashRequest >= 10000){
                this.arrayOfBills[2] += 1;
                this.cashRequest -= 10000;
            }
        }
    }

    //Getters
    public int getCashRequest() {
        return cashRequest;
    }

    public short get1() {
        return arrayOfBills[0];
    }
    public short get2() {
        return  arrayOfBills[1];
    }
    public short get3() {
        return  arrayOfBills[2];
    }
}

