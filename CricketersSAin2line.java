class CricketersSAin2line{
	public static void main (String [] squad){
		System.out.println("Squad for Tour of South africa is");

			
				for (int player=0; player<5; player++){
				System.out.print(squad[player]+"\t");
				}
					System.out.println();




				for (int player=5; player<squad.length; player++){
				System.out.print(squad[player]+"\t");
				}
					System.out.println();

			
		System.out.println("Stand by players will be announced shortly");
	}
}