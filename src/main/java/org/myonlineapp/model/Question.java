package org.myonlineapp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Question")
public class Question extends BaseEntity{
	
	private String questiontype;
	private String questioncategory;
	private String questiontext;
	private List<Choice> listChoice;
	private SubjectCategory subjectcategory;
	public String getQuestiontype() {
		return questiontype;
	}
	public void setQuestiontype(String questiontype) {
		this.questiontype = questiontype;
	}
	public String getQuestioncategory() {
		return questioncategory;
	}
	public void setQuestioncategory(String questioncategory) {
		this.questioncategory = questioncategory;
	}
	public String getQuestiontext() {
		return questiontext;
	}
	public void setQuestiontext(String questiontext) {
		this.questiontext = questiontext;
	}
	public List<Choice> getListChoice() {
		return listChoice;
	}
	public void setListChoice(List<Choice> listChoice) {
		this.listChoice = listChoice;
	}
	public SubjectCategory getSubjectcategory() {
		return subjectcategory;
	}
	public void setSubjectcategory(SubjectCategory subjectcategory) {
		this.subjectcategory = subjectcategory;
	}
}
