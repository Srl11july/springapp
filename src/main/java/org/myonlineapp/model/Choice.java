package org.myonlineapp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Choice")
public class Choice extends BaseEntity{
	
	private String choicetext;
	private List<Question> listQuestion;
	private Boolean isRight;
	public String getChoicetext() {
		return choicetext;
	}
	public void setChoicetext(String choicetext) {
		this.choicetext = choicetext;
	}
	public List<Question> getListQuestion() {
		return listQuestion;
	}
	public void setListQuestion(List<Question> listQuestion) {
		this.listQuestion = listQuestion;
	}
	public Boolean getIsRight() {
		return isRight;
	}
	public void setIsRight(Boolean isRight) {
		this.isRight = isRight;
	}
	
	
}
