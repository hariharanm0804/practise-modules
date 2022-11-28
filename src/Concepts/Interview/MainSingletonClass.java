package Concepts.Interview;


class MainSingletonClass{
	public static void main(String[] args) {
		SingletonClass sc = SingletonClass.getInstance();
		sc.show();
	}
}