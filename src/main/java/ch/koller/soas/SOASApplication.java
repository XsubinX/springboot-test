package ch.koller.soas;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class SOASApplication 
{
    private static Logger log = LoggerFactory.getLogger(SOASApplication.class);
    public static void main(String[] args) throws BeansException, InterruptedException 
    {
	SpringApplication.run(SOASApplication.class, args);
	log.info("\n\n\n\tSOAS is up and running\n\n");
    }
}
