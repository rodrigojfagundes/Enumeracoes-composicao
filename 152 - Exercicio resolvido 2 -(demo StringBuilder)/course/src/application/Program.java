package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//criando um OBJETO com o nome de C1, e ele vai ser um COMENTARIO
		Comment c1 = new Comment("have a nice trip!");
		Comment c2 = new Comment("how that's awesome!");
		//criando um objeto do tipo POST com o nome de P1...
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "traveling to new zealand", "i'm going to visit this wonderful country", 12);
		//adicionando os comentarios C1 e C2 no Post P1
		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment c3 = new Comment("good night");
		Comment c4 = new Comment("may the force be with you");
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "see you tomorrow", 5);
		
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);	
		System.out.println(p2);
	}

}
