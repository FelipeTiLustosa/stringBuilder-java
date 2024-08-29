package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
		private static DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		private LocalDateTime moment;
		private String title;
		private String concent;
		private Integer likes;
		
		private List<Comment> comments =new ArrayList<>();
		
		public Post() {
			
		}
		
		public Post(LocalDateTime moment, String title, String concent, Integer likes) {
			this.moment = moment;
			this.title = title;
			this.concent = concent;
			this.likes = likes;
		}

		public LocalDateTime getMoment() {
			return moment;
		}

		public void setMoment(LocalDateTime moment) {
			this.moment = moment;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getConcent() {
			return concent;
		}

		public void setConcent(String concent) {
			this.concent = concent;
		}

		public Integer getLikes() {
			return likes;
		}

		public void setLikes(Integer likes) {
			this.likes = likes;
		}

		public List<Comment> getComments() {
			return comments;
		}

		public void addComment(Comment comment) {
			comments.add(comment);
		}
		public void removeComment(Comment comment) {
			comments.remove(comment);
		}
		public String toString() {
			 StringBuilder sb = new StringBuilder();
			 sb.append(title + "\n");
			sb.append(likes);
			sb.append(" Likes - ");
			sb.append(fmt1.format(moment) +"\n");
			sb.append(concent+"\n");
			sb.append("Comments:\n");
			for (Comment c : comments) {
				sb.append(c.getText()+"\n");
			}
			return sb.toString();
		}
		
		
		
		
}
