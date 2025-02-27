package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args){

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		Post post1 = new Post(LocalDateTime.parse("21/06/2018 13:05:44", fmt), "Traveling to New Zealand",
				"I'm going to visit this wonderfull country!", 12);
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Wow that's awesome");
		post1.addComment(c1);
		post1.addComment(c2);
		
		Post post2 = new Post(LocalDateTime.parse("28/07/2018 23:14:19", fmt), "Good Night guys",
				"See you tomorrow", 5);
		Comment c3 = new Comment("Good Night");
		Comment c4 = new Comment("May the Force be with you");
		post2.addComment(c3);
		post2.addComment(c4);
		
		System.out.println(post1);
		System.out.println(post2);

	}

}
