package questions;
/**
 * @author ggear
 */

import java.util.ArrayList;
/**
   A question with multiple correct choices.
   Extends off of the class ChoiceQuestion.
*/
public class AnyCorrectChoiceQuestion extends Questions
{
  // answer variables initilized
  private String answer1 = ""; 
  private String answer2 = "";
  private String answer3 = "";
  // recreates choices array list for different .addChoice() method
  private ArrayList<String> choices = new ArrayList<String>();

  
  /**
      Sets the answers for this question.
      @param correctResponses the answers
   */
  public void setAnswer(String answer)
  {
    String[] answers = answer.split("  "); // splits the string into its two answers 
    // sets answers to variables with option for a third answer if necessary
    answer1 = answers[0];
    answer2 = answers[1];
    if (answers.length > 2){answer3 = answers[2];}
  }

  /**
      Adds an answer choice to this question.
      @param choice the choice to add
  **/
  public void addChoice(String choice)
  {
    choices.add(choice); //
  }

  /**
      Checks a given response for correctness.
      @param response the response to check
      @return true if the response was correct, false otherwise
   **/
  public boolean checkAnswer(String response)
  {
     if ((response.equals(answer1)) || (response.equals(answer2)) || (response.equals(answer3)))
     {
       return true;
     }
     return false;
  }
  public void display()
  {
    // tells user there are more than one correct answer and how to submit their answer(s)
    System.out.println("*There is more than one correct answer*");
    // Display the question text
    super.display();
    // Display the answer choices
    for (int i = 0; i < choices.size(); i++)
    {
       int choiceNumber = i + 1;
       System.out.println(choiceNumber + ": " + choices.get(i));
      }
   }
}
