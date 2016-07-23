
import java.rmi.Naming;

public class PrinterMachinePort{
        public static void main(String args[]){
        	PrinterMachine currentMachine;
        	int currentPages;
        	
                if(args.length < 2){
                        System.out.println("the args must be two or more");
                        System.exit(1);
                }
                int currentMachineLocation = Integer.parseInt(args[0]);
                currentPages = Integer.parseInt(args[1]);
                try {
					currentMachine = new PrinterMachine(currentMachineLocation, currentPages);
					Naming.rebind(currentMachineLocation + "_PrinterMachine", currentMachine);
					
				} catch (Exception e) {
					e.printStackTrace();
				}

        }
}