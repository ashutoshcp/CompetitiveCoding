package org.examples;
/*

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    private static String minLexicographicallyPath(String line) {
        StringBuilder output = new StringBuilder();
        char[] array = line.toCharArray();
        int direction = 1; // can be from 1 to 4 (clockwise)
        int[] xy = {0, 0};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'L') {
                direction = ((direction + 2) % 4)+1;
            } else if (array[i] == 'R') {
                direction = (direction % 4)+1;
            } else {
                switch (direction) {
                    case 1:
                        xy[1] += 1;
                        break;
                    case 2:
                        xy[0] += 1;
                        break;
                    case 3:
                        xy[1] -= 1;
                        break;
                    case 4:
                        xy[0] -= 1;
                }
            }
        }

        int x = xy[0];
        int y = xy[1];
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        int min = Math.min(absX, absY);
        int outDirection;
        if (x > 0 && y > 0) {
            outDirection = 1;
        } else if (x > 0 && y < 0) {
            outDirection = 2;
        } else if (x < 0 && y < 0) {
            outDirection = 3;
        } else {
            outDirection = 4;
        }
        for (int i = 0; i < min; i++) {
            output.append(outDirection);
        }


        int diff = Math.abs(absX - absY);
        char[] a = new char[diff];
        if (absX > absY) {
            if (x < 0) {
                Arrays.fill(a,'8');
            } else {
                Arrays.fill(a,'6');
            }
        } else {
            if (y < 0) {
                Arrays.fill(a,'7');
            } else {
                Arrays.fill(a,'5');
            }
        }
        output.append(a);
        output.append("0");
        return output.toString();
    }


    public static void main(String args[]) throws Exception {

        Scanner s = new Scanner(System.in);
        int testcases = s.nextInt();
        for (int i = 0; i < testcases; i++) {
            s.nextInt();
            String instructions = s.next();
            System.out.println(minLexicographicallyPath(instructions));
        }
    }
}
*/

import java.util.*;

public class Solution {
    /*public int Laddoos(int[] scores) {
        int n = scores.length;
        if (n == 0) {
            return 0;
        }
        int[] laddoos = new int[n];
        for (int i = 0; i < n; i++) {
            laddoos[i] = 1;
        }
        for (int i = 0; i < n - 1; ++i) {
            if (scores[i + 1] > scores[i]) {
                laddoos[i + 1] = laddoos[i] + 1;
            }
        }
        for (int i = n - 2; i >= 0; --i) {
            if (scores[i] > scores[i + 1] && laddoos[i] <= laddoos[i + 1]) {
                laddoos[i] = laddoos[i + 1] + 1;
            }
        }
        int minLaddoos = 0;
        for (int i = 0; i < n; ++i)
            minLaddoos += laddoos[i];
        return minLaddoos;
    }*/
    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        String message = in.nextLine();
        in.close();

        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(message.getBytes());
            byte[] hash = messageDigest.digest();
            for (byte b : hash) {
                System.out.printf("%02x", b);
            }
        } catch (Exception e) {
        }*/
       // System.out.println(new Solution().firstUniqChar("loveleetcode"));
        new Solution().process();


    }

    private void process() {
        System.out.println(kConcatenationMaxSum(new int[]{1, 0, 4, 1, 4}, 4));
    }

    public int kConcatenationMaxSum(int[] arr, int k) {
        int maxSoFar = arr[0];
        int currMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currMax = Math.max(arr[i], currMax+arr[i]);
            maxSoFar = Math.max(maxSoFar, currMax);
        }
        for (int i = 0; i < k-1; i++) {
            for (int value : arr) {
                currMax = Math.max(value, currMax + value);
                maxSoFar = Math.max(maxSoFar, currMax);
            }
        }

        return (maxSoFar%(1000000000 + 7));
    }

    public int maxNumberOfBalloons(String text) {
        int a = 0, b = 0,  l = 0, o = 0, n = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i)=='a') {
                a++;
            }
            if (text.charAt(i)=='b') {
                b++;
            }
            if (text.charAt(i)=='l') {
                l++;
            }
            if (text.charAt(i)=='o') {
                o++;
            }
            if (text.charAt(i)=='n') {
                n++;
            }
        }
        if (o%2!=0) {
            o--;
        }
        if (l%2!=0) {
            l--;
        }
        return Math.min(a, Math.min(b, Math.min((l/2), Math.min(n, (o/2)))));
    }

    public String reverseParentheses(String s) {
        List<String> result = new ArrayList<>();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char item = s.charAt(i);
            if (item == '(') {
                st.push(item);
                continue;
            }
            if (item == ')') {
                StringBuilder temp = new StringBuilder();
                while (st.peek()!= '(') {
                    temp.insert(0, st.pop());
                }
                st.pop();
                result.add(temp.toString());
                continue;
            }
            if (st.empty()){
               //result.add()
            }
            st.push(item);
        }
        System.out.println(result.toString());
        StringBuilder res = new StringBuilder();
        for (int i = result.size()-1; i >= 0 ; i--) {
            res.append(result.get(i));
        }
        return res.toString();
    }

    private class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Student)) {
                return false;
            }
            Student student = (Student) o;
            return getId() == student.getId() &&
                    Objects.equals(getName(), student.getName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getId(), getName());
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    public int maximumSum(int[] arr) {
        int n = arr.length;
        int[] forward = new int[n];
        int[] backward = new int[n];
        int cur_max = arr[0], max_so_far = arr[0];
        forward[0] = arr[0];

        for (int i = 1; i < n; i++) {
            cur_max = Math.max(arr[i], cur_max + arr[i]);
            max_so_far = Math.max(max_so_far, cur_max);
            forward[i] = cur_max;
        }

        cur_max = max_so_far = backward[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {

            cur_max = Math.max(arr[i], cur_max + arr[i]);
            max_so_far = Math.max(max_so_far, cur_max);

            backward[i] = cur_max;
        }

        int result = max_so_far;

        for (int i = 1; i < n - 1; i++)
            result = Math.max(result, forward[i - 1] + backward[i + 1]);

        return result;
    }

    public String dayOfTheWeek(int day, int month, int year) {
        int[] t = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
        year -= (month < 3) ? 1 : 0;
        int num = ( year + year/4 - year/100 + year/400 + t[month-1] + day) % 7;
        switch (num) {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
        }
        return "";
    }

    public int distanceBetweenBusStops(int[] d, int u, int v) {
        if (u > v) {
            return distanceBetweenBusStops(d, v, u);
        }
        int total = 0;
        for (int i = 0; i < u; i++)
            total += d[i];
        int min = 0;
        for (int i = u; i < v; i++) {
            min += d[i];
            total += d[i];
        }
        for (int i = v; i < d.length; i++)
            total += d[i];
        return Math.min(min, total - min);
    }


    public int firstUniqChar(String s) {
        boolean[] arr = new boolean[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = false;
        }
        List<Character> characters = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = c - 'a';
            if (arr[index]) {
                characters.remove(new Character(c));
            } else {
                characters.add(c);
                arr[index] = true;
            }
        }
        if (characters.size() == 0) {
            return -1;
        }
        return s.indexOf(characters.get(0));
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return res;
        }
        queue.add(root);
        while (queue.size()!=0) {
            int l = queue.size();
            List<Integer> inner  = new ArrayList<>();
            for (int i = 0; i < l; i++) {
                TreeNode poll = queue.poll();
                inner.add(poll.val);
                if (poll.left!=null) {
                    queue.add(poll.left);
                }
                if (poll.right!=null) {
                    queue.add(poll.right);
                }
            }
            res.add(inner);
        }
        return res;
    }
     public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
}
