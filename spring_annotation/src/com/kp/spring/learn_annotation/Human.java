package com.kp.spring.learn_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

   /* @Autowired // when using byType autowire rename "heart" to any other name. i.e. dependency matched by type not by name.
    @Qualifier("humanHeart")*/
    private Heart heart;


    public Human(){
        System.out.println("Inside default constructor - human bean created ");
        System.out.println(" WHY Default constructor ? - bean created by JVM unless if there is no override constructor");
    }

   //@Autowired // autowire is happening by constructor
    public Human(Heart heart) {
        this.heart = heart;
        System.out.println("Human constructor is getting called which has heart arg ");
    }

    public Heart getHeart() {
        return heart;
    }

    /*@Autowired // autowire is happing by setter
    @Qualifier("humanHeart")*/
    //@Qualifier("octpousHeart") // to inject octopus heart
    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public void getHeartStatus() {

        if (null !=heart){
            heart.pump();
            System.out.println(" name of the animal is: "+heart.getNameOfAnimal()+
                    " and number of heart are  " +heart.getNoOfHeart());
        }else
            System.out.println("Dead");

    }
}
