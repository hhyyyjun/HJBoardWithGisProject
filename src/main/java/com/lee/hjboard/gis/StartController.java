package com.lee.hjboard.gis;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StartController {

	@GetMapping("/leaflet")
	public String goleaflet() {
		System.out.println("leaflet");

		return "/tiles/view/gis/leaflet";
	}

	//leaflet 기능들 모여있는 api
	@GetMapping("/leaflet2")
	public String goleaflet2() {
		System.out.println("leaflet2");

		return "/tiles/view/gis/leaflet2";
	}

	@GetMapping("/openlayers")
	public String goopen() {
		System.out.println("openlayers");

		return "/tiles/view/gis/openlayers";
	}

	@GetMapping("/kakao")
	public String kakao() {
		System.out.println("kakao");

		return "/tiles/view/gis/kakaomap";
	}

	@GetMapping("/openfreedraw")
	public String openfreedraw() {
		System.out.println("openfreedraw");

		return "/tiles/view/gis/openfreedraw";
	}
}
