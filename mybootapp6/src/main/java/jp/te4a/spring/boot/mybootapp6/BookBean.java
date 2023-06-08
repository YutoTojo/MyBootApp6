package jp.te4a.spring.boot.mybootapp6;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookBean  {
	Integer id ;
	String title;
	String writter;
	String publisher;
	 Integer price;
	public Integer getId() {
		return null;
	}
    public String getTitle() {
        return null;
    }
    public String getPublisher() {
        return null;
    }
    public String getWritter() {
        return null;
    }
    public String getPrice() {
        return null;
    }
}