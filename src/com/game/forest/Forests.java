package com.game.forest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.game.forest.enums.Emotions;



public class Forests {
	
	private static List<Animals> ani;
	
	public static void main(String[] args) {
		ani=new ArrayList<>();
		
		
		Animals tiger1=new Tigers();
		tiger1.setName("Tiger");
		tiger1.setEmotion(Emotions.angry);
		tiger1.setStrength(1);
		
		Animals tiger2=new Tigers();
		tiger2.setName("Tiger");
		tiger2.setEmotion(Emotions.hungry);
		tiger2.setStrength(1);
		
		Animals tiger3=new Tigers();
		tiger3.setName("Tiger");
		tiger3.setEmotion(Emotions.angry);
		tiger3.setStrength(1);
		
		Animals rabbit1=new Rabbits();
		rabbit1.setName("Rabbit");
		rabbit1.setEmotion(Emotions.hungry);
		rabbit1.setStrength(3);
		
		Animals snake1=new Snakes();
		snake1.setName("Snake");
		snake1.setEmotion(Emotions.angry);
		snake1.setStrength(2);
		
		ani.add(tiger1);
		ani.add(tiger2);
		ani.add(tiger3);
		ani.add(rabbit1);
		ani.add(snake1);
		
		
		System.out.println("GAME STARTED_________....____>>>");
		//printing the list of animals
		System.out.println("Following Animals are existing in the Forest");
		
		
			for (Animals model : ani) {
	            System.out.println(model.getName());
	        }
		
		
//		 for (Animals model : ani) {
//	            System.out.println(model.getName());
//	        }
//		Iterator it=ani.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//			}
		
		//ani.forEach(System.out::println);
		//Lambda Expression
		//ani.forEach(sim -> System.out.println(sim));
	
		
		Random random=new Random();
		
		
		
		while(true) {
			int FirstAnimalIndex=random.nextInt(ani.size());
			int SecondAnimalIndex=random.nextInt(ani.size());
			
			Animals first=ani.get(FirstAnimalIndex);
			Animals second=ani.get(SecondAnimalIndex);
			
			
			if((first instanceof Tigers) &&(second instanceof Tigers) 
					&& (first.getEmotion().equals(Emotions.angry)) && (second.getEmotion().equals(Emotions.angry)) ) {
				
				System.out.println(" Both tigers are angry and fight started between them");
				System.out.println("First Tiger dead");
				ani.remove(FirstAnimalIndex);
			}
			
			else if((first instanceof Tigers) && (second instanceof Tigers) 
					&& (first.getEmotion().equals(Emotions.angry)) && (second.getEmotion().equals(Emotions.hungry))  ) {
				
				//runtime polymorphism
				Animals BehaviourOfANimals=new Tigers();
				BehaviourOfANimals.behaviour();
				
			System.out.println(" Tigers are Fighting");
			System.out.println("Second Tiger dead");
			ani.remove(SecondAnimalIndex);
			}
			
			else if((first instanceof Tigers) && (second instanceof Rabbits) 
					&& (first.getEmotion().equals(Emotions.angry))  ) {
				
			rabbit1.eat();
			Animals BehaviourOfANimals=new Rabbits();
			BehaviourOfANimals.behaviour();
			System.out.println(" Tiger attacked rabbit");
			System.out.println("Rabbit escaped");
			
			}
			
			else if((first instanceof Tigers) && (second instanceof Rabbits) 
					&& (first.getEmotion().equals(Emotions.hungry)) && (second.getEmotion().equals(Emotions.hungry)) ) {
				
				rabbit1.eat();
				Animals BehaviourOfANimals=new Rabbits();
				BehaviourOfANimals.behaviour();
			System.out.println(" Tiger hunted rabbit");
			tiger1.eat();
			ani.remove(SecondAnimalIndex);
			}
			
			else if((first instanceof Snakes) && (second instanceof Rabbits) 
					&& (first.getEmotion().equals(Emotions.angry))  ) {
				rabbit1.eat();
			System.out.println(" Snake bits Rabbit");
			System.out.println("Rabbit dead");
			snake1.eat();
			ani.remove(SecondAnimalIndex);
			}
			else
			{
				System.out.println("Now following animals are existing in Forest");
				for (Animals model : ani) {
		            System.out.println(model.getName());
		        }
				System.out.println("GAME OVER!---");
				break;
			}
			
		}
		
//		Iterator it=ani.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		//snake1.toString();
		
		
		
//		for(Object o: ani)
//		{
//			System.out.println(o);
//		}
//		System.out.println("GAME OVER!");
		
		
		
		
	}
}
		
	


