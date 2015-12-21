
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * @author RAHUL
 * PostJsonData class takes Url link and input string
 * and initialize the private variables
 */

class PostJsonData
{
    private String webLink;
    private String input;
    public PostJsonData(String input)
    {
        System.out.println("Enter URL link : ");
        webLink = new Scanner(System.in).nextLine();
        this.input = input;
    }

/**
 * getResponse method establish connection
 * send data as post method set header
 * generates response for the request
 */

    void getResponse()
    {
        try {

                URL url = new URL(webLink);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setDoOutput(true);
                conn.setRequestMethod("POST");                                      // set method as "POST"
                conn.setRequestProperty("Content-Type", "application/json");        // set header
                conn.setRequestProperty("x-forwarded-for", "1.7.255.255");          // set header

                OutputStream os = conn.getOutputStream();
                os.write(input.getBytes());
                os.flush();

                if (conn.getResponseCode() != 200) {
                    throw new RuntimeException("Failed : HTTP error code : "+ conn.getResponseCode());
                }

                BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

                String output;
                System.out.println("\nOutput from Server .... \n");

                FileWriter writer = new FileWriter("AxmlOutput.txt", true);     // for responseformat = "axml" print output in new txt file
//                FileWriter writer = new FileWriter("JsonOutput.txt", true);     // for responseformat = "json" print output in new txt file

                while ((output = br.readLine()) != null) {
                    writer.write(output);
                    System.out.println(output);                                    // print result in colsone
                }
                writer.close();
                conn.disconnect();

                } catch (MalformedURLException e){
                  e.printStackTrace();

                } catch (IOException e){
                  e.printStackTrace();

                }
    }

}

/**
 * The MyJson class implements an application that
 * simply takes input from json txt file and pass to PostJsonData class by default constructor
 * and call it's getResponse method
 *
 */


public class MyJson {
    public static void main(String [] args) throws MalformedURLException, IOException
    {
        InputStream inputFileStream = new FileInputStream("C:\\Users\\RAHUL\\Documents\\NetBeansProjects\\Rahul\\axml.txt");        // set path for input file and axml.txt or json.txt for responseformat axml or json respectively
        Reader      inputx = new InputStreamReader(inputFileStream);
        int ptr = 0;
        StringBuilder builder = new StringBuilder();
        while ((ptr = inputx.read()) != -1) {
            builder.append((char) ptr);
        }

        String input = builder.toString();

        PostJsonData obj = new PostJsonData(input);
        obj.getResponse();
    }
}