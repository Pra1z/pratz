
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test {
    public static void main(String[] args){
        String raw_pass = "123456";
       BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
       String[] result = new String[10];
       String hashedPassword="";
       for(int i =0;i<10;i++){
       hashedPassword = passwordEncoder.encode(raw_pass);
       System.out.println(hashedPassword);
       result[i]=hashedPassword;
       }
       
       for(int i =0;i<10;i++){
           System.out.println("Verify : "+passwordEncoder.matches(raw_pass, result[i]));
       }
    }
    
}
