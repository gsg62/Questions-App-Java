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

import java.lang.String;
/**
   Extends off of the class Question.
   A "fill in the blank question".
*/
public class FillInQuestion extends Questions
{
  /**
     Sets the question text and answer.
     @param questionText the text of this question
  */
    public void setText(String questionText)
    {
        String questiontext = new String(questionText);
        
        int beginAnswerIndex = 0;
        for (int i = 0; i < questionText.length(); i++)
        {
            char checkChar = questionText.charAt(i);
            if (checkChar == '_')
            {
                beginAnswerIndex = i;
                i = questionText.length();
            }
        }
     String adjustedQuestionText = questionText.substring(0, beginAnswerIndex) + "_________";
     super.setText(adjustedQuestionText);
     String answer = questionText.substring(beginAnswerIndex, questionText.length());
     answer = answer.replace("_", "");
     super.setAnswer(answer);

    }
}
