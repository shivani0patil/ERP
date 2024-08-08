package erp.generic.fileUtility;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyUtility {
	public String getDataProperty(String Key) throws Throwable
	{
		FileInputStream fs=new FileInputStream("./src/test/resources/data.properties");
        Properties op=new Properties();
        op.load(fs);
        String data =op.getProperty(Key);
        return data;
	}

}
