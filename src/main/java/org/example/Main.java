package org.example;

public class Main {
    public static void main(String[] args) {

        for(int numbers = 1; numbers <= 200; numbers ++){
        if(numbers % 3 ==0 && numbers % 5 == 0) {
            System.out.println("BuzzFizz");
        } else if (numbers % 3 == 0) {
            System.out.println("Fizz");
        } else if (numbers % 5 == 0) {
            System.out.println("Buzz");
        } else{
                        System.out.println(numbers);
                    }


                }
            }

        }
