package util;
/**
 * Mathematical functions for arrays.
 * 
 * @author Nutta Sittipongpanich
 */
public class ArrayMath{
   /**
    * Compute and return the average of an array of values.
    * @param x array of double values. May have length 0.
    * @return the average of values in x. If array has 
    *        length 0 then the average is 0.0.
    */
  public static double average(double[] x) {
      int sum = 0;
      double average = 0;
      if (x.length == 0){
          average = 0.0;
      }
      else{
          for (int i = 0; i < x.length; i++)
          sum += x[i];
      average = ((double) sum) / x.length;
      }
      return average;
  }

  /**
   * Returns the inner product (dot product) of two arrays. 
   * @param x array of double values. May have length 0.
   * @param y another array of double values. May have length 0.
   * @return the dot product of array x and array y.
   * If array has length 0 then the dot product is 0.0.
   */
  public static double dotProduct(double[] x, double[] y){
      int length = 0;
      if (x.length != y.length){
          if(x.length <= y.length){
              length = x.length;
          }
          else if(x.length > y.length){
              length = y.length;
          }
      }
      else{
          length = x.length;
      }
      double sum = 0;
      for (int i = 0; i < length; i++) {
          sum += x[i]*y[i];
      }
      return sum;
  }

  /**
   * Returns the Euclidean norm of an array.
   * @param x array of double values.
   * @return square-root of the sum of squares of elements
   * in given arrays.
   */
  public static double norm(double[] x){
      double norm = 0;
      for (int i = 0; i < x.length; i++) {
          norm += x[i]*x[i];
      }
      return Math.sqrt(norm);
  }

  /**
   * Return the maximal element in x.
   * If x is empty, return -Infinity
   * @param x array of double values. May have length 0.
   * @return the maximal element in x, or -Infinity, if x is empty.
   */
  public static double max(double[] x){        
      double maxNum = Double.NEGATIVE_INFINITY;
      if (x.length == 0){
          return maxNum;
      }
      else{
          for (double num : x){
              if (num > maxNum){
                  maxNum = num;
              }
          }
      return maxNum;
      }
  }

  /**
   * Return the value of a polynomial with coefficientsin array a, 
   * evaluated at x. 
   * @param x a number that will be the power of p(x)
   * @param a an array of double values.
   * @return the value of a polynomial
   */
  public static double polyval(double x, double[] a){
      // syntax: for(initializer; test_condition; increment)
      double poly = 0;
      int n = a.length - 1;
      for(int k = n; k >= 0; k--) {
          poly = poly*x + a[k];
      }
      return poly;
  }
}
