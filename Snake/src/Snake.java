import java.util.Scanner;

public class Snake {
    public static void main(String[] args) {
        int [][]arr=new int[6][6];
        arr[0][0]=2;
        Scanner sc=new Scanner(System.in);
        char move;
        while(true){
            move=sc.next().charAt(0);
            structure(arr);
        }

    }

    public static void structure(int [][]arr){
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if(arr[i][j]==2){
                    System.out.print(":");
                }else if(arr[i][j]==1){
                    System.out.print("*");
                }else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

    public static void positionUpdate(int [][]arr,char move){
        switch (move){
            case 'w' : 
        }
    }
}
