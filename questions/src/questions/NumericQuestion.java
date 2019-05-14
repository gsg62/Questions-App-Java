/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questions;

/**
 *
 * @author ggear
 */
import java.lang.Math;
import java.lang.Double;

/**
   Extends off of the class Question.
   A question with a numeric answer.
**/
public class NumericQuestion extends Questions
{
    double answer;
    /**
     Checks a given numeric answer for correctness.
     @param response the response to check
     @return true if the numeric response was correct, false otherwise
    */
    public void setAnswer(double correctResponse)
    {
        answer = correctResponse;
    }
    public boolean checkAnswer(String response)
  {
      // converts response and answer from strings to integers to check
      double userResponse = Double.valueOf(response);

      if (0.01 >= Math.abs(userResponse - answer)) // checks if response is within 0.01 of the actual answer
      {
          return true;
      }
      else{return false;}
  }
}
