/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Crawler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLReader {
  public static void main(String args[]) throws Exception {
   URL url;
    InputStream is = null;
    BufferedReader br;
    String line;

    try {
        url = new URL("https://www.youtube.com/");
        is = url.openStream();  // throws an IOException
        br = new BufferedReader(new InputStreamReader(is));

        while ((line = br.readLine()) != null) {
            if(line.contains("href="))
                System.out.println(line.trim());
        }
    } catch (MalformedURLException mue) {
    } catch (IOException ioe) {
    } finally {
        try {
            if (is != null) is.close();
        } catch (IOException ioe) {
            //exception
        }
    }
    }
}