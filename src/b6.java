public class b6 {
    public static void main(String[] args) {
        int number = 1;
        while (number < 100){
            if (number % 2 != 0){
                System.out.println(number + " là số lẻ");
            }else {
                System.out.println(number + "là số chẵn");
            }
            number++;
        }
    }
}
