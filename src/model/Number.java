package model;

public class Number {
    private final int numberInInteger;
    private double aDouble;

    double tenMillions;
    double hundredThousand;
    double tenThousand;
    double hundred;
    double ten;


    public Number(int i){
        this.numberInInteger = i;
        this.aDouble = i;
    }



    public String toLetterUnits(double number){
        String letter = "";
        int number2 = (int) number;

        switch (number2){
            case 1:
                letter = "one";
                break;
            case 2:
                letter = "two";
                break;
            case 3:
                letter = "three";
                break;
            case 4:
                letter = "four";
                break;
            case 5:
                letter = "five";
                break;
            case 6:
                letter = "six";
                break;
            case 7:
                letter = "seven";
                break;
            case 8:
                letter = "eight";
                break;
            case 9:
                letter = "nine";
                break;
        }
        return letter;
    }

    public String toLetterTenUnits(double number) {
        String letterTwo;

        if (number <= 19 && number >= 11) {
            if (number == 11) {
                letterTwo = "eleven";
            } else if (number == 12) {
                letterTwo = "twelve";
            } else if (number == 13) {
                letterTwo = "third-teen";
            }else {
                number = number - 10;
                letterTwo = toLetterUnits(number) + "-teen";
            }
        } else if (number <= 29 && number >= 20) {
            if (number == 20) {
                letterTwo = "twenty";
            } else {
                number = number - 20;
                letterTwo = "Twenty" + toLetterUnits(number);
            }
        } else if (number <= 39 && number >= 30) {
            if (number == 30) {
                letterTwo = "thirty";
            } else {
                number = number - 30;
                letterTwo = "Thirty" + toLetterUnits(number);
            }
        } else if (number <= 49 && number >= 40) {
            if (number == 40) {
                letterTwo = "forty";
            } else {
                number = number - 40;
            }

            letterTwo = "Forty" + toLetterUnits(number);
        } else if (number <= 59 && number >= 50) {
            if (number == 50) {
                letterTwo = "fifty";
            } else {
                number = number - 50;
            }

            letterTwo = "Fifty" + toLetterUnits(number);
        } else if (number <= 69 && number >= 60) {
            if (number == 60) {
                letterTwo = "sixty";
            } else {
                number = number - 60;
            }

            letterTwo = "Sixty" + toLetterUnits(number);
        } else if (number <= 79 && number >= 70) {
            if (number == 70) {
                letterTwo = "seventy";
            } else {
                number = number - 70;
            }

            letterTwo = "Seventy" + toLetterUnits(number);
        } else if (number <= 89 && number >= 80) {
            if (number == 80) {
                letterTwo = "eighty";
            } else {
                number = number - 80;
            }

            letterTwo = "Eighty" + toLetterUnits(number);
        } else if (number <= 99 && number >= 90) {
            if (number == 90) {
                letterTwo = "Ninety";
            } else {
                number = number - 90;
            }

            letterTwo = "Ninety" + toLetterUnits(number);
        } else {
            letterTwo = toLetterUnits(number) + "";
        }


        return letterTwo;
    }


    public String separateTheNumber(){
        String letterFinal = "";
        if (aDouble <=99999999 && aDouble >=10000000){
            this.tenMillions = (aDouble %100000000)/1000000;
            this.tenMillions = (int) this.tenMillions;
            this.tenMillions = Math.abs(this.tenMillions);
            letterFinal = letterFinal + toLetterTenUnits(this.tenMillions) + " Millions ";
            this.aDouble = aDouble - (this.tenMillions*1000000);
        }
        if (aDouble <=999999 && aDouble >=100000){
            this.hundredThousand = (aDouble %1000000)/100000;
            this.hundredThousand = (int) this.hundredThousand;
            this.hundredThousand = Math.abs(this.hundredThousand);
            letterFinal = letterFinal + toLetterUnits(this.hundredThousand) + " hundred ";
            this.aDouble = aDouble - (this.hundredThousand*100000);
        }
        if (aDouble <=99999 && aDouble >=10000){
            this.tenThousand = (aDouble %100000)/1000;
            this.tenThousand = (int) this.tenThousand;
            this.tenThousand = Math.abs(this.tenThousand);
            letterFinal = letterFinal + toLetterTenUnits(this.tenThousand) + " thousand ";
            this.aDouble = aDouble - (this.tenThousand*1000);
        }
        if (aDouble <=999 && aDouble >=100){
            this.hundred = (aDouble %1000)/100;
            this.hundred = (int) this.hundred;
            this.hundred = Math.abs(this.hundred);
            letterFinal = letterFinal + toLetterUnits(this.hundred) + " Hundred ";
            this.aDouble = this.aDouble - (this.hundred*100);
        }
        if (aDouble <=99 && aDouble >=0){
            this.ten = aDouble %100;
            this.ten = Math.abs(this.ten);
            letterFinal = letterFinal + toLetterTenUnits(this.ten);
            this.aDouble = this.aDouble - this.ten;
        }


        return letterFinal;
    }

    @Override
    public String toString() {
        String word;
        if (numberInInteger == 100000000){
            word = "One hundred millions";
        }else {
            word = separateTheNumber() + "";
        }

        return "Number: " +
                word;
    }
}
