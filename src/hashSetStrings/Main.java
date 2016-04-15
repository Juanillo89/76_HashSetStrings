package hashSetStrings;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		HashSet<String> hs = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		String aux;
		do{
			Main.mostrarMenu();
			System.out.println("Introduzca la opcion deseada: ");
			opcion = Integer.parseInt(sc.nextLine());
			switch (opcion)
			{
				case 1:
					System.out.print("Escriba la palabra ha introducir: ");
					aux = sc.nextLine();
					if(hs.add(aux))
					{
						System.out.println("la palabra se ha añadido satisfatoriamente.");
					}
					else
						System.out.println("la palabra no se ha añadido correctamente (repetida)");
				break;

				case 2:
					if(hs.size() == 0)
					{
						System.out.println("no hay elementos que listar");
					}
					else
					{
						System.out.println("listado de palabras introducidas: ");

						Iterator<String> iterator = hs.iterator();
						while(iterator.hasNext())
						{
							System.out.println(iterator.next());
						}
					}

				break;

				case 3:
					System.out.print("Introduzca la palabra que desea eliminar: ");
					aux = sc.nextLine();
					if(hs.remove(aux))
					{
						System.out.println("la palabra se ha borrado");
					}
					else
						System.out.println("no se encuentra la palabra que desea borrar");
				break;
				case 4:

					hs.clear();
					System.out.println("se han eliminado todas las palabras.");

				break;
				case 5:
					System.out.println("el tamaño es: " + hs.size());
				break;
				case 6:

					System.out.print("Introduzca la plabra que desea buscar: ");
					aux = sc.nextLine();
					if(hs.contains(aux))
					{
						System.out.println("la palabra "+ aux +" se ha encontrado satisfatoriamente");
					}
					else
						System.out.println("la palabra "+ aux +" no se ha encuentra almacenada");

				break;
				case 7:
					System.out.println("Ha salido del programa.");
				break;

				default:
					System.out.println("Introduzca una opcion correcta.");
				break;
			}

		}while(opcion != 7);
		sc.close();
	}

	private static void mostrarMenu()
	{
		System.out.println("Menú:\n" +
			"1.-Introducir palabra.\n" +
			"2.-Listar palabras.\n" +
			"3.-Eliminar palabra.\n" +
			"4.-Borrar todas.\n" +
			"5.-Mostrar tamaño.\n" +
			"6.-Buscar.\n" +
			"7.-Salir.\n");
	}

}
