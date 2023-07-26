package org.example;

public class CanPlaceFlowers {

    public boolean placeFlowers(int[] flowerbed, int n) {
        int index = 0;
        if(n > 0 && flowerbed[index] == 0 && (flowerbed.length == 1 || flowerbed[index + 1] == 0)){
            flowerbed[index] = 1;
            n--;
        }
        for(index=1;index < flowerbed.length-1 && n>0; index++){
            if(flowerbed[index] == 0 && flowerbed[index -1] == 0 && flowerbed[index+1] == 0){
                flowerbed[index] = 1;
                n--;
            }
        }
        if(n >0 &&index == flowerbed.length-1 && flowerbed[index] == 0 && flowerbed[index-1] ==0)
            n--;
        return n == 0;

    }
}
