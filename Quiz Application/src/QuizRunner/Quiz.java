/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package QuizRunner;

import java.util.List;

/**
 *
 * @author Anton
 */
public class Quiz {
    public Quiz(List<Question> QuestionList)
    {
        questionList = QuestionList;
    }
    public List<Question> questionList;
    public double timeLimit;
    
    
}
