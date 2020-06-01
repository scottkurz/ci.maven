package io.openliberty.tools.maven;

import java.util.ArrayList;
import java.util.List;

public class CopyDependencies {

	String location;
	
	//List<String> dependencies = new ArrayList<String>();
	List<Dependency> dependencies = new ArrayList<Dependency>();
	
	//public void addDependency(String dependency) {

	public void addDependency(Dependency dependency) {
		dependencies.add(dependency);
	}
		
}
