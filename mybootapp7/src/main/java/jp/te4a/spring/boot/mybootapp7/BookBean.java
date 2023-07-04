package jp.te4a.spring.boot.mybootapp7;

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
		return id;
	}
    public String getTitle() {
        return title;
    }
    public String getPublisher() {
        return writter;
    }
    public String getWritter() {
        return publisher;
    }
    public Integer getPrice() {
        return price;
    }
}