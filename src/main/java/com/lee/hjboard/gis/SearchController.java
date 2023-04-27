package com.lee.hjboard.gis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.util.Map;

@RestController
public class SearchController {

	@Value("${vworld.apiKey}")
	private String apiKey;	

	@PostMapping("/search")
	public Map<String, Object> search(HttpServletResponse response, @RequestBody Map<String,Object> paramss) throws Exception {

		String url = makeSearchUrl("http://api.vworld.kr/req/search", paramss);
		System.out.println("url : " + url);
		
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "POST, GET");
		response.setHeader("Access-Control-Max-Age", "3600");
		response.setHeader("Access-Control-Allow-Headers", "x-requested-with, origin, content-type, accept");
		
		HttpConnectionExample httpConnectionExample = new HttpConnectionExample();
		return httpConnectionExample.sendGet(url);
	}


	private String makeSearchUrl(String url, Map<String, Object> params) throws Exception {

		String service = (String) params.get("service");
		String request = (String) params.get("request");
		String version = (String) params.get("version");
		String crs = (String) params.get("crs");
		int size = (int) params.get("size");
		int page = (int) params.get("page");
		String query = URLEncoder.encode((String) params.get("query"), "UTF-8");
		String type = (String) params.get("type");
		String category = (String) params.get("category");
		String format = (String) params.get("format");
		String errorformat = (String) params.get("errorformat");
		String key = (String) params.get("key");

		url = url+"?key="+key+"&service="+service+"&request="+request+"&version="+version
				+"&crs="+crs+"&size="+size+"&page="+page+"&query="+query
				+"&type="+type+"&category="+category+"&format="+format+"&errorformat="+errorformat;
		System.out.println(url);
		return url;
	}

}
