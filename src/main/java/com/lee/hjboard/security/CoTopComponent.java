package com.lee.hjboard.security;

import com.google.gson.JsonObject;
import org.springframework.http.MediaType;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/* 최상위 컴포넌트 */

public abstract class CoTopComponent {
	protected void writeResponse(HttpServletResponse res, JsonObject jsonObject) throws IOException{
		writeResponse(res, jsonObject.toString());
	}
	
	protected void writeResponse(HttpServletResponse res, String message) throws IOException{
		res.setHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE);
		
		PrintWriter pw = res.getWriter();
		pw.write(message);
		pw.close();
	}
	
	protected String makePageDispatcherUrl(String requestUrl, String dispatcherPath) {
		return "/tiles/ajax" + dispatcherPath + requestUrl.substring(requestUrl.lastIndexOf("/"));
	}
}
