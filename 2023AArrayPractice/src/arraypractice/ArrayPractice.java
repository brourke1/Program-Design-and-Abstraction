package arraypractice;

/**
 *
 * @author jfiore
 */
public class ArrayPractice {
  /* sets every item in A[] to initialValue */
  public static void initialize(int A[], int initialValue) {
	  for(int i = 0; i < A.length; i++) {
		  A[i] = initialValue;
	  }
  }
  /* returns the average of the items in A
   * Be careful: A[] is an array of int and the method returns
   * double. What do we do to handle this? */
  public static double average(int A[]) {
	  double sum = 0.0;
	  for(int i = 0; i < A.length; i++) {
		  sum += A[i];
	  }
    return sum / A.length;
  }

  /* returns the number of times that x appears in A[] */
  public static int numOccurrences(int A[], int x) {
	  int occurences = 0;
	  for(int i = 0; i < A.length; i++) {
		  if(A[i] == x) {
			  occurences++;
		  }
	  }
    return occurences;
  }


  /* returns the index of the first occurrence of
   * x in A[] or -1 if x doesn't exist in A[] */
  public static int find(int A[], int x) {
	  for(int i = 0; i < A.length; i++) {
		  if(A[i] == x) {
			  return i;
		  }
	  }
    return -1;
  }

  /* returns the index of the last occurrence of
   * x in A[] or -1 if x doesn't exist in A[] */
  public static int findLast(int A[], int x) {
	  for(int i = A.length - 1; i >= 0; i--) {
		  if(A[i] == x) {
			  return i;
		  }
	  }
    return -1;
  }

  /* returns the largest item found in A */
  public static int largest(int A[]) {
	  int max = A[0];
	  for(int i= 0; i<  A.length; i++) {
		  if(A[i] > max) {
			  max = A[i];
		  }
	  }
    return max;
  }

  /* returns the index of the largest item found in A */
  public static int indexOfLargest(int A[]) {
	  int maxI = 0;
	  for(int i = 0; i < A.length; i++) {
		  if(A[i] > A[maxI]) {
			  maxI = i;
		  }
	  }
    return maxI;
  }

  /* returns true if x is odd or false otherwise
   * add a JUnit test to test this method in the
   * file ArrayPracticeTest.java  */
  public static boolean isOdd(int x) {
	  if(x % 2 != 0) {
		  return true;
	  }
    return false;
  }
  
  /* returns the index of the largest odd number
   * in A[] or -1 if A[] contains no odd numbers
   *
   * include a call to your isOdd(int) method in
   * your solution */
  public static int indexOfLargestOdd(int A[]) {
	  int maxI = -1;
	  for(int i = 0; i< A.length; i++) {
		  if(isOdd(A[i])) {
			  if(maxI == -1) {
				  maxI = i;
			  }
			  else if(A[i] > A[maxI]) {
				  maxI = i;
			  }
		  }
	  }
    return maxI;
  }

  /* inserts n into A[] at A[index] shifting all */
  /* the previous items one place to the right. For example */
  /* if A is  */
  /*   |---+---+---+---+---+---+---+---+---+---| */
  /*   | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | */
  /*   |---+---+---+---+---+---+---+---+---+---| */
  /*   | 5 | 7 | 6 | 9 | 4 | 3 | 0 | 0 | 0 | 0 | */
  /*   |---+---+---+---+---+---+---+---+---+---| */

  /*   and we call insert(A, 15, 1), A then becomes */

  /*   |---+----+---+---+---+---+---+---+---+---| */
  /*   | 0 |  1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | */
  /*   |---+----+---+---+---+---+---+---+---+---| */
  /*   | 5 | 15 | 7 | 6 | 9 | 4 | 3 | 0 | 0 | 0 | */
  /*   |---+----+---+---+---+---+---+---+---+---| */
  /*  the element in A[] that's in the right-most */
  /*    position is removed.                      */
  /*                                              */
  /*  if index < 0 or index >= A.length-1, the method */
  /*                                    does nothing */
  public static void insert(int A[], int n, int index) {
	  int[] B = new int[A.length + 1];
	  
	  for(int i = 0; i < index; i++) {
		  B[i] = A[i];
	  }
	  
	  B[index] = n;
	  
	  if(index < A.length) {
		  for(int i = index; i < A.length; i++) {
			  B[i + 1] = A[i];
		  }
	  }
	  
  }

  /* returns a new array consisting of all of the
   * elements of A[] followed by all of the
   * elements of B[]. For example, if 
   A[] is: {10,20,30} and 
   B[] is: {5, 9, 38}, the method returns the
   array : {10,20,30,5,9,38} */
  public static int[] copyAll(int A[], int B[]) {
	  int size = A.length + B.length;
	  int C[] = new int[size];
	  
	  for(int i = 0; i < A.length; i++) {
		  C[i] = A[i];
	  }
	  
	  for(int i = 0; i < B.length; i++) {
		  C[i + A.length] = B[i]; 
	  }
    return C;
  }

  /* exchanges the elements found at A[i] and A[j].
   * Does nothing if i or j is invalid
   *
   * Add a JUnit test to test this method to the
   * file ArrayPracticeTest.java */
  public static void swap(int []A, int i, int j) {
	  int k = A[i];
	  A[i] = A[j];
	  A[j] = k;
  }
  
  /* reverses the order of the elements in A[].
   * For example, if A[] is:
   {10,20,30,40,50}, after the method, A[] would
   be {50,40,30,20,10}
   * 
   * use your swap() method in your solution
   *
   * Note that this method sorts the array "in place", i.e.,
   * the original array is changed. No new array is created.
   */
  public static void reverse(int A[]) {
	  int lastIndex = A.length - 1;
	  for(int i = 0; i < A.length / 2; i++) {
		  swap(A, i, lastIndex - i);
	  }
  }
  
  /* returns the specified column from [][]A as a single-dimensional
   * array, or null if colNum is invalid.
   *
   * for example, if A is
   * |---+----+----+----+----|
   * |   |  0 |  1 |  2 |  3 |
   * |---+----+----+----+----|
   * | 0 | 10 | 20 | 30 | 40 |
   * | 1 | 11 | 21 | 31 | 41 |
   * | 2 | 12 | 22 | 32 | 42 |
   * |---+----+----+----+----|
   *
   * and colNum is 1, the array returned is:
   *
   * |----+----+----|
   * |  0 |  1 |  2 |
   * |----+----+----|
   * | 20 | 21 | 22 |
   * |----+----+----|
   *
   * Extra credit: add a JUnit test for this method
   * to the file ArrayPracticeTest.java
   */
  public static int[] getCol(int [][]A, int colNum) {
    return A[colNum];
  }
}
