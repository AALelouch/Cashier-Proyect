package model;

import java.util.ArrayList;
import java.util.List;

public class Date {
    int day;
    int month;
    int year;
    List<String> palindromos = new ArrayList<>();
    int quantity;

    public Date(int day, int month, int year, int quantity) {
        if (quantity>100){
            throw new IllegalArgumentException("Invalid quantity of palindromos");
        }
        this.day = day;
        this.month = month;
        this.year = year;
        this.quantity = quantity;
    }

    public List<String> findPalindromo() {
        boolean flag = true;
        while (flag) {
            for (int days = day; days <= 30; days++) {
                day = days;

                if (month == 12 && day == 30) {
                    month = 1;
                    year = year + 1;
                }
                if (day == 30) {
                    this.month = this.month + 1;
                    days = 1;
                }
                String date = toString();
                StringBuilder reverseDate = new StringBuilder();


                reverseDate.append(date);
                reverseDate.reverse();
                String reverseDateTwo = reverseDate.toString();

                if (reverseDateTwo.equals(date)){
                    palindromos.add(date);
                    if (palindromos.size() == quantity){
                        flag = false;
                        return palindromos;
                    }
                }
            }
        }
        return null;
    }

        @Override
        public String toString () {
            String d = String.valueOf(day);
            String m = String.valueOf(month);
            String y = String.valueOf(year);

            if (day <= 9) {
                d = "0" + d;
            }
            if (month <= 9) {
                m = "0" + m;
            }

            return d + m + y;
        }
    }