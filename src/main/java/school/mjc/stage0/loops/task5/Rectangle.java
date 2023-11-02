package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){

    /*public static void main(String[] args){
        int height = 6,length=5;*/
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                if(j>0 && j<length-1 && i>0 && i<height-1 ){
                    System.out.print(" ");
                }
                else
                    System.out.print("8");
            }
            System.out.println();

        }
    }
}
