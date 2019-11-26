package postgre.test.demo1.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PgTest {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	private String text;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public PgTest() {
	}
	
	public PgTest(String text) {
		super();
		this.text = text;
	}
	
	@Override
	public String toString() {
		return "PgTest [id=" + id + ", text=" + text + "]";
	}
	
	
	
}
