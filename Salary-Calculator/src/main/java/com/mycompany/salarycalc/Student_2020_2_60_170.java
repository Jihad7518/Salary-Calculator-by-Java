/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.salarycalc;
import java.io.Serializable;
/**
 *
 * @author shafi
 */
public class Student_2020_2_60_170 implements Serializable{
private static final long serialVersionUID = 1L;
 
    private String roll;
    private String name;
    private int bengaliMarks;
    private int engMarks;
    private int mathMarks;
 
    public Student_2020_2_60_170(String roll, String name, int bengaliMarks, int engMarks, int mathMarks){
        this.roll = roll;
        this.name  = name;
        this.bengaliMarks  = bengaliMarks;
        this.engMarks  = engMarks;
        this.mathMarks  = mathMarks;
    }
 
    public void setRoll(String roll) {
        this.roll = roll;
    }
 
    public String getRoll() {
        return this.roll;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getName() {
        return this.name;
    }
 
    public void setBengaliMarks(int bengaliMarks) {
        this.bengaliMarks = bengaliMarks;
    }
 
    public int getBengaliMarks() {
        return this.bengaliMarks;
    }

    public void setEngMarks(int engMarks) {
        this.engMarks = engMarks;
    }
 
    public int getEngMarks() {
        return this.engMarks;
    }

    public void setMathMarks(int mathMarks) {
        this.mathMarks = mathMarks;
    }
 
    public int getMathMarks() {
        return this.mathMarks;
    }
 
    @Override
    public String toString() {
        return new StringBuffer(" Roll: ").append(this.roll)
                .append(" Name : ").append(this.name).append(" Bengali Marks : ").append(this.bengaliMarks).toString();
    }
}
