import java.io.File;
import java.nio.file.Files;
public class p1
{
	public static void main(String [] args) throws Exception
	{
		File source = new File("c.txt");
		File destination = new File("/home/student/17IT111");
		Files.copy(source.toPath(), destination.toPath());
	}
}