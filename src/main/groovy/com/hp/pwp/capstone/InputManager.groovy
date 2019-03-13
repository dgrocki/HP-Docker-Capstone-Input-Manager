package com.hp.pwp.capstone
import com.surftools.BeanstalkClientImpl.ClientImpl
import com.surftools.BeanstalkClientImpl.JobImpl
import com.surftools.BeanstalkClient.BeanstalkException

class InputManager{

	public static void main(String [] args) {
		BeanstalkClient beanstalk = new BeanstalkClient();		

		Integer i = 0;
		beanstalk.useTube("new_work");
		String s = "{" + "'path': '/mnt/Test.pdf'," + "'outputPath': '/mnt/FinalPDF.pdf'," + "'WID': 1019," + "'JID': 1109," + "'pdfLength': 9" + "}";
		beanstalk.sendWork(s);
/*		while(true){
			print "Enter a string for system input: ";
			String input = System.in.newReader().readLine();

			sleep(1000);
			beanstalk.sendWork(input);
			i++;

		}
*/
		return;
	}

}

