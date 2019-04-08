package com.hp.pwp.capstone
import com.surftools.BeanstalkClientImpl.ClientImpl
import com.surftools.BeanstalkClientImpl.JobImpl
import com.surftools.BeanstalkClient.BeanstalkException

class InputManager{

	public static void main(String [] args) {
		BeanstalkClient beanstalk = new BeanstalkClient();		

		Integer i = 0;
		beanstalk.useTube("new_work");

	//String s = "{" + "'path': '/mnt/TestPDF.pdf'," + "'outputPath': '/mnt/FinalPDF.pdf'," + "'WID': 1019," + "'JID': 1109," + "'pdfLength': 9" + "}"
		String s ='{' +
			'"jobBool": true,' +
			'"path": "/mnt/TestPDF.pdf",' +
			'"outPath": "/mnt/FinalPDF.pdf",'+
			'"pageLength": 9,'+
			'"startPage": 1,'+
			'"endPage": 9,'+
			'"wid": 1019,'+
			'"jid": 1109,'+
			'"status": "done"' + '}';

			
		
		beanstalk.sendWork(s);
		println beanstalk.recieve_new_work();
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

