import java.util.*;
import java.io.*;
/// file name should agree with class name
/// DON'T USE THE TAB CHARACTER; The Eclipse II handout explains in
/// Section V end how to avoid it
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
      
   boolean exit, haventSeen$, hasLine;
   int count0, count1, length;

//contents of input file
   String s = src.nextLine();
   hasLine = haventSeen$ =true;

	for(int r=1;r<=10;r++){
		for(int c=1;c<=10;c++)
	if (hasLine && haventSeen$ && c<=length){ 
	
//index set to 1
	if (hasLine && haventSeen$ && c<=length){
      if (s.charAt(c-1)=='*'){
         grid[r][c] = 1;
         count1++;
      
//index 0
      }else{
         grid[r][c]=0;
      
         if(s.charAt(c-1)=='$')
            haventSeen$=false;
      

      }
   }else if (grid[r]!=10)
      grid[r][c]=0;

	if(src.hasNextLine()){
		s=src.nextLine();
		
	}else
		hasLine=false;
	}
   }
}
public void extractFeatures(){
   	
   int massbottom = corners = tees = count1 = i = none = total =0;

   int a1,a2,a3,b1,b2,b3,c1,c2,c3;
   
   boolean isTee, isCorner, isMB, noPttrn;

   for(int r=1;r<=10; r++){
      for(int c=1;c<=10; c++)
         if(grid[r][c]==1)
            count1++;
///  == 1?  if it's a 0, you can just skip over to the next
/// cell
      if(grid[r][c]==1){
         grid[r][c[c]=this.nextLine()
      	

/// actually, this grabs the leftmost column, no?
      	///bottom row
      	c1=grid[r-1][c-1];
      	c2=grid[r][c-1];
      	c3=grid[r+1][c-1];
      	
///  ??? this can't be right;
      	massbottom+=(c1+c2+c3);
      	isMB=true;
      	

         if()
      	
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

/// this gets the other 2
      	  if(1==a2 && 1==c2 && (1==b1 || 1==b3)
      	  tees++;
      	}
      
      //if corner
      if(3==total){
/// b?  b? this wouldn't compile;
/// I expect you to be able to get the syntax errors out on your own
      	if(1==a2 && (1==b1 || 1==b)
      	corners++;
      	if(1==c2 && (1==b1 || 1==b3)
      	corners++;
     
      }else{
         c1=grid[r-1][c-1];
         c2=grid[r][c-1];
         c3=grid[r+1][c-1];
      		
  	}

/// the method cannot end here;
//not a pattern, move onto next spot)
      	
public void classifyLetter(){
	// getter functions for the massbottom, tees, corners, and
   // the matching letter
   public int getMassbottom(){ return massbottom;}
   public int getCorners(){ return corners;}
   public int getTees(){ return tees;}
   public char getLetter(){ return letter;}

	if(2>=massbottom && 4==corners){
		if(0==tees)
		letter=S;
		if(2>=tees)
		letter=B;
	}
	if(2==massbottom && 2==corners && 2==tees){
		letter=A;
	if(2>=massbottom && 2==corners && 0==tees)
		letter=C;
	if(2>=massbottom && 2==corners && 1==tees)
		letter=E;
	if(1==massbottom && 1==corners && 1==tees)
		letter=F;
	if(2>=massbottom && 3==corners && 1==tees)
		letter=G;
	if(2==massbottom && 0==corners && 2==tees)
		letter=H;
	if(1==massbottom && 0==corners && 0==tees)
		letter=I;
	if(2>=massbottom && 1==corners && 0==tees)
		letter=L;
	if(2==massbottom && 2==corners && 1==tees)
		letter=M;
	if(1==massbottom && 3==corners && 1==tees)
		letter=P;
	if(1==massbottom && 0==corners && 1==tees)
		letter=T;
	if(1==massbottom && 2==corners && 1==tees)
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
