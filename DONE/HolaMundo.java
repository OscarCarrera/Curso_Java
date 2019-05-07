class HolaMundo{
	public static void main (String argumentos[]) {
		System.out.println("Hola Mundo");
		
		for (int i=0; i < argumentos.length; i++){
			System.out.println("Args "+ i + " = "
			+ argumentos[i]);
		}
	}	
}