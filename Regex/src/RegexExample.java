import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

	public static void main(String[] args) {
		
		// matcher의 find()메소드와   pattern.matches는 다르다!!!
//		Pattern pattern = Pattern.compile("^[a-zA-Z]*$");
//		String val = "abcdefg";
//		
//		Matcher matcher = pattern.matcher(val);
//		System.out.println(matcher.find());
		
		
		
		
		// 아이디는 3개의 소문자가 반드시 앞에 와야되며 이후의 문자는 숫자와 소문자를 합한 12개 이하의 문자열!
		String val2 = "abc1111!111";
		boolean check = Pattern.matches("^[a-z]{3}[a-z0-9!@#$]{1,9}$", val2);
		System.out.println(check);
		
		// 비밀번호는 아이디와 3개이상 겹칠 수 없으며 영어 + 숫자 조합의 12개이하의 문자열이어야한다.
//		String new_pwd = "dudgh12s3";
//		boolean check2 = Pattern.matches("^[a-z\\d`~!@#$&*]{8,24}$", new_pwd);
//		System.out.println(check2);
		
		
		
		
		
		
		// 아래는 특수문자가 1개 이상 무조건 포함시키는 정규표현식 
		String val3 = "[^a-zA-Z0-9ㄱ-힣]";
		Pattern p = Pattern.compile(val3);
		String new_pwd2 = "audgh15";
		Matcher m = p.matcher(new_pwd2);
		System.out.println(m.find());
		
		
		// 아이디와 3자리 이상 중복되지 말아야 한다는 조건 만들기
		String new_id = "qodudgh75";
		String pwd = "dugh11";
		
		int match_cnt = 0;
		for(int i = 0; i<pwd.length(); i++) {
			for(int j = 0; j < new_id.length(); j++) {
				if((pwd.charAt(i))==(new_id.charAt(j))) {
					match_cnt += 1;
					break;
				}
				
			}
		}
		System.out.println(match_cnt);
		
	}

}
