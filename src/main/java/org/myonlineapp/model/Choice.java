package org.myonlineapp.model;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Choice")
/*@AttributeOverrides({
		@AttributeOverride(name="id",column=@Column(name="choice_id"))
})*/
public class Choice extends BaseEntity{
	
	private String choicetext;
	
	@ManyToMany(targetEntity=Question.class)
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
