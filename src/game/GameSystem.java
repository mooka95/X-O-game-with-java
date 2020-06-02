package game;

public class GameSystem  {
   private char arr[][]={{'1','2','3'},{'4','5','6'},{'7','8','9'}};

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        GameSystem.count = count;
    }

    public static  int count=0;

    public GameSystem() {
    }

    public void Draw(){


        for(int i=0;i<3;i++){

            for(int j=0;j<3;j++){

                System.out.print(arr[i][j]);
            }
            System.out.println();

        }


    }




    public void ChangePositionInMAP(Player a,char pos){


        for(int i=0;i<3;i++){

            for(int j=0;j<3;j++){

              if(arr[i][j]==a.play(pos))

                 arr[i][j]=a.getPlayerXorY();


            }


        }
        count++;




    }

    public Boolean whoWin(char c){

        if(arr[0][0]==arr[1][0]&&arr[0][0]==arr[2][0]&&arr[0][0]==c)
            return true;
         if(arr[0][1]==arr[1][1]&&arr[0][1]==arr[2][1]&&arr[0][1]==c)
        return   true;
       if(arr[0][2]==arr[1][2]&&arr[0][2]==arr[2][2]&&arr[0][2]==c)
            return true;
         if(arr[0][0]==arr[0][1]&&arr[0][0]==arr[0][2]&&arr[0][0]==c)
            return  true;
         if(arr[1][0]==arr[1][1]&&arr[1][0]==arr[2][1]&&arr[1][0]==c)
            return true;
          if(arr[2][0]==arr[2][1]&&arr[2][0]==arr[2][2]&&arr[2][0]==c)
            return true;
         if(arr[0][0]==arr[1][1]&&arr[0][0]==arr[2][2]&&arr[0][0]==c)
            return true;
         if(arr[2][0]==arr[1][1]&&arr[2][0]==arr[0][2]&&arr[2][0]==c)
            return true;
        else
            return false;




    }

}
