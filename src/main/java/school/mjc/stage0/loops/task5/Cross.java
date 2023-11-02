package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
    //public static void main(String[] args){
      // int sideLength=5;
        for(int i = 0;i<sideLength;i++)
        {
            for(int j = 0;j<sideLength;j++)
            {

                if(i!=(sideLength/2) && j!=(sideLength/2))
                    System.out.print(" ");
                else
                    System.out.print("8");
            }
            System.out.println();
        }

    }
}
