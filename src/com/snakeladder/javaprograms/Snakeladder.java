package com.snakeladder.javaprograms;

public class Snakeladder {

	public static final int SNAKE = 1;
	public static final int LADDER = 2;
	
	public static void main(String[] args) {

		int position = 0;
		int count_dieroll = 0;
		
		while(position < 100) {
		int die_roll = (int)Math.floor ((Math.random() * 10 % 6) + 1);
		int option = (int)Math.floor (Math.random() * 10 % 3);
		switch (option) {
		
		case SNAKE:
			
			position -= die_roll;
			if(position < 0) {
				position = 0;
			}
			count_dieroll++;
			break;
			
		case LADDER:
			position += die_roll;
			if(position > 100) {
				position -= die_roll;
			}
			count_dieroll++;
			break;

		default:
			count_dieroll++;
			break;
		}
		System.out.println("Position : " + position);
		}
		
		if(position == 100)
		System.out.println("Winner winner chicken dinner");
		System.out.println("Die roll : " + count_dieroll);
	}

}
