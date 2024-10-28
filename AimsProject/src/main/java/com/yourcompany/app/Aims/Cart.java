package com.yourcompany.app.Aims;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED =20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (disc == itemsOrdered[i]){
                for (int j = i; j < qtyOrdered -1; j++){
                    itemsOrdered[j] = itemsOrdered[j+1];
                }
                qtyOrdered--;
                break;
            }
        }

    }

    public int totalCost() {
        int total = 0;
        for(int i = 0; i < qtyOrdered; i++) total += itemsOrdered[i].getCost();
        return total;
    }


}