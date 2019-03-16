package com.nanda.java8.workouts;

import org.apache.commons.lang3.StringEscapeUtils;

public class TimeTest {
	
	public static void main(String[] args) {
		
		//String transformScriptPayload = "{\"transformActions\":[{\"actionType\":\"rename\",\"data\":{\"columnId\":\"0\",\"oldName\":\"FIRST_NAME\",\"newName\":\"NAME\"}},{\"actionType\":\"delete\",\"data\":[{\"columnId\":\"1\",\"columnName\":\"LAST_NAME\"}]},{\"actionType\":\"columnMerge\",\"data\":{\"columnList\":[{\"columnId\":\"0\",\"columnName\":\"NAME\"},{\"columnId\":\"2\",\"columnName\":\"EMAIL\"}],\"newColumnName\":\"CONTACT\",\"delimiter\":\"\\t\",\"prefix\":\"\",\"suffix\":\"\"}}]}";
		
		String transformScriptPayload = "\"delimiter\":\"\\\\t\"";
		
		String replaceScript = "\"<TRANSFORM_SCRIPT_CONTENT>\"";
		
		System.out.println(replaceScript.replaceAll("\"<TRANSFORM_SCRIPT_CONTENT>\"", transformScriptPayload));
	}

}
