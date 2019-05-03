public class Assignment14_1_2
{
    public static int lowestCost(int []board, int position, int total)
    {
        total+=board[position];
        if(position == board.length-1)
            return total;
        else if(position == board.length-2)
            return lowestCost(board,position+1,total);
        else
        {
            int resultOne = lowestCost(board,position+1,total);
            int resultTwo = lowestCost(board,position+2,total);
            return Math.min(resultOne,resultTwo);
        }
    }

    public static void main(String[] args)
    {
        int[] board = {0,3,80,6,57,10};
        int cost = 0;
        cost = lowestCost(board,0,cost);
        for(int i=0;i < board.length;i++)
            System.out.print(board[i]+" ");
            System.out.println();
            System.out.println("The optimized cost is: " + cost);
        int board2[] = {0,12,66,1,22,3,87,90,45,60,120};
        int cost2 = 0;
        cost2 = lowestCost(board2,0,cost2);
        for(int i=0;i < board2.length;i++)
            System.out.print(board2[i]+" ");
            System.out.println();
            System.out.println("The optimized cost is: " + cost2);
    }
}