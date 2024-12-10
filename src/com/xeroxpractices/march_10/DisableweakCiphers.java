package com.xeroxpractices.march_10;

import java.io.*;
import java.util.*;

public class DisableweakCiphers {
	private static void disableweakCiphersInWindows() throws IOException {
		
		ArrayList<String> listWC = new ArrayList<String>();
		listWC.add("TLS_RSA_WITH_3DES_EDE_CBC_SHA");
		listWC.add("TLS_RSA_WITH_AES_256_CBC_SHA");
		listWC.add("TLS_RSA_WITH_AES_128_CBC_SHA");
		listWC.add("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
		listWC.add("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
		listWC.add("TLS_RSA_WITH_AES_256_CBC_SHA256");
		listWC.add("TLS_RSA_WITH_AES_128_CBC_SHA256");
		listWC.add("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
		listWC.add("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
		listWC.add("TLS_RSA_WITH_AES_256_GCM_SHA384");
		listWC.add("TLS_RSA_WITH_AES_128_GCM_SHA256");
		
		Iterator<String> itr = listWC.iterator();
		while(itr.hasNext()) {
			String command = "powershell.exe Disable-TlsCipherSuite -Name " + '"' +itr.next()+ '"';
			Process powerShellProcess = Runtime.getRuntime().exec(command);
			powerShellProcess.getOutputStream().close();
		}		
	}

}
