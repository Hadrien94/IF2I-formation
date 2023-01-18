package fil_rouge;

public class Test {

	public static void main(String[] args) {
		
		//pour tester
		ArrayList<Activite> activites = null;
		
		Activite activite = new Activite();///
		//liste avec unique élément
		activites.add(activite);
		
		ActiviteService activiteService = new ActiviteService();
		
		
		System.out.println(activiteService.listeActivite().get(0).toString());

	   
		
	}

}
