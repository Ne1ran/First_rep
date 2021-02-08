import java.util.*;


class Scratch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int[] mas = new int[y - x + 1];
        for(int i = 0; i <= y - x; i++){
            mas[i] = x + i;
        }
        int[] sorted_mas = new int[y - x + 1];
        for(int i = 0; i <= y - x; i++){
            int sort = 0;
            for(int j = 1; j <= mas[i] / 2; j++) {
                if(mas[i]% j == 0) {
                    sort += 1;
                }
            }
            sorted_mas[i] = sort;
        }
        int[] sorted = new int[y - x + 1];
        for (int i = 0; i < sorted_mas.length; i++) {
            sorted[i] = sorted_mas[i];
        }
        int[] otvet = new int[y - x + 1];
        Arrays.sort(sorted);
        int index = 0;
        for(int i = 0; i < otvet.length; i++){
            for(int j = index; j < sorted.length; j++){
                for(int g = 0; g < sorted_mas.length; g++){
                    if(sorted[j] == sorted_mas[g]) {
                        index = g;
                        sorted[j] = 0;
                        sorted_mas[g] = 0;
                        break;
                    }
                    else {
                        index = -1;
                    }
                }
                otvet[i] = mas[index];
                index = j + 1;
                break;
        }
        }
        for(int i : otvet){
            System.out.print(i + " ");
        }
    }
}