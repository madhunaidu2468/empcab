package com.empcab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestCmdLine {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		 Runtime rt = Runtime.getRuntime();
		 String[] commands = {"cmd.exe /c start "+"mvn -v","mvn -v"};
		 String command="cmd.exe /c start "+"mvn -v";
		 Process proc = rt.exec(command);

		 BufferedReader stdInput = new BufferedReader(new 
		      InputStreamReader(proc.getInputStream()));

		 BufferedReader stdError = new BufferedReader(new 
		      InputStreamReader(proc.getErrorStream()));

		 // read the output from the command
		 System.out.println("Here is the standard output of the command:\n");
		 String s = null;
		 while ((s = stdInput.readLine()) != null) {
		     System.out.println(s);
		 }

		 // read any errors from the attempted command
		 System.out.println("Here is the standard error of the command (if any):\n");
		 while ((s = stdError.readLine()) != null) {
		     System.out.println(s);
		 }
	}
}
