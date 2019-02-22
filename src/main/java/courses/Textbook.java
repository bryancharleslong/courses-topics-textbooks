package courses;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Textbook {
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	@ManyToOne
	private Course course;

	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Object getCourse() {
		return course;
	}
	
	public Textbook() {}
	
	public Textbook(String name, Course course) {
		this.name = name;
		this.course = course;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Textbook other = (Textbook) obj;
		if (id != other.id)
			return false;
		return true;
	}

	

}
