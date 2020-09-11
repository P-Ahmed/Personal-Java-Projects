package kacchiPotSellingPriceCounter;

import java.util.Scanner;

public class KacchiPotSellingPriceCounter {

    int loop;
    protected static int requiredBasmoti = 5;
    protected static int requiredMutton = 10;
    protected static int requiredOnion = 1;
    protected static int requiredGinger = 1;
    protected static int requiredPotato = 3;

    protected int basmotiCount = 0;
    protected int muttonCount = 0;
    protected int onionCount = 0;
    protected int gingerCount = 0;
    protected int potatoCount = 0;

    protected static long temporaryTotalAmount;
    protected static int temporaryHaveBasmoti;
    protected static int temporaryHaveMutton;
    protected static int temporaryHaveOnion;
    protected static int temporaryHaveGinger;
    protected static int temporaryHavePotato;

    protected int basmotiPrice;
    protected int muttonPrice;
    protected int onionPrice;
    protected int gingerPrice;
    protected int potatoPrice;

    protected int temporaryBasmotiPrice;
    protected int temporaryMuttonPrice;
    protected int temporaryOnionPrice;
    protected int temporaryGingerPrice;
    protected int temporaryPotatoPrice;
    protected int temporaryAllProductPrice;

    protected int haveBasmoti;
    protected int haveMutton;
    protected int haveOnion;
    protected int haveGinger;
    protected int havePotato;

    protected int basmotiCountForPot;
    protected int muttonCountForPot;
    protected int onionCountForPot;
    protected int gingerCountForPot;
    protected int potatoCountForPot;

    protected long totalAmount;
    protected int sellingPrice;

    protected static int soldPrice;

    public static void main(String[] args) {

        KacchiPotSellingPriceCounter assignment = new KacchiPotSellingPriceCounter();
        int m = assignment.sellPrice();
        System.out.println("The total money you can earn from your investment is: " + m);
    }

    public int sellPrice() {
        loop = 1;
        soldPrice = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Basmoti Rice price: ");
        basmotiPrice = scan.nextInt();

        System.out.println("Enter Mutton price: ");
        muttonPrice = scan.nextInt();

        System.out.println("Enter Onion price: ");
        onionPrice = scan.nextInt();

        System.out.println("Enter Ginger price: ");
        gingerPrice = scan.nextInt();

        System.out.println("Enter Potato price: ");
        potatoPrice = scan.nextInt();

        System.out.println("Enter how many KG of Basmoti Rice you have in your stock:");
        haveBasmoti = scan.nextInt();
        System.out.println("Enter how many KG of Mutton you have in your stock:");
        haveMutton = scan.nextInt();
        System.out.println("Enter how many KG of Onion you have in your stock:");
        haveOnion = scan.nextInt();
        System.out.println("Enter how many KG of Ginger you have in your stock:");
        haveGinger = scan.nextInt();
        System.out.println("Enter how many KG of Potato you have in your stock:");
        havePotato = scan.nextInt();

        System.out.println("Kindly enter the total amount you have for this business:");
        totalAmount = scan.nextLong();
        System.out.println("Kindly enter the selling price for one pot of Kacchi:");
        sellingPrice = scan.nextInt();

        temporaryTotalAmount = totalAmount;

        temporaryHaveBasmoti = haveBasmoti;
        temporaryHaveMutton = haveMutton;
        temporaryHaveOnion = haveOnion;
        temporaryHaveGinger = haveGinger;
        temporaryHavePotato = havePotato;

        temporaryBasmotiPrice = basmotiPrice * requiredBasmoti;
        temporaryMuttonPrice = muttonPrice * requiredMutton;
        temporaryOnionPrice = onionPrice * requiredOnion;
        temporaryGingerPrice = gingerPrice * requiredGinger;
        temporaryPotatoPrice = potatoPrice * requiredPotato;

        temporaryAllProductPrice = temporaryBasmotiPrice + temporaryMuttonPrice + temporaryOnionPrice + temporaryGingerPrice + temporaryPotatoPrice;

        while(loop > 0) {
            if(temporaryTotalAmount < temporaryAllProductPrice){
                basmotiCountForPot = countingBasmotiForPot(temporaryHaveBasmoti, basmotiPrice, temporaryTotalAmount);
                muttonCountForPot = countingMuttonForPot(temporaryHaveMutton, muttonPrice, temporaryTotalAmount);
                onionCountForPot = countingOnionForPot(temporaryHaveOnion, onionPrice, temporaryTotalAmount);
                gingerCountForPot = countingGingerForPot(temporaryHaveGinger, gingerPrice, temporaryTotalAmount);
                potatoCountForPot = countingPotatoForPot(temporaryHavePotato, potatoPrice, temporaryTotalAmount);

                if (basmotiCountForPot == 1 && muttonCountForPot == 1 && onionCountForPot == 1 && gingerCountForPot == 1 && potatoCountForPot == 1) {
                    soldPrice = soldPrice + sellingPrice;
                }
                else {
                    loop = -1;
                }
            }
            else {
                basmotiCountForPot = countingBasmotiForPot(temporaryHaveBasmoti, basmotiPrice, temporaryTotalAmount);
                muttonCountForPot = countingMuttonForPot(temporaryHaveMutton, muttonPrice, temporaryTotalAmount);
                onionCountForPot = countingOnionForPot(temporaryHaveOnion, onionPrice, temporaryTotalAmount);
                gingerCountForPot = countingGingerForPot(temporaryHaveGinger, gingerPrice, temporaryTotalAmount);
                potatoCountForPot = countingPotatoForPot(temporaryHavePotato, potatoPrice, temporaryTotalAmount);

                if (basmotiCountForPot == 1 && muttonCountForPot == 1 && onionCountForPot == 1 && gingerCountForPot == 1 && potatoCountForPot == 1) {
                    soldPrice = soldPrice + sellingPrice;
                }
                else {
                    loop = -1;
                }
            }
        }
        System.out.println("For one pot of Kacchi, you will be needed: "+temporaryAllProductPrice);
        if (sellingPrice>temporaryAllProductPrice){
            System.out.println("Your profit from one pot: "+(sellingPrice-temporaryAllProductPrice));
        }
        else{
            System.out.println("You will face loss by selling at your selling price.");
            System.out.println("Your loss in one pot: "+(temporaryAllProductPrice-sellingPrice));
        }
        return soldPrice;
    }

    public int countingBasmotiForPot(int haveBasmoti, int basmotiPrice, long totalMoney) {
        basmotiCount = 0;
        if (haveBasmoti == requiredBasmoti) {
            basmotiCount++;
            temporaryHaveBasmoti = 0;
        }
        else if (haveBasmoti > requiredBasmoti) {
            haveBasmoti = haveBasmoti - requiredBasmoti;
            basmotiCount++;
            temporaryHaveBasmoti = haveBasmoti;
        }
        else{
            haveBasmoti = requiredBasmoti - haveBasmoti;
            int tempBasmotiPrice = haveBasmoti * basmotiPrice;
            if (totalMoney >= tempBasmotiPrice) {
                totalMoney = totalMoney - tempBasmotiPrice;
                temporaryTotalAmount = totalMoney;
                temporaryHaveBasmoti = 0;
                basmotiCount++;
            } else {
                basmotiCount = 0;
            }
        }
        return basmotiCount;
    }

    public int countingMuttonForPot(int haveMutton, int muttonPrice, long totalMoney) {
        muttonCount = 0;
        if (haveMutton == requiredMutton) {
            muttonCount++;
            temporaryHaveMutton = 0;
        }
        else if (haveMutton > requiredMutton) {
            haveMutton = haveMutton - requiredMutton;
            muttonCount++;
            temporaryHaveMutton = haveMutton;
        }
        else{
            haveMutton = requiredMutton - haveMutton;
            int tempMuttonPrice = haveMutton * muttonPrice;
            if (totalMoney >= tempMuttonPrice) {
                totalMoney = totalMoney - tempMuttonPrice;
                temporaryTotalAmount = totalMoney;
                temporaryHaveMutton = 0;
                muttonCount++;
            } else {
                muttonCount = 0;
            }
        }
        return muttonCount;
    }

    public int countingOnionForPot(int haveOnion, int onionPrice, long totalMoney) {
        onionCount = 0;
        if (haveOnion == requiredOnion) {
            onionCount++;
            temporaryHaveOnion = 0;
        }
        else if (haveOnion > requiredOnion) {
            haveOnion = haveOnion - requiredOnion;
            onionCount++;
            temporaryHaveOnion = haveOnion;
        }
        else{
            haveOnion = requiredOnion - haveOnion;
            int tempOnionPrice = haveOnion * onionPrice;
            if (totalMoney >= tempOnionPrice) {
                totalMoney = totalMoney - tempOnionPrice;
                temporaryTotalAmount = totalMoney;
                temporaryHaveOnion = 0;
                onionCount++;
            } else {
                onionCount = 0;
            }
        }
        return onionCount;
    }

    public int countingGingerForPot(int haveGinger, int gingerPrice, long totalMoney) {
        gingerCount = 0;
        if (haveGinger == requiredGinger) {
            gingerCount++;
            temporaryHaveGinger = 0;
        }
        else if (haveGinger > requiredGinger) {
            haveGinger = haveGinger - requiredGinger;
            gingerCount++;
            temporaryHaveGinger = haveGinger;
        }
        else{
            haveGinger = requiredGinger - haveGinger;
            int tempGingerPrice = haveGinger * gingerPrice;
            if (totalMoney >= tempGingerPrice) {
                totalMoney = totalMoney - tempGingerPrice;
                temporaryTotalAmount = totalMoney;
                temporaryHaveGinger = 0;
                gingerCount++;
            } else {
                gingerCount = 0;
            }
        }
        return gingerCount;
    }

    public int countingPotatoForPot(int havePotato, int potatoPrice, long totalMoney) {
        potatoCount = 0;
        if (havePotato == requiredPotato) {
            potatoCount++;
            temporaryHavePotato = 0;
        }
        else if (havePotato > requiredPotato) {
            havePotato = havePotato - requiredPotato;
            potatoCount++;
            temporaryHavePotato = havePotato;
        }
        else{
            havePotato = requiredPotato - havePotato;
            int tempPotatoPrice = havePotato * potatoPrice;
            if (totalMoney >= tempPotatoPrice) {
                totalMoney = totalMoney - tempPotatoPrice;
                temporaryTotalAmount = totalMoney;
                temporaryHavePotato = 0;
                potatoCount++;
            } else {
                potatoCount = 0;
            }
        }
        return potatoCount;
    }
}
