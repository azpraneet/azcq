package P2;

public class Rect {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 && (j == 0|| j==4)
                		
                	|| i == 1 && ( j==1 || j==3)
                       
                    || i==2 &&(j==2)
                    || i == 3 && ( j==1|| j==3)
                    || i == 4 && (j == 0|| j==4)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}