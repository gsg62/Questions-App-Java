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
/**
   A question with a text and an answer.
*/

/*
 question is a class for : numeric, anycorrect, MCQ, and FillInQuestion
 to declare an array of 6 questions you have to use the question class
 and you can fill the array with objects from any of the classes
 ex. Question[] myQuestions = new Queston[6];
    NumericQuestion nq1 = new NumericQuestion();
    myQuestions[0] = fq1;
    FillInQuestion fq1 = new FillInQuestion();
    myQuestions[1] = fq1;
    anyCorrectChoiceQuestion aq1 = new anyCorrectChoiceQuestion();
    myQuesitons[2] = aq1;

     for (Question q: myQuestions)
    {
      q = myQuesitons[0];
      q.checkAnswer;
      if (q instanceOf NumericQuestion){
      // points earned for question type
    }
      if (q instanceOf anyCorrectChoiceQuestion)
      if (q instanceOf FillInQuestion)
      q = myQuesitons[1];
      q.checkAnswer;
      q = myQuesitons[2];
      q.checkAnswer;

    }
    to know what q is for the point system you need instanceOf operator:

*/
import java.util.Scanner;
import java.util.ArrayList;

public class QuestionApp
{
   //creates a variable to hold the score of the user
   private int score = 0;
   public static void main(String[] args)
   {  //creates a variable to hold the score of the user
      int score = 0;
      // creates an arrayList for the questions to be stored
      ArrayList<Questions> questionsArray = new ArrayList<Questions>();
     
      // adds and creates two numeric questions to the questions arrayList
      NumericQuestion nq1 = new NumericQuestion();
      nq1.setText("What is 40 divided by 4?");
      nq1.setAnswer(10);
      questionsArray.add(nq1);
      
      NumericQuestion nq2 = new NumericQuestion();
      nq2.setText("What is the square root of 400");
      nq2.setAnswer(20);
      questionsArray.add(nq2);
      
      
      // adds and creates two Fill In questions to the questions array
      FillInQuestion fq1 = new FillInQuestion();
      fq1.setText("The president of the United States is _Donald Trump_");
      questionsArray.add(fq1);
      
      FillInQuestion fq2 = new FillInQuestion();
      fq2.setText("The richest man in the world is _Bill Gates_");
      questionsArray.add(fq2);
      
      // adds and creates two Any Correct Choice questions to the questions array
      AnyCorrectChoiceQuestion accq1 = new AnyCorrectChoiceQuestion();
      accq1.setText("Which of the following animals are mammals?");
      accq1.addChoice("shark");
      accq1.addChoice("bear");
      accq1.addChoice("kangaroo");
      accq1.addChoice("lizard");
      accq1.setAnswer("bear  kangaroo");
      questionsArray.add(accq1);
      
      AnyCorrectChoiceQuestion accq2= new AnyCorrectChoiceQuestion();
      accq2.setText("Which of the following countries are in South America?");
      accq2.addChoice("Argentina");
      accq2.addChoice("Croatia");
      accq2.addChoice("Thailand");
      accq2.addChoice("Chile"); 
      accq2.setAnswer("Argentina  Chile");
      questionsArray.add(accq2);
      
      // presents each question
      for (Questions q: questionsArray)
      {
          // displays question
      q.display();
      System.out.print("Your answer: ");
      Scanner in = new Scanner(System.in);
      String response = in.nextLine();
      //checks if response is correct and adds score if it is
      if (q.checkAnswer(response))
          {
            System.out.println("You are Correct!");
            if (q instanceof NumericQuestion)
            {
              score += 1;
            }
            else if (q instanceof FillInQuestion)
            {
              score += 2;
            }
            else if (q instanceof AnyCorrectChoiceQuestion)
            {
              score += 3;
            }
          }
      else
      {
          System.out.println("You are incorrect.");
      }
      System.out.println("Your current score is:" + score);
   }
          
      
      System.out.println("Your final score is:" + score);
      System.out.println("Thank You!");
   }
      /**
       * original questions example:
      Questions first = new Questions();
      first.setText("Who was the inventor of Java?");
      first.setAnswer("James Gosling");

      ChoiceQuestion second = new ChoiceQuestion();
      second.setText("In which country was the inventor of Java born?");
      second.addChoice("Australia", false);
      second.addChoice("Canada", true);
      second.addChoice("Denmark", false);
      second.addChoice("United States", false);

      presentQuestion(first);
      presentQuestion(second);
      **/
   }

   /**
      Presents a question to the user and checks the response.
      @param q the question
   */
/**  
public void presentQuestion(Questions q)
   {
      // displays question
      q.display();
      System.out.print("Your answer: ");
      Scanner in = new Scanner(System.in);
      String response = in.nextLine();
      //checks if response is correct and adds score if it is
      if (q.checkAnswer(response))
          {
            System.out.println("You are Correct!");
            if (q instanceof NumericQuestion)
            {
              this.score += 1;
            }
            else if (q instanceof FillInQuestion)
            {
              this.score += 1;
            }
            else if (q instanceof NumericQuestion)
            {
              this.score += 1;
            }
          }
      else
      {
          System.out.println("You are incorrect.");
      }
      System.out.println("Your current score is:" + this.score);
   }
}
**/