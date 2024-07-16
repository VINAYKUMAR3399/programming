public class Square {

    public static void main(String[] args) {
    
        int[] numb = {9,7,4,2};
        for (int i=0; i<numb.length;i++) {
            int square = numb[i]*numb[i];
            System.out.println("The square"+ numb[i]+"  " + square);
        }
    }
}
