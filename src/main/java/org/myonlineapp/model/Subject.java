package org.myonlineapp.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Subject")
public class Subject extends BaseEntity {
	private String subjectname;
	private String subjectdescription;
	private SubjectCategory subjectCategory;
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
		return subjectCategory;
	}
	public void setSubjectCategory(SubjectCategory subjectCategory) {
		this.subjectCategory = subjectCategory;
	}
}
