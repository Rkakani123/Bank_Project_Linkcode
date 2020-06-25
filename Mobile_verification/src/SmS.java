import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Date;
import java.util.Random;

import com.sun.net.ssl.HttpsURLConnection;

import jdk.internal.util.xml.impl.Input;

public class SmS {
	@SuppressWarnings("deprecation")
	public static void sendsms(String message,String number)
	{
		try {
		String api="ZbvuBMYgLQHnds0hOAFR6rx14zti3lG7CwIEmUWe9PjX58fqSVqpt3XLWeyRvo8gYlm1rOGA2zwU7kuI";
		String senderId="FSTSMS";
		String language="english";
		String route="p";
			 message=URLEncoder.encode(message, "UTF-8");
			System.out.println(message);
			String myurl="https://www.fast2sms.com/dev/bulk?authorization="+api+"&sender_id="+senderId+"&message="+message+"&language="+language+"&route="+route+"&numbers="+number;
			URL url=new URL(myurl);
			HttpURLConnection  con=(HttpURLConnection)url.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("User-Agent", "Mozilla/5.0");
			con.setRequestProperty("cache-control", "no-cache");
			int code=con.getResponseCode();
			
			StringBuffer response=new StringBuffer();
			BufferedReader br=new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			while(true)
			{
				String line=br.readLine();
				if(line==null)
				{
					break;
				}
				response.append(line);
				
			}
			System.out.println(response);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static char[] OTP(int len) 
    { 
        System.out.println("Generating OTP using random() : "); 
        System.out.print("You OTP is : "); 
  
        // Using numeric values 
        String numbers = "0123456789"; 
  
        // Using random method 
        Random rndm_method = new Random(); 
  
        char[] otp = new char[len]; 
  
        for (int i = 0; i < len; i++) 
        { 
            // Use of charAt() method : to get character value 
            // Use of nextInt() as it is scanning the value as int 
            otp[i] = 
             numbers.charAt(rndm_method.nextInt(numbers.length())); 
        } 
        return otp; 
    } 
	public static void main()
	{
	      
	}
}

