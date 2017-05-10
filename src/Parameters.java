/*
  @ License - MIT 
  @ Author  - Anmol Chachra 
  @ e-mail  - 9914103037anmol@gmail.com
  @ Blog    - codeitplease.wordpress.com */

/*
  	Interface containing the paramters that controls the computation of the program
  	
  	MAX_ITERATIONS - Define the number of times the values will be updated until the error approaches required error.
  	PROBLEM_DIM    - The number of variables that make the function.
  	C1             - Constant(not necessary) used in location updation formula
	STARS          - The population size
*/
public interface Parameters {
	
	int MAX_ITERATIONS = 1000;
	int PROBLEM_DIM = 2;
	int C1 = 2;
	int STARS = 100;
}
