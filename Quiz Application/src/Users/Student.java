/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Users;

import QuizApp.Core.User;

/**
 *
 * @author Anton
 */
public class Student extends User{

    public Student(int Utype, String UserName) {
        super(Utype, UserName);
    }
    private enum UserType {STUDENT, LECTURER, MODULELEADER};
    }

