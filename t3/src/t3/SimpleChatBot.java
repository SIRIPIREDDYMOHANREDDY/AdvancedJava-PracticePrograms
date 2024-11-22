package t3;

import java.util.Scanner;

public class SimpleChatBot {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Hello! I'm a simple chatbot. How can I help you today?");
	        
	        while (true) {
	            String input = scanner.nextLine();
	            
	            if (input.equalsIgnoreCase("exit")) {
	                System.out.println("Goodbye! Have a great day!");
	                break;
	            }

	            String response = getResponse(input);
	            System.out.println(response);
	        }
	        
	        scanner.close();
	    }

	    private static String getResponse(String input) {
	        if (input.contains("hello") || input.contains("hi")) {
	            return "Hello there! How can I assist you?";
	        } else if (input.contains("your name")) {
	            return "I don't have a name, but you can call me ChatBot.";
	        } else if (input.contains("how are you")) {
	            return "I'm just a computer program, but I'm doing well! How about you?";
	        } else {
	            return "I'm not sure how to respond to that. Can you ask something else?";
	        }
	    }
	}
