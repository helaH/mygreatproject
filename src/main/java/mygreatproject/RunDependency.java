package mygreatproject;

//import commons.MyStringUtils;
import com.google.common.base.Strings;
import org.apache.commons.lang3.StringUtils;;;



public class RunDependency {

	public static void main(String[] args) {
	
		//après ce qu'on a fait la dépendance on peut
		//utliser la classe MyStringUTIls
		
		System.out.println(Strings.isNullOrEmpty("hello"));
		System.out.println(StringUtils.isEmpty("ok"));
		
		

	}

}
