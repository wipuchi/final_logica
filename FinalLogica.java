public class FinalLogica{

	public static void sumatoria() {

			int a,b,c;
			System.out.println(" Sumatoria ");
			System.out.println("Ingrese a ");
			a = ConsoleInput.getInt();
			b = 0;
			c = a;

			while(c !=0)
			{
				b = b+c;
				c--;
			}
			System.out.println("La sumatoria de " + a + " Es " + b );
			
		}

			public static void promedio() {

			float a,b,c,d;
			System.out.println(" Promedio ");
			System.out.println("Ingrese a ");
			a = ConsoleInput.getInt();
			System.out.println("Ingrese b ");
			b = ConsoleInput.getInt();
			System.out.println("Ingrese c ");
			c = ConsoleInput.getInt();
			d = a+b+c;
			d = d/3;
			
			System.out.println("El promedio es "+d);
			
		}

		public static void factorial() {

			int a,b;
			System.out.println(" Factorial" );
			System.out.println("Ingrese a ");
			a = ConsoleInput.getInt();
			b = 1;

			while(a !=0)
			{
				b*=a;
				a--;
			}		

			System.out.println("El factorial es: "+b);
			
		}


	public static void menu() {

		int centinela = 0;

		do{
			System.out.println("Ingrese una opcion asi:");
			System.out.println("1. Sumatoria");
			System.out.println("2. Promedio n datos");
			System.out.println("3. Factorial");
			System.out.println("4. Raiz n-esima");
			System.out.println("5. salir");
			centinela = ConsoleInput.getInt();

			switch(centinela)
		{
			case 1: sumatoria();
			break;
			case 2: promedio();
			break;
			case 3: factorial();
			break;
			case 5: System.out.println("Hasta luego");
			break;
			default: System.out.println("Elija una opcion valida");
		}

		}while(centinela!=5);

		

	}
	public static void main(String[] args) {
		menu();
	}
}

