package name.smithjn.springcloudtasksink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.launcher.annotation.EnableTaskLauncher;

@SpringBootApplication
@EnableTaskLauncher
public class SpringcloudTasksinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudTasksinkApplication.class, args);
	}
}
