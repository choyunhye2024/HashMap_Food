package com.food;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		HashMap<String, Food> foods = new HashMap<>();

		foods.put("라면", new Food("라면", true, 3500));
		foods.put("냉면", new Food("냉면", false, 12000));
		foods.put("쫄면", new Food("쫄면", false, 12000));
		foods.put("짜장면", new Food("짜장면", true, 10000));

		Scanner sc = new Scanner(System.in);
		System.out.println("원하시는 음식 이름을 입력해주세요:");
		String cmd = sc.next();

		Food selectFood1 = foods.get(cmd);
		System.out.println("주문하신 음식은:" + selectFood1.name);
		System.out.println("hot/cold는:" + selectFood1.isHot);
		System.out.println("hot/cold는" + selectFood1.price);
	}

}
