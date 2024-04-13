public class Test{
	public static void main(String as[]){
		Elephant el = new Elephant();
		Crate<Elephant> cr = new Crate<>();
		cr.setContent(el);
		System.out.println(cr.getContent());

		Dog dg = new Dog();
		Crate<Dog> cr1 = new Crate<>();
		cr1.setContent(dg);
		System.out.println(cr1.getContent());

	}
}