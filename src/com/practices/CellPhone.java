package com.practices;

public class CellPhone {

    private static CellPhone cellphone = null;

    private CellPhone() {

    }

    public static CellPhone getInstance() {
        if (cellphone == null) {
            cellphone = new CellPhone();
        }
        return cellphone;
    }

    public void printCellPhone() {
        System.out.println("OnePlus 6T");
    }
}
