package tasks09_arrays;

import java.util.Arrays;

public class Items {

    public static void main(String[] args) {

        String[] items = {"Shoes","Jacket","Gloves","Airpods","ipod","iphone 12 case "};
        double[] prices = {99.99 ,  150.0 ,  9.99  ,   250.0 ,439.50,  39.99  };
        int[] itemsIDs = {12345  ,  12346 , 12347  ,  12348  , 12349,  12350    } ;


        String [] ItemIndex = items;
        System.out.println("indexofGloves = "+Arrays.binarySearch(ItemIndex,"Gloves"));

        boolean checkitem = true;

        for (String item : items) {
            if(item.contains("ipod")){
                System.out.println("It has ipod = " + checkitem);
            }else {
                continue;
            }

        }



        for (int i = 0 , j = 0 , f = 0 ; i < items.length; i++,j++,f++) {
            System.out.println(items[i]+"\t - "+prices[j]+"$ - #"+itemsIDs[f]);
        }

    }
}
