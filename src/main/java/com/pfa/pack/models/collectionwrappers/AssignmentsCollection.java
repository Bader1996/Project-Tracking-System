package com.pfa.pack.models.collectionwrappers;

import java.io.Serializable;
import java.util.List;

import com.pfa.pack.models.entities.Assignment;

public final class AssignmentsCollection implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private List<Assignment> assignments;
	
	public AssignmentsCollection() {
		
	}
	
	public AssignmentsCollection(final List<Assignment> assignments) {
		this.assignments = assignments;
	}
	
	public List<Assignment> getAssignments() {
		return assignments;
	}

	public void setAssignments(final List<Assignment> assignments) {
		this.assignments = assignments;
	}
	
	
	
}








