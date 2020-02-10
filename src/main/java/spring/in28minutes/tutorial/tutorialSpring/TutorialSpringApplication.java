package spring.in28minutes.tutorial.tutorialSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TutorialSpringApplication {

	public static void main(String[] args) {

		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSort());
		System.out.println(binarySearch.binarySearch(new int[] {1,2,3},3));

		SpringApplication.run(TutorialSpringApplication.class, args);
	}

}
