import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 2, 3, 4 };
        int n = arr.length;
        int defaultValue = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            // map.getOrdefault=map.put+map.containskey
            map.put(arr[i], map.getOrDefault(arr[i], defaultValue) + 1);
        }
        for (int num : arr) {
            if (map.get(num) == 1) {

            }

        }
        System.out.println(map);

    }
}
