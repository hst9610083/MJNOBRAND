package com.min.mj.ctrl;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PayController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private int price = 10000;
	private String num = "103935454874";
	
	/*
	 * 결제 생성 코드
	 * 토스 결제 api 치면 나옵니다.
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/pay.do", method = {RequestMethod.POST, RequestMethod.GET})
	public String payPage(Model model, HttpSession session) {
		logger.info("Welcome pay.do:\t {}", new Date());
		
		URL url = null;
		URLConnection connection = null;
		StringBuilder responseBody = new StringBuilder();
		
		try {
			
			url = new URL("https://pay.toss.im/api/v2/payments");
			connection = url.openConnection();
			connection.addRequestProperty("Content-Type", "application/json");
			connection.setDoOutput(true);
			connection.setDoInput(true);
			
//			intent://pay?payToken={payToken}#Intent;scheme=supertoss;package=viva.republica.toss;end
			org.json.simple.JSONObject jsonBody = new JSONObject();
			jsonBody.put("orderNo", num);
			jsonBody.put("amount", price);
			jsonBody.put("amountTaxFree", 0);
			jsonBody.put("productDesc", "테스트 결제");
			jsonBody.put("autoExecute", true);
			jsonBody.put("apiKey", "sk_test_w5lNQylNqa5lNQe013Nq");
			jsonBody.put("resultCallback", "http://localhost:8091/paypay/callback.do");
		    jsonBody.put("retUrl", "http://localhost:8091/paypay/payresult.do?orderno="+num);
		    jsonBody.put("retCancelUrl", "http://localhost:8091/paypay/cancel.do");

			BufferedOutputStream bos = new BufferedOutputStream(connection.getOutputStream());
			
		    bos.write(jsonBody.toJSONString().getBytes(StandardCharsets.UTF_8));
			bos.flush();
			bos.close();

			
		    BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8));
			String line = null;
			while ((line = br.readLine()) != null) {
				responseBody.append(line);
			}
			br.close();
		} catch (Exception e) {
			responseBody.append(e);
		}
		System.out.println(responseBody.toString()+"응답받은거");
		String s = responseBody.toString();
		JSONParser parser = new JSONParser();
		Object obj = null;
		try {
			obj = parser.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		JSONObject jsonresult = (JSONObject) obj;
		String token = (String) jsonresult.get("payToken");
		String checkoutPage = (String) jsonresult.get("checkoutPage");
		
		System.out.println("잘담기나요??"+token);
		System.out.println("잘담기나요??"+checkoutPage);
		

		model.addAttribute("payed", checkoutPage);
		session.setAttribute("token", token);
		
		return "pay";
	}
	
	@RequestMapping(value = "/payresult.do", method = {RequestMethod.POST, RequestMethod.GET})
	public String checkoutPage(Model model, String status, HttpSession session) {
		logger.info("Welcome payresult.do:\t {}", new Date());
		System.out.println("들어왔어");
		System.out.println(status+"결제 완료??");
		String token = (String)session.getAttribute("token");
		System.out.println(token+"승인된 결제 토큰??");
		
		session.setAttribute("token", token);

		return "payresult";
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/cancel.do", method = {RequestMethod.POST, RequestMethod.GET})
	public String cancel(HttpSession session) {
		logger.info("Welcome cancel.do:\t {}", new Date());
		System.out.println("취소");
		
		URL url = null;
		URLConnection connection = null;
		StringBuilder responseBody = new StringBuilder();
		
		String token = (String)session.getAttribute("token");
		System.out.println(token + "환불 토큰");
		try {
			url = new URL("https://pay.toss.im/api/v2/refunds");
			connection = url.openConnection();
			connection.addRequestProperty("Content-Type", "application/json");
			connection.setDoOutput(true);
			connection.setDoInput(true);

			org.json.simple.JSONObject jsonBody = new JSONObject();
			jsonBody.put("payToken",token);
			jsonBody.put("amount", "5000");
			jsonBody.put("apiKey", "sk_test_w5lNQylNqa5lNQe013Nq");

			BufferedOutputStream bos = new BufferedOutputStream(connection.getOutputStream());
			
		    bos.write(jsonBody.toJSONString().getBytes(StandardCharsets.UTF_8));
			bos.flush();
			bos.close();

			
		    BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8));
			String line = null;
			while ((line = br.readLine()) != null) {
				responseBody.append(line);
			}
			br.close();
		} catch (Exception e) {
			responseBody.append(e);
		}
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&"+responseBody.toString());
		String s = responseBody.toString();
		
		
		
		return "cancel";
		
	}
	
	@RequestMapping(value = "payCheck.do", method = RequestMethod.GET)
	public String payCheck() {
		
		logger.info("Welcome payCheck.do:\t {}", new Date());
		System.out.println(" 결제상태 ");
		
		URL url = null;
		URLConnection connection = null;
		StringBuilder responseBody = new StringBuilder();
		try {
			url = new URL("https://pay.toss.im/api/v2/status");
			connection = url.openConnection();
			connection.addRequestProperty("Content-Type", "application/json");
			connection.setDoOutput(true);
			connection.setDoInput(true);

			org.json.simple.JSONObject jsonBody = new JSONObject();
			jsonBody.put("orderNo", num);
			jsonBody.put("apiKey", "sk_test_w5lNQylNqa5lNQe013Nq");

			BufferedOutputStream bos = new BufferedOutputStream(connection.getOutputStream());
			
		    bos.write(jsonBody.toJSONString().getBytes(StandardCharsets.UTF_8));
			bos.flush();
			bos.close();

			
		    BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8));
			String line = null;
			while ((line = br.readLine()) != null) {
				responseBody.append(line);
			}
			br.close();
		} catch (Exception e) {
			responseBody.append(e);
		}
		System.out.println(responseBody.toString());
		return "payCheck";
	}
	
}
