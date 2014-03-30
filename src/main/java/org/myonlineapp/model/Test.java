package org.myonlineapp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Test")
public class Test extends BaseEntity{
	private String username;
	private List<Question> listQuestion;
	private int totalmarks;
	private int marksobtained;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public List<Question> getListQuestion() {
		return listQuestion;
	}
	public void setListQuestion(List<Question> listQuestion) {
		this.listQuestion = listQuestion;
	}
	public int getTotalmarks() {
		return totalmarks;
	}
	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}
	public int getMarksobtained() {
		return marksobtained;
	}
	public void setMarksobtained(int marksobtained) {
		this.marksobtained = marksobtained;
	}
}
