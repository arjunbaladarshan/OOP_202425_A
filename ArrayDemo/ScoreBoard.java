import java.util.Scanner;
public class ScoreBoard{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] team = new String[2];
        System.out.println("Enter Name of Team 1 = ");
        team[0] = sc.nextLine();
        System.out.println("Enter Name of Team 2 = ");
        team[1] = sc.nextLine();

        System.out.println("Enter No of Overs played = ");
        int noOfOvers = sc.nextInt();
        
        int runPerOver[][][] = new int[2][noOfOvers][];

        System.out.println("Enter -61 for wide");
        System.out.println("Enter -62 for no ball");
        System.out.println("Enter -51 for wicket");

        for(int i=0;i<runPerOver.length;i++){ // loop for innings
            for(int j=0;j<runPerOver[i].length;j++){ // loop for over
                System.out.println("Enter No of balls played in over "+(j+1)+" in "+team[i]+" inning = ");
                int temp = sc.nextInt();
                runPerOver[i][j] = new int[temp];
                for(int k=0;k<runPerOver[i][j].length;k++){ // loop for ball in over
                    System.out.println("Enter run taken in ball "+(k+1)+" in over "+(j+1)+" in "+team[i]+" inning = ");
                    runPerOver[i][j][k] = sc.nextInt();
                }
            }
        }

        for(int i=0;i<runPerOver.length;i++){
            int totalRun = 0;
            int totalWicket = 0;
            int totalExtra = 0;
            for(int j=0;j<runPerOver[i].length;j++){
                for(int k=0;k<runPerOver[i][j].length;k++){
                    if(runPerOver[i][j][k]==-61){ // if wide
                        totalExtra++;
                        totalRun++;
                    }
                    else if(runPerOver[i][j][k]==-62){ // if no ball
                        totalExtra++;
                        totalRun++;
                    }
                    else if(runPerOver[i][j][k]==-51){ // if wicket
                        totalWicket++;
                    }
                    else{
                        totalRun+=runPerOver[i][j][k];
                    }
                }
            }
            System.out.println("Scoreboard of "+team[i]+" = "+totalRun+"/"+totalWicket+" ("+noOfOvers+" overs) with "+totalExtra+" extras");
        }

    }
}