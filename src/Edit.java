import java.awt.Color;
//google java api for the colors possible
import java.util.Scanner;
	
class Edit {
static	Scanner input = new Scanner(System.in);
static ImageUtils utils = new ImageUtils();

	public static void intro(String[] args) {
		
		String Booting = "Booting up . . .";
		for (int i = 0; i < Booting.length(); i++) {
		    System.out.print(Booting.charAt(i));
		    try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		while(true) {
		String game = "\nWould you like to test your brain?(Yes/No)";
		
		for (int i = 0; i < game.length(); i++) {
		    System.out.print(game.charAt(i));
		    try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		String firstAns = input.nextLine();
		
		if(firstAns.equalsIgnoreCase("yes")) {
			String accept = "Ok, Let's Have Some Fun Then!"
					+ "\nIn this program you will be tested on three different topics "
					+ "\nand you will get two chances to answer my questions. \nThe topics are:";
			for (int i = 0; i < accept.length(); i++) {
			    System.out.print(accept.charAt(i));
			    try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			try {
			Thread.sleep(500);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}		
			
			String rules = "\n1. Being able to tell the difference between two pictures"
					+ "\n2. Your memory"
					+ "\n3. Your general knowledge in color codes";
			
			for (int i = 0; i < rules.length(); i++) {
			    System.out.print(rules.charAt(i));
			    try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			    while (true) {
			 String start = "\nShall we begin?(Yes/No)\n";
					 for (int i = 0; i < start.length(); i++) {
						    System.out.print(start.charAt(i));
						    try {
								Thread.sleep(200);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
			    }
					 String secAns = input.nextLine();
			    if (secAns.equalsIgnoreCase("yes")) {
			    	break;
			    }
			    else if(secAns.equalsIgnoreCase("no")) {
			    	System.out.println("OK, system shutting down.");
			    	System.exit(0);
			    }
			    else {
			    	continue;
			    }
			    }
			    break;
		}
			    else if(firstAns.equalsIgnoreCase("no")) {
			    	System.out.println("OK, system shutting down.");
			    	System.exit(0);
			    }
			    else {
			    	continue;
			    }
			    }
		
		}

	public static void Test2(String[] args) {
		// create new image util.
			//	ImageUtils utils = new ImageUtils();
		String loading = "\nloading images . . .";		
		String intro = "\nTest 2: Memory";
		for (int i = 0; i < intro.length(); i++) {
		    System.out.print(intro.charAt(i));
		    try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		for (int i = 0; i < loading.length(); i++) {
		    System.out.print(loading.charAt(i));
		    try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
				// load in an image.
				Color[][] orig = utils.loadImage("src/Chick.jpg");
				
				// Add original image tab.
				utils.addImage(orig, "Original Chick image.");
				utils.display();
				
				String intro2 = "\nNext we will be testing your memory.\nAre you ready for the question?(yes/no)";
				for (int i = 0; i < intro2.length(); i++) {
				    System.out.print(intro2.charAt(i));
				    try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				while (true) {
					String secondAns = input.nextLine();
					
					if(secondAns.equalsIgnoreCase("yes")) {
						System.out.println("\n");
				break;
					}
					else {
						System.out.println("Ok, I will wait until you are ready");
						continue;
					}
				}
				
				//
				String q3 = "\nWhen I changed the picture from yellow to blue"
						+ "\nWhat two colors did the grass change to?(enter letter)"
						+ "\na) Red & Blue \nb) Green & Yellow \nc) Blue & Orange";
				for (int i = 0; i < q3.length(); i++) {
				    System.out.print(q3.charAt(i));
				    try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				    int n=0;
				    while(true && n<=1) {
				    String a3 = input.nextLine();
				    if(a3.equalsIgnoreCase("a")) {
				    	System.out.println("Perfect");
				    break;
				    }
				    
				    else if (n==0) {
				    String response = "Hmm ... not correct, try agian.";
				    for (int i = 0; i < response.length(); i++) {
					    System.out.print(response.charAt(i));
					    try {
							Thread.sleep(50);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				    n++;
				    continue;
				    }
				    else if (n==1) {
				    	 String wrong = ". . . Sadly you are incorrect, seems your memory is a little fuzzy.";
						    for (int i = 0; i < wrong.length(); i++) {
							    System.out.print(wrong.charAt(i));
							    try {
									Thread.sleep(50);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}
				    	break;
				    }
				    }
				    
				    Color[][] halfBlack = processChick1(orig);
					utils.addImage(halfBlack, "Processed Chick image.");
					utils.display();
					
				    System.out.println("\nThe correct answer is a) Blue & Red, You can see the red in the bottom left corner.");
				    try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				    
				    String continue2 = "\nThis concludes Test 2: Memory";
				    for (int i = 0; i < continue2.length(); i++) {
					    System.out.print(continue2.charAt(i));
					    try {
							Thread.sleep(50);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				    
				while(true) {
					System.out.println("\nAre you ready to go on?(yes/no)");
					String next = input.nextLine();
					
						if(next.equalsIgnoreCase("yes")) {
							utils.closeImages();
							break;
						}
						else {
							System.out.println("Ok, I will wait until you are ready.");
							continue;
						}
					}
	}
	
	public static Color[][] processChick2(Color[][] img){
		//clones image
		Color[][] tmp = ImageUtils.cloneArray(img);
		
		for (int i=0; i<tmp.length; i++) {
			for (int j = 0; j < tmp[i].length; j++) {
				Color pixel = tmp[i][j];
				if ( i < 576 && i > 255 && j <  255 && j > 120 && pixel.getRed() <= 300 
						&& pixel.getRed() >= 150 && pixel.getGreen() <= 300 && pixel.getGreen() >= 0
						&& pixel.getBlue() <= 300 && pixel.getBlue() >= 0) {
					int r = pixel.getRed();
					int g = pixel.getGreen();
					int b = pixel.getBlue();
					tmp[i][j] = new Color(b,g,b);
				}
				if ( i < 460 && i > 390 && j <  121 && j > 0 && pixel.getRed() <= 300 
						&& pixel.getRed() >= 150 && pixel.getGreen() <= 300 && pixel.getGreen() > 20
						&& pixel.getBlue() <= 300 && pixel.getBlue() >= 0) {
					int r = pixel.getRed();
					int g = pixel.getGreen();
					int b = pixel.getBlue();
					tmp[i][j] = new Color(b,g,b);
				}
				
				
			}
	//	return tmp;
	}
		return tmp;
	}
	
	public static void Test1(String[] args) {
		// create new image util.
				
		String loading = "\nloading images . . .";		
		String intro = "\nTest 1: Seeing the differences";
		for (int i = 0; i < intro.length(); i++) {
		    System.out.print(intro.charAt(i));
		    try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		for (int i = 0; i < loading.length(); i++) {
		    System.out.print(loading.charAt(i));
		    try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
				// load in an image.
				Color[][] orig = utils.loadImage("src/Chick.jpg");
				
				// Add original image tab.
				utils.addImage(orig, "Original Chick image.");
				utils.display();
				
				String Intro1 = "\nThroughout all tests we will be working with this picture of a chick. "
						+ "\nSee if you can see the difference between the original tab and the process tab. "
						+ "\nAre you ready to change the picture?(yes/no)";
				for (int i = 0; i < Intro1.length(); i++) {
				    System.out.print(Intro1.charAt(i));
				    try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				while (true) {
					String secondAns = input.nextLine();
					
					if(secondAns.equalsIgnoreCase("yes")) {
				//Proocess the image.
				Color[][] halfBlack = processChick1(orig);
				
				utils.addImage(halfBlack, "Processed Chick image.");
				
				//Display the image.
				utils.display();
				break;
					}
					else {
						System.out.println("Ok, I will wait until you are ready");
						continue;
					}
				}
				
				//
				String q1 = "\nWhat obvious color did the chick turn into?(enter letter)"
						+ "\na) Yellow \nb) Green \nc) Blue";
				for (int i = 0; i < q1.length(); i++) {
				    System.out.print(q1.charAt(i));
				    try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				    int n=0;
				    while(true && n<=1) {
				    String a1 = input.nextLine();
				    if(a1.equalsIgnoreCase("c")) {
				    	System.out.println("Perfect");
				    break;
				    }
				    
				    else if (n<1) {
				    String response = "Hmm ... not correct, try agian.";
				    for (int i = 0; i < response.length(); i++) {
					    System.out.print(response.charAt(i));
					    try {
							Thread.sleep(50);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				    n++;
				    continue;
				    }
				    else if (n==1) {
				    	String wrong2 = "Hmm ... seems your wrong agia.";
					    for (int i = 0; i < wrong2.length(); i++) {
						    System.out.print(wrong2.charAt(i));
						    try {
								Thread.sleep(50);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
				    	break;
				    }
				    }
				    System.out.println("The correct answer is c) Blue");
				    try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				    
				    utils.closeImages();
				    utils.addImage(orig, "Original Chick image.");
					utils.display();
					
					while(true) {
					String next = "Are you ready for the next question?(yes/no)";
					for (int i = 0; i < next.length(); i++) {
					    System.out.print(next.charAt(i));
					    try {
							Thread.sleep(50);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					
					String ans = input.nextLine();
					if(ans.equalsIgnoreCase("yes")) {
						break;
					//	utils.closeImages();
					}
					else {
						System.out.println("Ok, I will wait until you are ready.");
						continue;
					}
					}
				
					Color[][] halfBlack = processChick2(orig);
					
					utils.addImage(halfBlack, "Processed Chick image.");
					
					String q2 = "\nWhat is the difference between these two pictures?(choose letter)"
							+ "\na) Backround changed to white"
							+ "\nb) The flower changed from yellow to green"
							+ "\nc) Chick moved to the right";
					
					for (int i = 0; i < q2.length(); i++) {
					    System.out.print(q2.charAt(i));
					    try {
							Thread.sleep(50);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					     n=0;
					    while(true && n<=1) {
					    String a1 = input.nextLine();
					    if(a1.equalsIgnoreCase("B")) {
					    	System.out.println("Perfect");
					    break;
					    }
					    
					    else if (n<1) {
					    String response = "Hmm ... not correct, try agian.";
					    for (int i = 0; i < response.length(); i++) {
						    System.out.print(response.charAt(i));
						    try {
								Thread.sleep(50);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					    n++;
					    continue;
					    }
					    else if (n==1) {
					    	 String wrong3 = "Are you perhaps color Blind? \nIf so I am sorry but this test must be very difficult for you.";
							    for (int i = 0; i < wrong3.length(); i++) {
								    System.out.print(wrong3.charAt(i));
								    try {
										Thread.sleep(50);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
					    	break;
					    }
					    }
					    System.out.println("The correct answer is b) The flower changed from yellow to green");
					    try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					    
					    String fin = "This concludes Test 1"; 
					    for (int i = 0; i < fin.length(); i++) {
						    System.out.print(fin.charAt(i));
						    try {
								Thread.sleep(50);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
				   
				while(true) {
					System.out.println("\nAre you ready to go on?(yes/no)");
					String next1 = input.nextLine();
				
						if(next1.equalsIgnoreCase("yes")) {
							utils.closeImages();
							break;
						//	utils.closeImages();
						}
						else {
							System.out.println("Ok, I will wait until you are ready.");
							continue;
						}
					}
				
	}
	
	public static Color[][] processChick1(Color[][] img){
		//clones image
		Color[][] tmp = ImageUtils.cloneArray(img);
		
		for (int i=0; i<tmp.length; i++) {
			for (int j = 0; j < tmp[i].length; j++) {
				/*if ( i > tmp.length && Color pixel(20,20,20)) {
					Color pixel = tmp[i][j];
					int r = pixel.getRed();
					int g = pixel.getGreen();
					int b = pixel.getBlue();
					tmp[i][j] = new Color(b,b,b);*/
				Color pixel = tmp[i][j];
				if ( i < tmp[i].length || j < tmp[j].length) {
					int r = pixel.getRed();
					int g = pixel.getGreen();
					int b = pixel.getBlue();
					tmp[i][j] = new Color(b,r,r);
				}
				
			}
		}
		return tmp;
	}

	public static void Test3(String[] args) {
		String loading = "\nloading images . . .";		
		String intro = "\nTest 3: Knowledge in Color Codes";
		for (int i = 0; i < intro.length(); i++) {
		    System.out.print(intro.charAt(i));
		    try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		for (int i = 0; i < loading.length(); i++) {
		    System.out.print(loading.charAt(i));
		    try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
				// load in an image.
				Color[][] orig = utils.loadImage("src/Chick.jpg");
				
				// Add original image tab.
				utils.addImage(orig, "Original Chick image.");
				utils.display();
				
				String intro3 = "\nThis test will be on you knowledge of color codes.\nAre you ready for the question?(yes/no)";
				for (int i = 0; i < intro3.length(); i++) {
				    System.out.print(intro3.charAt(i));
				    try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				while (true) {
					String ThirdAns = input.nextLine();
					
					if(ThirdAns.equalsIgnoreCase("yes")) {
						System.out.println("\n");
				break;
					}
					else {
						System.out.println("Ok, I will wait until you are ready");
						continue;
					}
				}
				
				String q4 = "\nWhen I change the color to (0,0,0)"
						+ "\nWhat happens to the entire picture?(Enter letter)"
						+ "\na) The picture goes Black & White\nb) The picture turns into a White block \nc) The picture turns into a Black block";
				for (int i = 0; i < q4.length(); i++) {
				    System.out.print(q4.charAt(i));
				    try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				    int n=0;
				    while(true && n<=1) {
				    String a3 = input.nextLine();
				    if(a3.equalsIgnoreCase("c")) {
				    	System.out.println("NOICE");
				    break;
				    }
				    
				    else if (n==0) {
				    String response = "Hmm ... not correct, try agian.";
				    for (int i = 0; i < response.length(); i++) {
					    System.out.print(response.charAt(i));
					    try {
							Thread.sleep(50);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				    n++;
				    continue;
				    }
				    else if (n==1) {
				    	 String wrong = ". . . Sadly you are incorrect, I'll just give it to ya";
						    for (int i = 0; i < wrong.length(); i++) {
							    System.out.print(wrong.charAt(i));
							    try {
									Thread.sleep(50);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}
				    	break;
				    }
				    }
				    
				    Color[][] halfBlack = processChick3(orig);
					utils.addImage(halfBlack, "Processed Chick image.");
					utils.display();
					
				    System.out.println("\nThe correct answer is c) The picture turns into a Black block.");
				    try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				    
				    String continue2 = "\nThis concludes Test 3: Knowledge on color code";
				    for (int i = 0; i < continue2.length(); i++) {
					    System.out.print(continue2.charAt(i));
					    try {
							Thread.sleep(50);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				
				
				
	}
	
	public static Color[][] processChick3(Color[][] img){
		//clones image
		Color[][] tmp = ImageUtils.cloneArray(img);
		
		for (int i=0; i<tmp.length; i++) {
			for (int j = 0; j < tmp[i].length; j++) {
				Color pixel = tmp[i][j];
				if (  i < tmp.length) {
					int r = pixel.getRed();
					int g = pixel.getGreen();
					int b = pixel.getBlue();
					tmp[i][j] = new Color(0,0,0);
				}	
			}
		}
		return tmp;
	}

	public static void conclusion(String[] args) {
		
		String Conclusion = "\n This Concludes the tests. "
				+ "\nI wish to thank you for participating and wish a wonderful rest of your day.";
		for (int i = 0; i < Conclusion.length(); i++) {
		    System.out.print(Conclusion.charAt(i));
		    try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		String ShuttingDown = "\nSystem shutting down . . ."
				+ "\nProgram Terminated";
		for (int i = 0; i < ShuttingDown.length(); i++) {
		    System.out.print(ShuttingDown.charAt(i));
		    try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

