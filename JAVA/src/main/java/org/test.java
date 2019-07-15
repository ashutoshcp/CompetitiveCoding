package org;

import java.util.HashMap;
import java.util.Map;

public class test {
    private static Boolean sumZero(int[] temp, int si, int ei, int n)  {
        Map<Integer, Integer> presum = new HashMap<>();
        int sum =0;
        int max_length = 0;
        for(int i=0;i<n; i++) {
            sum+= temp[i];
            if(temp[i]==0 && max_length==0 ) {
                si = i;
                ei = i;
                max_length = 1;
            }
            if(sum ==0 ){
                if(max_length < i+1) {
                    si = 0;
                    ei = i;
                }
                max_length = i+1;
            }
            if(presum.containsKey(sum)) {
                int old = max_length;
                max_length = Math.max(max_length, i - presum.get(sum));
                if(old < max_length) {
                    ei = i;
                    si = presum.get(sum) + 1;
                }
            } else {
                presum.put(sum, i);
            }
        }

        return (max_length!=0);
    }


    private static String minLexo(String line) {
        StringBuilder output = new StringBuilder();
        char[] array = line.toCharArray();
        int direction = 1;
        int[] xy = {0, 0};

        for (int i = 0; i < array.length; i++) {
            if (array[i]== 'L') {
                direction = ((direction+2)%4) +1;
            } else if (array[i]=='R') {
                direction = (direction%4) + 1;
            } else {
                switch (direction) {
                    case 1:
                    case 2:
                        xy[0] += 1;
                        break;
                    case 3:
                    case 4:
                        xy[0] -= 1;
                        break;
                }
            }
        }

        int x = xy[0];
        int y = xy[1];
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        int min = Math.min(absX, absY);
        int outDirection;
        return null;
    }
}
