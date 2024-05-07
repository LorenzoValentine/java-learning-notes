package Treeset;

import java.util.HashMap;
import java.util.Scanner;

public class HshmapTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("par1", 17);
        // change the value of the key "par1"
        map.put("par1", 18);

        System.out.printf(String.valueOf(map.get("par1")));


    }
}
