package org.myonlineapp.model;

import org.springframework.stereotype.Repository;

@Repository
public class Job {
	private String jobid;
	private String jobstatus;
	public String getJobid() {
		return jobid;
	}
	public void setJobid(String jobid) {
		this.jobid = jobid;
	}
	public String getJobstatus() {
		return jobstatus;
	}
	public void setJobstatus(String jobstatus) {
		this.jobstatus = jobstatus;
	}
}
