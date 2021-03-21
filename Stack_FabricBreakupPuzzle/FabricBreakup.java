import java.util.Scanner; 
import java.io.*;
public class FabricBreakup {	
	public static void main(String args[]) throws FileNotFoundException{
		// Implement FabricBreakup puzzle using Stack interface
		try{

			Scanner scan = new Scanner(new File(args[0])); 

			Stack st1 = new Stack(); 
			Stack st2 = new Stack();

			while (scan.hasNextLine()){ 

				String in[] = scan.nextLine().split(" ");

				if(in.length>1){

					int o_id = Integer.parseInt(in[0]);
					int c = Integer.parseInt(in[1]);

					if(c == 1){

						int w = Integer.parseInt(in[2]);

						if(st1.size() == 0){

							st1.push(w);
							st2.push(0);

						} else {

							Object w1;

							try{

								w1 = st1.top();
								int w2 = (Integer) w1;
	 
								if(w2>w){

									Object t;  

									try{

										t = st2.pop();
										int t1 = (Integer) t;
										t1 = t1 + 1;
										st2.push(t1);

									} catch (EmptyStackException e){

										String ex = "";
									}

								} else {

									st1.push(w);
									st2.push(0);

								}

							} catch (EmptyStackException e){

								String ex = "";

							}

						}

					} else if(c == 2){
				
						try{

							Object w3 = st1.pop();
							int t = (Integer) st2.pop();
							System.out.println(o_id + " " + t);

						} catch (EmptyStackException e){

							int o = -1;
							System.out.println(o_id + " " + o);

						}
					}

				}

			}	 
		} catch (FileNotFoundException e){

			String ex = "";

		}
	}
}
