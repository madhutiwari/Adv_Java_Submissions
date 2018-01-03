package stack;

public class Q9MyDeadLock {

	
		String str1 = "Java";
	    String str2 = "UNIX";
	    String str3 = "Python";
	     
	    Thread trd1 = new Thread("My Thread 1"){
	        public void run(){
	            while(true){
	                synchronized(str1){
	                    synchronized(str2){
	                    	synchronized(str3) {
	                        System.out.println(str1 + str2+str3);
	                    	}
	                    }
	                }
	            }
	        }
	    };
	     
	    Thread trd2 = new Thread("My Thread 2"){
	        public void run(){
	            while(true){
	                synchronized(str2){
	                    synchronized(str3){
	                    	synchronized(str1) {
	                        System.out.println(str2 + str3+ str1);
	                    }
	                }
	            }
	            }
	        }
	    };
	    Thread trd3 = new Thread("My Thread 3"){
	        public void run(){
	            while(true){
	                synchronized(str3){
	                    synchronized(str2){
	                    	synchronized(str1) {
	                        System.out.println(str1 + str2+str3);
	                    	}
	                    }
	                }
	            }
	        }
	    };
	    public static void main(String a[]){
	        Q9MyDeadLock mdl = new Q9MyDeadLock();
	        mdl.trd1.start();
	        mdl.trd2.start();
	        mdl.trd3.start();

	}
 
	   
}




