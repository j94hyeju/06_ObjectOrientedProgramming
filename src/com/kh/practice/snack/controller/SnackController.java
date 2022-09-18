package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	private Snack s = new Snack();
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		String save = "저장 완료되었습니다.";
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		return save;
	}
	public String confirmData() {
		return s.imfomation();
	}
}
