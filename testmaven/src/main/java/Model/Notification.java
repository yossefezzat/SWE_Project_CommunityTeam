package Model;

import java.util.ArrayList;

public class Notification {
	
	private ArrayList<String>activities = new ArrayList<String>();
	private String User_ID;
	
	public ArrayList<String> getActivities() {
		return activities;
	}
	public void setActivities(ArrayList<String> activities) {
		this.activities = activities;
	}
	public String getUser_ID() {
		return User_ID;
	}
	public void setUser_ID(String user_ID) {
		User_ID = user_ID;
	}
	
	

}
