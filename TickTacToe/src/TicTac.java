import java.util.Scanner;

public class TicTac {
    static int [][]arr=new int[3][3];
    public static void main(String[] args) {
        
//        arr=new int[3][3];
        while(check(arr)){
            Scanner sc=new Scanner(System.in);
            int place=sc.nextInt();
            int value=sc.nextInt();
            for(int i=0;i<3;i++){
                if(place<3*(i+1)){
                    if(arr[i][place-3*i]==0){
                        arr[i][place-3*i]=value;
                    }else{
                        System.out.println("Wrong Move");
                    }
                    break;
                }
            }
            structure(arr);
        }


    }

    public static void structure(int [][]arr){
        for(int j=0;j<4;j++){
            for(int i=0;i<7;i++){
                System.out.print("_");
            }
            System.out.println();
            if(j!=3){
                for(int i=0;i<7;i++){
                    if(i%2==0){
                        System.out.print("|");
                    }else{
                        if(arr[j][(i-1)/2]==1){
                            System.out.print("X");
                        }else if(arr[j][(i-1)/2]==2){
                            System.out.print("0");
                        }else{
                            System.out.print(" ");
                        }
                    }
                }
            }
            System.out.println();

        }


    }

    public static boolean check(int [][]arr){
        int countRowX=0;
        int countRow0=0;
        int countColX=0;
        int countCol0=0;
        int countLDiaX=0;
        int countLDia0=0;
        int countRDiaX=0;
        int countRDia0=0;
        int count=0;
        for(int i=0;i<3;i++){
            if(arr[i][i]==1){
                countLDiaX++;
            }else if(arr[i][i]==2){
                countLDia0++;
            }
            if(arr[i][2-i]==1){
                countRDiaX++;
            }else if(arr[i][2-i]==2){
                countRDia0++;
            }
            for(int j=0;j<3;j++){
                if(arr[i][j]!=0){
                    count++;
                }
                if(arr[i][j]==1){
                    countRowX++;
                }else if(arr[i][j]==2){
                    countRow0++;
                }

            }
            if(countRowX==3){
//                System.out.println("X wins");
                return false;
            }else if(countRow0==3){
//                System.out.println("0 Wins");
                return false;
            }else{
                countRowX=countRow0=0;
            }

            for(int j=0;j<3;j++){
                if(arr[j][i]==1){
                    countColX++;
                }else if(arr[j][i]==2){
                    countCol0++;
                }
            }
            if(countColX==3){
//                System.out.println("X wins");
                return false;
            }else if(countCol0==3){
//                System.out.println("0 Wins");
                return false;
            }else{
                countColX=countCol0=0;
            }
        }
        if(countLDiaX==3 || countRDiaX==3){
//            System.out.println("X Wins");
            return false;
        }else if(countRDia0==3 || countLDia0==3){
//            System.out.println("0 Wins");
            return false;
        }

//        Important if run without visuals
//        else if(count ==9){
////            System.out.println("No Win");
//            return false;
//        }
        return true;
    }

//    public static boolean checkPos(int n);
}
