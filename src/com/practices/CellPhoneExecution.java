package com.practices;

public class CellPhoneExecution {
    public static void main(String[] args) {

        CellPhone cellPhone1 = CellPhone.getInstance();
        CellPhone cellPhone2 = CellPhone.getInstance();

        cellPhone1.printCellPhone();
        cellPhone2.printCellPhone();

    }
}
