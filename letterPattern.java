import java.util.*;
import java.io.*;
public class LetterPattern{

   // value for letter when there is no match
   public static final char UNRECOGNIZED_LETTER = ' ';

   // size of pattern array
   public static final int PATTERN_SIZE = 10;

   // size of grid array
   public static final int GRID_SIZE = PATTERN_SIZE + 2;

/*

    To hold the pattern, its features, and the letter
    it represents.  If the pattern does not match any
    of the letter specifications, then the letter char
    is a blank.

*/

   int[][] grid;
   int
      massbottom,
      corners,
      tees;
   char
      letter;

   // default constructor
   // grid will be created as a 12x12 array of 0's
   // the integer data members are initialized to 0
   // by default already; letter is set to ' '
   public LetterPattern(){
      grid = new int[GRID_SIZE][GRID_SIZE];
      letter = UNRECOGNIZED_LETTER;
 
   	
   
   }

   /*
       precondition: assumes sc is not null and has a least one
          more line of text in it.

       postcondition: grid is loaded with 0's and 1's according to
          the discussion in the project description based on what
          remains in the input Scanner sc.

       YOU HAVE TO CODE THIS.
   */
   public void loadPattern(Scanner src){
      
   private boolean exit, haventSeen$, hasLine;
   private int 0count, 1count, NA;

   //contents of input file
   String s = src.nextLine();
   hasLine = haventSeen$ =true;

	for(int r=1;r<=10;r++){
		for(int c=1;c<=10;c++)
	if (hasLine && haventSeen$ && c<=s.length()){ 
	if (s.charAt(c-1)=='*'){
   		grid[r][c] = 1;
   		1count++;
   	else{
   		grid[r][c]=0;
   		0count++;
	if(s.charAt(c-1)=='$')
   		haventSeen$=false;

      	}
	}else
		grid[r][c]=0;
		if(i<10)
	if(src.hasNextLine()){
		s=src.nextLine();
		
	}else
		hasLine=false;
	}
   }
}
   public void extractFeatures(){
   	
   	int i, massbottom, corner, tee;
   	boolean hasLine=true;
   	String s = src.nextLine();
   
   for(int r=1;r<=10; r++){
      for(int c=1;c<=10; c++)
      
      //if center not 1
      if(hasLine && s.charAt(c-1)!=0){
      i++;
      
      //if tee
      else if(grid[r][c]=1 && grid[r+1][c]=1 && grid[r-1][c]=1 && grid[r][c+1]^grid[r][c-1]=1)
      tee++;
      else if(grid[r][c+1]=1 && grid[r][c-1] && grid[r-1][c]^grid[r+1][c]=1)
      
      //if corner
      }else if(x[c-1]^x[c+1]==1 && y[c-1]==1){
         corner++;
      }else if(x[c+1]==1 && y[c+1]^y[c-1]==1){
         corner++;
      
      //if massbottom
      }else if(grid[c-1]==1 && grid[c+1]==1){
         massbottom++;
      }else if(grid[c+1]==1 && grid[c-1]==1){
         massbottom++;
      }else{
         i++;
      }
      
      }
   }


   /*
       precondition: assumes the massbottom, corners, and tees 
          data members have been correctly calculated from the 
          current contents of the grid.

       postcondition: letter is assigned either the UNRECOGNIZED_LETTER
         value if the features do not match any of the letter features,
         or the letter whose features are matched.

       YOU HAVE TO CODE THIS.
   */
   public void classifyLetter(){
   }


   // getter functions for the massbottom, tees, corners, and
   // the matching letter
   public int getMassbottom(){ return massbottom;}
   public int getCorners(){ return corners;}
   public int getTees(){ return tees;}
   public char getLetter(){ return letter;}

   /*

       pre: grid is not null

       post: grid is not modified its full contents(all 12 rows of 12 columns)
          has been printed to the screen, line by line

   */
   public void printPatternToScreen(){

   }

   /*

       pre: grid, massbottom, corners, tees, and letter are all 
          consistently loaded;
          patternNum indicates which number pattern this is from the
          input file

       post: the values of massbottom, corners, tees, and letter are
          reported to standard out labeled with patternNum

   */
   public void reportResultsToStdout(int patternNum){

      System.out.println("\nResults for pattern# " + patternNum + "\n");
      printPatternToScreen();
      System.out.println("\n   Massbottom = " + massbottom
      + "\n   Num of Corners = " + corners +
      "\n   Num of Tees = " + tees);

      System.out.print("\n   These feature values ");
      if (letter == LetterPattern.UNRECOGNIZED_LETTER)
         System.out.println("do not match any letter.");
      else
         System.out.println("match " + letter);
   }

   /*
      This main can be used to obtain your output.

      It sets up a Scanner instance from a command line argument,
      creates a LetterPattern instance, and repeatedly loads the 
      LetterPattern instance from the Scanner and
      analyzes it.  It displays the results to the standard out.

   */
   public static void main(String[] args){

      Scanner src;
      LetterPattern lp = new LetterPattern();
      int
         patternNumber = 1;

      if (args.length > 0){
         try{
  
            src = new Scanner(new File(args[0]));

            while (src.hasNextLine()){
               lp.loadPattern(src);
               lp.extractFeatures();
               lp.classifyLetter();
               lp.reportResultsToStdout(patternNumber);
               patternNumber++;
            }
         }
         catch(NullPointerException e){
            System.out.println("The file name may have been a null string.\nProgram Terminating." + e);
         }
         catch(FileNotFoundException e){
            System.out.println("No file with the name " + args[0]
            + "\nProgram terminating." + e);
         }
      }
      else // args is empty
         System.out.println("You must supply the input file name on"
         + " the command line.");
   }
}
