package model;

import java.util.List;

public class NumberMinorMajor {

    private final int n;
    private List<Character> minorToMajorList;

    public NumberMinorMajor(int n) {
        this.n = n;
    }

    public char[] numberToArray(){
        String nString = String.valueOf(n);
        char[] nDigits = nString.toCharArray();
        return nDigits;
    }

    public char[] arraySoutMinortoMajor(){
        char[] nDigits = numberToArray();

        for(int count = 0; count < nDigits.length; count++){
            for (int countTwo = 1; countTwo < nDigits.length; countTwo++){
                if (nDigits[countTwo-1] > nDigits[countTwo]){
                    char nTemp = nDigits[countTwo-1];
                    nDigits[countTwo-1] = nDigits[countTwo];
                    nDigits[countTwo] = nTemp;
                }
            }
        }

        return nDigits;
    }

    public char[] arraySoutMajortoMinor(){
        char[] nDigits = numberToArray();

        for(int count = 0; count < nDigits.length; count++){
            for (int countTwo = 1; countTwo<nDigits.length; countTwo++){
                if (nDigits[countTwo] > nDigits[countTwo-1]){
                    char nTemp = nDigits[countTwo-1];
                    nDigits[countTwo-1] = nDigits[countTwo];
                    nDigits[countTwo] = nTemp;
                }
            }
        }

        return nDigits;
    }

}
