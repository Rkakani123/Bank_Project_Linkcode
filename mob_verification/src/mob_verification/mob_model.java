package mob_verification;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Random;

import org.omg.CORBA.PUBLIC_MEMBER;
 
public class mob_model {
	public String sendSms(String phone) {
		
		try {
			String otp=mob_model.generateOTP();
			System.out.println(""+otp);
			String apiKey = "apikey=" + " hCO2FbcczzI-Y03adbP9ucQy14tffwWcNieztbl9le";
			String message = "&message=" + "Yor OTP is -:"+Integer.parseInt(String.valueOf(otp));
			String sender = "&sender=" + "TXTLCL";
			String numbers = "&numbers=" + phone;
			
			
			HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
			String data = apiKey + numbers + message + sender;
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
			conn.getOutputStream().write(data.getBytes("UTF-8"));
			final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			final StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = rd.readLine()) != null) {
				stringBuffer.append(line);
			}
			rd.close();
			
			return stringBuffer.toString();
		} catch (Exception e) {
			System.out.println("Error SMS "+e);
			return "Error "+e;
		}

		
	}

	public static String generateOTP() {
		otp_verification ov=new otp_verification();
		int randomPin   =(int)(Math.random()*9000)+1000;
		String otp  =String.valueOf(randomPin);
		ov.setOtp(otp);
		return otp;
	}
   
	public static void main(String[] args) {
		
	}

}