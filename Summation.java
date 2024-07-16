public class Summation{
    public static void main(String[] args) {
        
        int num[] = {9,5,3,6,8};
        int sum = 0;
        for (int i=0;i<num.length;i++ ) {
            sum = sum+num[i];
        }
        System.out.println("Sum of elements: " + sum);
    }
}
