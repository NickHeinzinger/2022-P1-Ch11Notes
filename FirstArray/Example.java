package FirstArray;

public class Example {
    public static void main(String args[]){
        //Arrays store one data type
        int numberOfChristmasGifts[];
        numberOfChristmasGifts = new int[200];

        for (int n = 0; n<numberOfChristmasGifts.length; n++){
            numberOfChristmasGifts[n] = 6;
            System.out.println(numberOfChristmasGifts[n]);
        }


       // numberOfChristmasGifts[0] = 7;
        // numberOfChristmasGifts[1] = 3;

       // System.out.println(numberOfChristmasGifts[0]);

    }
}
