package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
    /*public static void main(String[] args){
        int height=6;*/
        for(int i = 0;i<height;i++)
        {
            int noOfCol=i<=2?height-2*i:2+(i-3)*2;
            int space = noOfCol%3;
            for (int k = 0; k < space; k++) {
                System.out.print(" ");
            }
            for(int j = 0;j<noOfCol;j++){

                   System.out.print("8");

            }
            System.out.println();
        }

    }
}
