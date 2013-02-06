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
public void loadPattern(Scanner src){
      
   private boolean exit, haventSeen$, hasLine;
   private int 0count, 1count, NA;

   //contents of input file
   String s = src.nextLine();
   hasLine = haventSeen$ =true;

	for(int r=1;r<=10;r++){
		for(int c=1;c<=10;c++)
	if (hasLine && haventSeen$ && c<=s.length()){ 
	
	//index set to 1
	if (s.charAt(c-1)=='*'){
   		grid[r][c] = 1;
   		1count++;
   	
   	//index set to 0
   	else{
   		grid[r][c]=0;
   		0count++;
	
	if(s.charAt(c-1)=='$')
   		haventSeen$=false;
   	
	//insurance 0
	}}else
		grid[r][c]=0;
	
	if(src.hasNextLine()){
		s=src.nextLine();
		
	}else
		hasLine=false;
	}
   }
}
public void extractFeatures(){
   	
   private int i=0, none=0, total=0;
   	massbottom=0, corners=0, tees=0;
   private int a1,a2,a3,b1,b2,b3,c1,c2,c3;
   
   boolean isTee, isCorner, isMB, noPttrn;

   for(int r=1;r<=10; r++){
      for(int c=1;c<=10; c++)
      
      if(grid[r][c]!=1){
      	
      	///bottom row
      	c1=grid[r-1][c-1];
      	c2=grid[r][c-1];
      	c3=grid[r+1][c-1];
      	
      	massbottom+=(c1+c2+c3);
      	isMB=true;
      	
      }else
      	
      	//3x3 window
      	a1=grid[r-1][c+1];
      	a2=grid[r][c+1];
      	a3=grid[r+1][c+1];
      	b1=grid[r-1][c];
      	b2=grid[r][c];
      	b3=grid[r+1][c];
      	c1=grid[r-1][c-1];
      	c2=grid[r][c-1];
      	c3=grid[r+1][c-1];
      	total+=(a1+a2+a3+b1+b2+b3+c1+c2+c3);
      
      //if tee
      if(4==total){
      	if(1==b1 && 1==b3 && (1==c2 || 1==a2)
      	tees++;
      	if(1==a2 && 1==c2 && (1==b1 || 1==b3)
      	tees++;
      	
      }
      //if corner
      if(3==total){
      	if(1==a2 && (1==b1 || 1==b)
      	corners++;
      	if(1==c2 && (1==b1 || 1==b3)
      	corners++;
      }
      		
  	}else{
      		none++;
      	}//not a pattern, move onto next spot)
      	
public void classifyLetter(){
/ getter functions for the massbottom, tees, corners, and
   // the matching letter
   public int getMassbottom(){ return massbottom;}
   public int getCorners(){ return corners;}
   public int getTees(){ return tees;}
   public char getLetter(){ return letter;}

	if(4==corners){
		if(0==tees)
		letter=S;
		if(2>=tees)
		letter=B;
	else if(2==massbottom && 2==corners && 2==tees)
		letter=A;
	else if(2>=massbottom && 2==corners && 0==tees)
		letter=C;
	else if(2>=massbottom && 2==corners && 1==tees)
		letter=E;
	else if(1==massbottom && 1==corners && 1==tees)
		letter=F;
	else if(2>=massbottom && 3==corners && 1==tees)
		letter=G;
	else if(2==massbottom && 0==corners && 2==tees)
		letter=H;
	else if(1==massbottom && 0==corners && 0==tees)
		letter=I;
	else if(2>=massbottom && 1==corners && 0==tees)
		letter=L;
	else if(2==massbottom && 2==corners && 1==tees)
		letter=M;
	else if(1==massbottom && 3==corners && 1==tees)
		letter=P;
	else if(1==massbottom && 0==corners && 1==tees)
		letter=T;
	else if(1==massbottom && 2==corners && 1==tees)
		letter=Y;
	
	}else
		letter=UNRECOGNIZED_LETTER;



}
   /*

       pre: grid is not null

       post: grid is not modified its full contents(all 12 rows of 12 columns)
          has been printed to the screen, line by line

   */
public void printPatternToScreen(){
	
	for(int r=0;r<=10;r++){
		for(int c=0;c<=10;c++)
		System.out.printf(grid[r][c]);
	}
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
