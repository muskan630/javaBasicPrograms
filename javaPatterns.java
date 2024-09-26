package Java;

import java.util.Scanner;
public class javaPatterns {
	
	/// Pattern 1 ///
		// Square star pattern //
	    public static  void pattern1(int n) {
	    	System.out.println(" Square Star Pattern - ");
				for(int i =1; i<=n; i++) {
					for(int j=1; j<=n; j++) {
						System.out.print("*");
					}
				System.out.println(" ");
				}
				System.out.println("  ");
		}
		
	///     Pattern 2   ///
	  // Triangle star pattern  //
		public static void pattern2(int n) {
			System.out.println("Left Right Angle Triangle - ");
			for(int i =1; i<=n; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
			System.out.println(" ");
			}
			System.out.println("  ");
		}
	
	///    Pattern 3   ///
	  //reverse of pattern 1 //
		// Downward star triangle pattern  //
	public static void pattern3(int n) {
		System.out.println("Left Downward Right Angle triangle - ");
		for(int i =1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("*");
			}
		System.out.println(" ");
		}
		System.out.println("  ");
	}
	
	///    Pattern 4   ///
	//  Inverted left right angle triangle pyramid //
	public static void pattern4 (int n) {
	System.out.println("Inverted left right angle triangle pyramid  - ");
		for(int i =1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("*");
			}
		System.out.println(" ");
		}
		for(int k =1; k<=n; k++) {
			for(int l=1; l<=k; l++) {
				System.out.print("*");
			}
		System.out.println(" ");
		}	
		System.out.println("  ");
}
	
	 ///   Pattern 5   ///
	 //  North Pyramid  //
	public static void pattern5 (int n) {
	System.out.println("North Pyramid - ");
		for(int i =1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
		System.out.println(" ");
		}
		for(int k =1; k<=n; k++) {
			for(int l=1; l<=n-k+1; l++) {
				System.out.print("*");
			}
		System.out.println(" ");
		}
		System.out.println("  ");
	}
		
	///    Pattern 6  ///
	 //   Right angle triangle //
	public static void pattern6(int n) {
		System.out.println("Right angle triangle - ");
	    for(int i=1; i<=n; i++) {
	    	for(int j=1; j<=n-i; j++) {
	    		System.out.print(" ");
	    	}
	        for(int k=1; k<=i; k++) {
	    		System.out.print("*");
	        }
	    System.out.println();
	   }
		System.out.println("  ");
	}
	
	///   Pattern 7   ///
	// reverse of pattern 6 //
	  //Downward Right angle triangle//
	public static void  pattern7(int n) {
		System.out.println("Downward Right angle triangle - ");
		for(int i=1; i<=n; i++) {
	       for(int k=1; k<=i-1; k++) {
					System.out.print(" ");
			    }
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("*");
			}
		   
		    System.out.println();
		}
		System.out.println("  ");
	}
	
    //  Pattern 8 //
	// Inverted right angle triangle pyramid //
    public static void pattern8(int n) {
  		System.out.println("Inverted right angle triangle pyramid - ");
  	    for(int i=1; i<=n; i++) {
  		       for(int k=1; k<=i-1; k++) {
  						System.out.print(" ");
  				    }
  				for(int j=1; j<=n-i+1; j++) {
  					System.out.print("*");
  				}
  			   
  			    System.out.println();
  			}
  		  for(int i=1; i<=n; i++) {
    	    	for(int j=1; j<=n-i; j++) {
    	    		System.out.print(" ");
    	    	}
    	        for(int k=1; k<=i; k++) {
    	    		System.out.print("*");
    	        }
    	    System.out.println();
    	   }
  	}
      
    ///  Pattern9 ///
    // South Pyramid //
    public static void pattern9(int n) {
		System.out.println("South Pyramid  - ");
	    for(int i=1; i<=n; i++) {
	    	for(int j=1; j<=n-i; j++) {
	    		System.out.print(" ");
	    	}
	        for(int k=1; k<=i; k++) {
	    		System.out.print("*");
	        }
	    System.out.println();
	   }
	    for(int i=1; i<=n; i++) {
		       for(int k=1; k<=i-1; k++) {
						System.out.print(" ");
				    }
				for(int j=1; j<=n-i+1; j++) {
					System.out.print("*");
				}
			   
			    System.out.println();
			}
			System.out.println("  ");
	}
    
    // pattern 10 //
     // Triangle Pattern //
    public static void pattern10(int n) {
		System.out.println(" Triangle Angle or Pyramid - ");
	    for(int i=1; i<=n; i++) {
	    	for(int j=1; j<=n-i; j++) {
	    		System.out.print(" ");
	    	}
	        for(int k=1; k<=i; k++) {
	    		System.out.print(" *");
	        }
	    System.out.println();
	   }
		System.out.println("  ");
	} 
   
    // Pattern 11 //
    // Reverse Triangle Pattern //
    public static void  pattern11(int n) {
		System.out.println("Reverse triangle or Reverse Pyramid  - ");
		for(int i=1; i<=n; i++) {
	       for(int k=1; k<=i-1; k++) {
					System.out.print(" ");
			    }
			for(int j=1; j<=n-i+1; j++) {
				System.out.print(" *");
			}
		   
		    System.out.println();
		}
		System.out.println("  ");
	}
    
    // Pattern 12 //
    // Triangle without Spaces //
    public static void pattern12(int n) {
    	System.out.println("Pyramid  without spaces - ");
    	for(int i=1 ; i<=n; i++) {
    		for(int j=n; j>=i; j--) {
    			System.out.print(" ");
    		}
        	for(int k=1; k<2*i; k++) {
    		   System.out.print("*");
        	}
        	System.out.println();
       }System.out.println(" ");
    }
    
    // Pattern 13  //
    // Reverse Triangle without spaces //
    public static void pattern13(int n) {
		System.out.println("Reverse Pyramid without spaces -");
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=n; k>=i; k--) {
				System.out.print("*");
			}
			for(int l=n-1; l>=i; l--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println(" ");
	}
    
    // Pattern 14 //
     // Diamond Shape //
    public static void pattern14(int n) {
    	System.out.println("Diamond Shape - ");
    	for(int i=1 ; i<=n; i++) {
    		for(int j=n; j>=i; j--) {
    			System.out.print(" ");
    		}
        	for(int k=1; k<2*i; k++) {
    		   System.out.print("*");
        	}
        	System.out.println();
       }
    	for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=n; k>=i; k--) {
				System.out.print("*");
			}
			for(int l=n-1; l>=i; l--) {
				System.out.print("*");
			}
			System.out.println();
		}
    	System.out.println(" ");
    }
    
    // Pattern15 //
    // Diagonal Line //
    public static void pattern15(int n) {
    	System.out.println("Diagonal Line");
    	for(int i=1; i<=n; i++) {
    		for(int j=1; j<=n; j++) {
    				if (i==j) {
    					System.out.print("*");
					} else {
						System.out.print(" ");
					}
    			}
    			System.out.println();
           	}
	}
    
    // Pattern 16 //
    // Diagonal line //
    public static void pattern16(int n) {
		System.out.println("Diagonal line - ");
		for(int i =1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {
				if (i+j==6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("  ");
	}
    
    // Pattern 17 //
     // Cross Pattern //
    public static void pattern17(int n) {
		System.out.println("Cross Pattern - ");
		for(int i =1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if (i+j==6 || i==j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println(" ");
	}
    
    // Pattern 18 //
    // Hollow Square //
    public static void pattern18(int n) {
    System.out.println("Hollow Square -");
    	for(int i=1; i<=n; i++) {
    		for(int j=1; j<=n; j++) {
    			if (i==1||i==n||j==1||j==n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
    		}
    		System.out.println();
    	}
		System.out.println(" ");
	}
    
    public static void pattern19(int n) {
        System.out.println("Butterfly Pattern -");
        	for(int i=1; i<=n; i++) {
        		for(int j=1; j<=i; j++) {
        			System.out.println("*");
        		}
        	System.out.println(" ");
        		for(int k=n; k>=i; k--) {
        			System.out.println("*");
        		}
        	   System.out.println();
        	  
        	}
    }
    
     // MAIN METHOD //
public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	System.out.print("Enter how many number of stars you want to use : - ");
	int n = input.nextInt();
	pattern1(n);
	pattern2(n);
	pattern3(n);
	pattern4(n);
	pattern5(n);
	pattern6(n);
	pattern7(n);
	pattern8(n);
    pattern9(n);
 	pattern10(n);
 	pattern11(n);
 	pattern12(n);
 	pattern13(n);
 	pattern14(n);
 	pattern15(n);
 	pattern16(n);
 	pattern17(n);
 	pattern18(n);
}
}


