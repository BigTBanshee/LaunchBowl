package com.launchcode.bowling.models;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class Score extends AbstractEntity {

    @Size(max=300)
    private Integer score;

    public Score(){}

    public Score(Integer score) {
        this.score = score;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return score.toString();
    }
}