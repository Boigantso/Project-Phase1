

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

		public class Main_Project {
			

		    private List<String> fileDirectory;	 
		    
		

		    
		    public Main_Project() {
		        fileDirectory = new ArrayList<>();	  
		      
		    }

		    public void displayWelcomeScreen() {
		        System.out.println("Welcome to My File Directory Manager");
		        System.out.println("Developer: Boigantso Mabena");
		    }

		    public void displayUserInterface() {
		        System.out.println("\nOptions:");
		        System.out.println("1. List current file names in ascending order");
		        System.out.println("2. Add/Delete/Search files");
		        System.out.println("3. Close the application");
		    }

		    public void listFilesAscendingOrder() {
		        Collections.sort(fileDirectory);
		        System.out.println("\nCurrent File Names in Ascending Order:");
		        for (String fileName : fileDirectory) {
		            System.out.println(fileName);
		        }
		    }

		    public void manageFiles() {
		        try (Scanner scanner = new Scanner(System.in)) {
					while (true) {
					    System.out.println("\nOptions in File Management:");
					    System.out.println("1. Add a file");
					    System.out.println("2. Delete a file");
					    System.out.println("3. Search for a file");
					    System.out.println("4. Return to main menu");

					    int choice = scanner.nextInt();
					    scanner.nextLine();  // code blocks: methods  

					    switch (choice) {
					        case 1:
					            System.out.print("Enter the file name to add: ");
					            String newFile = scanner.nextLine();
					            fileDirectory.add(newFile);
					            System.out.println("File added successfully.");
					            break;
					        case 2:
					            System.out.print("Enter the file name to delete: ");
					            String fileToDelete = scanner.nextLine();
					            if (fileDirectory.remove(fileToDelete)) {
					                System.out.println("File deleted successfully.");
					            } else {
					                System.out.println("File not found.");
					            }
					            break;
					        case 3:
					            System.out.print("Enter the file name to search: ");
					            String fileToSearch = scanner.nextLine();
					            if (fileDirectory.contains(fileToSearch)) {
					                System.out.println("File found.");
					            } else {
					                System.out.println("File not found.");
					            }
					            break;
					        case 4:
					            return;
					        default:
					            System.out.println("Invalid option. Please try again.");
					    }
					}
				}
		    }

		    public static void main(String[] args) {
		        Main_Project manager = new Main_Project();
		        Scanner scanner = new Scanner(System.in);

		        manager.displayWelcomeScreen();
		        
		        while (true) {
		            manager.displayUserInterface();
		            int choice = scanner.nextInt();
		            scanner.nextLine();  // Consume the newline character

		            switch (choice) {
		                case 1:
		                    manager.listFilesAscendingOrder();
		                    break;
		                case 2:
		                    manager.manageFiles();
		                    break;
		                case 3:
		                    System.out.println("Closing the application.");
		                    scanner.close();
		                    System.exit(0);
		                default:
		                    System.out.println("Invalid option. Please try again.");
		            }
		        }
		    }
		    {

	}

}
