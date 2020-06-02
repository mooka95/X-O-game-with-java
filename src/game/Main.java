package game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GameSystem g1=new GameSystem();

        Scanner sc=new Scanner(System.in);
        System.out.println("please enter x or o for first player");

    char xOrY1=sc.next().charAt(0);
        System.out.println("please enter x or o for second player ");
        char xOrY2=sc.next().charAt(0);
        Player p1=new Player("ahmed",xOrY1);
        Player p2=new Player("osama",xOrY2);


while (true){
    g1.Draw();

    System.out.println("please enter position for " + p1.getPlayerXorY());
    char pos1 = sc.next().charAt(0);
    g1.ChangePositionInMAP(p1, pos1);

    if(g1.whoWin(p1.getPlayerXorY())==true)
    {
        System.out.println("the winner is player "+p1.getPlayerXorY());
        break;

    }
     if(g1.whoWin(p2.getPlayerXorY())==true)
    {
        System.out.println("the winner is player "+p2.getPlayerXorY());
        break;

    }
    if(GameSystem.count>=9)
    {
        System.out.println("there is now winner the result is draw ");
        break;
    }




        g1.Draw();
        System.out.println("please enter position for " + p2.getPlayerXorY());

        char pos2 = sc.next().charAt(0);
        g1.ChangePositionInMAP(p2, pos2);


}


    }
}
