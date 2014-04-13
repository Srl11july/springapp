package org.myonlineapp.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Subject")
public class Subject extends BaseEntity {
	
	private String subjectname;
	private String subjectdescription;
	
	@ManyToOne
	private SubjectCategory mySubjectCategory;
	
	public String getSubjectname() {
		return subjectname;
	}
	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
	public String getSubjectdescription() {
		return subjectdescription;
	}
	public void setSubjectdescription(String subjectdescription) {
		this.subjectdescription = subjectdescription;
	}
	public SubjectCategory getSubjectCategory() {
		return mySubjectCategory;
	}
	public void setSubjectCategory(SubjectCategory subjectCategory) {
		this.mySubjectCategory = subjectCategory;
	}
}
