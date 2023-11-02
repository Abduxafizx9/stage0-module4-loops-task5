
package school.mjc.stage0.loops.task5;

public class Hourglass {
  /*  public static void main(String[] args){
        int height = 5;*/
  public void printHourglassOfGivenSize(int height) {
        for(int i = 0; i < height; i++) {
            int noOfCol;
            if(height % 2 == 0)
                noOfCol = i < height / 2 ? height - 2 * i : 2 * (i - height / 2 + 1);
            else
                noOfCol = i <= height / 2 ? height - 2 * i : 2 * (i - height / 2) + 1;

            int space = (height - noOfCol) / 2;
            for (int k = 0; k < space; k++) {
                System.out.print(" ");
            }
            for(int j = 0; j < noOfCol; j++){
                System.out.print("8");
            }
            System.out.println();
        }
    }
}

